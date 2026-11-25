package modelos;

import java.util.List;
import interfaces.IFinanceiro;

// recebe a interface IFinanceiro pelo construtor (injecao de dependencia)
public class ControleFinanceiro {
    private IFinanceiro financeiro;

    // guarda a implementacao que foi passada de fora
    public ControleFinanceiro(IFinanceiro financeiro){
        this.financeiro = financeiro;
    }

    public double calcularTotalEntradas(List<Aluno> alunos){
        return financeiro.calcularTotalEntradas(alunos);
    }

    public double calcularTotalSaidas(List<Funcionario> funcionarios){
        return financeiro.calcularTotalSaidas(funcionarios);
    }

    public double calcularFaturamento(List<Aluno> alunos, List<Funcionario> funcionarios){
        return financeiro.calcularFaturamento(alunos, funcionarios);
    }

    @Override
    public String toString(){
        return "ControleFinanceiro: " + financeiro;
    }
}
