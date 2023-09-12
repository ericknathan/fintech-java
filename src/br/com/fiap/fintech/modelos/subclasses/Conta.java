package br.com.fiap.fintech.modelos.subclasses;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa uma Conta associada a um Cliente.
 * @author Caio Geraldi; Emily Cruz; Erick Nathan; Guilherme Naufal; João Paulo Maciel.
 * @version 1.0
 */
public class Conta implements Serializable {
    private static final long serialVersionUID = 5L;

    /**
     * Titular da conta, que é uma referência ao Cliente.
     */
    private Cliente cliente;

    /**
     * Identificador único da conta.
     */
    private String conta;

    /**
     * Identificador da agência.
     */
    private String agencia;

    /**
     * Número da conta.
     */
    private int numeroConta;

    /**
     * Saldo atual da conta.
     */
    private double saldo;

    /**
     * Histórico de movimentações da conta.
     */
    protected List<Movimentacao> movimentacoes = new ArrayList<>();

//--------------------------------------------------------------------------------------------------------

    //Métodos construtores:

    //Método construtor padrão (objetivo: manter padrão javaBeans):
    /**
     * Método Construtor padrão.
     */
    public Conta() {
        super();
    }

    //Método Construtor com parâmetros para instaciação:
    /**
     * Método Construtor com Parâmetros a serem inseridos na inicialização/instanciação.
     * @param cliente Titular da conta.
     * @param conta Identificador único da conta.
     * @param agencia Identificador da agência.
     * @param numeroConta Número da conta.
     * @param saldo Saldo inicial da conta.
     * @param movimentacoes Histórico de movimentações.
     */
    public Conta(Cliente cliente, String conta, String agencia, int numeroConta, double saldo, List<Movimentacao> movimentacoes) {
        this.cliente = cliente;
        this.conta = conta;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.movimentacoes = (movimentacoes != null) ? movimentacoes : new ArrayList<>();
    }

	//--------------------------------------------------------------------------------
    // Métodos Getters e Setters:

    /**
     * Método GET que retorna o Cliente titular da Conta.
     * @return Retorna o cliente.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Método SET para definir o Cliente titular da Conta.
     * @param cliente Recebe o cliente titular.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Método GET que retorna o identificador único da Conta.
     * @return Retorna o identificador da conta.
     */
    public String getConta() {
        return conta;
    }

    /**
     * Método SET para definir o identificador único da Conta.
     * @param conta Recebe o identificador da conta.
     */
    public void setConta(String conta) {
        this.conta = conta;
    }

    /**
     * Método GET que retorna o identificador da agência.
     * @return Retorna o identificador da agência.
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * Método SET para definir o identificador da agência.
     * @param agencia Recebe o identificador da agência.
     */
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    /**
     * Método GET que retorna o número da Conta.
     * @return Retorna o número da conta.
     */
    public int getNumeroConta() {
        return numeroConta;
    }

    /**
     * Método SET para definir o número da Conta.
     * @param numeroConta Recebe o número da conta.
     */
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    /**
     * Método GET que retorna o saldo atual da Conta.
     * @return Retorna o saldo atual.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método SET para definir o saldo atual da Conta.
     * @param saldo Recebe o saldo atual.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método GET que retorna o histórico de movimentações da Conta.
     * @return Retorna uma cópia do histórico de movimentações.
     */
    public List<Movimentacao> getMovimentacoes() {
        return new ArrayList<>(movimentacoes);
    }

    /**
     * Método SET para definir o histórico de movimentações da Conta.
     * Utilizado com cautela, garante que a lista nunca seja nula.
     * @param movimentacoes Recebe o histórico de movimentações.
     */
    public void setMovimentacoes(List<Movimentacao> movimentacoes) {
        this.movimentacoes = (movimentacoes != null) ? new ArrayList<>(movimentacoes) : new ArrayList<>();
    }

	//--------------------------------------------------------------------------------
    //Métodos Adicionais:
    /**
     * Método que adiciona uma conta ao titular (Cliente).
     */
    public void vincularAoCliente() {
        if (this.cliente != null) {
            this.cliente.addConta(this);
        }
    }

    /**
     * Método que adiciona uma movimentação à lista de movimentações da Conta.
     * @param movimentacao A movimentação a ser adicionada.
     */
    public void addMovimentacao(Movimentacao movimentacao) {
        this.movimentacoes.add(movimentacao);
    }

    /**
     * Método que remove uma movimentação da lista de movimentações da Conta.
     * @param movimentacao A movimentação a ser removida.
     */
    public void removeMovimentacao(Movimentacao movimentacao) {
        this.movimentacoes.remove(movimentacao);
    }
} //FIM



