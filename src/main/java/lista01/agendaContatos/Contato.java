package lista01.agendaContatos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Contato {
    private String nome;
    private String telefone;
    private String email;
}
