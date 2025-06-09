package desafios;

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
            scanner.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    desafios.metodos.calculadora.CalculadoraMain.main(null);
                    break;
                case 2:
                    desafios.metodos.conversor.ConversorTemperaturaMain.main(null);
                    break;
                case 3:
                    desafios.metodos.fatorial.FatorialMain.main(null);
                    break;
                case 4:
                    desafios.metodos.palindrono.PalindronoMain.main(null);
                    break;
                case 5:
                    desafios.arrays.MatrizMain.main(null);
                    break;
                case 6:
                    desafios.manipulacao_objetos.manipulacao_dados.ManipularDadosMain.main(null);
                    break;
                case 7:
                    desafios.manipulacao_objetos.troca_valores.TrocarValorMain.main(null);
                    break;
                case 8:
                    desafios.sistema_gerenciamento.SistemaGerenciamentoMain.main(null);
                    break;
                case 9:
                    desafios.agendaContatos.AgendaMain.main(null);
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
