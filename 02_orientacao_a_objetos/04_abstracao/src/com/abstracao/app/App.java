package com.abstracao.app;

import java.util.Scanner;

import com.abstracao.models.Carro;
import com.abstracao.models.Moto;

// Abstração é o ato de impedir que uma determinada classe seja instânciada
public class App {
    public static void main(String[] args) throws Exception {
        // Declaração de variáveis
        String combustivel;
       
        // Instância o objeto de entrada de dados
        Scanner leia = new Scanner(System.in);
        
        // Instância as classes
        Carro carro = new Carro();
        Moto moto = new Moto();
    
        // Entrada de dados do carro
        System.out.println("INFORME OS DADOS DO CARRO:\n");
        System.out.println("Informe o fabricante:");
        carro.fabricante = leia.nextLine();
        System.out.println("Informe o modelo:");
        carro.modelo = leia.nextLine();
        System.out.println("Informe a cor:");
        carro.cor = leia.nextLine();
        System.out.println("Informe o ano:");
        carro.ano = leia.nextLine();
        System.out.println("Informe a placa:");
        carro.placa = leia.nextLine();

        // Modelo de propulsão
        carro.motorFlex = false;
        carro.motorEletrico = false;
        carro.motorDisel = false;
        carro.motorGasolina = false;
        carro.motorEtanol = false;

        // User input: Propulsão
        System.out.println("\nInforme o tipo de combustível:\n");
        System.out.println("1 - Gasolina");
        System.out.println("2 - Etanol");
        System.out.println("3 - Tanto Gasolina como Etanol");
        System.out.println("4 - Disel");
        System.out.println("5 - Elétrico");
        combustivel = leia.nextLine();

        switch (combustivel) {
            case "1":
                carro.motorGasolina = true;
                break;
            case "2":
                carro.motorEtanol = true;
                break;
            case "3":
                carro.motorFlex = true;
                break;
            case "4":
                carro.motorDisel = true;
                break;
            case "5":
                carro.motorEletrico = true;
                break;
            default: System.out.println("OPÇÃO INVÁLIDA!");
        }

        // Entrada de dados da moto
        System.out.println("\nINFORME OS DADOS DA MOTO:\n");
        System.out.println("Informe o modelo:");
        moto.modelo = leia.nextLine();
        System.out.println("Informe a cor:");
        moto.cor = leia.nextLine();
        System.out.println("Informe o Ano:");
        moto.ano = leia.nextLine();
        System.out.println("Informe a placa:");
        moto.placa = leia.nextLine();

        // Saida de dados tanto do carro quanto o da moto
        System.out.println("\nDADOS DO CARRO:\n");
        carro.exibirDados();
        System.out.println("\nDADOS DA MOTO:\n");
        carro.exibirDados();



        // fecha o obejto leia
        leia.close();
    }
}