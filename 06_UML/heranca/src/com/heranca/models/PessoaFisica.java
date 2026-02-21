package com.heranca.models;

import java.time.LocalDate;

public class PessoaFisica extends Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private String CPF;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, LocalDate dataNascimento, String CPF) {
        super();
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.CPF = CPF;
    }

    public String getNome() { return this.nome; }
    public void setNome(String nome) { this.nome = nome; }

    public LocalDate getDataNascimento() { return this.dataNascimento; }
    public void setDataNascimento(LocalDate dataNascimento) { this.dataNascimento = dataNascimento; }

    public String getCPF() { return this.CPF; }
    public void setCPF(String CPF) { this.CPF = CPF; }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.CPF);
        System.out.println("Data de nascimento: " + this.dataNascimento);
        super.exibirDados();
    }
}