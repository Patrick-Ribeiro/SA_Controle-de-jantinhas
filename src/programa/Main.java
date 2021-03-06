
package programa;

import view.TelaCarregamento;
import view.TelaPorcoes;
import view.TelaPratos;

public class Main {
   
    public static TelaPratos telaPratos;
    public static TelaPorcoes telaPorcoes;
    
    public static void main(String[] args) {
        setLookAndFeel();
        new TelaCarregamento();
        telaPratos = new TelaPratos();
        telaPorcoes = new TelaPorcoes();

        telaPratos.setVisible(true);
    }
    
    private static void setLookAndFeel(){
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPorcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPorcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPorcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPorcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
