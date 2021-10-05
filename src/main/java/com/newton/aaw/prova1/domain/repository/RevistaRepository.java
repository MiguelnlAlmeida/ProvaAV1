package com.newton.aaw.prova1.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.newton.aaw.prova1.domain.entity.Revista;

public interface RevistaRepository extends MongoRepository<Revista, String>{

}
