package desafios.metodos.fatorial;

import java.math.BigInteger;
import java.util.Scanner;

public class FatorialMain {
    public static void main(String[] args) {
        Fatorial fatorial = new Fatorial();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = scanner.nextInt();
        fatorial.calcularFatorial(num1);

        if (num1 < 0) {
            System.out.println("Número inválido! Digite um número não negativo.");
        } else {
            BigInteger resultado = fatorial.calcularFatorial(num1);
            System.out.println("O fatorial de " + num1 + "! " + " é: " + resultado);
        }
        scanner.close();
    }
}
