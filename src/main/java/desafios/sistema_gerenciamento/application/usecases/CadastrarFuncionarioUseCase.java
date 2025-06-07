package desafios.sistema_gerenciamento.application.usecases;

import desafios.sistema_gerenciamento.domain.entities.Funcionario;
import desafios.sistema_gerenciamento.domain.repositories.FuncionarioRepository;

public class CadastrarFuncionarioUseCase {
    private final FuncionarioRepository repository;

    public CadastrarFuncionarioUseCase(FuncionarioRepository repository) {
        this.repository = repository;
    }

    public void executar(Funcionario funcionario) {
        repository.salvar(funcionario);
    }

}
