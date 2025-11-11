package com.encapsulamento.app;

import java.util.Scanner;
import com.encapsulamento.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        // Instância as Classes
        Pessoa usuario = new Pessoa();
        Scanner leia = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Informe seu nome: ");
        usuario.setNome(leia.nextLine());
        System.out.println("Informe seu CPF: ");
        usuario.setCpf(leia.nextLine());
        System.out.println("Informe seu e-mail: ");
        usuario.setEmail(leia.nextLine());
        System.out.println("Informe sua idade: ");
        usuario.setIdade(leia.nextInt());

        // Saida de dados
        System.out.println("\nDADOS DO USUARIO:\n");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("CPF: " + usuario.getCpf());
        System.out.println("E-mail: " + usuario.getEmail());
        System.out.println("Idade: " + usuario.getIdade());

        // fecha o objeto leia
        leia.close();
    }
}
