package br.com.fiap.fintech.modelos.subclasses;

import java.io.Serializable;
import java.util.List;

/**
 * Classe que representa um cliente Pessoa Jurídica, uma extensão da classe Cliente.
 * @author Caio Geraldi; Emily Cruz; Erick Nathan; Guilherme Naufal; João Paulo Maciel.
 * @version 1.0
 */
public class PessoaJuridica extends Cliente implements Serializable {
    private static final long serialVersionUID = 4L;

    /**
     * Documento CNPJ do cliente Pessoa Jurídica.
     */
    private String cnpj;

    /**
     * Número de inscrição municipal do cliente Pessoa Jurídica.
     */
    private String inscMunicipal;

//--------------------------------------------------------------------------------------------------------
    //Métodos construtores:

    //Método construtor padrão (objetivo: manter padrão javaBeans):
    /**
     * Método Construtor padrão.
     */
    public PessoaJuridica() {
        super();
    }

    //Método Construtor com parâmetros para instaciação:
    /**
     * Método Construtor com Parâmetros a serem inseridos na inicialização/instanciação.
     * @param nome Recebe o nome da Empresa.
     * @param cep Recebe o número do CEP referente ao endereço cadastrado pela Empresa.
     * @param nroLogradouro Recebe o número do logradouro do endereço cadastrado pela Empresa.
     * @param complemento Recebe o complemento do endereço cadastrado pela Empresa.
     * @param telContato Recebe o número de telefone de contato da empresa.
     * @param senha Recebe a senha cadastrada.
     * @param contas Recebe a lista de contas.
     * @param email Recebe o e-mail cadastrado.
     * @param cnpj Recebe o CNPJ da PessoaJuridica.
     * @param inscMunicipal Recebe o número de inscrição municipal da PessoaJuridica.
     */
    public PessoaJuridica(String nome, int cep, int nroLogradouro, String complemento, int telContato, String senha, List<Conta> contas, String email, String cnpj, String inscMunicipal) {
        super(nome, cep, nroLogradouro, complemento, telContato, senha, contas, email);
        this.cnpj = cnpj;
        this.inscMunicipal = inscMunicipal;
    }

    //--------------------------------------------------------------------------------
    // Métodos Getters e Setters:

    /**
     * Método GET que irá retornar o CNPJ.
     * @return Retorna o CNPJ.
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Método SET que pode ser utilizado para alterar o CNPJ.
     * @param cnpj O CNPJ a ser definido.
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * Método GET que irá retornar o número de inscrição municipal.
     * @return Retorna o número de inscrição municipal.
     */
    public String getInscMunicipal() {
        return inscMunicipal;
    }

    /**
     * Método SET que pode ser utilizado para alterar o número de inscrição municipal.
     * @param inscMunicipal O número de inscrição municipal a ser definido.
     */
    public void setInscMunicipal(String inscMunicipal) {
        this.inscMunicipal = inscMunicipal;
    }

    //--------------------------------------------------------------------------------
    //Métodos Adicionais:
    /**
     * Método que verifica se um cliente Pessoa Jurídica está cadastrado, com base no CNPJ.
     * @param cnpj O CNPJ a ser verificado.
     * @return Retorna true se o CNPJ corresponder ao cliente atual e false caso contrário.
     */
    public boolean consultarPessoaJuridica(String cnpj) {
        return this.cnpj.equals(cnpj);
    }
} //FIM
