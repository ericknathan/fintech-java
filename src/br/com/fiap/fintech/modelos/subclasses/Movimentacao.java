package br.com.fiap.fintech.modelos.subclasses;

import java.io.Serializable;
import java.util.Date;

/**
 * Classe que representa uma Movimentacao financeira associada a uma Conta.
 * @author Caio Geraldi; Emily Cruz; Erick Nathan; Guilherme Naufal; João Paulo Maciel.
 * @version 1.0
 */
public class Movimentacao implements Serializable {
    private static final long serialVersionUID = 6L;

    //--------------------------------------------------------------------------------------------------------
    // Atributos:

    /**
     * Conta associada à movimentação.
     */
    private Conta conta;

    /**
     * Tipo de movimentação (e.x., "Depósito", "Retirada").
     */
    private String tipoMovimentacao;

    /**
     * Valor da movimentação.
     */
    private double valor;

    /**
     * Categoria da movimentação (e.x., "Alimentação", "Transporte").
     */
    private String categoria;

    /**
     * Data da movimentação.
     */
    private Date data;

    /**
     * Recorrência da movimentação (e.x., "Mensal", "Anual").
     */
    private String recorrencia;

    //--------------------------------------------------------------------------------------------------------
    // Métodos construtores:

    //Método construtor padrão (objetivo: manter padrão javaBeans):
    /**
     * Método Construtor padrão.
     */
    public Movimentacao() {
        super();
    }

    //Método Construtor com parâmetros para instaciação:
    /**
     * Método Construtor com Parâmetros a serem inseridos na inicialização/instanciação.
     * @param conta Conta associada à movimentação.
     * @param tipoMovimentacao Tipo de movimentação.
     * @param valor Valor da movimentação.
     * @param categoria Categoria da movimentação.
     * @param data Data da movimentação.
     * @param recorrencia Recorrência da movimentação.
     */
    public Movimentacao(Conta conta, String tipoMovimentacao, double valor, String categoria, Date data, String recorrencia) {
        this.conta = conta;
        this.tipoMovimentacao = tipoMovimentacao;
        this.valor = valor;
        this.categoria = categoria;
        this.data = data;
        this.recorrencia = recorrencia;

        incluirMovimentacao();
    }

    //--------------------------------------------------------------------------------------------------------
    // Métodos privados:

    /**
     * Método para incluir a movimentação na conta associada.
     */
    private void incluirMovimentacao() {
        if (this.conta != null) {
            this.conta.addMovimentacao(this);
        }
    }

    //--------------------------------------------------------------------------------
    // Métodos Getters e Setters:

    /**
     * Método GET que irá retornar a conta associada à movimentação.
     * @return Retorna a conta.
     */
    public Conta getConta() {
        return conta;
    }

    /**
     * Método SET que pode ser utilizado para alterar a conta associada.
     * @param conta Conta a ser definida.
     */
    public void setConta(Conta conta) {
        this.conta = conta;
    }

    /**
     * Método GET que irá retornar o tipo de movimentação.
     * @return Retorna o tipo de movimentação.
     */
    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    /**
     * Método SET que pode ser utilizado para alterar o tipo de movimentação.
     * @param tipoMovimentacao Tipo de movimentação a ser definido.
     */
    public void setTipoMovimentacao(String tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    /**
     * Método GET que irá retornar o valor da movimentação.
     * @return Retorna o valor da movimentação.
     */
    public double getValor() {
        return valor;
    }

    /**
     * Método SET que pode ser utilizado para alterar o valor da movimentação.
     * @param valor Valor da movimentação a ser definido.
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * Método GET que irá retornar a categoria da movimentação.
     * @return Retorna a categoria da movimentação.
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Método SET que pode ser utilizado para alterar a categoria da movimentação.
     * @param categoria Categoria da movimentação a ser definido.
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Método GET que irá retornar a data da movimentação.
     * @return Retorna a data da movimentação.
     */
    public Date getData() {
        return data;
    }

    /**
     * Método SET que pode ser utilizado para alterar a data da movimentação.
     * @param data Data da movimentação a ser definido.
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * Método GET que irá retornar a recorrência da movimentação.
     * @return Retorna a recorrência da movimentação.
     */
    public String getRecorrencia() {
        return recorrencia;
    }

    /**
     * Método SET que pode ser utilizado para alterar a recorrência da movimentação.
     * @param recorrencia Recorrência da movimentação a ser definido.
     */
    public void setRecorrencia(String recorrencia) {
        this.recorrencia = recorrencia;
    }
} //FIM
