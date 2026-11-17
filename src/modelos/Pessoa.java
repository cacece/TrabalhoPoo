package modelos;

import interfaces.MovimentacaoFinanceira;

/**
 * Classe abstrata raiz que representa qualquer pessoa cadastrada no sistema.
 * Implementa MovimentacaoFinanceira e impede a instanciação de uma pessoa genérica.
 */
public abstract class Pessoa implements MovimentacaoFinanceira {

    private String cpf;
    private String nome;
    private String telefone;

    /**
     * Construtor base para inicializar os dados comuns de uma pessoa.
     *
     * @param cpf CPF da pessoa
     * @param nome nome completo da pessoa
     * @param telefone telefone de contato
     */
    public Pessoa(String cpf, String nome, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
