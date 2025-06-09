package lista02.soma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int x = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int y = sc.nextInt();

        Soma soma = new Soma(x, y);

        System.out.println("Soma: " + soma.calcular());

        sc.close();
    }
}
