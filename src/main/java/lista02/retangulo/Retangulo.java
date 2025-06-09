package lista02.retangulo;

public class Retangulo {

    private float altura;
    private float base;

    public Retangulo(float altura, float base) {
        this.altura = altura;
        this.base = base;
    }

    public double calcularArea() {
        return altura * base;
    }

    public double calcularPerimetro() {
        return 2 * (altura + base);
    }

    public double calcularDiagonal() {
        return Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));
    }
}
