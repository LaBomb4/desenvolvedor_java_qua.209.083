package com.abstracao.models;

// Final impede da classe de ser extendida
final public class Carro extends Veiculo {
    // Atributos
    public boolean motorEletrico;
    public boolean motorFlex;
    public boolean motorDisel;
    public boolean motorGasolina;
    public boolean motorEtanol;
    
    public Carro(){

    }
    // Exibir dados
    public void exibirDados(){
        super.exibirDados();
        if (motorEletrico == true){
            System.out.println("Motor: Elétrico");
        }
        if (motorFlex == true){
            System.out.println("Motor: Flex");
        }
        if (motorDisel == true){
            System.out.println("Motor: Diesel");
        }   
    }
}
