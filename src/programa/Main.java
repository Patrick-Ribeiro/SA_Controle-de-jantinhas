
package programa;

import view.TelaCarregamento;
import view.TelaPorcoes;
import view.TelaPratos;

public class Main {
   
    public static TelaPratos telaPratos;
    public static TelaPorcoes telaPorcoes;
    
    public static void main(String[] args) {
        new TelaCarregamento();
        telaPratos = new TelaPratos();
        telaPorcoes = new TelaPorcoes();
        telaPratos.setVisible(true);
    }
}
