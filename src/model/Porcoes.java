package model;

public class Porcoes {
    protected static double precoPorcoes[] = new double[3];
    
    public static void setPrecoPorcao(int posicaoPorcao, double novoPreco){
        precoPorcoes[posicaoPorcao] = novoPreco;
    }
    
    public static double getPrecoPorcao(int posicaoPorcao){
        return precoPorcoes[posicaoPorcao];
    }
    
    public static void estadoInicial(){
        final double ARROZ = 1F;
        final double CARNE = 3F;
        final double SALADA = 2F;
        
        precoPorcoes[0] = ARROZ;
        precoPorcoes[1] = CARNE;
        precoPorcoes[2] = SALADA;
    }
    
}
