package modelos;

import composicao.PlanoAssinatura;

/**
 * Classe concreta que representa um aluno (cliente pagante) da academia.
 * Herda de Pessoa e possui um PlanoAssinatura por composição.
 */
public class Aluno extends Pessoa {

    private String matricula;
    private int diaVencimento;
    private boolean bolsista;
    private PlanoAssinatura plano;

    /**
     * Construtor completo do Aluno.
     * Cria internamente a instância de PlanoAssinatura para caracterizar a composição.
     *
     * @param cpf CPF do aluno
     * @param nome nome completo do aluno
     * @param telefone telefone de contato
     * @param matricula código de matrícula do aluno
     * @param diaVencimento dia de vencimento da mensalidade
     * @param bolsista indica se o aluno possui bolsa integral
     * @param nomePlano nome do plano contratado
     * @param valorBase valor base do plano
     * @param percentualDesconto percentual de desconto do plano
     */
    public Aluno(String cpf, String nome, String telefone,
                 String matricula, int diaVencimento, boolean bolsista,
                 String nomePlano, double valorBase, double percentualDesconto) {
        super(cpf, nome, telefone);
        this.matricula = matricula;
        this.diaVencimento = diaVencimento;
        this.bolsista = bolsista;
        // Composição: o plano é criado e gerenciado dentro do ciclo de vida do aluno
        this.plano = new PlanoAssinatura(nomePlano, valorBase, percentualDesconto);
    }

    /**
     * Calcula a mensalidade do aluno.
     * Se for bolsista, o valor é 0.0; caso contrário, aplica o desconto do plano.
     *
     * @return valor mensal a ser pago pelo aluno
     */
    @Override
    public double calcularValorMensal() {
        if (bolsista) {
            return 0.0;
        }
        return plano.calcularValorComDesconto();
    }

    /**
     * Identifica o tipo de movimentação financeira gerada pelo aluno.
     *
     * @return "RECEITA"
     */
    @Override
    public String getTipoMovimentacao() {
        return "RECEITA";
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getDiaVencimento() {
        return diaVencimento;
    }

    public void setDiaVencimento(int diaVencimento) {
        this.diaVencimento = diaVencimento;
    }

    public boolean isBolsista() {
        return bolsista;
    }

    public void setBolsista(boolean bolsista) {
        this.bolsista = bolsista;
    }

    public PlanoAssinatura getPlano() {
        return plano;
    }

    public void setPlano(PlanoAssinatura plano) {
        this.plano = plano;
    }
}
