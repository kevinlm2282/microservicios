package com.example.microservicetres.api;

import com.example.microservicetres.bl.EntregaBl;
import com.example.microservicetres.dao.EntregaEntity;
import com.example.microservicetres.dto.EntregaDto;
import com.example.microservicetres.dto.MuebleDto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/v1/api/entrega")
public class EntregaController {
    private static Logger LOGGER = LoggerFactory.getLogger(EntregaController.class);

    private EntregaBl entregaBl;
    
    @Autowired
    public EntregaController(EntregaBl entregaBl) {
        this.entregaBl = entregaBl;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<EntregaEntity>> getEntregas() {
        LOGGER.info("REQUEST: Iniciando petición para obtener el listado de Entregas");
        List<EntregaEntity> result = entregaBl.getEntregas();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping
    public EntregaDto saveEntrega(@RequestBody EntregaDto entregaDto){
        return entregaBl.saveEntrega(entregaDto);
    }

    // @RequestMapping(method = RequestMethod.POST)
    // public ResponseEntity<EntregaEntity> saveEntrega(@RequestBody EntregaDto entregaDto) {
    //     LOGGER.info("REQUEST: Iniciando petición para guardar un mueble");
    //     EntregaEntity result = entregaBl.saveEntrega(entregaDto);
    //     return new ResponseEntity<>(result, HttpStatus.OK);
    // }
    
}
