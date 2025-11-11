// Encapsular é alterar a visibilidade de alguns elementos

package com.encapsulamento.models;

public class Pessoa {
    // atributos - agora eles são privados, é só serão visiveis dentro desta classe.
    private String nome;
    private String cpf;
    private String email;
    private int idade;

    // Metodos getters and setters

    public Pessoa() {
    
    }

        // Metodos setters e getters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
        

}
