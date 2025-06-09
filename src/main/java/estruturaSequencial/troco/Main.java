package estruturaSequencial.troco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        System.out.print("Digite o preço do produto: ");
        float precoProduto = sc.nextFloat();
        System.out.print("Digite a quantidade comprada: ");
        int quantidade = sc.nextInt();
        System.out.print("Digite o valor recebido: ");
        float valorRecebido = sc.nextFloat();

        Troco troco = new Troco(precoProduto, quantidade, valorRecebido);

        float valorTroco = troco.calcularTroco();

        System.out.println("Valor do troco: R$ " + valorTroco);

        sc.close();
    }
}
