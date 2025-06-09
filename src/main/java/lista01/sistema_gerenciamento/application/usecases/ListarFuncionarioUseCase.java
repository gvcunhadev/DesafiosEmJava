package lista01.sistema_gerenciamento.application.usecases;

import lista01.sistema_gerenciamento.domain.entities.Funcionario;
import lista01.sistema_gerenciamento.domain.repositories.FuncionarioRepository;

import java.util.List;


public class ListarFuncionarioUseCase {
    private final FuncionarioRepository repository;

    public ListarFuncionarioUseCase(FuncionarioRepository repository) {
        this.repository = repository;
    }

    public List<Funcionario> executar() {
        return repository.buscarTodos();
    }
}
