package controller;

import model.Porcoes;
import model.Pratos;

public class Inicializador {
    
    public static void estadoInicial(){
        Pratos.estadoInicialPratos();
        Porcoes.estadoInicialPrecoPorcoes();
    }
}
