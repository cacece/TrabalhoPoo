package composicao;

/**
 * Classe auxiliar que armazena os dados bancários de um funcionário.
 * Faz parte de uma relação de composição com a classe Funcionario.
 */
public class DadosBancarios {

    private String banco;
    private String agencia;
    private String conta;
    private String chavePix;

    /**
     * Construtor completo dos dados bancários.
     *
     * @param banco nome ou código do banco
     * @param agencia número da agência
     * @param conta número da conta
     * @param chavePix chave Pix para pagamento
     */
    public DadosBancarios(String banco, String agencia, String conta, String chavePix) {
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
        this.chavePix = chavePix;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }
}
