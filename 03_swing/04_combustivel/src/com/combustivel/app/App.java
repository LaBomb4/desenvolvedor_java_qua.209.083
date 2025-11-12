package com.combustivel.app;

import javax.swing.JOptionPane;
import com.combustivel.models.Combustivel;

public class App {
    public static void main(String[] args) throws Exception {
        Combustivel combustivel = new Combustivel();

        // array
        String[] op = {"Informar valores", "Sair do programa"};
        Object opcao;
        
        // Entrada de Dados
        do{ opcao = JOptionPane.showInputDialog(
            null, 
            "Selecione uma opção: ",
            "Combustivel",
            0,
            null, 
            op, 
            op[0]
            );

            if (opcao != "Sair do programa"){
            combustivel.setGasolina(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da gasolina: \n").replace(",", ".")));
            combustivel.setEtanol(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do Etanol: \n").replace(",", ".")));
            
            // Saida de dados
            JOptionPane.showMessageDialog(null, combustivel.calcularCombustivel());
            }
        } while(opcao != "Sair do programa");
    }
}
