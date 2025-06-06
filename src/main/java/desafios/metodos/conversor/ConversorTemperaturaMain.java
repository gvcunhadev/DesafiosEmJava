package desafios.metodos.conversor;

import java.util.Scanner;

public class ConversorTemperaturaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a unidade da temperatura que deseja converter (ex: Digite C para Celsius, e F para Fahrenheit): ");
        String unidadeOriginal = scanner.nextLine();

        System.out.print("Digite o valor da temperatura que deseja converter: ");
        double valorOriginal = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Digite a unidade para qual deseja converter (ex: Digite C para Celsius, e F para Fahrenheit): ");
        String unidadeDestino = scanner.nextLine();


        Temperatura converter = new Temperatura(unidadeOriginal, valorOriginal);
        Temperatura convertido = new Temperatura(unidadeDestino, 0.0);


        ConversorTemperatura conversor = new ConversorTemperatura();
        Temperatura resultado = conversor.Conversor(converter, convertido);


        Impressor.imprimir(resultado);

    }
}
