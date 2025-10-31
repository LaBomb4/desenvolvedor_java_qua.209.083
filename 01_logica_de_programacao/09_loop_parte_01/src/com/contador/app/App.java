package com.contador.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Instânciação do Objeto Leia
        Scanner leia = new Scanner(System.in);
        // Declaração da variável
        int i;
        // Entrada de dados
        System.out.println("Informe um número inteiro:  ");
            i = leia.nextInt();

        // Loop
        while (i > 0) {
            System.out.println(i - 1);
            i--;
        }

        // Fecha o objeto leia
        leia.close();
    }
}
