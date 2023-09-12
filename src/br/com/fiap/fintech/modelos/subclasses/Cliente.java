package br.com.fiap.fintech.modelos.subclasses;

import java.io.Serializable;
import br.com.fiap.fintech.modelos.Pessoa;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um Cliente, uma extensão da Pessoa.
 * @author Caio Geraldi; Emily Cruz; Erick Nathan; Guilherme Naufal; João Paulo Maciel.
 * @version 1.0
 */
public class Cliente extends Pessoa implements  Serializable {
    private static final long serialVersionUID = 2L;
    /**
     * SENHA de cadastrada pelo Cliente.
     */
    private String senha;


    /**
     * LISTA de contas do Cliente.
     */
    private List<Conta> contas;


    /**
     * E-MAIL de cadastro do Cliente.
     */
    private String email;



//--------------------------------------------------------------------------------------------------------
    //Métodos construtores:

    //Método construtor padrão (objetivo: manter padrão javaBeans):
    /**
     * Método Construtor padrão.
     * Inicializa a lista para evitar `NullPointerException` posteriormente.
     */
    public Cliente() {
        super();
        this.contas = new ArrayList<>();  // inicializando a lista aqui
    }


    //Método Construtor com parâmetros para instaciação:
    /**
     * Método Construtor com Parâmetros a serem inseridos na inicialização/instanciação.
     * @param nome Recebe o nome da Pessoa.
     * @param cep Recebe o número do CEP referente ao endereço cadastrado pela Pessoa.
     * @param nroLogradouro Recebe o número do logradouro do endereço cadastrado pela Pessoa.
     * @param complemento Recebe o complemento do endereço cadastrado pela Pessoa.
     * @param telContato Recebe o número de telefone de contato da pessoa.
     * @param senha Recebe a senha cadastrada.
     * @param contas Recebe a lista de contas.
     * @param email Recebe o e-mail cadastrado.
     */
    public Cliente(String nome, int cep, int nroLogradouro, String complemento, int telContato, String senha, List<Conta> contas, String email) {
        super(nome, cep, nroLogradouro, complemento, telContato);
        this.senha = senha;
        this.contas = (contas != null) ? contas : new ArrayList<>();  // Garante que a lista nunca seja nula
        this.email = email;
    }

//--------------------------------------------------------------------------------
    //Métodos Getters e Setters:
    /**
     * Método SET que pode ser utilizado para alterar a SENHA.
     * @param senha
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }




    /**
     * Método GET que irá retornar a lista de contas.
     * @return Retorna a lista de contas.
     */
    public List<Conta> getContas() {
        return contas;
    }




    /**
     * Método GET que irá retornar o e-mail de cadastro.
     * @return retorna o e-mail.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Método SET que pode ser utilizado para alterar o e-mail de cadastro.
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
//--------------------------------------------------------------------------------

    //Métodos Adicionais:
    /**
     * Permite adicionar uma conta na lista de contas.
     * @param conta
     */
    public void addConta(Conta conta) {
        if (conta != null && !this.contas.contains(conta)) { // Checa se a conta não é nula e se já não está na lista
            this.contas.add(conta);
            conta.setCliente(this); // Estabelece a relação bidirecional
        }
    }


    /**
     * Permite remover uma conta da lista de contas.
     * @param conta
     */
    public void removeConta(Conta conta) {
        this.contas.remove(conta);
    }


    /**
     * Permite obter uma conta em específica a partir de um índice.
     * @param indice
     * @return Retorna a conta na posição especificada pelo índice.
     */
    public Conta getConta(int indice) {
        return this.contas.get(indice);
    }


    /**
     * Permite consultar se uma conta está na lista fazendo uma busca com base na conta que foi fornecida como parâmetro.
     * @param conta
     * @return True ou False.
     */
    public boolean hasConta(Conta conta) {
        return this.contas.contains(conta);
    }


} //FIM

