package lista02.idades;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa: ");
        String nome1 = sc.nextLine();
        System.out.println("Digite a idade da primeira pessoa: ");
        int idade1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome da segunda pessoa: ");
        String nome2 = sc.nextLine();
        System.out.println("Digite a idade da segunda pessoa: ");
        int idade2 = sc.nextInt();

        Pessoa pessoa1 = new Pessoa(nome1, idade1);
        Pessoa pessoa2 = new Pessoa(nome2, idade2);

        int mediaIdades = pessoa1.calcularMediaIdades(pessoa2);

        System.out.println("A média das idades de " + pessoa1.getNome() + " e " + pessoa2.getNome() + " é de " + mediaIdades);

        sc.close();
    }
}
