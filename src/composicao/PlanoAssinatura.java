package composicao;

/**
 * Classe auxiliar que representa o plano de assinatura de um aluno.
 * Faz parte de uma relação de composição com a classe Aluno.
 */
public class PlanoAssinatura {

    private String nomePlano;
    private double valorBase;
    private double percentualDesconto;

    /**
     * Construtor completo do plano de assinatura.
     *
     * @param nomePlano nome do plano (ex.: Mensal, Trimestral, Anual)
     * @param valorBase valor base da mensalidade antes do desconto
     * @param percentualDesconto percentual de desconto aplicado (0 a 100)
     */
    public PlanoAssinatura(String nomePlano, double valorBase, double percentualDesconto) {
        this.nomePlano = nomePlano;
        this.valorBase = valorBase;
        this.percentualDesconto = percentualDesconto;
    }

    /**
     * Calcula o valor do plano já com o desconto aplicado.
     *
     * @return valor final após o desconto
     */
    public double calcularValorComDesconto() {
        double desconto = valorBase * (percentualDesconto / 100.0);
        return valorBase - desconto;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }
}
