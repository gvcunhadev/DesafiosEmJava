package desafios.agendaContatos;

import java.util.Scanner;

public class AgendaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AgendaService agenda = new AgendaService();
        int opcao;

        do {
            System.out.println("\nAGENDA DE CONTATOS");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Listar contatos");
            System.out.println("3. Buscar contato por nome");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    Contato contato = new Contato(nome, telefone, email);
                    agenda.adicionarContato(contato);
                    break;
                case 2:
                    agenda.listarContatos();
                    break;
                case 3:
                    System.out.print("Digite o nome do contato: ");
                    String busca = sc.nextLine();
                    agenda.buscarContatoPorNome(busca);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

    }
}

