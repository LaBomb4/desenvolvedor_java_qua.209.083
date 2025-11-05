package com.objeto.app;

public class Pessoa {
    // Atributos (Parecidas com as váriaveis)
    public String nome;
    public String cpf;
    public String email;
    public int idade;
    public double altura;


    // Métodos
    public void exibirDados(){
        System.out.println("DADOS DO USUÁRIO:\n");
      // Atributo   
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("E-mail: " + this.email);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura + "m");
    }
}
