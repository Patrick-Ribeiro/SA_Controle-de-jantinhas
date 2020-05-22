
public class Main {
    public static void main(String[] args) {
        String valor = "9,dsafasgas99";

        valor = valor.replace(",", ".");
        Double valorDouble = 0.0;
        try{
            valorDouble = Double.parseDouble(valor);
            System.out.println(valorDouble);
        }catch(NumberFormatException e){
            System.out.println("Erro");
        }
    }
}
