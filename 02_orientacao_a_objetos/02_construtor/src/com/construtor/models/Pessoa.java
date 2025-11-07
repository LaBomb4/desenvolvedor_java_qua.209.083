package com.construtor.models;
// Classe
public class Pessoa {
    // Atributos
    public String nome;
    public String cpf;
    public String email;
    public String telefone;
    public int idade;

     // Metodo é uma ação da classe
    // O construtor faz o objeto "nascer"

    public Pessoa(String nome, String cpf, String email, String telefone, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;
    }
    // Metodo
    public String apresentar(){

        return "Ola, meu nome é" + this.nome + ", tenho " + this.idade + " anos. Meu e-mail é " + this.email + ", meu telefone é " + this.telefone + " e meu CPF é " + this.cpf + ".";
    }
}
