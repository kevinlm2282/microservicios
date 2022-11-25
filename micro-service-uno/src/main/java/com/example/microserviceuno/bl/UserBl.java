package com.example.microserviceuno.bl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.microserviceuno.dao.UserEntity;
import com.example.microserviceuno.dao.repository.UserRepository;
import java.util.List;

import javax.transaction.Transactional;
@Service
public class UserBl {
    private Logger LOGGER = LoggerFactory.getLogger(UserBl.class);
    private UserRepository userRepository;


    @Autowired
    public UserBl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserEntity> getUsers() {
        LOGGER.info("BUSINESS-LOGIC: Iniciando consulta para obtener el listado de muebles");
        List<UserEntity> users = this.userRepository.findAll();
        LOGGER.info("BUSINESS-LOGIC: La consulta para obtener el listado de muebles retorno: {}", users);
        return users;
    }

    @Transactional
    public UserEntity saveUser(UserEntity user) {
        LOGGER.info("BUSINESS-LOGIC: Iniciando consulta para registrar un todo's");
        UserEntity user1 = (UserEntity) userRepository.save(user);
        LOGGER.info("BUSINESS-LOGIC: La consulta para registrar un mueble retorno: {}", user1);
        return user1;
    }

    public void deleteUser(Integer id){
        LOGGER.info("BUSINESS-LOGIC: Iniciando consulta para eliminar un usuario");
        this.userRepository.deleteById(id);
        LOGGER.info("BUSINESS-LOGIC: La consulta para eliminar el usuario");
    }
}
