package lista01.sistema_gerenciamento;

import lista01.sistema_gerenciamento.application.usecases.CadastrarFuncionarioUseCase;
import lista01.sistema_gerenciamento.application.usecases.CalcularSalarioPorDepartamentoUseCase;
import lista01.sistema_gerenciamento.application.usecases.ListarFuncionarioUseCase;
import lista01.sistema_gerenciamento.domain.entities.Funcionario;
import lista01.sistema_gerenciamento.domain.repositories.FuncionarioRepository;
import lista01.sistema_gerenciamento.infra.memory.FuncionarioRepositoryInMemory;

import java.util.Scanner;

public class SistemaGerenciamentoMain {
    public static void main(String[] args) {
        FuncionarioRepository repository = new FuncionarioRepositoryInMemory();

        CadastrarFuncionarioUseCase cadastrar = new CadastrarFuncionarioUseCase(repository);
        ListarFuncionarioUseCase listar = new ListarFuncionarioUseCase(repository);
        CalcularSalarioPorDepartamentoUseCase calcular = new CalcularSalarioPorDepartamentoUseCase(repository);

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Cadastrar funcionário");
            System.out.println("2. Calcular salários por departamento");
            System.out.println("3. Listar funcionários");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Salário: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Departamento: ");
                    String dep = scanner.nextLine();

                    Funcionario funcionario = new Funcionario(nome, id, salario, dep);
                    cadastrar.executar(funcionario);
                    System.out.println("Funcionário cadastrado!");
                }
                case 2 -> {
                    System.out.print("Departamento: ");
                    String dep = scanner.nextLine();
                    double total = calcular.executar(dep);
                    System.out.printf("Total salários do departamento '%s': R$ %.2f%n", dep, total);
                }
                case 3 -> {
                    var funcionarios = listar.executar();
                    if (funcionarios.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado.");
                    } else {
                        funcionarios.forEach(f -> System.out.printf(
                                "ID: %d | Nome: %s | Salário: R$ %.2f | Departamento: %s%n",
                                f.getId(), f.getNome(), f.getSalario(), f.getDepartamento()
                        ));
                    }
                }
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
