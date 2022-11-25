package com.example.services;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import feign.Headers;

@Service
@FeignClient(contextId = "keyCloakService", name = "keycloak", url = "http://localhost:8100/realms/empresa/protocol/openid-connect/token")
public interface KeyCloakService{

    @PostMapping(
            consumes = "application/x-www-form-urlencoded",
            produces = "application/json"
    )
    @Headers("Content-Type:application/x-www-form-urlencoded")
    Map<String,String> getToken(Map<String, ?> params);
}
