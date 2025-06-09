package lista02.duracao;

public class Duracao {

    private int duracaoEmSegundos;

    public Duracao(int duracaoEmSegundos) {
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    public String getDuracaoFormatada() {
        int horas = duracaoEmSegundos / 3600;
        int resto = duracaoEmSegundos % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;
        return horas + ":" + minutos + ":" + segundos;
    }
}

