package desafios.metodos.calculadora;

import java.util.Locale; // Adicione esta linha se quiser definir um Locale específico, como Locale.US
import java.util.Scanner;

public class CalculadoraMain {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        Calculadora calc = new Calculadora();

        int opcao;
        double num1, num2;

        do {
            System.out.println("\n-Escolha uma opção-");
            System.out.println("1. Soma");
            System.out.println("2. Subtracao");
            System.out.println("3. Multiplicacao");
            System.out.println("4. Divisao");
            System.out.println("0. Sair");
            System.out.print("Operação: ");

            opcao = input.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Qual o primeiro numero: ");
                num1 = input.nextDouble();
                System.out.print("Qual o segundo numero: ");
                num2 = input.nextDouble();

                switch (opcao) {
                    case 1:
                        double soma = calc.somar(num1, num2);
                        System.out.printf("\nO resultado da soma é: %.2f\n", soma);
                        break;
                    case 2:
                        double subtracao = calc.subtrair(num1, num2);
                        System.out.printf("\nO resultado da subtração é: %.2f\n", subtracao);
                        break;
                    case 3:
                        double multiplicacao = calc.multiplicar(num1, num2);
                        System.out.printf("\nO resultado da multiplicação é: %.2f\n", multiplicacao);
                        break;
                    case 4:
                        if (num2 == 0) {
                            System.out.println("\nErro: Divisão por zero não é permitida.");
                        } else {
                            double divisao = calc.dividir(num1, num2);
                            System.out.printf("\nO resultado da divisão é: %.2f\n", divisao);
                        }
                        break;
                }
            } else if (opcao == 0) {
                System.out.println("Saindo da calculadora...");
            } else {
                System.out.println("Opção inválida. Por favor, tente novamente.");
            }

        } while (opcao != 0);

        System.out.println("Calculadora encerrada.");
    }
}