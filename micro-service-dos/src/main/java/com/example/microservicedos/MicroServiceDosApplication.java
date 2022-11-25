package com.example.microservicedos;

import javax.persistence.Embeddable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class MicroServiceDosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceDosApplication.class, args);
	}

}
