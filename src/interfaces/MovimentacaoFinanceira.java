package interfaces;

/**
 * Interface que define o contrato financeiro do sistema da academia.
 * Garante o polimorfismo entre receitas (alunos) e despesas (funcionários).
 */
public interface MovimentacaoFinanceira {

    /**
     * Calcula o valor mensal final da movimentação
     * (mensalidade a receber ou salário a pagar).
     *
     * @return valor mensal calculado em reais
     */
    double calcularValorMensal();

    /**
     * Retorna o tipo da movimentação financeira.
     *
     * @return "RECEITA" para alunos ou "DESPESA" para funcionários
     */
    String getTipoMovimentacao();
}
