// Interface responsável por buscar o usuário no banco pelo login
package com.crud.usuario.app.repository;

import com.crud.usuario.app.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String>{
    Usuario findByLogin(String login); // Método mágico do Spring Data
}
