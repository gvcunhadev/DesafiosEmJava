package lista02.circulo;

public class Circulo {

    private float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }

    public float calcularArea() {
        return (float) (Math.PI * Math.pow(raio, 2));
    }
}
