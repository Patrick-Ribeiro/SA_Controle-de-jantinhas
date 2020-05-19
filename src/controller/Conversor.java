package controller;


public class Conversor {
    
    public static int modReais(double valor){
        int valorReais = (int) valor;
        return valorReais;
    }
    
    public static int modCentavos(double valor){
        double valorCentavos = valor * 100;
        valorCentavos %= 100;
        return (int) valorCentavos;
    }
}
