package com.example.microservicedos.api;

import com.example.microservicedos.bl.MuebleBl;
import com.example.microservicedos.dao.MuebleEntity;
import com.example.microservicedos.dto.MuebleDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/v1/api/mueble")
public class MuebleController {
    private static Logger LOGGER = LoggerFactory.getLogger(MuebleController.class);

    private MuebleBl muebleBl;

    @Autowired
    public MuebleController(MuebleBl muebleBl) {
        this.muebleBl = muebleBl;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<MuebleEntity>> getMuebles() {
        LOGGER.info("REQUEST: Iniciando petición para obtener el listado de Muebles");
        List<MuebleEntity> result = muebleBl.getMuebles();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<MuebleEntity> getMueble(@PathVariable Integer id){
        LOGGER.info("REQUEST: Iniciando peticion para obtener datos de un Mueble");
        MuebleEntity result = muebleBl.getMueble(id);
        return new ResponseEntity<>(result,HttpStatus.OK);

    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<MuebleEntity> saveMueble(@RequestBody MuebleDto muebleDto) {
        LOGGER.info("REQUEST: Iniciando petición para guardar un mueble");
        MuebleEntity result = muebleBl.saveMueble(muebleDto);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<MuebleEntity> updateMueble(@RequestBody MuebleDto muebleDto){
        LOGGER.info("REQUEST: Iniciamos la peticion para actualizar el mueble");
        MuebleEntity result = muebleBl.updateMueble(muebleDto);
        return new ResponseEntity<>(result,HttpStatus.OK);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}" )
    public ResponseEntity<MuebleEntity> deleteMueble(@PathVariable Integer id) {
        LOGGER.info("REQUEST: Iniciando petición para eliminar un mueble");
        muebleBl.deleteMueble(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



    
    // private TodoBl todoBl;

    // @Autowired
    // public TodoController(TodoBl todoBl) {
    //     this.todoBl = todoBl;
    // }

    // @RequestMapping(method = RequestMethod.GET)
    // public ResponseEntity<List<TodoEntity>> getTodos() {
    //     LOGGER.info("REQUEST: Iniciando petición para obtener el listado de TODO's");
    //     List<TodoEntity> result = todoBl.getTodos();
    //     return new ResponseEntity<>(result, HttpStatus.OK);
    // }

    // @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    // public ResponseEntity<TodoEntity> getTodo(@PathVariable Integer id) {
    //     LOGGER.info("REQUEST: Iniciando petición para obtener un TODO");
    //     TodoEntity result = todoBl.getTodo(id);
    //     return new ResponseEntity<>(result, HttpStatus.OK);
    // }

    // @RequestMapping(method = RequestMethod.POST)
    // public ResponseEntity<TodoEntity> saveTodo(@RequestBody TodoDto todoDto) {
    //     LOGGER.info("REQUEST: Iniciando petición para guardar un TODO");
    //     TodoEntity result = todoBl.saveTodo(todoDto);
    //     return new ResponseEntity<>(result, HttpStatus.OK);
    // }

    // @RequestMapping(method = RequestMethod.PUT)
    // public ResponseEntity<TodoEntity> updateTodo(@RequestBody TodoDto todoDto) {
    //     LOGGER.info("REQUEST: Iniciando petición para actualizar un TODO");
    //     TodoEntity result = todoBl.updateTodo(todoDto);
    //     return new ResponseEntity<>(result, HttpStatus.OK);
    // }
}
