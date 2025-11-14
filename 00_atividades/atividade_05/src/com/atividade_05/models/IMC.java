package com.atividade_05.models;

public class IMC {
    private String nome;
    private String resultado;
    private double peso;
    private double altura;
    private double IMC;

    public IMC(){

    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResultado() {
        return this.resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getIMC() {
        return this.IMC;
    }

    public void setIMC(double IMC) {
        this.IMC = IMC;
    }

    public double calcularIMC(){
        return this.IMC = this.peso / (Math.pow(this.altura, 2));
    }

    // metodos
    public String resultado(){
    return (this.IMC <= 18.5) ? " está abaixo do peso" : 
        (this.IMC <= 25.0) ? " está no peso ideal" :
        (this.IMC <= 30.0) ? " está acima do peso" :
        (this.IMC <= 35) ? " OBESO!" :
        (this.IMC <= 40) ? " vai concerteza de base" :
        "VAI MORRER!";
    }
}
