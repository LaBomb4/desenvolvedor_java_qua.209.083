package com.lista.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    //Intancia a classe Scanner
    Scanner leia = new Scanner(System.in);
    
    String[] nomes = new String[10];

    // Entrada de dados
    for (int i = 0; i < nomes.length; i++){
        System.out.println("Informe o " + (i + 1) + "º nome: ");
        nomes[i] = leia.nextLine();
    }

    // Saida de dados
        // enhanced for
            // A variável nome existe apenas dentro do bloco do   for (escopo local à iteração).
    for (String nome : nomes){
        System.out.println(nome);
    }

    // Fecha o objeto leia
    leia.close();
    }
}
