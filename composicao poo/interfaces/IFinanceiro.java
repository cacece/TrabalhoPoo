package interfaces;

import java.util.List;
import modelos.Aluno;
import modelos.Funcionario;

// interface com os metodos do financeiro para usar na injecao de dependencia
public interface IFinanceiro {
    public double calcularTotalEntradas(List<Aluno> alunos);
    public double calcularTotalSaidas(List<Funcionario> funcionarios);
    public double calcularFaturamento(List<Aluno> alunos, List<Funcionario> funcionarios);
}
