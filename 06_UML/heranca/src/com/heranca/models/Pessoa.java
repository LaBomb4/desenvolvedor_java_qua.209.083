package com.heranca.models;

public class Pessoa {
    private long idPessoa;

    public Pessoa() {
    }

    public long getIdPessoa() {
        return this.idPessoa;
    }

    public void setIdPessoa(long idPessoa) {
        this.idPessoa = idPessoa;
    }

    // Mantive um exibirDados simples para possíveis extensões
    public void exibirDados() {
        if (this.idPessoa != 0) {
            System.out.println("ID: " + this.idPessoa);
        }
    }
}