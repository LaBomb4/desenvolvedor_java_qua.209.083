package com.apostila.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apostila.app.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String>{
    Usuario findByLogin(String login); // Método para buscar usuário pelo login
}