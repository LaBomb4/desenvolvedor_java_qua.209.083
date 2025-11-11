package com.entrada.app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // Declaração de variáveis
        String nome;
        int idade;
        String result;

        // Entrada de dados
        nome = JOptionPane.showInputDialog("Informe seu nome: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));

        // Verifica maioridade
        result = (idade >= 18) ? "é maior de idade" : "é menor de idade";

        // Saida de dados
        JOptionPane.showMessageDialog(null, nome + " " + result + ".");
    }
}
