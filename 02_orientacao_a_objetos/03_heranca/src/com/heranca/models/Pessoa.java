package com.heranca.models;

// Superclasse ou Classe-Pai
public class Pessoa {
    // Atributos
    public String email;
    public String telefone;
    // Construtor - pessoa fisica e jurica já herdam esse cosntrutor
    public Pessoa(String email, String telefone){
        this.email = email;
        this.telefone = telefone;
    }

    public void exibirDados(){
        System.out.println("E-mail: " + this.email);
        System.out.println("Telefone:" + this.telefone);
    }

}