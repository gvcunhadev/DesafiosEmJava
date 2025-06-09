package lista01.manipulacao_objetos.manipulacao_dados;

public class Numero {
    private int valor;

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void imprimirValor() {
        System.out.println("Valor: " + valor);
        System.out.println("Endereço de memória (simulado): " + System.identityHashCode(this.valor));
    }
}

