package com.construtor.app;

import java.util.Scanner;
import com.construtor.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        // Intâncias
        Scanner leia = new Scanner(System.in);
        Pessoa usuario = new Pessoa("", "", "", "", 0);

        // Entrada de dados
        System.out.println("Informe o seu nome");
        usuario.nome = leia.nextLine();
        System.out.println("Informe o seu cpf");
        usuario.cpf = leia.nextLine();
        System.out.println("Informe o seu email");
        usuario.email = leia.nextLine();
        System.out.println("Informe o seu telefone");
        usuario.telefone = leia.nextLine();
        System.out.println("Informe a sua idade");
        usuario.idade = leia.nextInt();

        // Saída de dados
        System.out.println(usuario.apresentar());

        // Fecha o objeto leia
        leia.close();
    }
}
