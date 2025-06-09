package estruturaSequencial.medidas;

public class Medidas {

    private float medidaA;
    private float medidaB;
    private float medidaC;

    public Medidas(float medidaA, float medidaB, float medidaC) {
        this.medidaA = medidaA;
        this.medidaB = medidaB;
        this.medidaC = medidaC;
    }

    public float calcularAreaQuadrado() {
        return medidaA * medidaA;
    }

    public float calcularTrianguloRetangulo() {
        return (medidaA * medidaB) / 2;
    }

    public float calcularAreatrapezio() {
        return ((medidaA + medidaB) * medidaC) / 2;
    }
}
