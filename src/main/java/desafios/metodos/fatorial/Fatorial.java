package desafios.metodos.fatorial;

import java.math.BigInteger;

public class Fatorial {

    public BigInteger calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(calcularFatorial(n - 1));
    }
    }

