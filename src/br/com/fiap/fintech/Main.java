package br.com.fiap.fintech;

import br.com.fiap.fintech.modelos.subclasses.PessoaFisica;
import br.com.fiap.fintech.modelos.subclasses.PessoaJuridica;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Instanciando a classe PessoaFisica usando o construtor padrão:
        PessoaFisica pf1 = new PessoaFisica();
        pf1.setCpf("111.111.111-11");
        pf1.setRg("1234567-8");
        pf1.setEmail("pf1@example.com");
        // ... Outros setters conforme necessário ...

        // Instanciando a classe PessoaFisica usando o construtor com parâmetros:
        PessoaFisica pf2 = new PessoaFisica("João Silva", 12345678, 90, "Apt 10", 987654321,
                "senha123", new ArrayList<>(), "pf2@example.com",
                "222.222.222-22", "7654321-9");

        // Instanciando a classe PessoaJuridica usando o construtor padrão:
        PessoaJuridica pj1 = new PessoaJuridica();
        pj1.setCnpj("11.111.111/0001-11");
        pj1.setEmail("pj1@empresa.com");
        // ... Outros setters conforme necessário ...

        // Instanciando a classe PessoaJuridica usando o construtor com parâmetros:
        PessoaJuridica pj2 = new PessoaJuridica("Empresa XYZ", 87654321, 80, "Sala 101", 123456789,
                "senhaXYZ", new ArrayList<>(), "pj2@empresa.com",
                "22.222.222/0001-22", "Empresa XYZ Ltda.");

        // Imprimindo informações (como exemplo):
        System.out.println("CPF Pessoa Física 1: " + pf1.getCpf());
        System.out.println("CPF Pessoa Física 2: " + pf2.getCpf());
        System.out.println("CNPJ Pessoa Jurídica 1: " + pj1.getCnpj());
        System.out.println("CNPJ Pessoa Jurídica 2: " + pj2.getCnpj());
    }
}
