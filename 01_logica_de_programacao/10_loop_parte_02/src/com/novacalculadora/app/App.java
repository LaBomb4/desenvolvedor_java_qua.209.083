package com.novacalculadora.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Instanciação do Objeto Leia
        Scanner leia = new Scanner(System.in);

        // Declaração de variáveis
        double x;
        double y;
        double z = 0.0;

        int opcao = 7;

        String operacao;

        // Loop FIXME: 
        do {
            // Menu
        System.out.println("________________________");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Resto");
            System.out.println("6 - Potência");
            System.out.println("0 - Sair");
        System.out.println("-----------------------");
        operacao = leia.nextLine();

            if(operacao != "0"){
                // Entrada de dados
                System.out.println("Informe o valor de x:");
                    x = leia.nextDouble();
                System.out.println("Informe o valor de y:");
                    y = leia.nextDouble();

                switch(operacao){
                    case "1":
                        z = x + y;
                        break;
                    case "2":
                        z = x - y;
                        break;
                    case "3":
                        z = x * y;
                        break;
                    case "4":
                        z = x / y;
                        break;
                    case "5":
                        z = x % y;
                        break;
                    case "6":
                        z = Math.pow(x, y);
                        break;
                    default:
                    System.out.println("Operador inválido.");
                }

                // Mostra o resultado
                System.out.println("Resultado: " + z);
            }
            else{
                opcao = Integer.parseInt(operacao);
            }
         
        leia.nextLine();
        } while (opcao != 0);

        // Fecha o Objeto leia
        leia.close();
    }
}