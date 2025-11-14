package com.atividade_05.app;

import javax.swing.JOptionPane;
import com.atividade_05.models.IMC;

public class App {
    public static void main(String[] args) throws Exception {
        IMC objIMC = new IMC();
        // Declarações
        String[] opcoes = {"Informar dados", "Sair"};
        Object opcao;

        // Laço de repetição
        do {
            opcao = JOptionPane.showInputDialog(
                null, 
                "Escolha a opção", 
                null, 
                1, 
                null, 
                opcoes, 
                opcoes[0]);

             // Verifica a opção do usuário
        if (opcao == "Informar dados"){
            // Entrada de dados
            objIMC.setNome(JOptionPane.showInputDialog("Informe o nome: "));
            objIMC.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe o peso em kg: ")));
            objIMC.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe a altura em metros: ").replace(",", ".")));

            // Saida de dados
            JOptionPane.showMessageDialog(
                null,
                objIMC.getNome() + 
                ", seu IMC é: "
                 + String.format("%.2f", objIMC.calcularIMC()) 
                 +".\n" + 
                 objIMC.getNome() + 
                 objIMC.resultado());
        }
        } while (opcao != "Sair");

    }
}