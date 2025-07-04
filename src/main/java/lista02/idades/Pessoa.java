package lista02.idades;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int calcularMediaIdades(Pessoa outraPessoa) {
        return (this.idade + outraPessoa.idade)/2;
    }
}
