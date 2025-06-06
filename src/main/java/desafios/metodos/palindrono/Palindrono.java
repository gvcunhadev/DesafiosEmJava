package desafios.metodos.palindrono;

public class Palindrono {
    public String verificadorPalindrono (String palavra){
        String palavraLimpa = palavra.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String palavraInvertida = new StringBuilder(palavraLimpa).reverse().toString();


        if(palavraLimpa.equals(palavraInvertida)){
            return "\n✨ A palavra \"" + palavra + "\" é um palíndromo! ✨";
        } else{
            return "\n❌ A palavra \"" + palavra + "\" não é um palíndromo.";
        }
    }
}
