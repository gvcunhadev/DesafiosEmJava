package estruturaSequencial.terreno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        System.out.println("Digite a largura do terreno: ");
        float largura = sc.nextFloat();
        System.out.println("Digite o comprimento do terreno: ");
        float comprimento = sc.nextFloat();
        System.out.println("Digite o valor do metro quadrado: ");
        float valorMetroQuadrado = sc.nextFloat();

        Terreno terreno = new Terreno(largura, comprimento, valorMetroQuadrado);

        double area = terreno.calcularArea();
        double valorTotal = terreno.calcularValorTotal();

        System.out.printf("A área do terreno é: %.2f m²%n", area);
        System.out.printf("O valor total do terreno é: R$ %.2f%n", valorTotal);

        sc.close();
    }
}
