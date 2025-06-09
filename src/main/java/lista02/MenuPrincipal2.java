package lista02;

import java.util.Scanner;

public class MenuPrincipal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU DE ATIVIDADES =====");
            System.out.println("1. Problema Terreno");
            System.out.println("2. Problema Retangulo");
            System.out.println("3. Problema Idades");
            System.out.println("4. Problema Soma");
            System.out.println("5. Problema Troco");
            System.out.println("6. Problema Circulo");
            System.out.println("7. Problema Pagamento");
            System.out.println("8. Problema Consumo");
            System.out.println("9. Problema Medidas");
            System.out.println("10. Problema Duracao");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    lista02.terreno.Main.main(null);
                    break;
                case 2:
                    lista02.retangulo.Main.main(null);
                    break;
                case 3:
                    lista02.idades.Main.main(null);
                    break;
                case 4:
                    lista02.soma.Main.main(null);
                    break;
                case 5:
                    lista02.troco.Main.main(null);
                    break;
                case 6:
                    lista02.circulo.Main.main(null);
                    break;
                case 7:
                    lista02.pagamento.Main.main(null);
                    break;
                case 8:
                    lista02.consumo.Main.main(null);
                    break;
                case 9:
                    lista02.medidas.Main.main(null);
                    break;
                case 10:
                    lista02.duracao.Main.main(null);
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
