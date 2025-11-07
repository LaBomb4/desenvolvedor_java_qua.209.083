package com.heranca.app;
// import com.heranca.models.Pessoa;
import com.heranca.models.PessoaFisica;
import com.heranca.models.PessoaJurica;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Instancição
        Scanner leia = new Scanner(System.in);

        PessoaFisica usuario = new PessoaFisica(
            null, 
            null, 
            0, 
            null, 
            null);

        PessoaJurica corp = new PessoaJurica(
            null, 
            null, 
            null, 
            null, 
            null);

            // Entrada de Dados do usuario
            System.out.println("INFORME OS DADOS DO USUARIO\n");
            System.out.println("Informe o nome:");
            usuario.nome = leia.nextLine();
            System.out.println("Informe o CPF:");
            usuario.cpf = leia.nextLine();
            System.out.println("Informe o e-mail:");
            usuario.email = leia.nextLine();
            System.out.println("Informe o telefone:");
            usuario.telefone = leia.nextLine();
            System.out.println("Informe a idade:");
            usuario.idade = leia.nextInt();

            // Limpeza de buffer
            leia.nextLine();

            // Entrada de dados da empresa
            System.out.println("\nINFORME OS DADOS DA EMPRESA:\n");
            System.out.println("Informe o nome da empresa:");
            corp.nomeFantasia = leia.nextLine();
            System.out.println("Informe a Razão Social:");
            corp.razaoSocial = leia.nextLine();
            System.out.println("Informe o CNPJ:");
            corp.cnpj = leia.nextLine();
            System.out.println("Informe o e-mail:");
            corp.email = leia.nextLine();
            System.out.println("Informe o telefone:");
            corp.telefone = leia.nextLine();

            // Saida de Dados
            System.out.println("\nDADOS DO USUÁRIO:\n");
            usuario.exibirDados();
            System.out.println("\nDADOS DA EMPRESA:\n");
            corp.exibirDados();





        // Fecha o objeto leia
        leia.close();
}
}