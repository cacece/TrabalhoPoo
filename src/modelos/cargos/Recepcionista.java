package modelos.cargos;

import modelos.Funcionario;

/**
 * Classe concreta que representa o cargo de Recepcionista da academia.
 * Herda de Funcionario e calcula o salário somando comissões por matrícula.
 */
public class Recepcionista extends Funcionario {

    private String turno;
    private int matriculasRealizadas;
    private double comissaoPorMatricula;

    /**
     * Construtor completo do Recepcionista.
     *
     * @param cpf CPF do recepcionista
     * @param nome nome completo
     * @param telefone telefone de contato
     * @param matriculaFuncional matrícula funcional
     * @param salarioBase salário base mensal
     * @param dataAdmissao data de admissão
     * @param banco banco dos dados bancários
     * @param agencia agência bancária
     * @param conta conta bancária
     * @param chavePix chave Pix
     * @param turno turno de trabalho (ex.: Manhã, Tarde, Noite)
     * @param matriculasRealizadas quantidade de matrículas realizadas no mês
     * @param comissaoPorMatricula valor da comissão por cada matrícula
     */
    public Recepcionista(String cpf, String nome, String telefone,
                         String matriculaFuncional, double salarioBase, String dataAdmissao,
                         String banco, String agencia, String conta, String chavePix,
                         String turno, int matriculasRealizadas, double comissaoPorMatricula) {
        super(cpf, nome, telefone, matriculaFuncional, salarioBase, dataAdmissao,
              banco, agencia, conta, chavePix);
        this.turno = turno;
        this.matriculasRealizadas = matriculasRealizadas;
        this.comissaoPorMatricula = comissaoPorMatricula;
    }

    /**
     * Calcula o salário mensal do recepcionista com as comissões de matrícula.
     *
     * @return salário mensal total
     */
    @Override
    public double calcularValorMensal() {
        return getSalarioBase() + (matriculasRealizadas * comissaoPorMatricula);
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getMatriculasRealizadas() {
        return matriculasRealizadas;
    }

    public void setMatriculasRealizadas(int matriculasRealizadas) {
        this.matriculasRealizadas = matriculasRealizadas;
    }

    public double getComissaoPorMatricula() {
        return comissaoPorMatricula;
    }

    public void setComissaoPorMatricula(double comissaoPorMatricula) {
        this.comissaoPorMatricula = comissaoPorMatricula;
    }
}
