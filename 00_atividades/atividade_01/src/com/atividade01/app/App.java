// TODO: Crie um programa que calcule uma equação do 1º grau.

package com.atividade01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Instancia Scanner
        Scanner leia = new Scanner(System.in);

        // Equação do primeiro grau

        // Declaração Variaveis
        double a;
        double b;
        double c;
        
        // Entrada
        System.out.println("Informe o valor de A:   ");
            a = leia.nextDouble();
        System.out.println("Informe o valor de B:   ");
            b = leia.nextDouble();

        // Calcule a equação do primeiro grau
        c = -b/a;

        if (a != 0){
         c = -b/a;
            System.out.println("x = " + c);
        } else {
            System.out.println("Não exite raiz real");
        }


        //fecha objeto leia
        leia.close();
    }
}
