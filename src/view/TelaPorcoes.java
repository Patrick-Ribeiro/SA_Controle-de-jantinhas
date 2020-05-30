package view;

import controller.Receptor;
import controller.Transmissor;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static view.TelaPratos.telaPratos;

public class TelaPorcoes extends javax.swing.JFrame {

    private static String precoAtualArroz;

    public TelaPorcoes() {
        initComponents();
        atualizarPrecoPorcoes();
        atualizarQtdePorcoes();
        esconderBotoes();
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
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
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPorcoes().setVisible(true);
            }
        });
    }

    private void atualizarPrecoPorcoes() {
        atualizarPrecoArroz();
        atualizarPrecoCarne();
        atualizarPrecoSalada();
    }

    protected final void atualizarQtdePorcoes() {
        atualizarQtdeArroz();
        atualizarQtdeCarne();
        atualizarQtdeSalada();
    }

    private void esconderBotoes() {
        buttonCancelarArroz.setVisible(false);
        buttonConfirmarArroz.setVisible(false);

        buttonCancelarCarne.setVisible(false);
        buttonConfirmarCarne.setVisible(false);

        buttonCancelarSalada.setVisible(false);
        buttonConfirmarSalada.setVisible(false);
    }

    private void destivarCampos() {
        textFieldPrecoArroz.setEditable(false);
        campoValorCarne.setEditable(false);
        campoValorSalada.setEditable(false);
    }

    private void atualizarQtdeArroz() {
        final int POSICAO_PORCAO = 0;
        labelQtdeArrozP1.setText(Receptor.getQtdePorcao(0, POSICAO_PORCAO));
        labelQtdeArrozP2.setText(Receptor.getQtdePorcao(1, POSICAO_PORCAO));
        labelQtdeArrozP3.setText(Receptor.getQtdePorcao(2, POSICAO_PORCAO));
    }

    private void atualizarQtdeCarne() {
        final int POSICAO_PORCAO = 1;
        labelQtdeCarneP1.setText(Receptor.getQtdePorcao(0, POSICAO_PORCAO));
        labelQtdeCarneP2.setText(Receptor.getQtdePorcao(1, POSICAO_PORCAO));
        labelQtdeCarneP3.setText(Receptor.getQtdePorcao(2, POSICAO_PORCAO));
    }

    private void atualizarQtdeSalada() {
        final int POSICAO_PORCAO = 2;
        labelQtdeSaladaP1.setText(Receptor.getQtdePorcao(0, POSICAO_PORCAO));
        labelQtdeSaladaP2.setText(Receptor.getQtdePorcao(1, POSICAO_PORCAO));
        labelQtdeSaladaP3.setText(Receptor.getQtdePorcao(2, POSICAO_PORCAO));
    }

    private void atualizarPrecoArroz() {
        final int POSICAO_PORCAO = 0;
        textFieldPrecoArroz.setText(Receptor.getPrecoPorcao(POSICAO_PORCAO));
    }

    private void atualizarPrecoCarne() {
        final int POSICAO_PORCAO = 1;
        campoValorCarne.setText(Receptor.getPrecoPorcao(POSICAO_PORCAO));
    }

    private void atualizarPrecoSalada() {
        final int POSICAO_PORCAO = 2;
        campoValorSalada.setText(Receptor.getPrecoPorcao(POSICAO_PORCAO));
    }

    private String getPrecoAtualArroz() {
        return textFieldPrecoArroz.getText();
    }

    private void desfazerAlteracoes() {
        textFieldPrecoArroz.setText(precoAtualArroz);
    }

    private void modoEdicaoArroz(boolean ativado) {
        if (ativado) {
            buttonEditarArroz.setVisible(false);
            buttonCancelarArroz.setVisible(true);
            buttonConfirmarArroz.setVisible(true);
            textFieldPrecoArroz.setEditable(true);
            precoAtualArroz = getPrecoAtualArroz();
        } else {
            buttonEditarArroz.setVisible(true);
            buttonCancelarArroz.setVisible(false);
            buttonConfirmarArroz.setVisible(false);
            textFieldPrecoArroz.setEditable(false);
        }
    }

    private void modoEdicaoCarne(boolean ativado) {
        if (ativado) {
            buttonEditarCarne.setVisible(false);
            buttonCancelarCarne.setVisible(true);
            buttonConfirmarCarne.setVisible(true);
            campoValorCarne.setEditable(true);
        } else {
            buttonEditarCarne.setVisible(true);
            buttonCancelarCarne.setVisible(false);
            buttonConfirmarCarne.setVisible(false);
            campoValorCarne.setEditable(false);
        }
    }

    private void modoEdicaoSalada(boolean ativado) {
        if (ativado) {
            buttonEditarSalada.setVisible(false);
            buttonCancelarSalada.setVisible(true);
            buttonConfirmarSalada.setVisible(true);
            campoValorSalada.setEditable(true);
        } else {
            buttonEditarSalada.setVisible(true);
            buttonCancelarSalada.setVisible(false);
            buttonConfirmarSalada.setVisible(false);
            campoValorSalada.setEditable(false);
        }
    }

    private void setPrecoArroz(String preco) {
        if (!textFieldPrecoArroz.getText().equals(precoAtualArroz)) {
            int retorno = Transmissor.setPrecoPorcao(0, preco);
            switch (retorno) {
                case 1:
                    modoEdicaoArroz(false);
                    JOptionPane.showMessageDialog(null, "Preço da porção alterado", "Alteração de preço da porção", JOptionPane.INFORMATION_MESSAGE);
                    telaPratos.atualizarPrecoPratos();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Formato de preço inválido", "Erro no novo preço", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }else{
            JOptionPane.showMessageDialog(null, "O preço da porção não foi alterado", "Alteração de preço da porção", JOptionPane.INFORMATION_MESSAGE);
            modoEdicaoArroz(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelLateral = new javax.swing.JPanel();
        painelMenuPratos = new javax.swing.JPanel();
        iconeMenuPrato = new javax.swing.JLabel();
        textoMenuPratos = new javax.swing.JLabel();
        painelMenuPorcoes = new javax.swing.JPanel();
        iconeMenuPorcoes = new javax.swing.JLabel();
        textoMenuPorcoes = new javax.swing.JLabel();
        painelSuperior = new javax.swing.JPanel();
        ButtonFechar = new javax.swing.JButton();
        ButtonMinimizar = new javax.swing.JButton();
        painelCentral = new javax.swing.JPanel();
        painelArroz = new javax.swing.JPanel();
        painelTituloArroz = new javax.swing.JPanel();
        linhaInferiorArroz = new javax.swing.JLabel();
        textoArroz = new javax.swing.JLabel();
        linhaSuperiorArroz = new javax.swing.JLabel();
        iconeArroz = new javax.swing.JLabel();
        painelPrato1Arroz = new javax.swing.JPanel();
        labelQtdeArrozP1 = new javax.swing.JLabel();
        iconeCirculoPrato1Arroz = new javax.swing.JLabel();
        iconePrato1Arroz = new javax.swing.JLabel();
        textoPrato1Arroz = new javax.swing.JLabel();
        painelPrato2Arroz = new javax.swing.JPanel();
        labelQtdeArrozP2 = new javax.swing.JLabel();
        iconeCirculoPrato2Arroz = new javax.swing.JLabel();
        iconePrato2Arroz = new javax.swing.JLabel();
        textoPrato2Arroz = new javax.swing.JLabel();
        painelPrato3Arroz = new javax.swing.JPanel();
        labelQtdeArrozP3 = new javax.swing.JLabel();
        iconeCirculoPrato3Arroz = new javax.swing.JLabel();
        iconePrato3Arroz = new javax.swing.JLabel();
        textoPrato3Arroz = new javax.swing.JLabel();
        buttonCancelarArroz = new javax.swing.JButton();
        buttonConfirmarArroz = new javax.swing.JButton();
        painelValorArroz = new javax.swing.JPanel();
        labelRsArroz = new javax.swing.JLabel();
        textFieldPrecoArroz = new javax.swing.JTextField();
        buttonEditarArroz = new javax.swing.JButton();
        painelCarne = new javax.swing.JPanel();
        painelTituloCarne = new javax.swing.JPanel();
        linhaInferiorCarne = new javax.swing.JLabel();
        textoCarne = new javax.swing.JLabel();
        linhaSuperiorCarne = new javax.swing.JLabel();
        iconeCarne = new javax.swing.JLabel();
        painelPrato1Carne = new javax.swing.JPanel();
        labelQtdeCarneP1 = new javax.swing.JLabel();
        iconeCirculoPrato1Carne = new javax.swing.JLabel();
        iconePrato1Carne = new javax.swing.JLabel();
        textoPrato1Carne = new javax.swing.JLabel();
        painelPrato2Carne = new javax.swing.JPanel();
        labelQtdeCarneP2 = new javax.swing.JLabel();
        iconeCirculoPrato2Carne = new javax.swing.JLabel();
        iconePrato2Carne = new javax.swing.JLabel();
        textoPrato2Carne = new javax.swing.JLabel();
        painelPrato3Carne = new javax.swing.JPanel();
        labelQtdeCarneP3 = new javax.swing.JLabel();
        iconeCirculoPrato3Carne = new javax.swing.JLabel();
        iconePrato3Carne = new javax.swing.JLabel();
        textoPrato3Carne = new javax.swing.JLabel();
        painelValorCarne = new javax.swing.JPanel();
        labelRsCarne = new javax.swing.JLabel();
        campoValorCarne = new javax.swing.JTextField();
        buttonEditarCarne = new javax.swing.JButton();
        buttonCancelarCarne = new javax.swing.JButton();
        buttonConfirmarCarne = new javax.swing.JButton();
        painelSalada = new javax.swing.JPanel();
        painelTituloSalada = new javax.swing.JPanel();
        linhaInferiorSalada = new javax.swing.JLabel();
        textoSalada = new javax.swing.JLabel();
        linhaSuperiorSalada = new javax.swing.JLabel();
        iconeSalada = new javax.swing.JLabel();
        painelPrato1Salada = new javax.swing.JPanel();
        labelQtdeSaladaP1 = new javax.swing.JLabel();
        iconeCirculoPrato1Salada = new javax.swing.JLabel();
        iconePrato1Salada = new javax.swing.JLabel();
        textoPrato1Salada = new javax.swing.JLabel();
        painelPrato2Salada = new javax.swing.JPanel();
        labelQtdeSaladaP2 = new javax.swing.JLabel();
        iconeCirculoPrato2Salada = new javax.swing.JLabel();
        iconePrato2Salada = new javax.swing.JLabel();
        textoPrato2Salada = new javax.swing.JLabel();
        painelPrato3Salada = new javax.swing.JPanel();
        labelQtdeSaladaP3 = new javax.swing.JLabel();
        iconeCirculoPrato3Salada = new javax.swing.JLabel();
        iconePrato3Salada = new javax.swing.JLabel();
        textoPrato3Salada = new javax.swing.JLabel();
        painelValorSalada = new javax.swing.JPanel();
        labelRsSalada = new javax.swing.JLabel();
        campoValorSalada = new javax.swing.JTextField();
        buttonEditarSalada = new javax.swing.JButton();
        buttonCancelarSalada = new javax.swing.JButton();
        buttonConfirmarSalada = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelLateral.setBackground(new java.awt.Color(26, 26, 26));
        painelLateral.setPreferredSize(new java.awt.Dimension(360, 730));
        painelLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelMenuPratos.setBackground(new java.awt.Color(26, 26, 26));
        painelMenuPratos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        painelMenuPratos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelMenuPratosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                painelMenuPratosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                painelMenuPratosMouseExited(evt);
            }
        });
        painelMenuPratos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconeMenuPrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Prato-65x65.png"))); // NOI18N
        painelMenuPratos.add(iconeMenuPrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        textoMenuPratos.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        textoMenuPratos.setForeground(new java.awt.Color(242, 242, 235));
        textoMenuPratos.setText("Pratos");
        painelMenuPratos.add(textoMenuPratos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, 39));

        painelLateral.add(painelMenuPratos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 131, 360, 90));

        painelMenuPorcoes.setBackground(new java.awt.Color(48, 48, 47));
        painelMenuPorcoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        painelMenuPorcoes.setPreferredSize(new java.awt.Dimension(360, 90));
        painelMenuPorcoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelMenuPorcoesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                painelMenuPorcoesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                painelMenuPorcoesMouseExited(evt);
            }
        });
        painelMenuPorcoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconeMenuPorcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Porcoes-65x65.png"))); // NOI18N
        painelMenuPorcoes.add(iconeMenuPorcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        textoMenuPorcoes.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        textoMenuPorcoes.setForeground(new java.awt.Color(242, 242, 235));
        textoMenuPorcoes.setText("Porções");
        painelMenuPorcoes.add(textoMenuPorcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        painelLateral.add(painelMenuPorcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, -1));

        getContentPane().add(painelLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        painelSuperior.setBackground(new java.awt.Color(167, 14, 19));
        painelSuperior.setPreferredSize(new java.awt.Dimension(1366, 35));
        painelSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Fechar-26x26.png"))); // NOI18N
        ButtonFechar.setBorder(null);
        ButtonFechar.setBorderPainted(false);
        ButtonFechar.setContentAreaFilled(false);
        ButtonFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonFechar.setPreferredSize(new java.awt.Dimension(28, 28));
        ButtonFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonFecharMouseClicked(evt);
            }
        });
        ButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFecharActionPerformed(evt);
            }
        });
        painelSuperior.add(ButtonFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1332, 6, -1, -1));

        ButtonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Minimizar-26x26.png"))); // NOI18N
        ButtonMinimizar.setBorder(null);
        ButtonMinimizar.setBorderPainted(false);
        ButtonMinimizar.setContentAreaFilled(false);
        ButtonMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMinimizarActionPerformed(evt);
            }
        });
        painelSuperior.add(ButtonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1299, 7, -1, -1));

        getContentPane().add(painelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        painelCentral.setBackground(new java.awt.Color(242, 242, 235));
        painelCentral.setPreferredSize(new java.awt.Dimension(1006, 730));
        painelCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelArroz.setBackground(new java.awt.Color(242, 242, 235));
        painelArroz.setPreferredSize(new java.awt.Dimension(930, 250));
        painelArroz.setRequestFocusEnabled(false);
        painelArroz.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelTituloArroz.setBackground(new java.awt.Color(242, 242, 235));
        painelTituloArroz.setPreferredSize(new java.awt.Dimension(929, 90));
        painelTituloArroz.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        linhaInferiorArroz.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        linhaInferiorArroz.setForeground(new java.awt.Color(26, 26, 26));
        linhaInferiorArroz.setText("_______________________________________________________________________");
        painelTituloArroz.add(linhaInferiorArroz, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 54, -1, -1));

        textoArroz.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        textoArroz.setForeground(new java.awt.Color(26, 26, 26));
        textoArroz.setText("ARROZ");
        painelTituloArroz.add(textoArroz, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 35, -1, -1));

        linhaSuperiorArroz.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        linhaSuperiorArroz.setForeground(new java.awt.Color(26, 26, 26));
        linhaSuperiorArroz.setText("_______________________________________________________________________");
        painelTituloArroz.add(linhaSuperiorArroz, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        painelArroz.add(painelTituloArroz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        iconeArroz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Arroz-140x140.png"))); // NOI18N
        iconeArroz.setPreferredSize(new java.awt.Dimension(150, 150));
        painelArroz.add(iconeArroz, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 150, 150));

        painelPrato1Arroz.setBackground(new java.awt.Color(242, 242, 235));
        painelPrato1Arroz.setPreferredSize(new java.awt.Dimension(140, 140));
        painelPrato1Arroz.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelQtdeArrozP1.setBackground(new java.awt.Color(242, 242, 235));
        labelQtdeArrozP1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        labelQtdeArrozP1.setForeground(new java.awt.Color(255, 255, 255));
        labelQtdeArrozP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelQtdeArrozP1.setText("0");
        labelQtdeArrozP1.setMaximumSize(new java.awt.Dimension(18, 21));
        labelQtdeArrozP1.setMinimumSize(new java.awt.Dimension(18, 21));
        labelQtdeArrozP1.setPreferredSize(new java.awt.Dimension(18, 21));
        painelPrato1Arroz.add(labelQtdeArrozP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 77, -1, -1));

        iconeCirculoPrato1Arroz.setBackground(new java.awt.Color(47, 47, 235));
        iconeCirculoPrato1Arroz.setForeground(new java.awt.Color(255, 255, 255));
        iconeCirculoPrato1Arroz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-Preto-35x35.png"))); // NOI18N
        painelPrato1Arroz.add(iconeCirculoPrato1Arroz, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        iconePrato1Arroz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Prato-105x105.png"))); // NOI18N
        painelPrato1Arroz.add(iconePrato1Arroz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        textoPrato1Arroz.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        textoPrato1Arroz.setForeground(new java.awt.Color(26, 26, 26));
        textoPrato1Arroz.setText("Prato 1");
        painelPrato1Arroz.add(textoPrato1Arroz, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 110, -1, 20));

        painelArroz.add(painelPrato1Arroz, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 120, 130));

        painelPrato2Arroz.setBackground(new java.awt.Color(242, 242, 235));
        painelPrato2Arroz.setPreferredSize(new java.awt.Dimension(140, 140));
        painelPrato2Arroz.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelQtdeArrozP2.setBackground(new java.awt.Color(242, 242, 235));
        labelQtdeArrozP2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        labelQtdeArrozP2.setForeground(new java.awt.Color(255, 255, 255));
        labelQtdeArrozP2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelQtdeArrozP2.setText("0");
        labelQtdeArrozP2.setMaximumSize(new java.awt.Dimension(18, 21));
        labelQtdeArrozP2.setMinimumSize(new java.awt.Dimension(18, 21));
        labelQtdeArrozP2.setPreferredSize(new java.awt.Dimension(18, 21));
        painelPrato2Arroz.add(labelQtdeArrozP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 77, -1, -1));

        iconeCirculoPrato2Arroz.setBackground(new java.awt.Color(47, 47, 235));
        iconeCirculoPrato2Arroz.setForeground(new java.awt.Color(255, 255, 255));
        iconeCirculoPrato2Arroz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-Preto-35x35.png"))); // NOI18N
        painelPrato2Arroz.add(iconeCirculoPrato2Arroz, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        iconePrato2Arroz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Prato-105x105.png"))); // NOI18N
        painelPrato2Arroz.add(iconePrato2Arroz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        textoPrato2Arroz.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        textoPrato2Arroz.setForeground(new java.awt.Color(26, 26, 26));
        textoPrato2Arroz.setText("Prato 2");
        painelPrato2Arroz.add(textoPrato2Arroz, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 110, -1, 20));

        painelArroz.add(painelPrato2Arroz, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 120, 130));

        painelPrato3Arroz.setBackground(new java.awt.Color(242, 242, 235));
        painelPrato3Arroz.setPreferredSize(new java.awt.Dimension(140, 140));
        painelPrato3Arroz.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelQtdeArrozP3.setBackground(new java.awt.Color(242, 242, 235));
        labelQtdeArrozP3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        labelQtdeArrozP3.setForeground(new java.awt.Color(255, 255, 255));
        labelQtdeArrozP3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelQtdeArrozP3.setText("0");
        labelQtdeArrozP3.setMaximumSize(new java.awt.Dimension(18, 21));
        labelQtdeArrozP3.setMinimumSize(new java.awt.Dimension(18, 21));
        labelQtdeArrozP3.setPreferredSize(new java.awt.Dimension(18, 21));
        painelPrato3Arroz.add(labelQtdeArrozP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 77, -1, -1));

        iconeCirculoPrato3Arroz.setBackground(new java.awt.Color(47, 47, 235));
        iconeCirculoPrato3Arroz.setForeground(new java.awt.Color(255, 255, 255));
        iconeCirculoPrato3Arroz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-Preto-35x35.png"))); // NOI18N
        painelPrato3Arroz.add(iconeCirculoPrato3Arroz, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        iconePrato3Arroz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Prato-105x105.png"))); // NOI18N
        painelPrato3Arroz.add(iconePrato3Arroz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        textoPrato3Arroz.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        textoPrato3Arroz.setForeground(new java.awt.Color(26, 26, 26));
        textoPrato3Arroz.setText("Prato 3");
        painelPrato3Arroz.add(textoPrato3Arroz, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 110, -1, 20));

        painelArroz.add(painelPrato3Arroz, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 120, 130));

        buttonCancelarArroz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/icone-Cancelar-30x30.png"))); // NOI18N
        buttonCancelarArroz.setBorder(null);
        buttonCancelarArroz.setBorderPainted(false);
        buttonCancelarArroz.setContentAreaFilled(false);
        buttonCancelarArroz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCancelarArroz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarArrozActionPerformed(evt);
            }
        });
        painelArroz.add(buttonCancelarArroz, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 190, -1, -1));

        buttonConfirmarArroz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Confirmar-30x30.png"))); // NOI18N
        buttonConfirmarArroz.setBorder(null);
        buttonConfirmarArroz.setBorderPainted(false);
        buttonConfirmarArroz.setContentAreaFilled(false);
        buttonConfirmarArroz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonConfirmarArroz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConfirmarArrozActionPerformed(evt);
            }
        });
        painelArroz.add(buttonConfirmarArroz, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 190, -1, -1));

        painelValorArroz.setBackground(new java.awt.Color(242, 242, 235));

        labelRsArroz.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        labelRsArroz.setForeground(new java.awt.Color(26, 26, 26));
        labelRsArroz.setText("R$");

        textFieldPrecoArroz.setEditable(false);
        textFieldPrecoArroz.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        textFieldPrecoArroz.setForeground(new java.awt.Color(26, 26, 26));
        textFieldPrecoArroz.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldPrecoArroz.setText("1,00");
        textFieldPrecoArroz.setToolTipText("");
        textFieldPrecoArroz.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(26, 26, 26), 2));

        buttonEditarArroz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Editar-30x30.png"))); // NOI18N
        buttonEditarArroz.setBorderPainted(false);
        buttonEditarArroz.setContentAreaFilled(false);
        buttonEditarArroz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonEditarArroz.setPreferredSize(new java.awt.Dimension(36, 36));
        buttonEditarArroz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarArrozActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelValorArrozLayout = new javax.swing.GroupLayout(painelValorArroz);
        painelValorArroz.setLayout(painelValorArrozLayout);
        painelValorArrozLayout.setHorizontalGroup(
            painelValorArrozLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelValorArrozLayout.createSequentialGroup()
                .addComponent(labelRsArroz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldPrecoArroz, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonEditarArroz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelValorArrozLayout.setVerticalGroup(
            painelValorArrozLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelValorArrozLayout.createSequentialGroup()
                .addComponent(labelRsArroz)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelValorArrozLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelValorArrozLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonEditarArroz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldPrecoArroz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        textFieldPrecoArroz.getAccessibleContext().setAccessibleName("");

        painelArroz.add(painelValorArroz, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, 210, 50));

        painelCentral.add(painelArroz, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        painelCarne.setBackground(new java.awt.Color(242, 242, 235));
        painelCarne.setPreferredSize(new java.awt.Dimension(930, 250));
        painelCarne.setRequestFocusEnabled(false);
        painelCarne.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelTituloCarne.setBackground(new java.awt.Color(242, 242, 235));
        painelTituloCarne.setPreferredSize(new java.awt.Dimension(929, 90));
        painelTituloCarne.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        linhaInferiorCarne.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        linhaInferiorCarne.setForeground(new java.awt.Color(26, 26, 26));
        linhaInferiorCarne.setText("_______________________________________________________________________");
        painelTituloCarne.add(linhaInferiorCarne, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 54, -1, -1));

        textoCarne.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        textoCarne.setForeground(new java.awt.Color(26, 26, 26));
        textoCarne.setText("CARNE");
        painelTituloCarne.add(textoCarne, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 35, -1, -1));

        linhaSuperiorCarne.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        linhaSuperiorCarne.setForeground(new java.awt.Color(26, 26, 26));
        linhaSuperiorCarne.setText("_______________________________________________________________________");
        painelTituloCarne.add(linhaSuperiorCarne, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        painelCarne.add(painelTituloCarne, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        iconeCarne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Carne-140x92.png"))); // NOI18N
        iconeCarne.setPreferredSize(new java.awt.Dimension(150, 150));
        painelCarne.add(iconeCarne, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 100, 100, 150));

        painelPrato1Carne.setBackground(new java.awt.Color(242, 242, 235));
        painelPrato1Carne.setPreferredSize(new java.awt.Dimension(140, 140));
        painelPrato1Carne.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelQtdeCarneP1.setBackground(new java.awt.Color(242, 242, 235));
        labelQtdeCarneP1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        labelQtdeCarneP1.setForeground(new java.awt.Color(255, 255, 255));
        labelQtdeCarneP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelQtdeCarneP1.setText("0");
        labelQtdeCarneP1.setMaximumSize(new java.awt.Dimension(18, 21));
        labelQtdeCarneP1.setMinimumSize(new java.awt.Dimension(18, 21));
        labelQtdeCarneP1.setPreferredSize(new java.awt.Dimension(18, 21));
        painelPrato1Carne.add(labelQtdeCarneP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 77, -1, -1));

        iconeCirculoPrato1Carne.setBackground(new java.awt.Color(47, 47, 235));
        iconeCirculoPrato1Carne.setForeground(new java.awt.Color(255, 255, 255));
        iconeCirculoPrato1Carne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-Preto-35x35.png"))); // NOI18N
        painelPrato1Carne.add(iconeCirculoPrato1Carne, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        iconePrato1Carne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Prato-105x105.png"))); // NOI18N
        painelPrato1Carne.add(iconePrato1Carne, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        textoPrato1Carne.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        textoPrato1Carne.setForeground(new java.awt.Color(26, 26, 26));
        textoPrato1Carne.setText("Prato 1");
        painelPrato1Carne.add(textoPrato1Carne, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 110, -1, 20));

        painelCarne.add(painelPrato1Carne, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 120, 130));

        painelPrato2Carne.setBackground(new java.awt.Color(242, 242, 235));
        painelPrato2Carne.setPreferredSize(new java.awt.Dimension(140, 140));
        painelPrato2Carne.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelQtdeCarneP2.setBackground(new java.awt.Color(242, 242, 235));
        labelQtdeCarneP2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        labelQtdeCarneP2.setForeground(new java.awt.Color(255, 255, 255));
        labelQtdeCarneP2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelQtdeCarneP2.setText("0");
        labelQtdeCarneP2.setMaximumSize(new java.awt.Dimension(18, 21));
        labelQtdeCarneP2.setMinimumSize(new java.awt.Dimension(18, 21));
        labelQtdeCarneP2.setPreferredSize(new java.awt.Dimension(18, 21));
        painelPrato2Carne.add(labelQtdeCarneP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 77, -1, -1));

        iconeCirculoPrato2Carne.setBackground(new java.awt.Color(47, 47, 235));
        iconeCirculoPrato2Carne.setForeground(new java.awt.Color(255, 255, 255));
        iconeCirculoPrato2Carne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-Preto-35x35.png"))); // NOI18N
        painelPrato2Carne.add(iconeCirculoPrato2Carne, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        iconePrato2Carne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Prato-105x105.png"))); // NOI18N
        painelPrato2Carne.add(iconePrato2Carne, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        textoPrato2Carne.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        textoPrato2Carne.setForeground(new java.awt.Color(26, 26, 26));
        textoPrato2Carne.setText("Prato 2");
        painelPrato2Carne.add(textoPrato2Carne, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 110, -1, 20));

        painelCarne.add(painelPrato2Carne, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 120, 130));

        painelPrato3Carne.setBackground(new java.awt.Color(242, 242, 235));
        painelPrato3Carne.setPreferredSize(new java.awt.Dimension(140, 140));
        painelPrato3Carne.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelQtdeCarneP3.setBackground(new java.awt.Color(242, 242, 235));
        labelQtdeCarneP3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        labelQtdeCarneP3.setForeground(new java.awt.Color(255, 255, 255));
        labelQtdeCarneP3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelQtdeCarneP3.setText("0");
        labelQtdeCarneP3.setMaximumSize(new java.awt.Dimension(18, 21));
        labelQtdeCarneP3.setMinimumSize(new java.awt.Dimension(18, 21));
        labelQtdeCarneP3.setPreferredSize(new java.awt.Dimension(18, 21));
        painelPrato3Carne.add(labelQtdeCarneP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 77, -1, -1));

        iconeCirculoPrato3Carne.setBackground(new java.awt.Color(47, 47, 235));
        iconeCirculoPrato3Carne.setForeground(new java.awt.Color(255, 255, 255));
        iconeCirculoPrato3Carne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-Preto-35x35.png"))); // NOI18N
        painelPrato3Carne.add(iconeCirculoPrato3Carne, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        iconePrato3Carne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Prato-105x105.png"))); // NOI18N
        painelPrato3Carne.add(iconePrato3Carne, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        textoPrato3Carne.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        textoPrato3Carne.setForeground(new java.awt.Color(26, 26, 26));
        textoPrato3Carne.setText("Prato 3");
        painelPrato3Carne.add(textoPrato3Carne, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 110, -1, 20));

        painelCarne.add(painelPrato3Carne, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 120, 130));

        painelValorCarne.setBackground(new java.awt.Color(242, 242, 235));

        labelRsCarne.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        labelRsCarne.setForeground(new java.awt.Color(26, 26, 26));
        labelRsCarne.setText("R$");

        campoValorCarne.setEditable(false);
        campoValorCarne.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        campoValorCarne.setForeground(new java.awt.Color(26, 26, 26));
        campoValorCarne.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoValorCarne.setText("1,00");
        campoValorCarne.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(26, 26, 26), 2));

        buttonEditarCarne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Editar-30x30.png"))); // NOI18N
        buttonEditarCarne.setBorderPainted(false);
        buttonEditarCarne.setContentAreaFilled(false);
        buttonEditarCarne.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonEditarCarne.setPreferredSize(new java.awt.Dimension(36, 36));
        buttonEditarCarne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarCarneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelValorCarneLayout = new javax.swing.GroupLayout(painelValorCarne);
        painelValorCarne.setLayout(painelValorCarneLayout);
        painelValorCarneLayout.setHorizontalGroup(
            painelValorCarneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelValorCarneLayout.createSequentialGroup()
                .addComponent(labelRsCarne)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoValorCarne, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonEditarCarne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelValorCarneLayout.setVerticalGroup(
            painelValorCarneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelValorCarneLayout.createSequentialGroup()
                .addComponent(labelRsCarne)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelValorCarneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelValorCarneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonEditarCarne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoValorCarne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        painelCarne.add(painelValorCarne, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, 210, 50));

        buttonCancelarCarne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/icone-Cancelar-30x30.png"))); // NOI18N
        buttonCancelarCarne.setBorder(null);
        buttonCancelarCarne.setBorderPainted(false);
        buttonCancelarCarne.setContentAreaFilled(false);
        buttonCancelarCarne.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCancelarCarne.setOpaque(true);
        buttonCancelarCarne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarCarneActionPerformed(evt);
            }
        });
        painelCarne.add(buttonCancelarCarne, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 190, -1, -1));

        buttonConfirmarCarne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Confirmar-30x30.png"))); // NOI18N
        buttonConfirmarCarne.setBorder(null);
        buttonConfirmarCarne.setBorderPainted(false);
        buttonConfirmarCarne.setContentAreaFilled(false);
        buttonConfirmarCarne.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonConfirmarCarne.setOpaque(true);
        buttonConfirmarCarne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConfirmarCarneActionPerformed(evt);
            }
        });
        painelCarne.add(buttonConfirmarCarne, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 190, -1, -1));

        painelCentral.add(painelCarne, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        painelSalada.setBackground(new java.awt.Color(242, 242, 235));
        painelSalada.setPreferredSize(new java.awt.Dimension(930, 250));
        painelSalada.setRequestFocusEnabled(false);
        painelSalada.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelTituloSalada.setBackground(new java.awt.Color(242, 242, 235));
        painelTituloSalada.setPreferredSize(new java.awt.Dimension(929, 90));
        painelTituloSalada.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        linhaInferiorSalada.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        linhaInferiorSalada.setForeground(new java.awt.Color(26, 26, 26));
        linhaInferiorSalada.setText("_______________________________________________________________________");
        painelTituloSalada.add(linhaInferiorSalada, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 54, -1, -1));

        textoSalada.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        textoSalada.setForeground(new java.awt.Color(26, 26, 26));
        textoSalada.setText("SALADA");
        painelTituloSalada.add(textoSalada, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 35, -1, -1));

        linhaSuperiorSalada.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        linhaSuperiorSalada.setForeground(new java.awt.Color(26, 26, 26));
        linhaSuperiorSalada.setText("_______________________________________________________________________");
        painelTituloSalada.add(linhaSuperiorSalada, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        painelSalada.add(painelTituloSalada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        iconeSalada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Salada-140x134.png"))); // NOI18N
        iconeSalada.setPreferredSize(new java.awt.Dimension(150, 150));
        painelSalada.add(iconeSalada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 150, 150));

        painelPrato1Salada.setBackground(new java.awt.Color(242, 242, 235));
        painelPrato1Salada.setPreferredSize(new java.awt.Dimension(140, 140));
        painelPrato1Salada.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelQtdeSaladaP1.setBackground(new java.awt.Color(242, 242, 235));
        labelQtdeSaladaP1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        labelQtdeSaladaP1.setForeground(new java.awt.Color(255, 255, 255));
        labelQtdeSaladaP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelQtdeSaladaP1.setText("0");
        labelQtdeSaladaP1.setMaximumSize(new java.awt.Dimension(18, 21));
        labelQtdeSaladaP1.setMinimumSize(new java.awt.Dimension(18, 21));
        labelQtdeSaladaP1.setPreferredSize(new java.awt.Dimension(18, 21));
        painelPrato1Salada.add(labelQtdeSaladaP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 77, -1, -1));

        iconeCirculoPrato1Salada.setBackground(new java.awt.Color(47, 47, 235));
        iconeCirculoPrato1Salada.setForeground(new java.awt.Color(255, 255, 255));
        iconeCirculoPrato1Salada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-Preto-35x35.png"))); // NOI18N
        painelPrato1Salada.add(iconeCirculoPrato1Salada, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        iconePrato1Salada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Prato-105x105.png"))); // NOI18N
        painelPrato1Salada.add(iconePrato1Salada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        textoPrato1Salada.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        textoPrato1Salada.setForeground(new java.awt.Color(26, 26, 26));
        textoPrato1Salada.setText("Prato 1");
        painelPrato1Salada.add(textoPrato1Salada, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 110, -1, 20));

        painelSalada.add(painelPrato1Salada, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 120, 130));

        painelPrato2Salada.setBackground(new java.awt.Color(242, 242, 235));
        painelPrato2Salada.setPreferredSize(new java.awt.Dimension(140, 140));
        painelPrato2Salada.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelQtdeSaladaP2.setBackground(new java.awt.Color(242, 242, 235));
        labelQtdeSaladaP2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        labelQtdeSaladaP2.setForeground(new java.awt.Color(255, 255, 255));
        labelQtdeSaladaP2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelQtdeSaladaP2.setText("0");
        labelQtdeSaladaP2.setMaximumSize(new java.awt.Dimension(18, 21));
        labelQtdeSaladaP2.setMinimumSize(new java.awt.Dimension(18, 21));
        labelQtdeSaladaP2.setPreferredSize(new java.awt.Dimension(18, 21));
        painelPrato2Salada.add(labelQtdeSaladaP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 77, -1, -1));

        iconeCirculoPrato2Salada.setBackground(new java.awt.Color(47, 47, 235));
        iconeCirculoPrato2Salada.setForeground(new java.awt.Color(255, 255, 255));
        iconeCirculoPrato2Salada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-Preto-35x35.png"))); // NOI18N
        painelPrato2Salada.add(iconeCirculoPrato2Salada, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        iconePrato2Salada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Prato-105x105.png"))); // NOI18N
        painelPrato2Salada.add(iconePrato2Salada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        textoPrato2Salada.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        textoPrato2Salada.setForeground(new java.awt.Color(26, 26, 26));
        textoPrato2Salada.setText("Prato 2");
        painelPrato2Salada.add(textoPrato2Salada, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 110, -1, 20));

        painelSalada.add(painelPrato2Salada, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 120, 130));

        painelPrato3Salada.setBackground(new java.awt.Color(242, 242, 235));
        painelPrato3Salada.setPreferredSize(new java.awt.Dimension(140, 140));
        painelPrato3Salada.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelQtdeSaladaP3.setBackground(new java.awt.Color(242, 242, 235));
        labelQtdeSaladaP3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        labelQtdeSaladaP3.setForeground(new java.awt.Color(255, 255, 255));
        labelQtdeSaladaP3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelQtdeSaladaP3.setText("0");
        labelQtdeSaladaP3.setMaximumSize(new java.awt.Dimension(18, 21));
        labelQtdeSaladaP3.setMinimumSize(new java.awt.Dimension(18, 21));
        labelQtdeSaladaP3.setPreferredSize(new java.awt.Dimension(18, 21));
        painelPrato3Salada.add(labelQtdeSaladaP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 77, -1, -1));

        iconeCirculoPrato3Salada.setBackground(new java.awt.Color(47, 47, 235));
        iconeCirculoPrato3Salada.setForeground(new java.awt.Color(255, 255, 255));
        iconeCirculoPrato3Salada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-Preto-35x35.png"))); // NOI18N
        painelPrato3Salada.add(iconeCirculoPrato3Salada, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        iconePrato3Salada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Prato-105x105.png"))); // NOI18N
        painelPrato3Salada.add(iconePrato3Salada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        textoPrato3Salada.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        textoPrato3Salada.setForeground(new java.awt.Color(26, 26, 26));
        textoPrato3Salada.setText("Prato 3");
        painelPrato3Salada.add(textoPrato3Salada, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 110, -1, 20));

        painelSalada.add(painelPrato3Salada, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 120, 130));

        painelValorSalada.setBackground(new java.awt.Color(242, 242, 235));

        labelRsSalada.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        labelRsSalada.setForeground(new java.awt.Color(26, 26, 26));
        labelRsSalada.setText("R$");

        campoValorSalada.setEditable(false);
        campoValorSalada.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        campoValorSalada.setForeground(new java.awt.Color(26, 26, 26));
        campoValorSalada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoValorSalada.setText("1,00");
        campoValorSalada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(26, 26, 26), 2));

        buttonEditarSalada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Editar-30x30.png"))); // NOI18N
        buttonEditarSalada.setBorderPainted(false);
        buttonEditarSalada.setContentAreaFilled(false);
        buttonEditarSalada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonEditarSalada.setPreferredSize(new java.awt.Dimension(36, 36));
        buttonEditarSalada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarSaladaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelValorSaladaLayout = new javax.swing.GroupLayout(painelValorSalada);
        painelValorSalada.setLayout(painelValorSaladaLayout);
        painelValorSaladaLayout.setHorizontalGroup(
            painelValorSaladaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelValorSaladaLayout.createSequentialGroup()
                .addComponent(labelRsSalada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoValorSalada, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonEditarSalada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelValorSaladaLayout.setVerticalGroup(
            painelValorSaladaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelValorSaladaLayout.createSequentialGroup()
                .addComponent(labelRsSalada)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelValorSaladaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelValorSaladaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonEditarSalada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoValorSalada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        painelSalada.add(painelValorSalada, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, 210, 50));

        buttonCancelarSalada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/icone-Cancelar-30x30.png"))); // NOI18N
        buttonCancelarSalada.setBorder(null);
        buttonCancelarSalada.setBorderPainted(false);
        buttonCancelarSalada.setContentAreaFilled(false);
        buttonCancelarSalada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCancelarSalada.setOpaque(true);
        buttonCancelarSalada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarSaladaActionPerformed(evt);
            }
        });
        painelSalada.add(buttonCancelarSalada, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 190, -1, -1));

        buttonConfirmarSalada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Confirmar-30x30.png"))); // NOI18N
        buttonConfirmarSalada.setBorder(null);
        buttonConfirmarSalada.setBorderPainted(false);
        buttonConfirmarSalada.setContentAreaFilled(false);
        buttonConfirmarSalada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonConfirmarSalada.setOpaque(true);
        painelSalada.add(buttonConfirmarSalada, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 190, -1, -1));

        painelCentral.add(painelSalada, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        getContentPane().add(painelCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void painelMenuPorcoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelMenuPorcoesMouseClicked

    }//GEN-LAST:event_painelMenuPorcoesMouseClicked

    private void painelMenuPorcoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelMenuPorcoesMouseExited

    }//GEN-LAST:event_painelMenuPorcoesMouseExited

    private void painelMenuPorcoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelMenuPorcoesMouseEntered

    }//GEN-LAST:event_painelMenuPorcoesMouseEntered

    private void ButtonFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonFecharMouseClicked

    }//GEN-LAST:event_ButtonFecharMouseClicked

    private void ButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ButtonFecharActionPerformed

    private void ButtonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMinimizarActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_ButtonMinimizarActionPerformed

    private void painelMenuPratosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelMenuPratosMouseClicked
        telaPratos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_painelMenuPratosMouseClicked

    private void painelMenuPratosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelMenuPratosMouseEntered
        painelMenuPorcoes.setBackground(Color.decode("#1A1A1A"));
        painelMenuPratos.setBackground(Color.decode("#30302F"));
    }//GEN-LAST:event_painelMenuPratosMouseEntered

    private void painelMenuPratosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelMenuPratosMouseExited
        painelMenuPratos.setBackground(Color.decode("#1A1A1A"));
        painelMenuPorcoes.setBackground(Color.decode("#30302F"));
    }//GEN-LAST:event_painelMenuPratosMouseExited

    private void buttonEditarArrozActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarArrozActionPerformed
        modoEdicaoArroz(true);
    }//GEN-LAST:event_buttonEditarArrozActionPerformed

    private void buttonCancelarArrozActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarArrozActionPerformed
        modoEdicaoArroz(false);
        desfazerAlteracoes();
    }//GEN-LAST:event_buttonCancelarArrozActionPerformed

    private void buttonEditarCarneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarCarneActionPerformed
        modoEdicaoCarne(true);
    }//GEN-LAST:event_buttonEditarCarneActionPerformed

    private void buttonCancelarCarneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarCarneActionPerformed
        modoEdicaoCarne(false);
    }//GEN-LAST:event_buttonCancelarCarneActionPerformed

    private void buttonEditarSaladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarSaladaActionPerformed
        modoEdicaoSalada(true);
    }//GEN-LAST:event_buttonEditarSaladaActionPerformed

    private void buttonCancelarSaladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarSaladaActionPerformed
        modoEdicaoSalada(false);
    }//GEN-LAST:event_buttonCancelarSaladaActionPerformed

    private void buttonConfirmarArrozActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConfirmarArrozActionPerformed
        setPrecoArroz(textFieldPrecoArroz.getText());
    }//GEN-LAST:event_buttonConfirmarArrozActionPerformed

    private void buttonConfirmarCarneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConfirmarCarneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonConfirmarCarneActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonFechar;
    private javax.swing.JButton ButtonMinimizar;
    private javax.swing.JButton buttonCancelarArroz;
    private javax.swing.JButton buttonCancelarCarne;
    private javax.swing.JButton buttonCancelarSalada;
    private javax.swing.JButton buttonConfirmarArroz;
    private javax.swing.JButton buttonConfirmarCarne;
    private javax.swing.JButton buttonConfirmarSalada;
    private javax.swing.JButton buttonEditarArroz;
    private javax.swing.JButton buttonEditarCarne;
    private javax.swing.JButton buttonEditarSalada;
    private javax.swing.JTextField campoValorCarne;
    private javax.swing.JTextField campoValorSalada;
    private javax.swing.JLabel iconeArroz;
    private javax.swing.JLabel iconeCarne;
    private javax.swing.JLabel iconeCirculoPrato1Arroz;
    private javax.swing.JLabel iconeCirculoPrato1Carne;
    private javax.swing.JLabel iconeCirculoPrato1Salada;
    private javax.swing.JLabel iconeCirculoPrato2Arroz;
    private javax.swing.JLabel iconeCirculoPrato2Carne;
    private javax.swing.JLabel iconeCirculoPrato2Salada;
    private javax.swing.JLabel iconeCirculoPrato3Arroz;
    private javax.swing.JLabel iconeCirculoPrato3Carne;
    private javax.swing.JLabel iconeCirculoPrato3Salada;
    private javax.swing.JLabel iconeMenuPorcoes;
    private javax.swing.JLabel iconeMenuPrato;
    private javax.swing.JLabel iconePrato1Arroz;
    private javax.swing.JLabel iconePrato1Carne;
    private javax.swing.JLabel iconePrato1Salada;
    private javax.swing.JLabel iconePrato2Arroz;
    private javax.swing.JLabel iconePrato2Carne;
    private javax.swing.JLabel iconePrato2Salada;
    private javax.swing.JLabel iconePrato3Arroz;
    private javax.swing.JLabel iconePrato3Carne;
    private javax.swing.JLabel iconePrato3Salada;
    private javax.swing.JLabel iconeSalada;
    private javax.swing.JLabel labelQtdeArrozP1;
    private javax.swing.JLabel labelQtdeArrozP2;
    private javax.swing.JLabel labelQtdeArrozP3;
    private javax.swing.JLabel labelQtdeCarneP1;
    private javax.swing.JLabel labelQtdeCarneP2;
    private javax.swing.JLabel labelQtdeCarneP3;
    private javax.swing.JLabel labelQtdeSaladaP1;
    private javax.swing.JLabel labelQtdeSaladaP2;
    private javax.swing.JLabel labelQtdeSaladaP3;
    private javax.swing.JLabel labelRsArroz;
    private javax.swing.JLabel labelRsCarne;
    private javax.swing.JLabel labelRsSalada;
    private javax.swing.JLabel linhaInferiorArroz;
    private javax.swing.JLabel linhaInferiorCarne;
    private javax.swing.JLabel linhaInferiorSalada;
    private javax.swing.JLabel linhaSuperiorArroz;
    private javax.swing.JLabel linhaSuperiorCarne;
    private javax.swing.JLabel linhaSuperiorSalada;
    private javax.swing.JPanel painelArroz;
    private javax.swing.JPanel painelCarne;
    private javax.swing.JPanel painelCentral;
    private javax.swing.JPanel painelLateral;
    private javax.swing.JPanel painelMenuPorcoes;
    private javax.swing.JPanel painelMenuPratos;
    private javax.swing.JPanel painelPrato1Arroz;
    private javax.swing.JPanel painelPrato1Carne;
    private javax.swing.JPanel painelPrato1Salada;
    private javax.swing.JPanel painelPrato2Arroz;
    private javax.swing.JPanel painelPrato2Carne;
    private javax.swing.JPanel painelPrato2Salada;
    private javax.swing.JPanel painelPrato3Arroz;
    private javax.swing.JPanel painelPrato3Carne;
    private javax.swing.JPanel painelPrato3Salada;
    private javax.swing.JPanel painelSalada;
    private javax.swing.JPanel painelSuperior;
    private javax.swing.JPanel painelTituloArroz;
    private javax.swing.JPanel painelTituloCarne;
    private javax.swing.JPanel painelTituloSalada;
    private javax.swing.JPanel painelValorArroz;
    private javax.swing.JPanel painelValorCarne;
    private javax.swing.JPanel painelValorSalada;
    private javax.swing.JTextField textFieldPrecoArroz;
    private javax.swing.JLabel textoArroz;
    private javax.swing.JLabel textoCarne;
    private javax.swing.JLabel textoMenuPorcoes;
    private javax.swing.JLabel textoMenuPratos;
    private javax.swing.JLabel textoPrato1Arroz;
    private javax.swing.JLabel textoPrato1Carne;
    private javax.swing.JLabel textoPrato1Salada;
    private javax.swing.JLabel textoPrato2Arroz;
    private javax.swing.JLabel textoPrato2Carne;
    private javax.swing.JLabel textoPrato2Salada;
    private javax.swing.JLabel textoPrato3Arroz;
    private javax.swing.JLabel textoPrato3Carne;
    private javax.swing.JLabel textoPrato3Salada;
    private javax.swing.JLabel textoSalada;
    // End of variables declaration//GEN-END:variables
}
