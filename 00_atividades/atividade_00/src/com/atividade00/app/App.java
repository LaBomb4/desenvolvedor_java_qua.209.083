// TODO: atividade
/* Crie um programa que receba do usuário:
- Nome
- Data de Nascimento
- CPF
- E-mail
- Telefone
- Exiba os dados na tela
 */
package com.atividade00.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        
        // Declaração das váriaveis
        String nome;
        String ani;
        String cpf;
        String email;
        String telefone;

        // Entrada de dados
        System.out.println("Informe seu nome:");
            nome = leia.nextLine();
        System.out.println("Informe sua data de nascimento:");
            ani = leia.nextLine();
        System.out.println("Informe o seu CPF:");
            cpf = leia.nextLine();
        System.out.println("Informe seu e-mail:");
            email = leia.nextLine();
        System.out.println("Informe seu telefone:");
            telefone = leia.nextLine();

        // Saida de dados
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + ani);
        System.out.println("cpf: " + cpf);
        System.out.println("E-mail: " + email);
        System.out.println("Telefone: " + telefone);
        
        
        leia.close();
    }
}
