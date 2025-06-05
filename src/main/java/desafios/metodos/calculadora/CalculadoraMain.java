package desafios.metodos.calculadora;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraMain {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Calculadora calc = new Calculadora();

        int opcao;
        int num1, num2;

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
                num1 = input.nextInt();
                System.out.print("Qual o segundo numero: ");
                num2 = input.nextInt();

                switch (opcao) {
                    case 1:
                        int soma = calc.somar(num1, num2);
                        System.out.printf("\nO resultado da soma é: %d\n", soma);
                        break;
                    case 2:
                        int subtracao = calc.subtrair(num1, num2);
                        System.out.printf("\nO resultado da subtração é: %d\n", subtracao);
                        break;
                    case 3:
                        int multiplicacao = calc.multiplicar(num1, num2);
                        System.out.printf("\nO resultado da multiplicação é: %d\n", multiplicacao);
                        break;
                    case 4:
                        if (num2 == 0) {
                            System.out.println("\nErro: Divisão por zero não é permitida.");
                        } else {
                            int divisao = calc.dividir(num1, num2);
                            System.out.printf("\nO resultado da divisão é: %d\n", divisao);
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
        input.close();
    }
}
