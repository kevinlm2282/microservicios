package com.example.microservicedos.bl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.microservicedos.dao.MuebleEntity;

import com.example.microservicedos.dao.repository.MuebleRepository;
import com.example.microservicedos.dto.MuebleDto;

import java.util.List;

import javax.transaction.Transactional;

@Service
public class MuebleBl {
    private Logger LOGGER = LoggerFactory.getLogger(MuebleBl.class);
    private MuebleRepository muebleRepository;


    @Autowired
    public MuebleBl(MuebleRepository muebleRepository) {
        this.muebleRepository = muebleRepository;
    }

    public List<MuebleEntity> getMuebles() {
        LOGGER.info("BUSINESS-LOGIC: Iniciando consulta para obtener el listado de muebles");
        List<MuebleEntity> muebleList = this.muebleRepository.findAll();
        LOGGER.info("BUSINESS-LOGIC: La consulta para obtener el listado de muebles retorno: {}", muebleList);
        return muebleList;
    }

    public MuebleEntity getMueble(Integer id){
        LOGGER.info("BUSINESS-LOGIC: Iniciando consulta para obtener un mueble");
        MuebleEntity muebleEntity = this.muebleRepository.findById(id).orElseThrow();
        LOGGER.info("BUSINESS-LOGIC: La consulta para obtener el mueble retorno", muebleEntity);
        return muebleEntity;

    }

    @Transactional
    public MuebleEntity saveMueble(MuebleDto muebleDto) {
        LOGGER.info("BUSINESS-LOGIC: Iniciando consulta para registrar un mueble");
        MuebleEntity muebleEntity = new MuebleEntity(muebleDto.getNombre(),
        muebleDto.getColor(),muebleDto.getCantidad(),muebleDto.getEstado(),
        muebleDto.getCategoria_categoria_id());
        MuebleEntity mueble = this.muebleRepository.saveAndFlush(muebleEntity);
        LOGGER.info("BUSINESS-LOGIC: La consulta para registrar un mueble retorno: {}", mueble);
        return mueble;
    }

    public void deleteMueble(Integer id){
        LOGGER.info("BUSINESS-LOGIC: Iniciando consulta para eliminar un mueble");
        this.muebleRepository.deleteById(id);
        LOGGER.info("BUSINESS-LOGIC: La consulta para eliminar el mueble");
    }

    public MuebleEntity updateMueble(MuebleDto muebleDto) {
        LOGGER.info("BUSINESS-LOGIC: Iniciando consulta para actualizar un mueble");
        MuebleEntity muebleEntity = this.muebleRepository.findById(muebleDto.getMueble_id()).orElseThrow();
        muebleEntity.setNombre(muebleDto.getNombre());
        muebleEntity.setColor(muebleDto.getColor());
        muebleEntity.setCantidad(muebleDto.getCantidad());
        muebleEntity.setEstado(muebleDto.getEstado());
        MuebleEntity mueble = this.muebleRepository.save(muebleEntity);
        LOGGER.info("BUSINESS-LOGIC: La consulta para actualizar un todo retorno: {}", mueble);
        return mueble;
    }


}
