package com.media.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Intância a classe Scanner
        Scanner leia = new Scanner(System.in);

        // Declaração de Variáveis
        String nome;
        double nota;

        // Entrada de dados
        System.out.println("Informe o nome do Aluno.");
        nome = leia.nextLine();
        System.out.println("Informe a nota do aluno de 0 a 10.");
        nota = leia.nextDouble();


        // Verificação dos dados
            
        if (nota >= 0 && nota <= 10) {
            if (nota >= 7) {
                System.out.println(nome + " está aprovado.");
            }
            else if (nota >= 5) {
                System.out.println(nome + " está atualmente em recuperação");
            }
            else{
                System.out.println(nome + " está infelizmente reprovado");
            }
        } else {
            System.out.println("A nota declarada está fora da faixa determinada, por favor ensira uma nota de 0 - 10");

        // Fecha o objeto Scanner
        leia.close();
    }
}
}