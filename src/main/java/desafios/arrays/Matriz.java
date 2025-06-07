package desafios.arrays;

import java.util.Scanner;

public class Matriz {
    private final int [][] dados;
    private final int linhas;
    private final int colunas;

    public Matriz(int linhas, int colunas) {
        if(linhas <= 0 || colunas <= 0) {
            throw new IllegalArgumentException("As dimensões da matriz devem ser positivas. ");
        }this.linhas = linhas;
        this.colunas = colunas;
        this.dados = new int [linhas][colunas];
    }

    public Matriz (int ordem){
        this(ordem, ordem);
    }

    public void preencher(Scanner scanner){
        System.out.println("Digite o valor da matriz: ");
        for(int i = 0; i < this.linhas; i++) {
            for(int j = 0; j < this.colunas; j++) {
                System.out.printf("Digite o valor para a posição [%d][%d]: ", i, j);
                this.dados[i][j] = scanner.nextInt();
            }
        }
    }

    public int encontrarMaiorElemento() {
        int maior = this.dados[0][0];
        for (int[] linha : this.dados) {
            for (int elemento : linha) {
                if (elemento > maior) {
                    maior = elemento;
                }
            }
        }
        return maior;
    }

    public int encontrarMenorElemento() {
        int menor = this.dados[0][0];
        for (int[] linha : this.dados) {
            for (int elemento : linha) {
                if (elemento < menor) {
                    menor = elemento;
                }
            }
        }
        return menor;
    }

    public void imprimir() {
        System.out.println("\n--- Matriz ---");
        for (int[] linha : this.dados) {
            for (int elemento : linha) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }

    public boolean matrizQuadrada() {
        return this.linhas == this.colunas;
    }

    public int somarDiagonalPrincipal(){
        if(!matrizQuadrada()){
            throw new IllegalArgumentException("O cálculo da diagonal principal só é válido para matrizes quadradas.");
        }
        int soma = 0;
        for(int i = 0; i<this.linhas;i++){
            soma += this.dados[i][i];
        }
        return soma;
    }

    public int somarDiagonalSecundario(){
        if(!matrizQuadrada()){
            throw new IllegalArgumentException("O cálculo da diagonal secundária só é válido para matrizes quadradas.");
        }
        int soma = 0;
        int n = this.linhas;
        for(int i = 0; i < n; i++){
            soma += this.dados[i][(n-1)-i];
        }
        return soma;
    }
}
