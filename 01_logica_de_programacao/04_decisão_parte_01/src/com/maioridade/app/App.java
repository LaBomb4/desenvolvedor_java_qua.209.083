package com.maioridade.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Instância a classe Scanner
        Scanner leia = new Scanner(System.in);

        // Declaração de Variáveis
        String nome;
        int idade;

        // Input
        System.out.println("Informe o nome: ");
        nome = leia.nextLine();
        System.out.println("informe a idade: ");
        idade = leia.nextInt();

        // Estrutura de decisão
        if(idade >= 18){
            System.out.println(nome + " é maior de idade.");
        }
        else{
            System.out.println(nome + " é menor de idade.");
        }

        // Fecha o Objeto leia
        leia.close();
    }
}