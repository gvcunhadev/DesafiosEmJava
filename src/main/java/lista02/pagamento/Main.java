package lista02.pagamento;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Nome do funcionário: ");
        String nome = sc.nextLine();
        System.out.print("Salário por hora: ");
        float salarioPorHora = sc.nextFloat();
        System.out.print("Horas trabalhadas no mês: ");
        int horasTrabalhadas = sc.nextInt();

        Funcionario funcionario = new Funcionario(nome, salarioPorHora, horasTrabalhadas);
        float pagamento = funcionario.salarioTotal();

        System.out.printf("O pagamento para %s deve ser R$ %.2f%n", funcionario.getNome(), pagamento);

        sc.close();
    }
}
