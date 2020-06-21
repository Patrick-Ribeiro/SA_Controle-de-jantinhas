package model;

public class Porcoes {

    protected static double precoPorcoes[] = new double[3];

    public static void setPrecoPorcao(int posicaoPorcao, double novoPreco) {
        precoPorcoes[posicaoPorcao] = novoPreco;
    }

    public static double getPrecoPorcao(int posicaoPorcao) {
        return precoPorcoes[posicaoPorcao];
    }

    public static void estadoInicial() {
        precoPorcoes[0] = 1F;
        precoPorcoes[1] = 3F;
        precoPorcoes[2] = 2F;
    }

}
