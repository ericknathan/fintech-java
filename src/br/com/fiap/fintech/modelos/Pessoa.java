package br.com.fiap.fintech.modelos;

import java.io.Serializable;

/**
 * Classe que abstrai uma Pessoa.
 * @author Caio Geraldi; Emily Cruz; Erick Nathan; Guilherme Naufal; João Paulo Maciel.
 * @version 1.0
 */

public class Pessoa implements Serializable {

    /**
     * Uma constante que representa o ID de versão único para a classe serializável.
     * Esse ID é usado durante a desserialização para verificar se o remetente e o receptor
     * de um objeto serializado mantêm compatibilidade com respeito à classe do objeto serializado.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Nome da Pessoa.
     */
    private String nome;


    /**
     * CEP referente ao endereço da Pessoa.
     */
    private int cep;


    /**
     * Número do logradouro do endereço cadastrado pela Pessoa.
     */
    private int nroLogradouro;


    /**
     * Anotação de complemento do Endereço da Pessoa.
      */
    private String complemento;


    /**
     * Telefone de Contato da Pessoa.
     */
    private int telContato;




    //Métodos:
//-------------------------------------------------------------------------------
    //Método construtor padrão (objetivo: manter padrão javaBeans):
    /**
     * Método Construtor padrão.
     */
    public Pessoa(){
    }


    //Método Construtor com parâmetros para instaciação:
    /**
     * Método Construtor com Parâmetros a serem inseridos na inicialização/instanciação.
     * @param nome Recebe o nome da Pessoa.
     * @param cep Recebe o número do CEP referente ao endereço cadastrado pela Pessoa.
     * @param nroLogradouro Recebe o número do logradouro do endereço cadastrado pela Pessoa.
     * @param complemento Recebe o complemento do endereço cadastrado pela Pessoa.
     * @param telContato Recebe o número de telefone de contato da cadastrado pela pessoa.
     */
    public Pessoa(String nome, int cep, int nroLogradouro, String complemento, int telContato) {
        this.nome = nome;
        this.cep = cep;
        this.nroLogradouro = nroLogradouro;
        this.complemento = complemento;
        this.telContato = telContato;
    }


//--------------------------------------------------------------------------------
    //Métodos Getters e Setters:
    /**
     * Método GET que irá retornar o nome da Pessoa.
     * @return Retorna o nome da pessoa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método SET que pode ser utilizado para alterar o nome da Pessoa.
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }




    /**
     * Método GET que irá retornar o número do CEP cadastrado.
     * @return Retorna o número do cep cadastrado.
     */
    public int getCep() {
        return cep;
    }

    /**
     * Método SET que pode ser utilizado para alterar o número do CEP cadastrado.
     * @param cep
     */
    public void setCep(int cep) {
        this.cep = cep;
    }




    /**
     * Método GET que irá retornar o número do logradouro do endereço cadastrado.
     * @return retorna o número logradouro do endereço cadastrado.
     */
    public int getNroLogradouro() {
        return nroLogradouro;
    }

    /**
     * Método SET que pode ser utilizado para alterar o número do logradouro do endereço cadastrado.
     * @param nroLogradouro
     */
    public void setNroLogradouro(int nroLogradouro) {
        this.nroLogradouro = nroLogradouro;
    }




    /**
     * Método GET que irá retornar o complemento do endereço cadastrado.
     * @return Retorna o complemento referente ao endereço de cadastro.
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * Método SET que pode ser utilizado para alterar o complemento do endereço cadastrado.
     * @param complemento
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }




    /**
     * Método GET que irá retornar o número do contato telefônico cadastrado.
     * @return Retorna o número do contato telefônico.
     */
    public int getTelContato() {
        return telContato;
    }

    /**
     * Método SET que pode ser utilizado para alterar o contato telefônico cadastrado.
     * @param telContato
     */
    public void setTelContato(int telContato) {
        this.telContato = telContato;
    }
//--------------------------------------------------------------------------------

}//FIM
