package br.com.fiap.fintech.modelos.subclasses;

import java.io.Serializable;
import java.util.List;

/**
 * Classe que representa uma ContaPoupanca, subclasse de Conta.
 * @author Caio Geraldi; Emily Cruz; Erick Nathan; Guilherme Naufal; João Paulo Maciel.
 * @version 1.0
 */
public class ContaPoupanca extends Conta implements Serializable {
    private static final long serialVersionUID = 8L; // UID diferente para ContaPoupanca

    /**
     * Taxa de juros da Conta Poupança.
     */
    private double juros;

    /**
     * Imposto sobre Operações Financeiras (IOF) da Conta Poupança.
     */
    private double iof;

    /**
     * Imposto de Renda (IR) da Conta Poupança.
     */
    private double ir;

    //--------------------------------------------------------------------------------------------------------

    // Métodos construtores:

    /**
     * Método Construtor padrão.
     */
    public ContaPoupanca() {
        super();
    }

    /**
     * Método Construtor com Parâmetros para instanciação.
     * @param cliente Titular da conta poupança.
     * @param conta Identificador único da conta poupança.
     * @param agencia Identificador da agência.
     * @param numeroConta Número da conta poupança.
     * @param saldo Saldo inicial da conta poupança.
     * @param movimentacoes Histórico de movimentações.
     * @param juros Taxa de juros.
     * @param iof IOF.
     * @param ir Imposto de Renda.
     */
    public ContaPoupanca(Cliente cliente, String conta, String agencia, int numeroConta, double saldo,
                         List<Movimentacao> movimentacoes, double juros, double iof, double ir) {
        super(cliente, conta, agencia, numeroConta, saldo, movimentacoes);
        this.juros = juros;
        this.iof = iof;
        this.ir = ir;
    }

    //--------------------------------------------------------------------------------------------------------
    // Métodos Getters e Setters:

    /**
     * Método GET que retorna a taxa de juros da Conta Poupança.
     * @return Retorna a taxa de juros.
     */
    public double getJuros() {
        return juros;
    }

    /**
     * Método SET para definir a taxa de juros da Conta Poupança.
     * @param juros Recebe a taxa de juros.
     */
    public void setJuros(double juros) {
        this.juros = juros;
    }

    /**
     * Método GET que retorna o Imposto sobre Operações Financeiras (IOF) da Conta Poupança.
     * @return Retorna o IOF.
     */
    public double getIof() {
        return iof;
    }

    /**
     * Método SET para definir o Imposto sobre Operações Financeiras (IOF) da Conta Poupança.
     * @param iof Recebe o IOF.
     */
    public void setIof(double iof) {
        this.iof = iof;
    }

    /**
     * Método GET que retorna o Imposto de Renda (IR) da Conta Poupança.
     * @return Retorna o IR.
     */
    public double getIr() {
        return ir;
    }

    /**
     * Método SET para definir o Imposto de Renda (IR) da Conta Poupança.
     * @param ir Recebe o IR.
     */
    public void setIr(double ir) {
        this.ir = ir;
    }

    //--------------------------------------------------------------------------------------------------------
    // Métodos adicionais:

    /**
     * Método para cadastrar a Conta Poupança.
     */
    public void cadastrarContaPoupanca() {
        // Implementação do cadastro da Conta Poupança
        // Será uma lógica ou conexão com banco de dados aqui
    }

    /**
     * Método para consultar detalhes da Conta Poupança.
     */
    public void consultarContaPoupanca() {
        // Implementação da consulta da Conta Poupança
        // Será uma lógica ou conexão com banco de dados aqui
    }
} //FIM