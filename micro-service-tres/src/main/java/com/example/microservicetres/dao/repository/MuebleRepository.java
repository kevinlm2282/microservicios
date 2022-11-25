package com.example.microservicetres.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.microservicetres.dao.MuebleEntity;

public interface MuebleRepository extends JpaRepository<MuebleEntity,Integer>{
}
