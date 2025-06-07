package desafios.sistema_gerenciamento.application.usecases;

import desafios.sistema_gerenciamento.domain.entities.Funcionario;
import desafios.sistema_gerenciamento.domain.repositories.FuncionarioRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
