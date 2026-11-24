package modelos;

import composicao.Plano;

// aluno herda de Pessoa e tem um Plano por composicao
public class Aluno extends Pessoa {
    private Plano plano;

    public Aluno (Plano plano, String nome, int cpf, int telefone){
        super(nome, cpf, telefone);
        this.plano = plano;
    }

    public Plano getPlano(){
        return plano;
    }
    public void setPlano(Plano plano){
        this.plano = plano;
    }

    // junta os dados da pessoa com os dados do plano
    @Override 
    public String toString (){
        return super.toString() + " Plano: " + plano;
    }
    
}
