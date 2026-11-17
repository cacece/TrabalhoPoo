package modelos.cargos;

import modelos.Funcionario;

/**
 * Classe concreta que representa o cargo de Faxineiro da academia.
 * Herda de Funcionario e calcula o salário com adicional de insalubridade.
 */
public class Faxineiro extends Funcionario {

    private double percentualInsalubridade;

    /**
     * Construtor completo do Faxineiro.
     *
     * @param cpf CPF do faxineiro
     * @param nome nome completo
     * @param telefone telefone de contato
     * @param matriculaFuncional matrícula funcional
     * @param salarioBase salário base mensal
     * @param dataAdmissao data de admissão
     * @param banco banco dos dados bancários
     * @param agencia agência bancária
     * @param conta conta bancária
     * @param chavePix chave Pix
     * @param percentualInsalubridade percentual de insalubridade (ex.: 20.0 para 20%)
     */
    public Faxineiro(String cpf, String nome, String telefone,
                     String matriculaFuncional, double salarioBase, String dataAdmissao,
                     String banco, String agencia, String conta, String chavePix,
                     double percentualInsalubridade) {
        super(cpf, nome, telefone, matriculaFuncional, salarioBase, dataAdmissao,
              banco, agencia, conta, chavePix);
        this.percentualInsalubridade = percentualInsalubridade;
    }

    /**
     * Calcula o salário mensal do faxineiro aplicando o percentual de insalubridade.
     *
     * @return salário mensal total
     */
    @Override
    public double calcularValorMensal() {
        return getSalarioBase() + (getSalarioBase() * (percentualInsalubridade / 100.0));
    }

    public double getPercentualInsalubridade() {
        return percentualInsalubridade;
    }

    public void setPercentualInsalubridade(double percentualInsalubridade) {
        this.percentualInsalubridade = percentualInsalubridade;
    }
}
