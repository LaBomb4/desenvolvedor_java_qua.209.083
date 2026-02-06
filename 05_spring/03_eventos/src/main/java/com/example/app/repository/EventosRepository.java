package com.example.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.app.models.Evento;

public interface EventosRepository extends CrudRepository<Evento, String>{
    Evento findByIdEvento(long idevento);   
}
