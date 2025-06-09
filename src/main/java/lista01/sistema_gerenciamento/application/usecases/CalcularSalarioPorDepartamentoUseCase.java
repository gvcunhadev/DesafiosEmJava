package lista01.sistema_gerenciamento.application.usecases;

import lista01.sistema_gerenciamento.domain.entities.Funcionario;
import lista01.sistema_gerenciamento.domain.repositories.FuncionarioRepository;

public class CalcularSalarioPorDepartamentoUseCase {

    private final FuncionarioRepository repository;

    public CalcularSalarioPorDepartamentoUseCase(FuncionarioRepository repository) {
        this.repository = repository;
    }

    public double executar(String departamento) {
        return repository.buscarTodos().stream()
                .filter(f -> f.getDepartamento().equalsIgnoreCase(departamento))
                .mapToDouble(Funcionario::getSalario)
                .sum();
    }
}
