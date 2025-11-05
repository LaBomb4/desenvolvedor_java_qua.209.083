package com.objeto.app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // Instâncias
        Scanner leia = new Scanner(System.in);

        Pessoa usuario = new Pessoa();

        // Entrada de dados
        System.out.println("Informe um nome:    ");
        usuario.nome = leia.nextLine();
        System.out.println("Informe o CPF:");
        usuario.cpf = leia.nextLine();
        System.out.println("Informe o e-mail:");
        usuario.email = leia.nextLine();
        System.out.println("Informe a idade:");
        usuario.idade = leia.nextInt();
        System.out.println("Informe a altura em metros:");
        usuario.altura = leia.nextDouble();

        // Saida de dados
        usuario.exibirDados();

        // Fecha objeto leia
        leia.close();
    }
}