package controller;
import model.Porcoes;
import model.Pratos;

public class Transmissor {
    
    public static void iniciarArrays(){
        Pratos.estadoInicial();
        Porcoes.estadoInicial();
    }
    
    public static void addPorcao(int posicaoLinhaPrato, int posicaoPorcao){
        int qtde = 1;
        Pratos.addPorcao(posicaoLinhaPrato, posicaoPorcao, qtde);
    }
    
    public static void removePorcao(int posicaoLinhaPrato, int posicaoPorcao){
        int qtde = 1;
        Pratos.removePorcao(posicaoLinhaPrato, posicaoPorcao, qtde);
    }
    
    
}
