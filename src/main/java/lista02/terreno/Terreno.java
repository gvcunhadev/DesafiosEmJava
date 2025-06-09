package lista02.terreno;

public class Terreno {

    private float largura;
    private float comprimento;
    private float valorMetroQuadrado;

    public Terreno(float largura, float comprimento, float valorMetroQuadrado) {
        this.largura = largura;
        this.comprimento = comprimento;
        this.valorMetroQuadrado = valorMetroQuadrado;
    }

    public double calcularArea() {
        return largura * comprimento;
    }

    public double calcularValorTotal() {
        return calcularArea() * valorMetroQuadrado;
    }
}
