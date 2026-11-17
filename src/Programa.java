import java.util.ArrayList;
import java.util.Scanner;
import modelos.Aluno;
import modelos.Pessoa;
import modelos.cargos.Administrador;
import modelos.cargos.Faxineiro;
import modelos.cargos.Instrutor;
import modelos.cargos.Recepcionista;

/**
 * Classe principal do sistema de gerenciamento financeiro e cadastral da academia.
 * Contém o ponto de entrada (main), a lista polimórfica de registros e o menu textual.
 */
public class Programa {

    // Estrutura de dados principal que armazena todas as pessoas (alunos e funcionários)
    private static ArrayList<Pessoa> registros = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Método principal que inicializa os dados de teste e executa o loop do menu.
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        carregarDadosIniciais();

        int opcao;
        do {
            exibirMenu();
            opcao = lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    incluirRegistro();
                    break;
                case 2:
                    alterarRegistro();
                    break;
                case 3:
                    excluirRegistro();
                    break;
                case 4:
                    buscarRegistro();
                    break;
                case 5:
                    listarRegistros();
                    break;
                case 6:
                    listarRegistrosOrdenados();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    /**
     * Exibe as opções do menu textual no console.
     */
    private static void exibirMenu() {
        System.out.println("\n=== SISTEMA DE ACADEMIA ===");
        System.out.println("1. Incluir registro");
        System.out.println("2. Alterar registro");
        System.out.println("3. Excluir registro");
        System.out.println("4. Buscar registro");
        System.out.println("5. Listar registros");
        System.out.println("6. Listar registros ordenados");
        System.out.println("0. Sair");
    }

    /**
     * Realiza a carga automática inicial de objetos para testes.
     * Requisito do trabalho: cadastrar automaticamente pelo menos 7 objetos de cada classe concreta.
     */
    private static void carregarDadosIniciais() {
        // TODO: Adicionar 7 objetos de cada uma das 5 classes concretas (total = 35 registros):
        // - 7 Aluno
        // - 7 Administrador
        // - 7 Instrutor
        // - 7 Recepcionista
        // - 7 Faxineiro
    }

    /**
     * Permite cadastrar um novo Aluno ou Funcionário na lista de registros.
     */
    private static void incluirRegistro() {
        // TODO: Implementar leitura dos dados e escolha do tipo de pessoa/cargo
        System.out.println("Funcionalidade 'Incluir registro' ainda não implementada.");
    }

    /**
     * Permite alterar os dados de um registro existente a partir de um identificador (ex.: CPF).
     */
    private static void alterarRegistro() {
        // TODO: Implementar busca do registro e atualização dos atributos
        System.out.println("Funcionalidade 'Alterar registro' ainda não implementada.");
    }

    /**
     * Permite remover um registro da lista a partir de um identificador (ex.: CPF).
     */
    private static void excluirRegistro() {
        // TODO: Implementar localização e remoção do objeto no ArrayList
        System.out.println("Funcionalidade 'Excluir registro' ainda não implementada.");
    }

    /**
     * Permite buscar e exibir um registro específico a partir de um dos seus atributos.
     */
    private static void buscarRegistro() {
        // TODO: Implementar busca por atributo (ex.: CPF ou nome) e exibição detalhada
        System.out.println("Funcionalidade 'Buscar registro' ainda não implementada.");
    }

    /**
     * Lista todos os registros cadastrados em formato tabular.
     */
    private static void listarRegistros() {
        // TODO: Implementar exibição em formato tabular usando System.out.printf
        System.out.println("Total de registros carregados: " + registros.size());
    }

    /**
     * Lista todos os registros cadastrados em formato tabular, ordenados por algum atributo.
     */
    private static void listarRegistrosOrdenados() {
        // TODO: Implementar ordenação (ex.: por nome ou valor mensal) e exibição tabular
        System.out.println("Funcionalidade 'Listar registros ordenados' ainda não implementada.");
    }

    /**
     * Lê um número inteiro do console com tratamento básico para evitar falhas de entrada.
     *
     * @param mensagem texto exibido antes da leitura
     * @return número inteiro digitado pelo usuário
     */
    private static int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextInt()) {
            System.out.print("Digite um número válido: ");
            scanner.next();
        }
        int valor = scanner.nextInt();
        scanner.nextLine(); // Limpa a quebra de linha pendente no buffer
        return valor;
    }
}
