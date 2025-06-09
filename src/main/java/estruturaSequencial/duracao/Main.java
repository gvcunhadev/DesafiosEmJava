package estruturaSequencial.duracao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a duração em segundos: ");
        int duracaoEmSegundos = sc.nextInt();

        Duracao duracao = new Duracao(duracaoEmSegundos);

        System.out.println("Duração formatada: " + duracao.getDuracaoFormatada());

        sc.close();
    }
}
