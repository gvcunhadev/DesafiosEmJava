package desafios.sistema_gerenciamento.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Funcionario {
    private String nome;
    private int id;
    private double salario;
    private String departamento;
}
