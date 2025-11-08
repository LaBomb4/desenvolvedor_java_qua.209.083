package com.abstracao.models;


// abstract impede da classe de ser abstrada, isso é uma proteção.
abstract public class Veiculo {
    // atributos
    public String fabricante;
    public String modelo;
    public String ano;
    public String cor;
    public String placa;

    // construtor
    public Veiculo(String fabricante, String modelo, String ano, String cor, String placa){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
    }

    public void exibirDados(){
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.cor);
        System.out.println("Cor: " + this.cor);
        System.out.println("Placa: " + this.placa);
    }

    public Veiculo(){
        
    }
}
