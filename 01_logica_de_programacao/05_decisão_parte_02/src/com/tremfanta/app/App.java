package com.tremfanta.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Instânciar a classe Scanner
        Scanner leia = new Scanner(System.in);

        // Declaração de Variáveis
        String nome;
        int idade;
        double altura;

        // Entrade de dados
        System.out.println("Informe o nome: ");
        nome = leia.nextLine();
        System.out.println("Informe a idade: ");
        idade = leia.nextInt();
        System.out.println("Informe a altura em metros: ");
        altura = leia.nextDouble();

        // Estrutura de decisão // && = AND
        if(idade >= 14 && altura >= 1.5){
            System.out.println(nome + " foi liberado.");
        }
        else{
            System.out.println(nome + " não foi autorizado(a).");
        }

        //Fecha o objeto Scanner
        leia.close();
    }
}