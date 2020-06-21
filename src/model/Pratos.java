package model;

public class Pratos {

    protected static int pratos[][] = new int[3][3];

    public static void addPorcao(int posicaoLinhaPrato, int posicaoPorcao, int qtde) {
        pratos[posicaoLinhaPrato][posicaoPorcao] += qtde;
    }

    public static void removePorcao(int posicaoLinhaPrato, int posicaoPorcao, int qtde) {
        pratos[posicaoLinhaPrato][posicaoPorcao] -= qtde;
    }

    public static int getQtdePorcao(int posicaoLinhaPrato, int posicaoPorcao) {
        return pratos[posicaoLinhaPrato][posicaoPorcao];
    }

    public static double getPreco(int posicaoLinhaPrato) {
        double multiplicacao = 0;
        int posicaoColunaPrato = 0;

        for (int posicaoPorcao = 0; posicaoPorcao < Porcoes.precoPorcoes.length; posicaoPorcao++) {
            multiplicacao += Porcoes.precoPorcoes[posicaoPorcao] * pratos[posicaoLinhaPrato][posicaoColunaPrato];
            posicaoColunaPrato++;
        }
        return multiplicacao;
    }

    public static void estadoInicial() {
        pratos[0][0] = 2;
        pratos[0][1] = 1;
        pratos[0][2] = 1;

        pratos[1][0] = 1;
        pratos[1][1] = 2;
        pratos[1][2] = 1;

        pratos[2][0] = 2;
        pratos[2][1] = 2;
        pratos[2][2] = 0;
    }
}
