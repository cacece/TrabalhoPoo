package modelos;

import composicao.DadosBancarios;

/**
 * Classe abstrata intermediária que representa um funcionário da academia.
 * Herda de Pessoa, impede o cadastro de funcionário sem cargo definido
 * e possui DadosBancarios por composição.
 */
public abstract class Funcionario extends Pessoa {

    private String matriculaFuncional;
    private double salarioBase;
    private String dataAdmissao;
    private DadosBancarios dadosBancarios;

    /**
     * Construtor base para inicializar os dados trabalhistas e bancários do funcionário.
     * Cria internamente a instância de DadosBancarios para caracterizar a composição.
     *
     * @param cpf CPF do funcionário
     * @param nome nome completo do funcionário
     * @param telefone telefone de contato
     * @param matriculaFuncional matrícula funcional na academia
     * @param salarioBase salário base mensal
     * @param dataAdmissao data de admissão no formato texto
     * @param banco nome do banco
     * @param agencia número da agência
     * @param conta número da conta
     * @param chavePix chave Pix do funcionário
     */
    public Funcionario(String cpf, String nome, String telefone,
                       String matriculaFuncional, double salarioBase, String dataAdmissao,
                       String banco, String agencia, String conta, String chavePix) {
        super(cpf, nome, telefone);
        this.matriculaFuncional = matriculaFuncional;
        this.salarioBase = salarioBase;
        this.dataAdmissao = dataAdmissao;
        // Composição: os dados bancários pertencem ao funcionário
        this.dadosBancarios = new DadosBancarios(banco, agencia, conta, chavePix);
    }

    /**
     * Define que todo funcionário representa uma despesa para a academia.
     *
     * @return "DESPESA"
     */
    @Override
    public String getTipoMovimentacao() {
        return "DESPESA";
    }

    public String getMatriculaFuncional() {
        return matriculaFuncional;
    }

    public void setMatriculaFuncional(String matriculaFuncional) {
        this.matriculaFuncional = matriculaFuncional;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public DadosBancarios getDadosBancarios() {
        return dadosBancarios;
    }

    public void setDadosBancarios(DadosBancarios dadosBancarios) {
        this.dadosBancarios = dadosBancarios;
    }
}
