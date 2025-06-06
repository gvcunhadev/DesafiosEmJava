package desafios.metodos.conversor;

public class Impressor {
    public static void imprimir(Temperatura temperatura) {
        String unidade;

        if (temperatura.unidade.equalsIgnoreCase("F")) {
            unidade = "Fahrenheit";
        } else {
            unidade = "Celsius";
        }

        System.out.printf("Resultado da conversão: %.1f° %s%n", temperatura.valor, unidade);
    }
}