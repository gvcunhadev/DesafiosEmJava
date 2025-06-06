package desafios.metodos.palindrono;

import java.util.Scanner;

public class PalindronoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Palindrono palindrono = new Palindrono();

        System.out.println("Digite uma palavra");
        String palavra = sc.nextLine();
        System.out.println(palavra + " é palíndrono? " + palindrono.verificadorPalindrono(palavra));

    }
}
