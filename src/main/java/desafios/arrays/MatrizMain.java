package desafios.arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MatrizMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            try {
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        analisarMatrizRetangular(scanner);
                        break;
                    case 2:
                        analisarMatrizQuadrada(scanner);
                        break;
                    case 0:
                        System.out.println("Encerrando o programa...");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número.");
                scanner.next();
                opcao = -1;
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
                opcao = -1;
            }

            if (opcao != 0) {
                System.out.println("\nPressione Enter para continuar...");
                scanner.nextLine();
                scanner.nextLine();
            }

        } while (opcao != 0);

        scanner.close();
    }

    /**
     * Exibe o menu de opções para o usuário.
     */
    public static void exibirMenu() {
        System.out.println("\nDesafio das Matrizes");
        System.out.println("1. Desafio Matriz Retangular Encontrar Maior/Menor Elemento");
        System.out.println("2. Desafio Matriz Quadrada (Soma das Diagonais)");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    /**
     * Conduz o fluxo para análise de uma matriz retangular.
     */
    public static void analisarMatrizRetangular(Scanner scanner) {
        System.out.println("\n--- Maior e Menor ---");
        System.out.print("Informe o número de linhas (m): ");
        int m = scanner.nextInt();
        System.out.print("Informe o número de colunas (n): ");
        int n = scanner.nextInt();

        Matriz matriz = new Matriz(m, n);
        matriz.preencher(scanner);
        matriz.imprimir();

        int maior = matriz.encontrarMaiorElemento();
        int menor = matriz.encontrarMenorElemento();

        System.out.println("\n--- Resultados ---");
        System.out.println("Maior elemento: " + maior);
        System.out.println("Menor elemento: " + menor);
    }

    /**
     * Conduz o fluxo para análise de uma matriz quadrada.
     */
    public static void analisarMatrizQuadrada(Scanner scanner) {
        System.out.println("\n--- Soma das Diagonais ---");
        System.out.print("Informe a ordem da matriz (n): ");
        int n = scanner.nextInt();

        Matriz matriz = new Matriz(n); // Usa o construtor para matrizes quadradas
        matriz.preencher(scanner);
        matriz.imprimir();

        int somaPrincipal = matriz.somarDiagonalPrincipal();
        int somaSecundaria = matriz.somarDiagonalSecundario();

        System.out.println("\n--- Resultados ---");
        System.out.println("Soma da diagonal principal: " + somaPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaSecundaria);
    }
}