package estruturaSequencial.pagamento;

public class Funcionario {

    private String nome;
    private float salarioPorHora;
    private int horasTrabalhadas;

    public Funcionario(String nome, float salarioPorHora, int horasTrabalhadas) {
        this.nome = nome;
        this.salarioPorHora = salarioPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }

    public float salarioTotal() {
        return salarioPorHora * horasTrabalhadas;
    }
}
