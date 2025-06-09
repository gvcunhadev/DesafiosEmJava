package desafios.agendaContatos;

import java.util.ArrayList;
import java.util.List;

public class AgendaService {
    private final List<Contato> contatos = new ArrayList<>();

    public boolean adicionarContato(Contato contato) {
        if (contatos.size() >= 10) {
            System.out.println("Agenda cheia! Máximo de 10 contatos.");
            return false;
        }
        contatos.add(contato);
        return true;
    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
            return;
        }
        for (Contato contato : contatos) {
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Telefone: " + contato.getTelefone());
            System.out.println("Email: " + contato.getEmail());
            System.out.println("-----------------------");
        }
    }

    public void buscarContatoPorNome(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Telefone: " + contato.getTelefone());
                System.out.println("Email: " + contato.getEmail());
                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }
}
