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
    
    public static String getPrecoPorcao(int posicaoPorcao){
        String precoPorcao = String.format("%.2f", Porcoes.getPrecoPorcao(posicaoPorcao));
        return precoPorcao;
    }
}
