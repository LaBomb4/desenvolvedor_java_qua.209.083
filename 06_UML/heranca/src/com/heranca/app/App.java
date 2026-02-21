package com.heranca.app;

import com.heranca.models.PessoaFisica;
import com.heranca.models.PessoaJuridica;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class App {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica corp = new PessoaJuridica();

        // ---------- Pessoa Física ----------
        System.out.println("INFORME OS DADOS DO USUARIO (PESSOA FÍSICA)\n");

        System.out.print("Informe o nome: ");
        usuario.setNome(leia.nextLine().trim());

        System.out.print("Informe o CPF: ");
        usuario.setCPF(leia.nextLine().trim());

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = null;
        while (data == null) {
            System.out.print("Informe a data de Nascimento (dd/MM/yyyy): ");
            String entrada = leia.nextLine().trim();
            if (entrada.isEmpty()) {
                System.out.println("Entrada vazia. Tente novamente.");
                continue;
            }
            try {
                data = LocalDate.parse(entrada, fmt);
            } catch (DateTimeParseException e) {
                System.out.println("Formato inválido. Ex: 20/02/1980. Tente novamente.");
            }
        }
        usuario.setDataNascimento(data);

        System.out.println("\n--- Dados do usuário (Pessoa Física) ---");
        usuario.exibirDados();

        // ---------- Pessoa Jurídica ----------
        System.out.println("\n\nINFORME OS DADOS DA EMPRESA (PESSOA JURÍDICA)\n");

        System.out.print("Informe a razão social: ");
        corp.setNomeSocial(leia.nextLine().trim());

        System.out.print("Informe o nome fantasia: ");
        corp.setNomeFantasia(leia.nextLine().trim());

        String cnpj = null;
        while (cnpj == null) {
            System.out.print("Informe o CNPJ (somente números ou formato qualquer): ");
            String entrada = leia.nextLine().trim();
            String apenasDigitos = entrada.replaceAll("\\D", "");
            if (apenasDigitos.length() != 14) {
                System.out.println("CNPJ inválido — deve conter 14 dígitos. Tente novamente.");
                continue;
            }
            cnpj = apenasDigitos;
        }
        corp.setCnpj(cnpj);

        System.out.println("\n--- Dados da empresa (Pessoa Jurídica) ---");
        corp.exibirDados();

        leia.close();
    }
}