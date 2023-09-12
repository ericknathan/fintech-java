package br.com.fiap.fintech.modelos.subclasses;

import java.io.Serializable;
import java.util.List;

/**
 * Classe que representa uma ContaCorrente, subclasse de Conta.
 * @author Caio Geraldi; Emily Cruz; Erick Nathan; Guilherme Naufal; João Paulo Maciel.
 * @version 1.0
 */
public class ContaCorrente extends Conta implements Serializable {
    private static final long serialVersionUID = 7L;

    /**
     * Taxa de juros da Conta Corrente.
     */
    private double juros;

    /**
     * Imposto sobre Operações Financeiras (IOF).
     */
    private double iof;

    /**
     * Imposto de Renda (IR).
     */
    private double ir;

    //--------------------------------------------------------------------------------------------------------
    // Métodos construtores:

    /**
     * Método Construtor padrão.
     */
    public ContaCorrente() {
        super();
    }

    /**
     * Método Construtor com Parâmetros para instanciação.
     * @param cliente Titular da conta corrente.
     * @param conta Identificador único da conta corrente.
     * @param agencia Identificador da agência.
     * @param numeroConta Número da conta corrente.
     * @param saldo Saldo inicial da conta corrente.
     * @param movimentacoes Histórico de movimentações.
     * @param juros Taxa de juros.
     * @param iof IOF.
     * @param ir Imposto de Renda.
     */
    public ContaCorrente(Cliente cliente, String conta, String agencia, int numeroConta, double saldo,
                         List<Movimentacao> movimentacoes, double juros, double iof, double ir) {
        super(cliente, conta, agencia, numeroConta, saldo, movimentacoes);
        this.juros = juros;
        this.iof = iof;
        this.ir = ir;
    }

    //--------------------------------------------------------------------------------------------------------
    // Métodos Getters e Setters:

    /**
     * Método GET que retorna a taxa de juros da Conta Corrente.
     * @return Retorna a taxa de juros.
     */
    public double getJuros() {
        return juros;
    }

    /**
     * Método SET para definir a taxa de juros da Conta Corrente.
     * @param juros Recebe a taxa de juros.
     */
    public void setJuros(double juros) {
        this.juros = juros;
    }

    /**
     * Método GET que retorna o Imposto sobre Operações Financeiras (IOF) da Conta Corrente.
     * @return Retorna o IOF.
     */
    public double getIof() {
        return iof;
    }

    /**
     * Método SET para definir o Imposto sobre Operações Financeiras (IOF) da Conta Corrente.
     * @param iof Recebe o IOF.
     */
    public void setIof(double iof) {
        this.iof = iof;
    }

    /**
     * Método GET que retorna o Imposto de Renda (IR) da Conta Corrente.
     * @return Retorna o IR.
     */
    public double getIr() {
        return ir;
    }

    /**
     * Método SET para definir o Imposto de Renda (IR) da Conta Corrente.
     * @param ir Recebe o IR.
     */
    public void setIr(double ir) {
        this.ir = ir;
    }

    //--------------------------------------------------------------------------------------------------------
    // Métodos adicionais:

    /**
     * Método para cadastrar a Conta Corrente.
     */
    public void cadastrarContaCorrente() {
        // Implementação do cadastro da Conta Corrente
        // Será uma lógica ou conexão com banco de dados aqui
    }

    /**
     * Método para consultar detalhes da Conta Corrente.
     */
    public void consultarContaCorrente() {
        // Implementação da consulta da Conta Corrente
        // Será uma lógica ou conexão com banco de dados aqui
    }
}//FIM

