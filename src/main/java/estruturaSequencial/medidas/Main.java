package estruturaSequencial.medidas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        System.out.println("Digite a medida A: ");
        float medidaA = sc.nextFloat();
        System.out.println("Digite a medida B: ");
        float medidaB = sc.nextFloat();
        System.out.println("Digite a medida C: ");
        float medidaC = sc.nextFloat();

        Medidas medidas = new Medidas(medidaA, medidaB, medidaC);

        System.out.printf("Area do quadrado: %.4f%n", medidas.calcularAreaQuadrado());
        System.out.printf("Area do triangulo retangulo: %.4f%n", medidas.calcularTrianguloRetangulo());
        System.out.printf("Area do trapezio: %.4f%n", medidas.calcularAreatrapezio());

        sc.close();
    }
}
