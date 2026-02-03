package com.example.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.app.models.Eventos;

public interface EventosRepository extends CrudRepository<Eventos, String>{
    
}
