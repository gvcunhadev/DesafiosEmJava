package lista02.retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        System.out.println("Digite a altura do retângulo: ");
        float altura = sc.nextFloat();
        System.out.println("Digite a base do retângulo: ");
        float base = sc.nextFloat();

        Retangulo retangulo = new Retangulo(altura, base);

        double area = retangulo.calcularArea();
        double perimetro = retangulo.calcularPerimetro();
        double diagonal = retangulo.calcularDiagonal();

        System.out.printf("A área do retângulo é: %.2f m²%n", area);
        System.out.printf("O perímetro do retângulo é: %.2f m%n", perimetro);
        System.out.printf("A diagonal do retângulo é: %.2f m%n", diagonal);

        sc.close();
    }
}
