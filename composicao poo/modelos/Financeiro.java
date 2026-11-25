package modelos;

import java.util.List;
import interfaces.IFinanceiro;

// implementa os calculos de entradas, saidas e faturamento
public class Financeiro implements IFinanceiro {

    public Financeiro(){
    }

    // soma o valor pago por todos os alunos
    public double calcularTotalEntradas(List<Aluno> alunos){
        double totalEntradas = 0;
        for(int i = 0; i < alunos.size(); i++){
            totalEntradas += alunos.get(i).getPlano().getvalor();
        }
        return totalEntradas;
    }

    // soma o salario de todos os funcionarios
    public double calcularTotalSaidas(List<Funcionario> funcionarios){
        double totalSaidas = 0;
        for(int i = 0; i < funcionarios.size(); i++){
            totalSaidas += funcionarios.get(i).getSalario();
        }
        return totalSaidas;
    }

    // calcula o saldo final (entradas menos saidas)
    public double calcularFaturamento(List<Aluno> alunos, List<Funcionario> funcionarios){
        return calcularTotalEntradas(alunos) - calcularTotalSaidas(funcionarios);
    }

    @Override
    public String toString(){
        return "Financeiro";
    }
}
