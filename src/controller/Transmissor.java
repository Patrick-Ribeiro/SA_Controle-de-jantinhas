
package controller;
import model.Porcoes;
import model.Pratos;

public class Transmissor {
    
    public static String getPrecoPratoReais(int posicaoLinhaPrato){
        int valorReais = Conversor.modReais(Pratos.getPreco(posicaoLinhaPrato));
        return String.valueOf(valorReais);
    }
    
    public static String getPrecoPratoMoedas(int posicaoLinhaPrato){
        int valorCentavos = Conversor.modCentavos(Pratos.getPreco(posicaoLinhaPrato));
        return String.valueOf(valorCentavos);
    }
    
    public static String getPrecoArroz(){
        final int POSICAO_PORCAO = 0;
        String precoArroz = String.format("%.2f", Porcoes.getPrecoPorcao(POSICAO_PORCAO));
        return precoArroz;
    }
    
    public static String getPrecoCarne(){
        final int POSICAO_PORCAO = 0;
        String precoCarne = String.format("%.2f", Porcoes.getPrecoPorcao(POSICAO_PORCAO));
        return precoCarne;
    }

    public static String getPrecoSalada(){
        final int POSICAO_PORCAO = 0;
        String precoSalada = String.format("%.2f", Porcoes.getPrecoPorcao(POSICAO_PORCAO));
        return precoSalada;
    }
}
