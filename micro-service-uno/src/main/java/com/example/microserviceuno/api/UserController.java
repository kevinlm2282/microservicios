package com.example.microserviceuno.api;


import com.example.microserviceuno.bl.UserBl;
import com.example.microserviceuno.dao.UserEntity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/v1/api/user")
public class UserController {
    private static Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    private UserBl userBl;

    @Autowired
    public UserController(UserBl userBl) {
        this.userBl = userBl;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<UserEntity>> getUser() {
        LOGGER.info("REQUEST: Iniciando petición para obtener el listado de Muebles");
        List<UserEntity> result = userBl.getUsers();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<UserEntity> saveUser(@RequestBody UserEntity user) {
        LOGGER.info("REQUEST: Iniciando petición para guardar un mueble");
        UserEntity result = userBl.saveUser(user);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}" )
    public ResponseEntity<UserEntity> deleteUser(@PathVariable Integer id) {
        LOGGER.info("REQUEST: Iniciando petición para eliminar un user");
        userBl.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}