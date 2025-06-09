package lista01;

import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU DE ATIVIDADES =====");
            System.out.println("1. Calculadora");
            System.out.println("2. Conversor de Temperatura");
            System.out.println("3. Calcular Fatorial");
            System.out.println("4. Palindromo");
            System.out.println("5. Matrizes em Java");
            System.out.println("6. Maipulação de Dados");
            System.out.println("7. Trocando Valores dos Objetos");
            System.out.println("8. Sistema de Gerenciamento Baseado em Clean Arch");
            System.out.println("9. Agenda de Contatos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    lista01.metodos.calculadora.CalculadoraMain.main(null);
                    break;
                case 2:
                    lista01.metodos.conversor.ConversorTemperaturaMain.main(null);
                    break;
                case 3:
                    lista01.metodos.fatorial.FatorialMain.main(null);
                    break;
                case 4:
                    lista01.metodos.palindrono.PalindronoMain.main(null);
                    break;
                case 5:
                    lista01.arrays.MatrizMain.main(null);
                    break;
                case 6:
                    lista01.manipulacao_objetos.manipulacao_dados.ManipularDadosMain.main(null);
                    break;
                case 7:
                    lista01.manipulacao_objetos.troca_valores.TrocarValorMain.main(null);
                    break;
                case 8:
                    lista01.sistema_gerenciamento.SistemaGerenciamentoMain.main(null);
                    break;
                case 9:
                    lista01.agendaContatos.AgendaMain.main(null);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
