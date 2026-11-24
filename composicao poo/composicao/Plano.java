package composicao;

import interfaces.calculos;

// classe de composicao que guarda o plano e pagamento do aluno
public class Plano implements calculos{
    private TpPag TpPag;
    private TpPlano tpPlano;
    private double valor;

    // ja define o valor automaticamente quando cria o plano
    public Plano (TpPag TpPag, TpPlano tpPlano){
            this.TpPag = TpPag;
            this.tpPlano = tpPlano;
            defineValor();
    }

    public TpPag geTpPag(){
        return TpPag;
    }
    public void setTpPag(TpPag TpPag){
        this.TpPag = TpPag;
    }
    public TpPlano getTpPlano(){
        return tpPlano;
    }
    // atualiza o tipo de plano e recalcula o valor
    public void setTpPlano(TpPlano tpPlano){
        this.tpPlano = tpPlano;
        defineValor();
    }
    public double getvalor(){
        return valor;
    }
    public void setvalor(double valor){
        this.valor = valor;
    }

    // define o preco de acordo com o tipo de plano
    public void defineValor() {
        if (this.tpPlano == TpPlano.Pro) { 
            this.valor = 1000.00;
        } else {  
            this.valor = 600.00;
        }
    }

    // formata os dados do plano para impressao
    @Override
    public String toString(){
        return "Tipo de Pagamento: " + TpPag + " Plano: " + tpPlano + " Valor: " + valor;
    }


}
