package lista01.manipulacao_objetos.troca_valores;

import java.util.Scanner;

public class TrocarValorMain {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        TrocarValor objeto1 = new TrocarValor();
        TrocarValor objeto2 = new TrocarValor();


        System.out.println("Digite o valor do objeto 1: ");
        objeto1.setValor(scanner.nextInt());

        System.out.println("Digite o valor do objeto 2: ");
        objeto2.setValor(scanner.nextInt());

        System.out.println("\n --- Valores antes da troca ---");
        TrocarValor.imprimirValores(objeto1, objeto2);

        TrocarValor.trocarValores(objeto1, objeto2);

        System.out.println("\n --- Valores depois da troca ---");
        TrocarValor.imprimirValores(objeto1, objeto2);
    }
}
