/* Crie um programa que receba do usuário
 *  - Nome
 *  - Peso em KG
 *  - Altura em metros
 * E depois, calcule e exiba na tela o IMC
 * Exiba o diagnóstico de cancer de acordo com a tabela do IMC.
 */

package com.atividade02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner leia = new Scanner(System.in);

        // Declaração de Variaveis
        String nome, resultado;
        double peso;
        double altura;
        double imc;

        // Entrada de dados
        System.out.println("Informe seu nome:   ");
            nome = leia.nextLine();
        System.out.println("Informe o peso em KG:   ");
            peso = leia.nextDouble();
        System.out.println("Informe a altura em metros: ");
            altura = leia.nextDouble();
        // Calcular o IMC
        imc = peso/Math.pow(altura, 2);

        System.out.println(nome + ", seu IMC é " + String.format("%.2f", imc) + ".");

        // Exibir o diagnostico
        resultado =
         (imc > 18.5) ? nome + " está abaixo do peso." :
         (imc < 25) ? nome + " está no peso ideal" : 
         (imc < 30) ? nome + " está acima do peso" : 
         (imc < 35) ? nome + " esta obeso" : 
         (imc < 40) ? nome + " vai morrer":
         " está mais doq morto";

        // Saida
        System.out.println(resultado + ".");

        leia.close();
    }
}
