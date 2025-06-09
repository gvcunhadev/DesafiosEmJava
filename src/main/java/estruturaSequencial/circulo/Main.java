package estruturaSequencial.circulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        System.out.print("Digite o raio do círculo: ");
        float raio = sc.nextFloat();

        Circulo circulo = new Circulo(raio);
        float area = circulo.calcularArea();

        System.out.printf("A área do círculo com raio %.2f é: %.3f%n", raio, area);

        sc.close();
    }
}
