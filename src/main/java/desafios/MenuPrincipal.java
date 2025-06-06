package desafios;

import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU DE ATIVIDADES =====");
            System.out.println("1. Verificar Palíndromo");
            System.out.println("2. Calcular Fatorial");
            System.out.println("3. Conversor de Temperatura");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    desafios.metodos.palindrono.PalindronoMain.main(null);
                    break;
                case 2:
                    desafios.metodos.fatorial.FatorialMain.main(null);
                    break;
                case 3:
                    desafios.metodos.conversor.ConversorTemperaturaMain.main(null);
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
