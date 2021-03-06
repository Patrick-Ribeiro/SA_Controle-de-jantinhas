package controller;

import model.Porcoes;
import model.Pratos;

public class Transmissor {

    public static void iniciarArrays() {
        Pratos.estadoInicial();
        Porcoes.estadoInicial();
    }

    public static void addPorcao(int posicaoLinhaPrato, int posicaoPorcao) {
        int qtdePorcao = Pratos.getQtdePorcao(posicaoLinhaPrato, posicaoPorcao);
        if (qtdePorcao < 10) {
            int qtde = 1;
            Pratos.addPorcao(posicaoLinhaPrato, posicaoPorcao, qtde);
        }
    }

    public static void removePorcao(int posicaoLinhaPrato, int posicaoPorcao) {
        int qtdePorcao = Pratos.getQtdePorcao(posicaoLinhaPrato, posicaoPorcao);
        if (qtdePorcao > 0) {
            int qtde = 1;
            Pratos.removePorcao(posicaoLinhaPrato, posicaoPorcao, qtde);
        }
    }

    public static boolean setPrecoPorcao(int posicaoPorcao, String novoPreco) {
        try {
            Double precoFormatado = formatarPreco(novoPreco);
            if (precoFormatado >= 0F) {
                Porcoes.setPrecoPorcao(posicaoPorcao, precoFormatado);
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static Double formatarPreco(String preco) {
        preco = preco.replace(",", ".");
        preco = preco.replaceAll(" ", "");
        Double precoFormatado = Double.parseDouble(preco);
        return precoFormatado;
    }

}
