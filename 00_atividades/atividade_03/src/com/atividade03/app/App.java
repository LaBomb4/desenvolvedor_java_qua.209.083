/* Crie um programa que receba do usuário: o nome e a idade.
 *  Depois, exiba um menu com 5 filmes, suas respectivas salas
 *  de cinema e suas respectivas classificações indicativas.
 *  O usuário deve escolher o filme, e se caso ele tiver a idade
 *  mínima para ver o filme, o programa imprime o ingresso e    encerra. Caso o usuário não tenha idade miníma, o programa bloqueia a entrada do usuário e exibe novamente os filmes.
 *  Filmes em cartz:
 *  - Sala 1 - A Roda Quadrada - Livre
 *  - Sala 2 - A Volta dos Que Não Foram - 12 Anos
 *  - Sala 3 - Poeira em Alto Mar - 14 Anos
 *  - Sala 4 - As Transas do Rei Careca - 16 Anos
 *  - Sala 5 - A Vingança do Peixe - 18 Anos
 */

package com.atividade03.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Intância da classe Scanner
        Scanner leia = new Scanner(System.in);

        // Declaração de Variáveis
        String[] salas = new String[5];
        String nome;
        String Sala;
        String filme = "";
        int idade;
        int idadeMin = 0;

        // Inicializar Array
        salas[0] = "A roda Quadrada";
        salas[1] = "A volta dos que não foram";
        salas[2] = "Poeira em Alto Mar";
        salas[3] = "As Transas do Rei Careca";
        salas[4] = "A Vingança do Peixe Frito";

        // Entrada de dados
        System.out.println("Informe o nome: ");
            nome = leia.nextLine();
        System.out.println("Informe a idade:    ");
            idade = leia.nextInt();

        // Limpeza de buffer
        leia.nextLine();


        // Loop
        do{ // Menu
            System.out.println("Sala 1 - " + salas[0] + " - Livre.");
            System.out.println("Sala 2 - " + salas[1] + " - 12 Anos.");
            System.out.println("Sala 3 - " + salas[2] + " - 14 Anos.");
            System.out.println("Sala 4 - " + salas[3] + " - 16 Anos.");
            System.out.println("Sala 5 - " + salas[4] + " - 18 Anos.");
            System.out.println("Informe a sala desejada.");
                Sala = leia.nextLine();

            switch (Sala){
                case "1":
                    filme = salas[0];
                    idadeMin = 0;
                    break;
                case "2":
                    filme = salas[1];
                    idadeMin = 12;
                    break;
                case "3":
                    filme = salas[2];
                    idadeMin = 14;
                    break;
                case "4":
                    filme = salas[3];
                    idadeMin = 16;
                    break;
                case "5":
                    filme = salas[4];
                    idadeMin = 18;
                    break;
                default:
                    System.out.println("Sala inexistente.");
            }
                // Verificação da idade
                if (idade >= idadeMin) {
                    System.out.println("Filme escolhido: " + filme);
                    System.out.println("Tenha um bom filme, " + nome);
                    System.out.println(":P");
                } else {
                    System.out.println("Entrada não permitida, favor");
                    System.out.println("X_X");
                }
        } while(idade < idadeMin);
        


        // Fecha o objeto leia
        leia.close();
    }
}
