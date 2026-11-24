package modelos;

import interfaces.calculos;

// funcionario herda de Pessoa e calcula o salario pela funcao
public class Funcionario extends Pessoa implements calculos{
    private TpFunc funcao;
    private double salario;

    // ja define o salario automaticamente ao criar o funcionario
    public Funcionario(TpFunc funcao, String nome, int cpf, int telefone){
        super(nome, cpf, telefone);
        this.funcao = funcao;
        defineValor();
    }

    public TpFunc getFuncao(){ 
        return funcao;
    }
    public void setFuncao(TpFunc funcao){
        this.funcao = funcao;
    }
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    // atribui o salario de acordo com o cargo
    public void defineValor(){
        if(this.funcao == TpFunc.Adimnistrador){
            this.salario = 2400;
        }
        if(this.funcao == TpFunc.Faxineiro){
            this.salario = 1650;
        }
        if(this.funcao == TpFunc.Instrutor){
            this.salario = 1900;
        }
        if(this.funcao == TpFunc.Recepcionista){
            this.salario = 1750;
        }        
    }

    // junta os dados da pessoa com cargo e salario
    @Override 
    public String toString(){
        return super.toString() + " Cargo: " + funcao + " Salario: " + salario;
    }

}
