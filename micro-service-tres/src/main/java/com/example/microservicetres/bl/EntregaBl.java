package com.example.microservicetres.bl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;

import com.example.microservicetres.dao.EntregaEntity;
import com.example.microservicetres.dao.MuebleEntity;
import com.example.microservicetres.dao.repository.EntregaRepository;
import com.example.microservicetres.dao.repository.MuebleRepository;
import com.example.microservicetres.dto.EntregaDto;
import com.example.microservicetres.dto.MuebleDto;

import com.example.microservicetres.dao.MuebleHasEntregaEntity;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.transaction.annotation.Transactional;

/**
 * EntregaBl
 */
@Service
public class EntregaBl {
    
    private Logger LOGGER = LoggerFactory.getLogger(EntregaBl.class);
    private MuebleRepository muebleRepository;
    private EntregaRepository entregaRepository;
    @Autowired
    public EntregaBl(EntregaRepository entregaRepository, MuebleRepository muebleRepository) {
        this.entregaRepository = entregaRepository;
        this.muebleRepository = muebleRepository;
    }
    
    public List<EntregaEntity> getEntregas() {
        LOGGER.info("BUSINESS-LOGIC: Iniciando consulta para obtener el listado de entregas");
        List<EntregaEntity> entragaList = this.entregaRepository.findAll();
        LOGGER.info("BUSINESS-LOGIC: La consulta para obtener el listado de muebles retorno: {}", entragaList);
        return entragaList;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public EntregaDto saveEntrega(EntregaDto entregaDto) {
        EntregaEntity entregaEntity = new EntregaEntity();
        entregaEntity.setFecha(entregaDto.getFecha());
        entregaEntity.setTotal(entregaDto.getTotal());
        entregaEntity.setPropietario(entregaDto.getPropietario());
        entregaEntity.setFecha_entrega(entregaDto.getFecha_entrega());
        entregaEntity.setUsuario_user_id(entregaDto.getUsuario_user_id());
        LOGGER.info("entrega {}",entregaDto);
        entregaEntity.setItems(entregaDto.getMuebles().stream().map(muebleItem -> {
            MuebleHasEntregaEntity muebleHasEntregaEntity = new MuebleHasEntregaEntity();
            MuebleEntity muebleEntity = muebleRepository.findById(muebleItem.getMuebleDto().getMueble_id()).orElseThrow(() -> new RuntimeException("mueble no encontrado"));
            muebleHasEntregaEntity.setEntrega(entregaEntity);
            muebleHasEntregaEntity.setMueble(muebleEntity);
            muebleHasEntregaEntity.setCantidad(muebleItem.getCantidad());
            muebleEntity.setCantidad(muebleEntity.getCantidad() - muebleItem.getCantidad());
            muebleRepository.save(muebleEntity);
            return muebleHasEntregaEntity;
        }).collect(Collectors.toList()));
        LOGGER.info("Guardando orden {}", entregaEntity);
        EntregaEntity guardarEntrega = entregaRepository.save(entregaEntity);
        entregaDto.setEntrega_id(guardarEntrega.getEntrega_id());
        return entregaDto;



        // LOGGER.info("BUSINESS-LOGIC: Iniciando consulta para registrar una entrega");
        // EntregaEntity entregaEntity = new EntregaEntity(entregaDto.getFecha(), entregaDto.getTotal(), entregaDto.getPropietario(),
        // entregaDto.getFecha_entrega(),entregaDto.getUsuario_user_id(), entregaDto.getMuebles());
        // EntregaEntity entrega = this.entregaRepository.save(entregaEntity);
        // LOGGER.info("BUSINESS-LOGIC: La consulta para registrar una entrega retorno: {}", entrega);
        // return entrega;
    }
}