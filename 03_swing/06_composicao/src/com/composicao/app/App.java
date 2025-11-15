package com.composicao.app;

import javax.swing.JOptionPane;
import com.composicao.models.Pessoa;
import com.composicao.models.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Instânciação das classes
        Pessoa motorista = new Pessoa();
        Veiculo carro = new Veiculo();

        // Entrada de dados do motorista
        motorista.setNome(JOptionPane.showInputDialog("Qual o nome do proprietario do veículo: "));
        motorista.setCpf(JOptionPane.showInputDialog("Informe o CPF do proprietário: "));
        motorista.setTelefone(JOptionPane.showInputDialog("Informe o telefone do proprietário"));

        // Entrada de dados do carro
        carro.setMarca(JOptionPane.showInputDialog("Informe a marca do veículo: "));
        carro.setModelo(JOptionPane.showInputDialog("Informe o modelo do veículo: "));
        carro.setAno(JOptionPane.showInputDialog("Informe o ano do veículo: "));
        carro.setCor(JOptionPane.showInputDialog("Informe a cor do veículo: "));
        carro.setPlaca(JOptionPane.showInputDialog("Informe a placa do veículo: "));

        carro.setProprietario(motorista);

        // Saida de dados
        JOptionPane.showMessageDialog(
            null,
            "Marca: " + carro.getMarca() + 
            "\nModelo: " + carro.getModelo() +
            "\nAno: " + carro.getAno() +
            "\nCor: " + carro.getCor() +
            "\nPlaca: " + carro.getPlaca() +
            "\nDono do Veículo: " + carro.getProprietario().getNome() + 
            "\nCPF do proprietário: " + carro.getProprietario().getCpf() +
            "\nTelefone do proprietário: " + carro.getProprietario().getTelefone()
        );
    }
}
