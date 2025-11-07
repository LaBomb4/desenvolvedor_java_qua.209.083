package com.heranca.models;

// SubClasse ou Classe-Filha
public class PessoaJurica extends Pessoa{
    // Atributos
    public String razaoSocial;
    public String nomeFantasia;
    public String cnpj;

    public PessoaJurica(String razaoSocial, String nomeFantasia, String cnpj, String email, String telefone){
        super(email, telefone);

        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    public void exibirDados(){
        System.out.println("Razão Social: " + this.razaoSocial);
        System.out.println("Nome da empresa:" + this.nomeFantasia);
        System.out.println("CNPJ:" + this.cnpj);
        super.exibirDados();
    }
}
