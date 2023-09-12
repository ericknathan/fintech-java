package br.com.fiap.fintech.modelos.subclasses;

import java.io.Serializable;
import java.util.List;

/**
 * Classe que representa um cliente Pessoa Física, uma extensão da classe Cliente.
 * @author Caio Geraldi; Emily Cruz; Erick Nathan; Guilherme Naufal; João Paulo Maciel.
 * @version 1.0
 */
public class PessoaFisica extends Cliente implements Serializable {
    private static final long serialVersionUID = 3L;

    /**
     * Documento CPF do cliente Pessoa Física.
     */
    private String cpf;

    /**
     * Documento RG do cliente Pessoa Física.
     */
    private String rg;

    //--------------------------------------------------------------------------------------------------------
    //Métodos construtores:

    //Método construtor padrão (objetivo: manter padrão javaBeans):
    /**
     * Método Construtor padrão.
     */
    public PessoaFisica() {
        super();
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
     * @param cpf Recebe o CPF da PessoaFísica.
     * @param rg Recebe o RG da PessoaFísica.
     */
    public PessoaFisica(String nome, int cep, int nroLogradouro, String complemento, int telContato, String senha, List<Conta> contas, String email, String cpf, String rg) {
        super(nome, cep, nroLogradouro, complemento, telContato, senha, contas, email);
        this.cpf = cpf;
        this.rg = rg;
    }

    //--------------------------------------------------------------------------------
    // Métodos Getters e Setters:

    /**
     * Método GET que irá retornar o CPF.
     * @return Retorna o CPF.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Método SET que pode ser utilizado para alterar o CPF.
     * @param cpf O CPF a ser definido.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Método GET que irá retornar o RG.
     * @return Retorna o RG.
     */
    public String getRg() {
        return rg;
    }

    /**
     * Método SET que pode ser utilizado para alterar o RG.
     * @param rg O RG a ser definido.
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    //--------------------------------------------------------------------------------
    //Métodos Adicionais:
    /**
     * Método que verifica se um cliente Pessoa Física está cadastrado, com base no CPF.
     * @param cpf O CPF a ser verificado.
     * @return Retorna true se o CPF corresponder ao cliente atual e false caso contrário.
     */
    public boolean consultarPessoaFisica(String cpf) {
        return this.cpf.equals(cpf);
    }
} //FIM

