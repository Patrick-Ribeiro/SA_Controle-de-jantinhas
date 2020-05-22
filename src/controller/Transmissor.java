package controller;
import javax.swing.JOptionPane;
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
    
    public static int setPrecoPorcao(int posicaoPorcao, String preco){
        try{
            preco = preco.replace(",", ".");
            Double novoPreco = Double.parseDouble(preco);
            Porcoes.setPrecoPorcao(posicaoPorcao, novoPreco);
            return 1;
        }catch(NumberFormatException e){
            return 0;
        }
    }
    
}
