package model;

public class Pratos {
    protected static final int pratos[][] = new int[3][3]; 
   
    private static void estadoInicialPratos(){       
        final int PRATO1_ARROZ = 2;
        final int PRATO1_CARNE = 1;
        final int PRATO1_SALADA = 1;
        
        final int PRATO2_ARROZ = 1;
        final int PRATO2_CARNE = 2;
        final int PRATO2_SALADA = 1;
        
        final int PRATO3_ARROZ = 2;
        final int PRATO3_CARNE = 2;
        final int PRATO3_SALADA = 0;
        
        pratos[0][0] = PRATO1_ARROZ;
        pratos[0][1] = PRATO1_CARNE;
        pratos[0][2] = PRATO1_SALADA;
        
        pratos[1][0] = PRATO2_ARROZ;
        pratos[1][1] = PRATO2_CARNE;
        pratos[1][2] = PRATO2_SALADA;
        
        pratos[2][0] = PRATO3_ARROZ;
        pratos[2][1] = PRATO3_CARNE;
        pratos[2][2] = PRATO3_SALADA;
    }
    
    public static double getPreco(int posicaoLinhaPrato){
        double multiplicacao = 0;
        int posicaoColunaPrato = 0;
        
        for(int posicaoPorcao=0; posicaoPorcao<Porcoes.precoPorcoes.length; posicaoPorcao++){
            multiplicacao += Porcoes.precoPorcoes[posicaoPorcao] * pratos[posicaoLinhaPrato][posicaoColunaPrato];
            posicaoColunaPrato++;
        }
        return multiplicacao;
    }
}
