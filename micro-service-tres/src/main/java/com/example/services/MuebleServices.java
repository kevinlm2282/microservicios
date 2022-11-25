package com.example.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import com.example.microservicetres.dao.MuebleEntity;

import feign.Headers;

@Service
@FeignClient(name = "ms-service-mueble")
public interface MuebleServices {

    @GetMapping("/v1/api/mueble/{id}")
    public MuebleEntity getMueble(@PathVariable ("id") Integer id, @RequestHeader("Authorization") String token);
    
}
