package lista02.consumo;

public class Carro {

    private float distanciaPercorrida;
    private float combustivelGasto;

    public Carro(float distanciaPercorrida, float combustivelGasto) {
        this.distanciaPercorrida = distanciaPercorrida;
        this.combustivelGasto = combustivelGasto;
    }

    public float calcularMediaConsumo() {
        return distanciaPercorrida/combustivelGasto;
    }
}
