package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.SwingConstants;

public class TelaCarregamento {

    private final int LARGURA_GIF = 933;
    private final int ALTURA_GIF = 524;
    private final int TEMPO_CARREGAMENTO = 4000;
    private final String CAMINHO_GIF = "/view/images/SplashScreen.gif";

    public TelaCarregamento() {

        JWindow telaCarregamento = new JWindow();
        telaCarregamento.getContentPane().add(new JLabel("", new ImageIcon(getClass().getResource(CAMINHO_GIF)), SwingConstants.CENTER));

        Toolkit toolKit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolKit.getScreenSize();
        telaCarregamento.setBounds((dimension.width - LARGURA_GIF) / 2, (dimension.height - ALTURA_GIF) / 2, LARGURA_GIF, ALTURA_GIF);
        telaCarregamento.setVisible(true);
        
        try{
            Thread.sleep(TEMPO_CARREGAMENTO);
        }catch(InterruptedException e){
        }
        telaCarregamento.dispose();
    }

}
