package com.calculadora.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Intânciação do Objeto Leia
        Scanner leia = new Scanner(System.in);

        // Declaração das variáveis
        double x;
        double y;
        double resultado;

        String operador;

        // Entrada dos Dados
        System.out.println("Por favor informe o valor do primeiro operador: ");
        x = leia.nextDouble();
        System.out.println("Por favor informe o valor do segundo operador: ");
        y = leia.nextDouble();
        System.out.println("Agora informe o tipo de operação desejada (+ - x /): ");
        // Limpeza de Buffer
        leia.nextLine();
        // Menu
        System.out.println("________________________");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("-----------------------");
        operador = leia.nextLine();

        // shift + alt + seta para baixo = bug case infinito
        switch(operador){
            case "1":
            resultado = x + y;
            System.out.println("O Valor da soma é: " + resultado);
            break;
            case "2":
            resultado = x - y;
            System.out.println("O valor da subtração é: " + resultado);
            break;
            case "3":
            resultado = x * y;
            System.out.println("O valor da multiplicação é: " + resultado);
            break;
            case "4":
            resultado = x / y;
            System.out.println("O valor da divisão é: " + resultado);
            break;
            default:
            System.out.println("Opção Invalida!");
        }

        // Fecha o objeto leia
        leia.close();
    }
}
