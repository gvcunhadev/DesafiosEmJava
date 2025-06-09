package lista02.consumo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        System.out.println("Informe a distância percorrida (em km): ");
        float distanciaPercorrida = sc.nextFloat();
        System.out.println("Informe o combustível gasto (em litros): ");
        float combustivelGasto = sc.nextFloat();

        Carro carro = new Carro(distanciaPercorrida, combustivelGasto);

        float mediaConsumo = carro.calcularMediaConsumo();
        System.out.printf("A média de consumo do carro é: %.3f km/l%n", mediaConsumo);

        sc.close();
    }
}
