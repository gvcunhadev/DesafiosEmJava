package desafios.sistema_gerenciamento.infra.memory;

import desafios.sistema_gerenciamento.domain.entities.Funcionario;
import desafios.sistema_gerenciamento.domain.repositories.FuncionarioRepository;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioRepositoryInMemory implements FuncionarioRepository {
    private final List<Funcionario> funcionarios = new ArrayList<>();

    @Override
    public void salvar(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    @Override
    public List<Funcionario> buscarTodos() {
        return funcionarios;
    }
}
