package modelos.cargos;

import modelos.Funcionario;

/**
 * Classe concreta que representa o cargo de Instrutor da academia.
 * Herda de Funcionario e calcula o salário somando horas de aulas extras.
 */
public class Instrutor extends Funcionario {

    private String cref;
    private String especialidade;
    private int horasAulasExtras;
    private double valorHoraExtra;

    /**
     * Construtor completo do Instrutor.
     *
     * @param cpf CPF do instrutor
     * @param nome nome completo
     * @param telefone telefone de contato
     * @param matriculaFuncional matrícula funcional
     * @param salarioBase salário base mensal
     * @param dataAdmissao data de admissão
     * @param banco banco dos dados bancários
     * @param agencia agência bancária
     * @param conta conta bancária
     * @param chavePix chave Pix
     * @param cref registro profissional CREF
     * @param especialidade área de atuação (ex.: Musculação, Funcional)
     * @param horasAulasExtras quantidade de horas extras ministradas
     * @param valorHoraExtra valor pago por hora extra
     */
    public Instrutor(String cpf, String nome, String telefone,
                     String matriculaFuncional, double salarioBase, String dataAdmissao,
                     String banco, String agencia, String conta, String chavePix,
                     String cref, String especialidade, int horasAulasExtras, double valorHoraExtra) {
        super(cpf, nome, telefone, matriculaFuncional, salarioBase, dataAdmissao,
              banco, agencia, conta, chavePix);
        this.cref = cref;
        this.especialidade = especialidade;
        this.horasAulasExtras = horasAulasExtras;
        this.valorHoraExtra = valorHoraExtra;
    }

    /**
     * Calcula o salário mensal do instrutor somando o valor das aulas extras.
     *
     * @return salário mensal total
     */
    @Override
    public double calcularValorMensal() {
        return getSalarioBase() + (horasAulasExtras * valorHoraExtra);
    }

    public String getCref() {
        return cref;
    }

    public void setCref(String cref) {
        this.cref = cref;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getHorasAulasExtras() {
        return horasAulasExtras;
    }

    public void setHorasAulasExtras(int horasAulasExtras) {
        this.horasAulasExtras = horasAulasExtras;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }
}
