package com.apostila.app.models;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Usuario implements UserDetails {

    @Id
    @Column(nullable = false, unique = true)
    private String login; // login = ID

    private String nomeCompleto;
    private String senha;

    // GT and ST


    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNomeCompleto() {
        return this.nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }    

    // Métodos obrigatórios da interface UserDetails:
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword(){
        return this.senha; // Retorn a senha definida na classe
    }

    @Override
    public String getUsername(){
        return this.login; // Retorna o Login
    }
    
    // Métodos Booleanos como (isAccountNonExpired, etc.) podem retornar true
}
