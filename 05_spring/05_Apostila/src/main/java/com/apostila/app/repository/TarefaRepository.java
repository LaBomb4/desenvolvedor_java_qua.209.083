package com.apostila.app.repository;

import org.jspecify.annotations.Nullable;

import com.apostila.app.models.Tarefa;

public interface TarefaRepository {

    @Nullable
    Object findAll();

    void save(Tarefa tarefa);

}