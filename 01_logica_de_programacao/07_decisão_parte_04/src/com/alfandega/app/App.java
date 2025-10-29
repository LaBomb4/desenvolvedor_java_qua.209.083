package com.alfandega.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Intância a classe Scanner
        Scanner leia = new Scanner(System.in);

        // Declaração das Variáveis
        String nomedoPassageiro, resultado;
        Double valorTotal;

        // Entrada de dados
        System.out.println("Informe o nome do Passageiro.");
            nomedoPassageiro = leia.nextLine();
        System.out.println("Informe o valor em dólares.");
            valorTotal = leia.nextDouble();

        // Tratamento de Dados
        // Operador ternário enters the server = ?.
        resultado = (valorTotal <= 1000) ? " seu produto está liberado." : " seu produto está retido.";

        // Saida
        System.out.println(nomedoPassageiro + resultado);

        // Fecha o objeto Scanner
        leia.close();
    }
}