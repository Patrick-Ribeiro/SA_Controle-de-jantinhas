package controller;

import model.Porcoes;
import model.Pratos;

public class Receptor {
    
    public static String getPrecoPrato(int posicaoLinhaPrato){
        return String.format("%.2f", Pratos.getPreco(posicaoLinhaPrato));
    }
    
    public static String getPrecoPorcao(int posicaoPorcao){
        return String.format("%.2f", Porcoes.getPrecoPorcao(posicaoPorcao));
    }
    
    public static String getQtdePorcao(int posicaoLinhaPrato, int posicaoPorcao){
        int qtdePorcao = Pratos.getQtdePorcao(posicaoLinhaPrato, posicaoPorcao);
        return String.valueOf(qtdePorcao);
    }
    
}
