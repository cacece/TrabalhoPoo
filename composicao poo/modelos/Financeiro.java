package modelos;

import java.util.List;
import interfaces.IFinanceiro;

// implementa os calculos de entradas, saidas e faturamento
public class Financeiro implements IFinanceiro {

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

    // lista cada aluno com o valor pago em tabela e mostra o total no final
    public void listarEntradas(List<Aluno> alunos){
        System.out.println("Entradas (Receitas):");
        System.out.println("---------------------------------------");
        System.out.printf("%-22s | %-12s%n", "Aluno", "Valor Pago");
        System.out.println("---------------------------------------");
        for(int i = 0; i < alunos.size(); i++){
            System.out.printf("%-22s | %-12.2f%n", alunos.get(i).getNome(), alunos.get(i).getPlano().getvalor());
        }
        System.out.println("---------------------------------------");
        System.out.printf("Total de entradas: %.2f%n", calcularTotalEntradas(alunos));
    }

    // lista cada funcionario com o salario em tabela e mostra o total no final
    public void listarSaidas(List<Funcionario> funcionarios){
        System.out.println("Saidas (Despesas):");
        System.out.println("---------------------------------------");
        System.out.printf("%-22s | %-12s%n", "Funcionario", "Salario");
        System.out.println("---------------------------------------");
        for(int i = 0; i < funcionarios.size(); i++){
            System.out.printf("%-22s | %-12.2f%n", funcionarios.get(i).getNome(), funcionarios.get(i).getSalario());
        }
        System.out.println("---------------------------------------");
        System.out.printf("Total de saidas: %.2f%n", calcularTotalSaidas(funcionarios));
    }

    // mostra os totais e o faturamento da empresa
    public void exibirFaturamento(List<Aluno> alunos, List<Funcionario> funcionarios){
        System.out.println("Total de entradas: " + calcularTotalEntradas(alunos));
        System.out.println("Total de saidas: " + calcularTotalSaidas(funcionarios));
        System.out.println("Faturamento (Saldo): " + calcularFaturamento(alunos, funcionarios));
    }
}
