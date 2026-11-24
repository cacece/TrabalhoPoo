package programa;

import modelos.Aluno;
import modelos.Funcionario;
import modelos.Financeiro;
import modelos.ControleFinanceiro;
import interfaces.IFinanceiro;
import java.util.Scanner;
import java.util.ArrayList; 
import java.util.List;
import modelos.TpFunc;
import composicao.Plano;
import composicao.TpPlano;
import composicao.TpPag;
import java.util.Comparator;

// classe principal com o menu do sistema
public class Programa{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // listas que guardam os alunos e funcionarios cadastrados
        List<Aluno> alunos = new ArrayList<Aluno>();
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        // cria o financeiro e injeta na classe de controle via interface
        IFinanceiro financeiro = new Financeiro();
        ControleFinanceiro controleFinanceiro = new ControleFinanceiro(financeiro);

        // 7 Funcionários iniciais (cobrindo as funções do enum TpFunc)
        funcionarios.add(new Funcionario(TpFunc.Adimnistrador, "Roberto Almeida", 101202303, 991112222));
        funcionarios.add(new Funcionario(TpFunc.Instrutor, "Fernanda Costa", 202303404, 992223333));
        funcionarios.add(new Funcionario(TpFunc.Recepcionista, "Juliana Mendes", 303404505, 993334444));
        funcionarios.add(new Funcionario(TpFunc.Faxineiro, "Carlos Silva", 404505606, 994445555));
        funcionarios.add(new Funcionario(TpFunc.Instrutor, "Marcos Pereira", 111222333, 998881111));
        funcionarios.add(new Funcionario(TpFunc.Recepcionista, "Patrícia Lima", 222333444, 998882222));
        funcionarios.add(new Funcionario(TpFunc.Faxineiro, "Eduardo Rocha", 333444555, 998883333));
        // Ordena os funcionários por nome
        funcionarios.sort(Comparator.comparing(Funcionario::getNome, String.CASE_INSENSITIVE_ORDER));

        // 7 Alunos iniciais (variando planos e formas de pagamento)
        alunos.add(new Aluno(new Plano(TpPag.Pix, TpPlano.Pro), "Mariana Souza", 505606707, 995556666));
        alunos.add(new Aluno(new Plano(TpPag.Credito, TpPlano.Standard), "Gabriel Oliveira", 606707808, 996667777));
        alunos.add(new Aluno(new Plano(TpPag.Debito, TpPlano.Pro), "Beatriz Santos", 707808909, 997778888));
        alunos.add(new Aluno(new Plano(TpPag.Pix, TpPlano.Standard), "Lucas Ferreira", 444555666, 998884444));
        alunos.add(new Aluno(new Plano(TpPag.Credito, TpPlano.Pro), "Camila Martins", 555666777, 998885555));
        alunos.add(new Aluno(new Plano(TpPag.Debito, TpPlano.Standard), "Rafael Alves", 666777888, 998886666));
        alunos.add(new Aluno(new Plano(TpPag.Pix, TpPlano.Pro), "Amanda Ribeiro", 777888999, 998887777));
        // Ordena os alunos por nome
        alunos.sort(Comparator.comparing(Aluno::getNome, String.CASE_INSENSITIVE_ORDER));

        // loop principal do menu
        boolean continuar = true;
        while(continuar){
            System.out.println("Olá, oque gostaria de fazer: ");
            System.out.println("Digite:\n1-Incluir funcionario/aluno\n2-alterar funcionario/aluno\n3-Excluir funcionario/aluno\n4-Listar funcionarios/alunos\n5-Listar uma unica pessoa\n6-Entradas\n7-Saidas\n8-Faturamento\n9-Sair");
            int opcao = sc.nextInt();
            switch(opcao){
                // cadastrar novo funcionario ou aluno
                case 1: 
                    System.out.println("Digite 1 para funcionario ou 2 para aluno:");
                    int opcao2 = sc.nextInt();
                    switch(opcao2){
                        case 1:
                            System.out.println("Digite o nome do funcionario:");
                            String nome = sc.next();
                            System.out.println("Digite o cpf do funcionario:");
                            int cpf = sc.nextInt();
                            System.out.println("Digite o telefone do funcionario:");
                            int telefone = sc.nextInt();
                            System.out.println("Digite a função do funcionario (Administrador, Faxineiro, Instrutor, Recepcionista):");
                            String funcao = sc.next();
                            TpFunc funcaoEnum = TpFunc.valueOf(funcao);
                            funcionarios.add(new Funcionario(funcaoEnum, nome, cpf, telefone));
                            funcionarios.sort(Comparator.comparing(Funcionario::getNome, String.CASE_INSENSITIVE_ORDER));
                            break;
                case 2:
                            System.out.println("Digite o nome do aluno:");
                            String nomeAluno = sc.next();
                            System.out.println("Digite o cpf do aluno:");
                            int cpfAluno = sc.nextInt();
                            System.out.println("Digite o telefone do aluno:");
                            int telefoneAluno = sc.nextInt();
                            System.out.println("Digite o plano do aluno (Standard, Pro):");
                            String p = sc.next();
                            TpPlano planoEnum = TpPlano.valueOf(p);
                            System.out.println("Digite o tipo de pagamento do aluno (Debito, Credito, Pix):");
                            String t = sc.next();
                            TpPag tipoPagamento = TpPag.valueOf(t);
                            Plano plano = new Plano(tipoPagamento, planoEnum);
                            alunos.add(new Aluno(plano, nomeAluno, cpfAluno, telefoneAluno));
                            alunos.sort(Comparator.comparing(Aluno::getNome, String.CASE_INSENSITIVE_ORDER));
                            break;
                    }
                    break;
                // alterar dados buscando pelo cpf
                case 2:
                    System.out.println("Gostaria de alterar: 1-funcionario, 2-aluno");
                    int opcao3 = sc.nextInt();
                    switch(opcao3){
                        case 1:
                            System.out.println("Digite o cpf do funcionario que deseja alterar:");
                            int cpfAlterarFuncionario = sc.nextInt();
                            for(int i = 0; i < funcionarios.size(); i++){
                                if(funcionarios.get(i).getCpf() == cpfAlterarFuncionario){
                                    System.out.println("Digite o novo nome do funcionario:");
                                    String novoNome = sc.next();
                                    funcionarios.get(i).setNome(novoNome);
                                    System.out.println("Digite o novo telefone do funcionario:");
                                    int novoTelefone = sc.nextInt();
                                    funcionarios.get(i).setTelefone(novoTelefone);
                                    System.out.println("Digite a nova função do funcionario (Administrador, Faxineiro, Instrutor, Recepcionista):");
                                    String novaFuncao = sc.next();
                                    TpFunc novaFuncaoEnum = TpFunc.valueOf(novaFuncao);
                                    funcionarios.get(i).setFuncao(novaFuncaoEnum);
                                    funcionarios.sort(Comparator.comparing(Funcionario::getNome, String.CASE_INSENSITIVE_ORDER));
                                }
                            }
                            break;
                case 2:
                            System.out.println("Digite o cpf do aluno que deseja alterar:");
                            int cpfAlterarAluno = sc.nextInt();
                            for(int i = 0; i < alunos.size(); i++){
                                if(alunos.get(i).getCpf() == cpfAlterarAluno){
                                    System.out.println("digite o novo nome do aluno:");
                                    String novoNomeAluno = sc.next();
                                    alunos.get(i).setNome(novoNomeAluno);
                                    System.out.println("Digite o novo telefone do aluno:");
                                    int novoTelefoneAluno = sc.nextInt();
                                    alunos.get(i).setTelefone(novoTelefoneAluno);
                                    System.out.println("Digite o novo plano do aluno (Basico, Pro):");
                                    String novoPlano = sc.next();
                                    TpPlano novoPlanoEnum = TpPlano.valueOf(novoPlano);
                                    alunos.get(i).getPlano().setTpPlano(novoPlanoEnum);
                                    System.out.println("Digite o novo tipo de pagamento do aluno (Debito, Credito, Pix):");
                                    String novoTipoPagamento = sc.next();
                                    TpPag novoTipoPagamentoEnum = TpPag.valueOf(novoTipoPagamento);
                                    alunos.get(i).getPlano().setTpPag(novoTipoPagamentoEnum);
                                    alunos.sort(Comparator.comparing(Aluno::getNome, String.CASE_INSENSITIVE_ORDER));
                                }
                            }

                    }
                    break;
                // remover funcionario ou aluno pelo cpf
                case 3:
                    System.out.println("Gostaria de remover: 1-funcionario 2-aluno");
                    int opcao4 = sc.nextInt();
                    switch(opcao4){
                        case 1:
                            System.out.println("Digite o cpf do funcionario que deseja remover:");
                            int cpfRemoverFuncionario = sc.nextInt();
                            for(int i = 0; i < funcionarios.size(); i++){
                                if(funcionarios.get(i).getCpf() == cpfRemoverFuncionario){
                                    funcionarios.remove(i);
                                    System.out.println("Funcionario removido");
                                }
                            }
                            break;
                case 2:
                            System.out.println("Digite o cpf do aluno que deseja remover:");
                            int cpfRemoverAluno = sc.nextInt();
                            for(int i = 0; i < alunos.size(); i++){
                                if(alunos.get(i).getCpf() == cpfRemoverAluno){
                                    alunos.remove(i);
                                    System.out.println("Aluno removido");
                                }
                            }
                            break;
                    }
                    break;
                // listar todos os alunos, funcionarios ou filtrar por cargo em formato tabular
                case 4:
                    System.out.println("Gostaria de listar: 1-alunos 2-funcionarios 3-todos");
                    int opcao5 = sc.nextInt();
                    switch(opcao5){
                        case 1:
                            imprimirTabelaAlunos(alunos);
                            break;
                        case 2:
                            System.out.println("Qual tipo de funcionario você quer listar? 1-Administrador 2-Faxineiro 3-Instrutor 4-Recepcionista 5-todos");
                            int opcao5_1 = sc.nextInt();
                            switch (opcao5_1){
                                case 1:
                                    imprimirTabelaFuncionarios(funcionarios, TpFunc.Adimnistrador);
                                    break;
                                case 2:
                                    imprimirTabelaFuncionarios(funcionarios, TpFunc.Faxineiro);
                                    break;
                                case 3:
                                    imprimirTabelaFuncionarios(funcionarios, TpFunc.Instrutor);
                                    break;
                                case 4:
                                    imprimirTabelaFuncionarios(funcionarios, TpFunc.Recepcionista);
                                    break;
                                case 5:
                                    imprimirTabelaFuncionarios(funcionarios, null);
                                    break;
                            }
                            break;
                        case 3:
                            imprimirTabelaFuncionarios(funcionarios, null);
                            System.out.println(" ");
                            imprimirTabelaAlunos(alunos);
                            break;
                    }
                    break;
                // buscar uma unica pessoa pelo cpf
                case 5:
                    System.out.println("Gostaria de encontrar um: 1-funcionario 2-aluno");
                    int opcao6 = sc.nextInt();
                    switch(opcao6){
                        case 1:
                            System.out.println("Digite o cpf do funcionario que deseja encontrar:");
                            int cpfEncontrarFuncionario = sc.nextInt();
                            for(int i = 0; i < funcionarios.size(); i++){
                                if(funcionarios.get(i).getCpf() == cpfEncontrarFuncionario){
                                    System.out.println(funcionarios.get(i));
                                }
                            }
                            break;
                case 2:
                            System.out.println("Digite o cpf do aluno que deseja encontrar:");
                            int cpfEncontrarAluno = sc.nextInt();
                            for(int i = 0; i < alunos.size(); i++){
                                if(alunos.get(i).getCpf() == cpfEncontrarAluno){
                                    System.out.println(alunos.get(i));
                                }
                            }
                            break;
                    }
                    break;
                // lista alunos com valor pago e total de entradas
                case 6:
                    controleFinanceiro.mostrarEntradas(alunos);
                    break;
                // lista funcionarios com salario e total de saidas
                case 7:
                    controleFinanceiro.mostrarSaidas(funcionarios);
                    break;
                // calcula e exibe o faturamento (entradas - saidas)
                case 8:
                    controleFinanceiro.mostrarFaturamento(alunos, funcionarios);
                    break;
                // sai do programa
                case 9:
                    continuar = false;
                    break;
            }
        }
        sc.close();
    }

    // imprime os alunos em formato de tabela
    public static void imprimirTabelaAlunos(List<Aluno> alunos){
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.printf("%-20s | %-11s | %-11s | %-10s | %-10s | %-10s%n", "Nome", "CPF", "Telefone", "Pagamento", "Plano", "Valor");
        System.out.println("---------------------------------------------------------------------------------------");
        for(int i = 0; i < alunos.size(); i++){
            Aluno a = alunos.get(i);
            System.out.printf("%-20s | %-11d | %-11d | %-10s | %-10s | %-10.2f%n", a.getNome(), a.getCpf(), a.getTelefone(), a.getPlano().geTpPag(), a.getPlano().getTpPlano(), a.getPlano().getvalor());
        }
        System.out.println("---------------------------------------------------------------------------------------");
    }

    // imprime os funcionarios em formato de tabela (com filtro opcional por cargo)
    public static void imprimirTabelaFuncionarios(List<Funcionario> funcionarios, TpFunc filtro){
        System.out.println("-------------------------------------------------------------------------------");
        System.out.printf("%-20s | %-11s | %-11s | %-15s | %-10s%n", "Nome", "CPF", "Telefone", "Cargo", "Salario");
        System.out.println("-------------------------------------------------------------------------------");
        for(int i = 0; i < funcionarios.size(); i++){
            Funcionario f = funcionarios.get(i);
            if(filtro == null || f.getFuncao() == filtro){
                System.out.printf("%-20s | %-11d | %-11d | %-15s | %-10.2f%n", f.getNome(), f.getCpf(), f.getTelefone(), f.getFuncao(), f.getSalario());
            }
        }
        System.out.println("-------------------------------------------------------------------------------");
    }
}