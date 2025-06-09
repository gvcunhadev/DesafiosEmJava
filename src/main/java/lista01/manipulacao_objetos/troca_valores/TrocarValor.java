package lista01.manipulacao_objetos.troca_valores;

public class TrocarValor {
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public static void trocarValores(TrocarValor refA, TrocarValor refB){
        int temp = refA.getValor();
        refA.setValor(refB.getValor());
        refB.setValor(temp);
    }

    public static void imprimirValores(TrocarValor a, TrocarValor b) {
        System.out.println("objA.valor = " + a.getValor());
        System.out.println("objB.valor = " + b.getValor());
    }
}
