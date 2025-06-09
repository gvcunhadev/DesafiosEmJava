package estruturaSequencial.troco;

public class Troco {

    private float precoProduto;
    private int quantidade;
    private float valorRecebido;

    public Troco(float precoProduto, int quantidade, float valorRecebido) {
        this.precoProduto = precoProduto;
        this.quantidade = quantidade;
        this.valorRecebido = valorRecebido;
    }

    public float calcularTroco() {
        float totalCompra = precoProduto * quantidade;
        return valorRecebido - totalCompra;
    }
}
