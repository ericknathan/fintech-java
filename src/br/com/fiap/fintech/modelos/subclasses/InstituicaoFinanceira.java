package br.com.fiap.fintech.modelos.subclasses;

import br.com.fiap.fintech.modelos.Pessoa;

import java.io.Serializable;

/**
 * Classe que representa uma Instituição Financeira, subclasse de Pessoa.
 * @author Caio Geraldi; Emily Cruz; Erick Nathan; Guilherme Naufal; João Paulo Maciel.
 * @version 1.0
 */
public class InstituicaoFinanceira extends Pessoa implements Serializable {

    /**
     * Uma constante que representa o ID de versão único para a classe serializável.
     */
    private static final long serialVersionUID = 9L;

    /**
     * Código de registro da instituição financeira.
     */
    private String codigoRegistro;

    /**
     * Tipo de instituição (ex: Banco, Cooperativa, etc.)
     */
    private String tipoInstituicao;

    //--------------------------------------------------------------------------------------------------------
    // Métodos construtores:
    //Método construtor padrão (objetivo: manter padrão javaBeans):
    /**
     * Método Construtor padrão.
     */
    public InstituicaoFinanceira() {
        super();
    }


    //Método Construtor com parâmetros para instaciação:
    /**
     * Método Construtor com Parâmetros para instanciação.
     * @param nome Nome da instituição financeira.
     * @param cep CEP da instituição financeira.
     * @param nroLogradouro Número do logradouro da instituição financeira.
     * @param complemento Complemento do endereço da instituição financeira.
     * @param telContato Telefone de contato da instituição financeira.
     * @param codigoRegistro Código de registro da instituição financeira.
     * @param tipoInstituicao Tipo de instituição.
     */
    public InstituicaoFinanceira(String nome, int cep, int nroLogradouro, String complemento, int telContato,
                                 String codigoRegistro, String tipoInstituicao) {
        super(nome, cep, nroLogradouro, complemento, telContato);
        this.codigoRegistro = codigoRegistro;
        this.tipoInstituicao = tipoInstituicao;
    }

    //--------------------------------------------------------------------------------------------------------
    // Métodos Getters e Setters:

    /**
     * Método GET que retorna o código de registro da instituição financeira.
     * @return Retorna o código de registro.
     */
    public String getCodigoRegistro() {
        return codigoRegistro;
    }

    /**
     * Método SET para definir o código de registro da instituição financeira.
     * @param codigoRegistro Recebe o código de registro.
     */
    public void setCodigoRegistro(String codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }

    /**
     * Método GET que retorna o tipo da instituição financeira.
     * @return Retorna o tipo da instituição.
     */
    public String getTipoInstituicao() {
        return tipoInstituicao;
    }

    /**
     * Método SET para definir o tipo da instituição financeira.
     * @param tipoInstituicao Recebe o tipo da instituição.
     */
    public void setTipoInstituicao(String tipoInstituicao) {
        this.tipoInstituicao = tipoInstituicao;
    }

    //--------------------------------------------------------------------------------------------------------
    // Métodos adicionais:

    /**
     * Método para cadastrar a Instituição Financeira.
     */
    public void cadastrarInstituicao() {
        // Implementação do cadastro da Instituição Financeira
        // Será uma lógica ou conexão com banco de dados aqui
    }

    /**
     * Método para consultar detalhes da Instituição Financeira.
     */
    public void consultarInstituicao() {
        // Implementação da consulta da Instituição Financeira
        // Será uma lógica ou conexão com banco de dados aqui
    }


}//FIM
