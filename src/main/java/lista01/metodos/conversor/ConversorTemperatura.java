package lista01.metodos.conversor;

public class ConversorTemperatura {
   public Temperatura Conversor (Temperatura origem, Temperatura destino){

       if(origem.unidade.equalsIgnoreCase("C")  && destino.unidade.equalsIgnoreCase("F")){
           destino.valor = (origem.valor * 9/5) + 32;
           return destino;
       }
       if(origem.unidade.equalsIgnoreCase("F") && destino.unidade.equalsIgnoreCase("C")){
            destino.valor = (origem.valor - 32) * 5/9;
            return destino;
       }else{
           throw new RuntimeException("Conversao não suportada" + origem.unidade + " e " + destino.unidade);
       }
   }
}
