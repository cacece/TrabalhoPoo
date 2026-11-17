package modelos.cargos;

import modelos.Funcionario;

/**
 * Classe concreta que representa o cargo de Administrador da academia.
 * Herda de Funcionario e calcula o salário considerando bônus por meta batida.
 */
public class Administrador extends Funcionario {

    private double bonusGestao;
    private boolean metaBatida;

    /**
     * Construtor completo do Administrador.
     *
     * @param cpf CPF do administrador
     * @param nome nome completo
     * @param telefone telefone de contato
     * @param matriculaFuncional matrícula funcional
     * @param salarioBase salário base mensal
     * @param dataAdmissao data de admissão
     * @param banco banco dos dados bancários
     * @param agencia agência bancária
     * @param conta conta bancária
     * @param chavePix chave Pix
     * @param bonusGestao valor do bônus de gestão
     * @param metaBatida indica se a meta mensal foi atingida
     */
    public Administrador(String cpf, String nome, String telefone,
                         String matriculaFuncional, double salarioBase, String dataAdmissao,
                         String banco, String agencia, String conta, String chavePix,
                         double bonusGestao, boolean metaBatida) {
        super(cpf, nome, telefone, matriculaFuncional, salarioBase, dataAdmissao,
              banco, agencia, conta, chavePix);
        this.bonusGestao = bonusGestao;
        this.metaBatida = metaBatida;
    }

    /**
     * Calcula o salário mensal do administrador.
     * Soma o bônus de gestão apenas se a meta tiver sido batida.
     *
     * @return salário mensal total
     */
    @Override
    public double calcularValorMensal() {
        return getSalarioBase() + (metaBatida ? bonusGestao : 0.0);
    }

    public double getBonusGestao() {
        return bonusGestao;
    }

    public void setBonusGestao(double bonusGestao) {
        this.bonusGestao = bonusGestao;
    }

    public boolean isMetaBatida() {
        return metaBatida;
    }

    public void setMetaBatida(boolean metaBatida) {
        this.metaBatida = metaBatida;
    }
}
