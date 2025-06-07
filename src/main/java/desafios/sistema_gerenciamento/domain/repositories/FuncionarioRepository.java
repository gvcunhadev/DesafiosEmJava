package desafios.sistema_gerenciamento.domain.repositories;

import desafios.sistema_gerenciamento.domain.entities.Funcionario;

import java.util.List;

public interface FuncionarioRepository {
    void salvar(Funcionario funcionario);
    List<Funcionario> buscarTodos();
}
