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

    // repassa a chamada de entradas para a interface
    public void mostrarEntradas(List<Aluno> alunos){
        financeiro.listarEntradas(alunos);
    }

    // repassa a chamada de saidas para a interface
    public void mostrarSaidas(List<Funcionario> funcionarios){
        financeiro.listarSaidas(funcionarios);
    }

    // repassa o calculo e exibicao do faturamento para a interface
    public void mostrarFaturamento(List<Aluno> alunos, List<Funcionario> funcionarios){
        financeiro.exibirFaturamento(alunos, funcionarios);
    }
}
