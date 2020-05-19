package controller;

import model.Porcoes;
import model.Pratos;

public class Inicializador {
    
    public static void estadoInicialMatrizes(){
        Pratos.estadoInicialPratos();
        Porcoes.estadoInicialPrecoPorcoes();
    }
}
