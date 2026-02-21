package com.heranca.models;

public class PessoaJuridica extends Pessoa {
    private String nomeSocial;
    private String nomeFantasia;
    private String cnpj;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String razaoSocial, String nomeFantasia, String cnpj) {
        super();
        this.nomeSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    public String getNomeSocial() { return this.nomeSocial; }
    public void setNomeSocial(String nomeSocial) { this.nomeSocial = nomeSocial; }

    public String getNomeFantasia() { return this.nomeFantasia; }
    public void setNomeFantasia(String nomeFantasia) { this.nomeFantasia = nomeFantasia; }

    public String getCnpj() { return this.cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    @Override
    public void exibirDados() {
        System.out.println("Razão Social: " + this.nomeSocial);
        System.out.println("Nome da empresa: " + this.nomeFantasia);
        System.out.println("CNPJ: " + this.cnpj);
        super.exibirDados();
    }
}