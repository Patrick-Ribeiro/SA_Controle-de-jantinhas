package view;

import controller.Receptor;
import controller.Transmissor;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static programa.Main.telaPorcoes;
import static programa.Main.telaPratos;


public final class TelaPratos extends javax.swing.JFrame {
    
    public TelaPratos() {
        initComponents();
        iniciarArrays();
        atualizarPrecoPratos();
        atualizarQtdePorcoes();
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                telaPratos.setVisible(true);
            }
        });
    }
    
    private static void iniciarArrays() {
        Transmissor.iniciarArrays();
    }
    
    protected final void atualizarPrecoPratos() {
        atualizarPrecoPrato1();
        atualizarPrecoPrato2();
        atualizarPrecoPrato3();
    }
    
    private void atualizarQtdePorcoes() {
        atualizarQtdePorcoesPrato1();
        atualizarQtdePorcoesPrato2();
        atualizarQtdePorcoesPrato3();
    }
    
    private void atualizarPrecoPrato1() {
        final int POSICAO_LINHA_PRATO = 0;
        labelPrecoP1.setText(Receptor.getPrecoPrato(POSICAO_LINHA_PRATO));        
    }
    
    private void atualizarPrecoPrato2() {
        final int POSICAO_LINHA_PRATO = 1;
        labelPrecoP2.setText(Receptor.getPrecoPrato(POSICAO_LINHA_PRATO));
    }
    
    private void atualizarPrecoPrato3() {
        final int POSICAO_LINHA_PRATO = 2;
        labelPrecoP3.setText(Receptor.getPrecoPrato(POSICAO_LINHA_PRATO));
    }
    
    private void mostrarTelaPorcoes() {
        telaPorcoes.setVisible(true);
        telaPorcoes.atualizarQtdePorcoes();
        telaPorcoes.atualizarPrecoPorcoes();
    }
    
    private void atualizarQtdePorcoesPrato1() {
        final int POSICAO_LINHA_PRATO1 = 0;
        labelQtdeArrozP1.setText(Receptor.getQtdePorcao(POSICAO_LINHA_PRATO1, 0));
        labelQtdeCarneP1.setText(Receptor.getQtdePorcao(POSICAO_LINHA_PRATO1, 1));
        labelQtdeSaladaP1.setText(Receptor.getQtdePorcao(POSICAO_LINHA_PRATO1, 2));
    }
    
    private void atualizarQtdePorcoesPrato2() {
        final int POSICAO_LINHA_PRATO2 = 1;
        labelQtdeArrozP2.setText(Receptor.getQtdePorcao(POSICAO_LINHA_PRATO2, 0));
        labelQtdeCarneP2.setText(Receptor.getQtdePorcao(POSICAO_LINHA_PRATO2, 1));
        labelQtdeSaladaP2.setText(Receptor.getQtdePorcao(POSICAO_LINHA_PRATO2, 2));
    }
    
    private void atualizarQtdePorcoesPrato3() {
        final int POSICAO_LINHA_PRATO3 = 2;
        labelQtdeArrozP3.setText(Receptor.getQtdePorcao(POSICAO_LINHA_PRATO3, 0));
        labelQtdeCarneP3.setText(Receptor.getQtdePorcao(POSICAO_LINHA_PRATO3, 1));
        labelQtdeSaladaP3.setText(Receptor.getQtdePorcao(POSICAO_LINHA_PRATO3, 2));
    }
    
    private void addArroz(int posicaoLinhaPrato) {
        final int POSICAO_PORCAO = 0;
        Transmissor.addPorcao(posicaoLinhaPrato, POSICAO_PORCAO);
        telaPorcoes.atualizarQtdePorcoes();
    }
    
    private void removeArroz(int posicaoLinhaPrato) {
        final int POSICAO_PORCAO = 0;
        Transmissor.removePorcao(posicaoLinhaPrato, POSICAO_PORCAO);
        telaPorcoes.atualizarQtdePorcoes();
    }
    
    private void addCarne(int posicaoLinhaPrato) {
        final int POSICAO_PORCAO = 1;
        Transmissor.addPorcao(posicaoLinhaPrato, POSICAO_PORCAO);
        telaPorcoes.atualizarQtdePorcoes();
    }
    
    private void removeCarne(int posicaoLinhaPrato) {
        final int POSICAO_PORCAO = 1;
        Transmissor.removePorcao(posicaoLinhaPrato, POSICAO_PORCAO);
        telaPorcoes.atualizarQtdePorcoes();
    }
    
    private void addSalada(int posicaoLinhaPrato) {
        final int POSICAO_PORCAO = 2;
        Transmissor.addPorcao(posicaoLinhaPrato, POSICAO_PORCAO);
        telaPorcoes.atualizarQtdePorcoes();
    }
    
    private void removeSalada(int posicaoLinhaPrato) {
        final int POSICAO_PORCAO = 2;
        Transmissor.removePorcao(posicaoLinhaPrato, POSICAO_PORCAO);
        telaPorcoes.atualizarQtdePorcoes();
    }
    
    protected void animacaoBotaoPressionado(String tipoBotao, JButton button, boolean ativo) {
        Icon iconePadrao = null;
        Icon iconePressionado = null;
        switch(tipoBotao){
            case "add":
                 iconePadrao = new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Adicionar-30x30.png"));
                 iconePressionado = new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Adicionar-onHover-30x30.png"));
                 break;
            case "remove":
                iconePadrao = new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Diminuir-30x30.png"));
                iconePressionado = new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Diminuir-onHover-30x30.png"));
                break;
            case "fechar":
                iconePadrao = new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Fechar-26x26.png"));
                iconePressionado = new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Fechar-onHover-26x26.png"));
                break;
            case "minimizar":
                iconePadrao = new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Minimizar-26x26.png"));
                iconePressionado = new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Minimizar-onHover-26x26.png"));
                break;
            case "editar":
                iconePadrao = new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Editar-30x30.png"));
                iconePressionado = new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Editar-onHover-30x30.png"));
                break;
            case "confirmar":
                iconePadrao = new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Confirmar-30x30.png"));
                iconePressionado = new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Confirmar-onHover-30x30.png"));
                break;
            case "cancelar":
                iconePadrao = new javax.swing.ImageIcon(getClass().getResource("/view/images/icone-Cancelar-30x30.png"));
                iconePressionado = new javax.swing.ImageIcon(getClass().getResource("/view/images/icone-Cancelar-onHover-30x30.png"));
                break;
        }
        if (ativo) {
            button.setIcon(iconePressionado);   
        } else {
            button.setIcon(iconePadrao);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelSuperior = new javax.swing.JPanel();
        buttonFechar = new javax.swing.JButton();
        buttonMinimizar = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        painelLateral = new javax.swing.JPanel();
        painelMenuPratos = new javax.swing.JPanel();
        iconeMenuPrato = new javax.swing.JLabel();
        textoMenuPratos = new javax.swing.JLabel();
        painelMenuPorcoes = new javax.swing.JPanel();
        iconeMenuPorcoes = new javax.swing.JLabel();
        textoMenuPorcoes = new javax.swing.JLabel();
        painelCentral = new javax.swing.JPanel();
        painelP1 = new javax.swing.JPanel();
        painelTituloP1 = new javax.swing.JPanel();
        linhaInferiorPrato1 = new javax.swing.JLabel();
        labelPrato1 = new javax.swing.JLabel();
        linhaSuperiorPrato1 = new javax.swing.JLabel();
        iconeP1 = new javax.swing.JLabel();
        painelArrozP1 = new javax.swing.JPanel();
        labelQtdeArrozP1 = new javax.swing.JLabel();
        iconeCirculoArrozP1 = new javax.swing.JLabel();
        buttonRemoveArrozP1 = new javax.swing.JButton();
        buttonAddArrozP1 = new javax.swing.JButton();
        iconeArrozP1 = new javax.swing.JLabel();
        textoPrato1Arroz = new javax.swing.JLabel();
        painelCarneP1 = new javax.swing.JPanel();
        labelQtdeCarneP1 = new javax.swing.JLabel();
        iconeCirculoCarneP1 = new javax.swing.JLabel();
        buttonRemoveCarneP1 = new javax.swing.JButton();
        buttonAddCarneP1 = new javax.swing.JButton();
        iconeCarneP1 = new javax.swing.JLabel();
        textoPrato1Arroz1 = new javax.swing.JLabel();
        painelSaladaP1 = new javax.swing.JPanel();
        labelQtdeSaladaP1 = new javax.swing.JLabel();
        iconeCirculoSaladaP1 = new javax.swing.JLabel();
        buttonRemoveSaladaP1 = new javax.swing.JButton();
        buttonAddSaladaP1 = new javax.swing.JButton();
        iconeSaladaP1 = new javax.swing.JLabel();
        textoPrato1Arroz2 = new javax.swing.JLabel();
        painelPrecoP1 = new javax.swing.JPanel();
        labelRsP1 = new javax.swing.JLabel();
        labelPrecoP1 = new javax.swing.JLabel();
        painelP2 = new javax.swing.JPanel();
        painelTituloP2 = new javax.swing.JPanel();
        linhaInferiorP2 = new javax.swing.JLabel();
        labelPrato2 = new javax.swing.JLabel();
        linhaSuperiorP2 = new javax.swing.JLabel();
        iconeP2 = new javax.swing.JLabel();
        painelArrozP2 = new javax.swing.JPanel();
        labelQtdeArrozP2 = new javax.swing.JLabel();
        iconeCirculoArrozP2 = new javax.swing.JLabel();
        buttonRemoveArrozP2 = new javax.swing.JButton();
        buttonAddArrozP2 = new javax.swing.JButton();
        iconeArrozP2 = new javax.swing.JLabel();
        textoPrato1Arroz3 = new javax.swing.JLabel();
        painelCarneP2 = new javax.swing.JPanel();
        labelQtdeCarneP2 = new javax.swing.JLabel();
        iconeCirculoCarneP2 = new javax.swing.JLabel();
        buttonRemoveCarneP2 = new javax.swing.JButton();
        buttonAddCarneP2 = new javax.swing.JButton();
        iconeCarneP2 = new javax.swing.JLabel();
        textoPrato1Arroz5 = new javax.swing.JLabel();
        painelSaladaP2 = new javax.swing.JPanel();
        labelQtdeSaladaP2 = new javax.swing.JLabel();
        iconeCirculoSaladaP2 = new javax.swing.JLabel();
        buttonRemoveSaladaP2 = new javax.swing.JButton();
        buttonAddSaladaP2 = new javax.swing.JButton();
        iconeSaladaP2 = new javax.swing.JLabel();
        textoPrato1Arroz7 = new javax.swing.JLabel();
        painelPrecoP2 = new javax.swing.JPanel();
        labelRsP2 = new javax.swing.JLabel();
        labelPrecoP2 = new javax.swing.JLabel();
        painelP3 = new javax.swing.JPanel();
        painelTituloP3 = new javax.swing.JPanel();
        linhaInferiorP3 = new javax.swing.JLabel();
        labelPrato3 = new javax.swing.JLabel();
        linhaSuperiorP3 = new javax.swing.JLabel();
        iconeP3 = new javax.swing.JLabel();
        painelArrozP3 = new javax.swing.JPanel();
        labelQtdeArrozP3 = new javax.swing.JLabel();
        iconeCirculoArrozP3 = new javax.swing.JLabel();
        buttonRemoveArrozP3 = new javax.swing.JButton();
        buttonAddArrozP3 = new javax.swing.JButton();
        iconeArrozP3 = new javax.swing.JLabel();
        textoPrato1Arroz4 = new javax.swing.JLabel();
        painelCarneP3 = new javax.swing.JPanel();
        labelQtdeCarneP3 = new javax.swing.JLabel();
        buttonAddCarneP3 = new javax.swing.JButton();
        buttonRemoveCarneP3 = new javax.swing.JButton();
        iconeCirculoCarneP3 = new javax.swing.JLabel();
        iconeCarneP3 = new javax.swing.JLabel();
        textoPrato1Arroz6 = new javax.swing.JLabel();
        painelSaladaP3 = new javax.swing.JPanel();
        labelQtdeSaladaP3 = new javax.swing.JLabel();
        iconeCirculoSaladaP3 = new javax.swing.JLabel();
        buttonAddSaladaP3 = new javax.swing.JButton();
        buttonRemoveSaladaP3 = new javax.swing.JButton();
        iconeSaladaP3 = new javax.swing.JLabel();
        textoPrato1Arroz8 = new javax.swing.JLabel();
        painelPrecoP3 = new javax.swing.JPanel();
        labelRsP3 = new javax.swing.JLabel();
        labelPrecoP3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Jantinhas");
        setUndecorated(true);
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelSuperior.setBackground(new java.awt.Color(167, 14, 19));
        painelSuperior.setPreferredSize(new java.awt.Dimension(1366, 35));
        painelSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Fechar-26x26.png"))); // NOI18N
        buttonFechar.setBorder(null);
        buttonFechar.setBorderPainted(false);
        buttonFechar.setContentAreaFilled(false);
        buttonFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonFecharMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonFecharMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonFecharMouseExited(evt);
            }
        });
        buttonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFecharActionPerformed(evt);
            }
        });
        painelSuperior.add(buttonFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1332, 6, -1, -1));

        buttonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Minimizar-26x26.png"))); // NOI18N
        buttonMinimizar.setBorder(null);
        buttonMinimizar.setBorderPainted(false);
        buttonMinimizar.setContentAreaFilled(false);
        buttonMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonMinimizarMouseExited(evt);
            }
        });
        buttonMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMinimizarActionPerformed(evt);
            }
        });
        painelSuperior.add(buttonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1299, 7, -1, -1));

        labelTitulo.setBackground(new java.awt.Color(242, 242, 235));
        labelTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(242, 242, 235));
        labelTitulo.setText("Controle de Jantinhas");
        painelSuperior.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        getContentPane().add(painelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        painelLateral.setBackground(new java.awt.Color(26, 26, 26));
        painelLateral.setPreferredSize(new java.awt.Dimension(360, 740));
        painelLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelMenuPratos.setBackground(new java.awt.Color(48, 48, 47));
        painelMenuPratos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        painelMenuPratos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconeMenuPrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Prato-65x65.png"))); // NOI18N
        painelMenuPratos.add(iconeMenuPrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        textoMenuPratos.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        textoMenuPratos.setForeground(new java.awt.Color(242, 242, 235));
        textoMenuPratos.setText("Pratos");
        painelMenuPratos.add(textoMenuPratos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, 39));

        painelLateral.add(painelMenuPratos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 131, 360, 90));

        painelMenuPorcoes.setBackground(new java.awt.Color(26, 26, 26));
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

        painelLateral.add(painelMenuPorcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 360, -1));

        getContentPane().add(painelLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, 730));

        painelCentral.setBackground(new java.awt.Color(242, 242, 235));
        painelCentral.setPreferredSize(new java.awt.Dimension(1006, 730));
        painelCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelP1.setBackground(new java.awt.Color(242, 242, 235));
        painelP1.setPreferredSize(new java.awt.Dimension(930, 250));
        painelP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelTituloP1.setBackground(new java.awt.Color(242, 242, 235));
        painelTituloP1.setPreferredSize(new java.awt.Dimension(929, 90));
        painelTituloP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        linhaInferiorPrato1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        linhaInferiorPrato1.setForeground(new java.awt.Color(26, 26, 26));
        linhaInferiorPrato1.setText("_______________________________________________________________________");
        painelTituloP1.add(linhaInferiorPrato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 54, -1, -1));

        labelPrato1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelPrato1.setForeground(new java.awt.Color(26, 26, 26));
        labelPrato1.setText("PRATO 1");
        painelTituloP1.add(labelPrato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 35, -1, -1));

        linhaSuperiorPrato1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        linhaSuperiorPrato1.setForeground(new java.awt.Color(26, 26, 26));
        linhaSuperiorPrato1.setText("_______________________________________________________________________");
        painelTituloP1.add(linhaSuperiorPrato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        painelP1.add(painelTituloP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        iconeP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Prato.png"))); // NOI18N
        painelP1.add(iconeP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        painelArrozP1.setBackground(new java.awt.Color(242, 242, 235));
        painelArrozP1.setPreferredSize(new java.awt.Dimension(140, 160));
        painelArrozP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelQtdeArrozP1.setBackground(new java.awt.Color(242, 242, 235));
        labelQtdeArrozP1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        labelQtdeArrozP1.setForeground(new java.awt.Color(242, 242, 235));
        labelQtdeArrozP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelQtdeArrozP1.setText("0");
        labelQtdeArrozP1.setBorder(null);
        labelQtdeArrozP1.setMaximumSize(new java.awt.Dimension(18, 21));
        labelQtdeArrozP1.setMinimumSize(new java.awt.Dimension(18, 21));
        labelQtdeArrozP1.setPreferredSize(new java.awt.Dimension(18, 21));
        painelArrozP1.add(labelQtdeArrozP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 107, -1, -1));

        iconeCirculoArrozP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-35x35.png"))); // NOI18N
        painelArrozP1.add(iconeCirculoArrozP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        buttonRemoveArrozP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Diminuir-30x30.png"))); // NOI18N
        buttonRemoveArrozP1.setBorder(null);
        buttonRemoveArrozP1.setBorderPainted(false);
        buttonRemoveArrozP1.setContentAreaFilled(false);
        buttonRemoveArrozP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRemoveArrozP1.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonRemoveArrozP1.setMinimumSize(new java.awt.Dimension(18, 18));
        buttonRemoveArrozP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonRemoveArrozP1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonRemoveArrozP1MouseExited(evt);
            }
        });
        buttonRemoveArrozP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveArrozP1ActionPerformed(evt);
            }
        });
        painelArrozP1.add(buttonRemoveArrozP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, -1, -1));

        buttonAddArrozP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Adicionar-30x30.png"))); // NOI18N
        buttonAddArrozP1.setBorder(null);
        buttonAddArrozP1.setBorderPainted(false);
        buttonAddArrozP1.setContentAreaFilled(false);
        buttonAddArrozP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAddArrozP1.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonAddArrozP1.setMinimumSize(new java.awt.Dimension(18, 18));
        buttonAddArrozP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonAddArrozP1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonAddArrozP1MouseExited(evt);
            }
        });
        buttonAddArrozP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddArrozP1ActionPerformed(evt);
            }
        });
        painelArrozP1.add(buttonAddArrozP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        iconeArrozP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Arroz.png"))); // NOI18N
        iconeArrozP1.setPreferredSize(new java.awt.Dimension(100, 100));
        painelArrozP1.add(iconeArrozP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 30, -1, -1));

        textoPrato1Arroz.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        textoPrato1Arroz.setForeground(new java.awt.Color(26, 26, 26));
        textoPrato1Arroz.setText("Arroz");
        painelArrozP1.add(textoPrato1Arroz, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 140, -1, 20));

        painelP1.add(painelArrozP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        painelCarneP1.setBackground(new java.awt.Color(242, 242, 235));
        painelCarneP1.setPreferredSize(new java.awt.Dimension(140, 160));
        painelCarneP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelQtdeCarneP1.setBackground(new java.awt.Color(242, 242, 235));
        labelQtdeCarneP1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        labelQtdeCarneP1.setForeground(new java.awt.Color(242, 242, 235));
        labelQtdeCarneP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelQtdeCarneP1.setText("0");
        labelQtdeCarneP1.setBorder(null);
        labelQtdeCarneP1.setMaximumSize(new java.awt.Dimension(18, 21));
        labelQtdeCarneP1.setMinimumSize(new java.awt.Dimension(18, 21));
        labelQtdeCarneP1.setPreferredSize(new java.awt.Dimension(18, 21));
        painelCarneP1.add(labelQtdeCarneP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 107, -1, -1));

        iconeCirculoCarneP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-35x35.png"))); // NOI18N
        painelCarneP1.add(iconeCirculoCarneP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        buttonRemoveCarneP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Diminuir-30x30.png"))); // NOI18N
        buttonRemoveCarneP1.setBorder(null);
        buttonRemoveCarneP1.setBorderPainted(false);
        buttonRemoveCarneP1.setContentAreaFilled(false);
        buttonRemoveCarneP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRemoveCarneP1.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonRemoveCarneP1.setMinimumSize(new java.awt.Dimension(18, 18));
        buttonRemoveCarneP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonRemoveCarneP1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonRemoveCarneP1MouseExited(evt);
            }
        });
        buttonRemoveCarneP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveCarneP1ActionPerformed(evt);
            }
        });
        painelCarneP1.add(buttonRemoveCarneP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, -1, -1));

        buttonAddCarneP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Adicionar-30x30.png"))); // NOI18N
        buttonAddCarneP1.setBorder(null);
        buttonAddCarneP1.setBorderPainted(false);
        buttonAddCarneP1.setContentAreaFilled(false);
        buttonAddCarneP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAddCarneP1.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonAddCarneP1.setMinimumSize(new java.awt.Dimension(18, 18));
        buttonAddCarneP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonAddCarneP1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonAddCarneP1MouseExited(evt);
            }
        });
        buttonAddCarneP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddCarneP1ActionPerformed(evt);
            }
        });
        painelCarneP1.add(buttonAddCarneP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        iconeCarneP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Carne.png"))); // NOI18N
        painelCarneP1.add(iconeCarneP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        textoPrato1Arroz1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        textoPrato1Arroz1.setForeground(new java.awt.Color(26, 26, 26));
        textoPrato1Arroz1.setText("Carne");
        painelCarneP1.add(textoPrato1Arroz1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, 20));

        painelP1.add(painelCarneP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        painelSaladaP1.setBackground(new java.awt.Color(242, 242, 235));
        painelSaladaP1.setPreferredSize(new java.awt.Dimension(140, 160));
        painelSaladaP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelQtdeSaladaP1.setBackground(new java.awt.Color(242, 242, 235));
        labelQtdeSaladaP1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        labelQtdeSaladaP1.setForeground(new java.awt.Color(242, 242, 235));
        labelQtdeSaladaP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelQtdeSaladaP1.setText("0");
        labelQtdeSaladaP1.setBorder(null);
        labelQtdeSaladaP1.setMaximumSize(new java.awt.Dimension(18, 21));
        labelQtdeSaladaP1.setMinimumSize(new java.awt.Dimension(18, 21));
        labelQtdeSaladaP1.setPreferredSize(new java.awt.Dimension(18, 21));
        painelSaladaP1.add(labelQtdeSaladaP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 107, -1, -1));

        iconeCirculoSaladaP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-35x35.png"))); // NOI18N
        painelSaladaP1.add(iconeCirculoSaladaP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        buttonRemoveSaladaP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Diminuir-30x30.png"))); // NOI18N
        buttonRemoveSaladaP1.setBorder(null);
        buttonRemoveSaladaP1.setBorderPainted(false);
        buttonRemoveSaladaP1.setContentAreaFilled(false);
        buttonRemoveSaladaP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRemoveSaladaP1.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonRemoveSaladaP1.setMinimumSize(new java.awt.Dimension(18, 18));
        buttonRemoveSaladaP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonRemoveSaladaP1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonRemoveSaladaP1MouseExited(evt);
            }
        });
        buttonRemoveSaladaP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveSaladaP1ActionPerformed(evt);
            }
        });
        painelSaladaP1.add(buttonRemoveSaladaP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, -1, -1));

        buttonAddSaladaP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Adicionar-30x30.png"))); // NOI18N
        buttonAddSaladaP1.setBorder(null);
        buttonAddSaladaP1.setBorderPainted(false);
        buttonAddSaladaP1.setContentAreaFilled(false);
        buttonAddSaladaP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAddSaladaP1.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonAddSaladaP1.setMinimumSize(new java.awt.Dimension(18, 18));
        buttonAddSaladaP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonAddSaladaP1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonAddSaladaP1MouseExited(evt);
            }
        });
        buttonAddSaladaP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddSaladaP1ActionPerformed(evt);
            }
        });
        painelSaladaP1.add(buttonAddSaladaP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        iconeSaladaP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Salada.png"))); // NOI18N
        painelSaladaP1.add(iconeSaladaP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 30, -1, -1));

        textoPrato1Arroz2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        textoPrato1Arroz2.setForeground(new java.awt.Color(26, 26, 26));
        textoPrato1Arroz2.setText("Salada");
        painelSaladaP1.add(textoPrato1Arroz2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, 20));

        painelP1.add(painelSaladaP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, -1, -1));

        painelPrecoP1.setBackground(new java.awt.Color(242, 242, 235));
        painelPrecoP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelRsP1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        labelRsP1.setForeground(new java.awt.Color(26, 26, 26));
        labelRsP1.setText("R$");
        painelPrecoP1.add(labelRsP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        labelPrecoP1.setFont(new java.awt.Font("Arial Black", 0, 42)); // NOI18N
        labelPrecoP1.setForeground(new java.awt.Color(26, 26, 26));
        labelPrecoP1.setText("999,99");
        labelPrecoP1.setPreferredSize(new java.awt.Dimension(150, 68));
        painelPrecoP1.add(labelPrecoP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 160, -1));

        painelP1.add(painelPrecoP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 240, -1));

        painelCentral.add(painelP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 940, -1));

        painelP2.setBackground(new java.awt.Color(242, 242, 235));
        painelP2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelTituloP2.setBackground(new java.awt.Color(242, 242, 235));
        painelTituloP2.setPreferredSize(new java.awt.Dimension(929, 90));
        painelTituloP2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        linhaInferiorP2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        linhaInferiorP2.setForeground(new java.awt.Color(26, 26, 26));
        linhaInferiorP2.setText("_______________________________________________________________________");
        painelTituloP2.add(linhaInferiorP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 54, -1, -1));

        labelPrato2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelPrato2.setForeground(new java.awt.Color(26, 26, 26));
        labelPrato2.setText("PRATO 2");
        painelTituloP2.add(labelPrato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 35, -1, -1));

        linhaSuperiorP2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        linhaSuperiorP2.setForeground(new java.awt.Color(26, 26, 26));
        linhaSuperiorP2.setText("_______________________________________________________________________");
        painelTituloP2.add(linhaSuperiorP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        painelP2.add(painelTituloP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        iconeP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Prato.png"))); // NOI18N
        painelP2.add(iconeP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        painelArrozP2.setBackground(new java.awt.Color(242, 242, 235));
        painelArrozP2.setPreferredSize(new java.awt.Dimension(140, 160));
        painelArrozP2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelQtdeArrozP2.setBackground(new java.awt.Color(242, 242, 235));
        labelQtdeArrozP2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        labelQtdeArrozP2.setForeground(new java.awt.Color(242, 242, 235));
        labelQtdeArrozP2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelQtdeArrozP2.setText("0");
        labelQtdeArrozP2.setBorder(null);
        labelQtdeArrozP2.setMaximumSize(new java.awt.Dimension(18, 21));
        labelQtdeArrozP2.setMinimumSize(new java.awt.Dimension(18, 21));
        labelQtdeArrozP2.setPreferredSize(new java.awt.Dimension(18, 21));
        painelArrozP2.add(labelQtdeArrozP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 107, -1, -1));

        iconeCirculoArrozP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-35x35.png"))); // NOI18N
        painelArrozP2.add(iconeCirculoArrozP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        buttonRemoveArrozP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Diminuir-30x30.png"))); // NOI18N
        buttonRemoveArrozP2.setBorder(null);
        buttonRemoveArrozP2.setBorderPainted(false);
        buttonRemoveArrozP2.setContentAreaFilled(false);
        buttonRemoveArrozP2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRemoveArrozP2.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonRemoveArrozP2.setMinimumSize(new java.awt.Dimension(18, 18));
        buttonRemoveArrozP2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonRemoveArrozP2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonRemoveArrozP2MouseExited(evt);
            }
        });
        buttonRemoveArrozP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveArrozP2ActionPerformed(evt);
            }
        });
        painelArrozP2.add(buttonRemoveArrozP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, -1, -1));

        buttonAddArrozP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Adicionar-30x30.png"))); // NOI18N
        buttonAddArrozP2.setBorder(null);
        buttonAddArrozP2.setBorderPainted(false);
        buttonAddArrozP2.setContentAreaFilled(false);
        buttonAddArrozP2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAddArrozP2.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonAddArrozP2.setMinimumSize(new java.awt.Dimension(18, 18));
        buttonAddArrozP2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonAddArrozP2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonAddArrozP2MouseExited(evt);
            }
        });
        buttonAddArrozP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddArrozP2ActionPerformed(evt);
            }
        });
        painelArrozP2.add(buttonAddArrozP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        iconeArrozP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Arroz.png"))); // NOI18N
        iconeArrozP2.setPreferredSize(new java.awt.Dimension(100, 100));
        painelArrozP2.add(iconeArrozP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 30, -1, -1));

        textoPrato1Arroz3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        textoPrato1Arroz3.setForeground(new java.awt.Color(26, 26, 26));
        textoPrato1Arroz3.setText("Arroz");
        painelArrozP2.add(textoPrato1Arroz3, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 140, -1, 20));

        painelP2.add(painelArrozP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        painelCarneP2.setBackground(new java.awt.Color(242, 242, 235));
        painelCarneP2.setPreferredSize(new java.awt.Dimension(140, 160));
        painelCarneP2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelQtdeCarneP2.setBackground(new java.awt.Color(242, 242, 235));
        labelQtdeCarneP2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        labelQtdeCarneP2.setForeground(new java.awt.Color(242, 242, 235));
        labelQtdeCarneP2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelQtdeCarneP2.setText("0");
        labelQtdeCarneP2.setBorder(null);
        labelQtdeCarneP2.setMaximumSize(new java.awt.Dimension(18, 21));
        labelQtdeCarneP2.setMinimumSize(new java.awt.Dimension(18, 21));
        labelQtdeCarneP2.setPreferredSize(new java.awt.Dimension(18, 21));
        painelCarneP2.add(labelQtdeCarneP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 107, -1, -1));

        iconeCirculoCarneP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-35x35.png"))); // NOI18N
        painelCarneP2.add(iconeCirculoCarneP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        buttonRemoveCarneP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Diminuir-30x30.png"))); // NOI18N
        buttonRemoveCarneP2.setBorder(null);
        buttonRemoveCarneP2.setBorderPainted(false);
        buttonRemoveCarneP2.setContentAreaFilled(false);
        buttonRemoveCarneP2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRemoveCarneP2.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonRemoveCarneP2.setMinimumSize(new java.awt.Dimension(18, 18));
        buttonRemoveCarneP2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonRemoveCarneP2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonRemoveCarneP2MouseExited(evt);
            }
        });
        buttonRemoveCarneP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveCarneP2ActionPerformed(evt);
            }
        });
        painelCarneP2.add(buttonRemoveCarneP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, -1, -1));

        buttonAddCarneP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Adicionar-30x30.png"))); // NOI18N
        buttonAddCarneP2.setBorder(null);
        buttonAddCarneP2.setBorderPainted(false);
        buttonAddCarneP2.setContentAreaFilled(false);
        buttonAddCarneP2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAddCarneP2.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonAddCarneP2.setMinimumSize(new java.awt.Dimension(18, 18));
        buttonAddCarneP2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonAddCarneP2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonAddCarneP2MouseExited(evt);
            }
        });
        buttonAddCarneP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddCarneP2ActionPerformed(evt);
            }
        });
        painelCarneP2.add(buttonAddCarneP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        iconeCarneP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Carne.png"))); // NOI18N
        painelCarneP2.add(iconeCarneP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        textoPrato1Arroz5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        textoPrato1Arroz5.setForeground(new java.awt.Color(26, 26, 26));
        textoPrato1Arroz5.setText("Carne");
        painelCarneP2.add(textoPrato1Arroz5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, 20));

        painelP2.add(painelCarneP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        painelSaladaP2.setBackground(new java.awt.Color(242, 242, 235));
        painelSaladaP2.setPreferredSize(new java.awt.Dimension(140, 160));
        painelSaladaP2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelQtdeSaladaP2.setBackground(new java.awt.Color(242, 242, 235));
        labelQtdeSaladaP2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        labelQtdeSaladaP2.setForeground(new java.awt.Color(242, 242, 235));
        labelQtdeSaladaP2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelQtdeSaladaP2.setText("0");
        labelQtdeSaladaP2.setBorder(null);
        labelQtdeSaladaP2.setMaximumSize(new java.awt.Dimension(18, 21));
        labelQtdeSaladaP2.setMinimumSize(new java.awt.Dimension(18, 21));
        labelQtdeSaladaP2.setPreferredSize(new java.awt.Dimension(18, 21));
        painelSaladaP2.add(labelQtdeSaladaP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 107, -1, -1));

        iconeCirculoSaladaP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-35x35.png"))); // NOI18N
        painelSaladaP2.add(iconeCirculoSaladaP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        buttonRemoveSaladaP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Diminuir-30x30.png"))); // NOI18N
        buttonRemoveSaladaP2.setBorder(null);
        buttonRemoveSaladaP2.setBorderPainted(false);
        buttonRemoveSaladaP2.setContentAreaFilled(false);
        buttonRemoveSaladaP2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRemoveSaladaP2.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonRemoveSaladaP2.setMinimumSize(new java.awt.Dimension(18, 18));
        buttonRemoveSaladaP2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonRemoveSaladaP2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonRemoveSaladaP2MouseExited(evt);
            }
        });
        buttonRemoveSaladaP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveSaladaP2ActionPerformed(evt);
            }
        });
        painelSaladaP2.add(buttonRemoveSaladaP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, -1, -1));

        buttonAddSaladaP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Adicionar-30x30.png"))); // NOI18N
        buttonAddSaladaP2.setBorder(null);
        buttonAddSaladaP2.setBorderPainted(false);
        buttonAddSaladaP2.setContentAreaFilled(false);
        buttonAddSaladaP2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAddSaladaP2.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonAddSaladaP2.setMinimumSize(new java.awt.Dimension(18, 18));
        buttonAddSaladaP2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonAddSaladaP2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonAddSaladaP2MouseExited(evt);
            }
        });
        buttonAddSaladaP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddSaladaP2ActionPerformed(evt);
            }
        });
        painelSaladaP2.add(buttonAddSaladaP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        iconeSaladaP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Salada.png"))); // NOI18N
        painelSaladaP2.add(iconeSaladaP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 30, -1, -1));

        textoPrato1Arroz7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        textoPrato1Arroz7.setForeground(new java.awt.Color(26, 26, 26));
        textoPrato1Arroz7.setText("Salada");
        painelSaladaP2.add(textoPrato1Arroz7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, 20));

        painelP2.add(painelSaladaP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, -1, -1));

        painelPrecoP2.setBackground(new java.awt.Color(242, 242, 235));
        painelPrecoP2.setPreferredSize(new java.awt.Dimension(210, 68));
        painelPrecoP2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelRsP2.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        labelRsP2.setForeground(new java.awt.Color(26, 26, 26));
        labelRsP2.setText("R$");
        painelPrecoP2.add(labelRsP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        labelPrecoP2.setFont(new java.awt.Font("Arial Black", 0, 42)); // NOI18N
        labelPrecoP2.setForeground(new java.awt.Color(26, 26, 26));
        labelPrecoP2.setText("999,99");
        labelPrecoP2.setPreferredSize(new java.awt.Dimension(150, 68));
        painelPrecoP2.add(labelPrecoP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 160, -1));

        painelP2.add(painelPrecoP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 230, -1));

        painelCentral.add(painelP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        painelP3.setBackground(new java.awt.Color(242, 242, 235));
        painelP3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelTituloP3.setBackground(new java.awt.Color(242, 242, 235));
        painelTituloP3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        linhaInferiorP3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        linhaInferiorP3.setForeground(new java.awt.Color(26, 26, 26));
        linhaInferiorP3.setText("_______________________________________________________________________");
        painelTituloP3.add(linhaInferiorP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 54, -1, -1));

        labelPrato3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelPrato3.setForeground(new java.awt.Color(26, 26, 26));
        labelPrato3.setText("PRATO 3");
        painelTituloP3.add(labelPrato3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 35, -1, -1));

        linhaSuperiorP3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        linhaSuperiorP3.setForeground(new java.awt.Color(26, 26, 26));
        linhaSuperiorP3.setText("_______________________________________________________________________");
        painelTituloP3.add(linhaSuperiorP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        painelP3.add(painelTituloP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 90));

        iconeP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Prato.png"))); // NOI18N
        painelP3.add(iconeP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        painelArrozP3.setBackground(new java.awt.Color(242, 242, 235));
        painelArrozP3.setPreferredSize(new java.awt.Dimension(140, 160));
        painelArrozP3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelQtdeArrozP3.setBackground(new java.awt.Color(242, 242, 235));
        labelQtdeArrozP3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        labelQtdeArrozP3.setForeground(new java.awt.Color(242, 242, 235));
        labelQtdeArrozP3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelQtdeArrozP3.setText("0");
        labelQtdeArrozP3.setBorder(null);
        labelQtdeArrozP3.setMaximumSize(new java.awt.Dimension(18, 21));
        labelQtdeArrozP3.setMinimumSize(new java.awt.Dimension(18, 21));
        labelQtdeArrozP3.setPreferredSize(new java.awt.Dimension(18, 21));
        painelArrozP3.add(labelQtdeArrozP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 107, -1, -1));

        iconeCirculoArrozP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-35x35.png"))); // NOI18N
        painelArrozP3.add(iconeCirculoArrozP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        buttonRemoveArrozP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Diminuir-30x30.png"))); // NOI18N
        buttonRemoveArrozP3.setBorder(null);
        buttonRemoveArrozP3.setBorderPainted(false);
        buttonRemoveArrozP3.setContentAreaFilled(false);
        buttonRemoveArrozP3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRemoveArrozP3.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonRemoveArrozP3.setMinimumSize(new java.awt.Dimension(18, 18));
        buttonRemoveArrozP3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonRemoveArrozP3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonRemoveArrozP3MouseExited(evt);
            }
        });
        buttonRemoveArrozP3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveArrozP3ActionPerformed(evt);
            }
        });
        painelArrozP3.add(buttonRemoveArrozP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, -1, -1));

        buttonAddArrozP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Adicionar-30x30.png"))); // NOI18N
        buttonAddArrozP3.setBorder(null);
        buttonAddArrozP3.setBorderPainted(false);
        buttonAddArrozP3.setContentAreaFilled(false);
        buttonAddArrozP3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAddArrozP3.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonAddArrozP3.setMinimumSize(new java.awt.Dimension(18, 18));
        buttonAddArrozP3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonAddArrozP3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonAddArrozP3MouseExited(evt);
            }
        });
        buttonAddArrozP3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddArrozP3ActionPerformed(evt);
            }
        });
        painelArrozP3.add(buttonAddArrozP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        iconeArrozP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Arroz.png"))); // NOI18N
        iconeArrozP3.setPreferredSize(new java.awt.Dimension(100, 100));
        painelArrozP3.add(iconeArrozP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 30, -1, -1));

        textoPrato1Arroz4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        textoPrato1Arroz4.setForeground(new java.awt.Color(26, 26, 26));
        textoPrato1Arroz4.setText("Arroz");
        painelArrozP3.add(textoPrato1Arroz4, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 140, -1, 20));

        painelP3.add(painelArrozP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        painelCarneP3.setBackground(new java.awt.Color(242, 242, 235));
        painelCarneP3.setPreferredSize(new java.awt.Dimension(140, 160));
        painelCarneP3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelQtdeCarneP3.setBackground(new java.awt.Color(242, 242, 235));
        labelQtdeCarneP3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        labelQtdeCarneP3.setForeground(new java.awt.Color(242, 242, 235));
        labelQtdeCarneP3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelQtdeCarneP3.setText("0");
        labelQtdeCarneP3.setBorder(null);
        labelQtdeCarneP3.setMaximumSize(new java.awt.Dimension(18, 21));
        labelQtdeCarneP3.setMinimumSize(new java.awt.Dimension(18, 21));
        labelQtdeCarneP3.setPreferredSize(new java.awt.Dimension(18, 21));
        painelCarneP3.add(labelQtdeCarneP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 107, -1, -1));

        buttonAddCarneP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Adicionar-30x30.png"))); // NOI18N
        buttonAddCarneP3.setBorder(null);
        buttonAddCarneP3.setBorderPainted(false);
        buttonAddCarneP3.setContentAreaFilled(false);
        buttonAddCarneP3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAddCarneP3.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonAddCarneP3.setMinimumSize(new java.awt.Dimension(18, 18));
        buttonAddCarneP3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonAddCarneP3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonAddCarneP3MouseExited(evt);
            }
        });
        buttonAddCarneP3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddCarneP3ActionPerformed(evt);
            }
        });
        painelCarneP3.add(buttonAddCarneP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        buttonRemoveCarneP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Diminuir-30x30.png"))); // NOI18N
        buttonRemoveCarneP3.setBorder(null);
        buttonRemoveCarneP3.setBorderPainted(false);
        buttonRemoveCarneP3.setContentAreaFilled(false);
        buttonRemoveCarneP3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRemoveCarneP3.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonRemoveCarneP3.setMinimumSize(new java.awt.Dimension(18, 18));
        buttonRemoveCarneP3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonRemoveCarneP3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonRemoveCarneP3MouseExited(evt);
            }
        });
        buttonRemoveCarneP3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveCarneP3ActionPerformed(evt);
            }
        });
        painelCarneP3.add(buttonRemoveCarneP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, -1, -1));

        iconeCirculoCarneP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-35x35.png"))); // NOI18N
        painelCarneP3.add(iconeCirculoCarneP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        iconeCarneP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Carne.png"))); // NOI18N
        painelCarneP3.add(iconeCarneP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        textoPrato1Arroz6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        textoPrato1Arroz6.setForeground(new java.awt.Color(26, 26, 26));
        textoPrato1Arroz6.setText("Carne");
        painelCarneP3.add(textoPrato1Arroz6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, 20));

        painelP3.add(painelCarneP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        painelSaladaP3.setBackground(new java.awt.Color(242, 242, 235));
        painelSaladaP3.setPreferredSize(new java.awt.Dimension(140, 160));
        painelSaladaP3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelQtdeSaladaP3.setBackground(new java.awt.Color(242, 242, 235));
        labelQtdeSaladaP3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        labelQtdeSaladaP3.setForeground(new java.awt.Color(242, 242, 235));
        labelQtdeSaladaP3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelQtdeSaladaP3.setText("0");
        labelQtdeSaladaP3.setBorder(null);
        labelQtdeSaladaP3.setMaximumSize(new java.awt.Dimension(18, 21));
        labelQtdeSaladaP3.setMinimumSize(new java.awt.Dimension(18, 21));
        labelQtdeSaladaP3.setPreferredSize(new java.awt.Dimension(18, 21));
        painelSaladaP3.add(labelQtdeSaladaP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 107, -1, -1));

        iconeCirculoSaladaP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-35x35.png"))); // NOI18N
        painelSaladaP3.add(iconeCirculoSaladaP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        buttonAddSaladaP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Adicionar-30x30.png"))); // NOI18N
        buttonAddSaladaP3.setBorder(null);
        buttonAddSaladaP3.setBorderPainted(false);
        buttonAddSaladaP3.setContentAreaFilled(false);
        buttonAddSaladaP3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAddSaladaP3.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonAddSaladaP3.setMinimumSize(new java.awt.Dimension(18, 18));
        buttonAddSaladaP3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonAddSaladaP3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonAddSaladaP3MouseExited(evt);
            }
        });
        buttonAddSaladaP3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddSaladaP3ActionPerformed(evt);
            }
        });
        painelSaladaP3.add(buttonAddSaladaP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        buttonRemoveSaladaP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Diminuir-30x30.png"))); // NOI18N
        buttonRemoveSaladaP3.setBorder(null);
        buttonRemoveSaladaP3.setBorderPainted(false);
        buttonRemoveSaladaP3.setContentAreaFilled(false);
        buttonRemoveSaladaP3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRemoveSaladaP3.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonRemoveSaladaP3.setMinimumSize(new java.awt.Dimension(18, 18));
        buttonRemoveSaladaP3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonRemoveSaladaP3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonRemoveSaladaP3MouseExited(evt);
            }
        });
        buttonRemoveSaladaP3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveSaladaP3ActionPerformed(evt);
            }
        });
        painelSaladaP3.add(buttonRemoveSaladaP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, -1, -1));

        iconeSaladaP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Salada.png"))); // NOI18N
        painelSaladaP3.add(iconeSaladaP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 30, -1, -1));

        textoPrato1Arroz8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        textoPrato1Arroz8.setForeground(new java.awt.Color(26, 26, 26));
        textoPrato1Arroz8.setText("Salada");
        painelSaladaP3.add(textoPrato1Arroz8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, 20));

        painelP3.add(painelSaladaP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, -1, -1));

        painelPrecoP3.setBackground(new java.awt.Color(242, 242, 235));
        painelPrecoP3.setPreferredSize(new java.awt.Dimension(210, 68));
        painelPrecoP3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelRsP3.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        labelRsP3.setForeground(new java.awt.Color(26, 26, 26));
        labelRsP3.setText("R$");
        painelPrecoP3.add(labelRsP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        labelPrecoP3.setFont(new java.awt.Font("Arial Black", 0, 42)); // NOI18N
        labelPrecoP3.setForeground(new java.awt.Color(26, 26, 26));
        labelPrecoP3.setText("999,99");
        labelPrecoP3.setPreferredSize(new java.awt.Dimension(150, 68));
        painelPrecoP3.add(labelPrecoP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 160, -1));

        painelP3.add(painelPrecoP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 220, -1));

        painelCentral.add(painelP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        getContentPane().add(painelCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFecharMouseClicked

    }//GEN-LAST:event_buttonFecharMouseClicked

    private void buttonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonFecharActionPerformed

    private void buttonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMinimizarActionPerformed
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_buttonMinimizarActionPerformed

    private void painelMenuPorcoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelMenuPorcoesMouseClicked
        mostrarTelaPorcoes();
        this.setVisible(false);
    }//GEN-LAST:event_painelMenuPorcoesMouseClicked

    private void painelMenuPorcoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelMenuPorcoesMouseExited
        painelMenuPorcoes.setBackground(Color.decode("#1A1A1A"));
        painelMenuPratos.setBackground(Color.decode("#30302F"));
    }//GEN-LAST:event_painelMenuPorcoesMouseExited

    private void painelMenuPorcoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelMenuPorcoesMouseEntered
        painelMenuPorcoes.setBackground(Color.decode("#30302F"));
        painelMenuPratos.setBackground(Color.decode("#1A1A1A"));
    }//GEN-LAST:event_painelMenuPorcoesMouseEntered

    private void buttonAddArrozP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddArrozP1ActionPerformed
        addArroz(0);
        atualizarPrecoPrato1();
        atualizarQtdePorcoesPrato1();
    }//GEN-LAST:event_buttonAddArrozP1ActionPerformed

    private void buttonRemoveArrozP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveArrozP1ActionPerformed
        removeArroz(0);
        atualizarPrecoPrato1();
        atualizarQtdePorcoesPrato1();
    }//GEN-LAST:event_buttonRemoveArrozP1ActionPerformed

    private void buttonAddCarneP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddCarneP1ActionPerformed
        addCarne(0);
        atualizarPrecoPrato1();
        atualizarQtdePorcoesPrato1();
    }//GEN-LAST:event_buttonAddCarneP1ActionPerformed

    private void buttonRemoveCarneP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveCarneP1ActionPerformed
        removeCarne(0);
        atualizarPrecoPrato1();
        atualizarQtdePorcoesPrato1();
    }//GEN-LAST:event_buttonRemoveCarneP1ActionPerformed

    private void buttonAddSaladaP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddSaladaP1ActionPerformed
        addSalada(0);
        atualizarPrecoPrato1();
        atualizarQtdePorcoesPrato1();
    }//GEN-LAST:event_buttonAddSaladaP1ActionPerformed

    private void buttonRemoveSaladaP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveSaladaP1ActionPerformed
        removeSalada(0);
        atualizarPrecoPrato1();
        atualizarQtdePorcoesPrato1();
    }//GEN-LAST:event_buttonRemoveSaladaP1ActionPerformed

    private void buttonAddArrozP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddArrozP2ActionPerformed
        addArroz(1);
        atualizarPrecoPrato2();
        atualizarQtdePorcoesPrato2();
    }//GEN-LAST:event_buttonAddArrozP2ActionPerformed

    private void buttonRemoveArrozP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveArrozP2ActionPerformed
        removeArroz(1);
        atualizarPrecoPrato2();
        atualizarQtdePorcoesPrato2();
    }//GEN-LAST:event_buttonRemoveArrozP2ActionPerformed

    private void buttonAddCarneP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddCarneP2ActionPerformed
        addCarne(1);
        atualizarPrecoPrato2();
        atualizarQtdePorcoesPrato2();
    }//GEN-LAST:event_buttonAddCarneP2ActionPerformed

    private void buttonRemoveCarneP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveCarneP2ActionPerformed
        removeCarne(1);
        atualizarPrecoPrato2();
        atualizarQtdePorcoesPrato2();
    }//GEN-LAST:event_buttonRemoveCarneP2ActionPerformed

    private void buttonAddSaladaP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddSaladaP2ActionPerformed
        addSalada(1);
        atualizarPrecoPrato2();
        atualizarQtdePorcoesPrato2();
    }//GEN-LAST:event_buttonAddSaladaP2ActionPerformed

    private void buttonRemoveSaladaP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveSaladaP2ActionPerformed
        removeSalada(1);
        atualizarPrecoPrato2();
        atualizarQtdePorcoesPrato2();
    }//GEN-LAST:event_buttonRemoveSaladaP2ActionPerformed

    private void buttonAddArrozP3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddArrozP3ActionPerformed
        addArroz(2);
        atualizarPrecoPrato3();
        atualizarQtdePorcoesPrato3();
    }//GEN-LAST:event_buttonAddArrozP3ActionPerformed

    private void buttonRemoveArrozP3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveArrozP3ActionPerformed
        removeArroz(2);
        atualizarPrecoPrato3();
        atualizarQtdePorcoesPrato3();
    }//GEN-LAST:event_buttonRemoveArrozP3ActionPerformed

    private void buttonAddCarneP3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddCarneP3ActionPerformed
        addCarne(2);
        atualizarPrecoPrato3();
        atualizarQtdePorcoesPrato3();
    }//GEN-LAST:event_buttonAddCarneP3ActionPerformed

    private void buttonRemoveCarneP3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveCarneP3ActionPerformed
        removeCarne(2);
        atualizarPrecoPrato3();
        atualizarQtdePorcoesPrato3();
    }//GEN-LAST:event_buttonRemoveCarneP3ActionPerformed

    private void buttonAddSaladaP3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddSaladaP3ActionPerformed
        addSalada(2);
        atualizarPrecoPrato3();
        atualizarQtdePorcoesPrato3();
    }//GEN-LAST:event_buttonAddSaladaP3ActionPerformed

    private void buttonRemoveSaladaP3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveSaladaP3ActionPerformed
        removeSalada(2);
        atualizarPrecoPrato3();
        atualizarQtdePorcoesPrato3();
    }//GEN-LAST:event_buttonRemoveSaladaP3ActionPerformed

    private void buttonAddArrozP1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAddArrozP1MouseEntered
        animacaoBotaoPressionado("add", buttonAddArrozP1, true);
    }//GEN-LAST:event_buttonAddArrozP1MouseEntered

    private void buttonAddArrozP1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAddArrozP1MouseExited
        animacaoBotaoPressionado("add", buttonAddArrozP1, false);
    }//GEN-LAST:event_buttonAddArrozP1MouseExited

    private void buttonRemoveArrozP1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRemoveArrozP1MouseEntered
        animacaoBotaoPressionado("remove", buttonRemoveArrozP1, true);
    }//GEN-LAST:event_buttonRemoveArrozP1MouseEntered

    private void buttonRemoveArrozP1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRemoveArrozP1MouseExited
        animacaoBotaoPressionado("remove", buttonRemoveArrozP1, false);
    }//GEN-LAST:event_buttonRemoveArrozP1MouseExited

    private void buttonAddCarneP1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAddCarneP1MouseEntered
        animacaoBotaoPressionado("add", buttonAddCarneP1, true);
    }//GEN-LAST:event_buttonAddCarneP1MouseEntered

    private void buttonAddCarneP1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAddCarneP1MouseExited
        animacaoBotaoPressionado("add", buttonAddCarneP1, false);
    }//GEN-LAST:event_buttonAddCarneP1MouseExited

    private void buttonRemoveCarneP1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRemoveCarneP1MouseEntered
        animacaoBotaoPressionado("remove", buttonRemoveCarneP1, true);
    }//GEN-LAST:event_buttonRemoveCarneP1MouseEntered

    private void buttonRemoveCarneP1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRemoveCarneP1MouseExited
        animacaoBotaoPressionado("remove", buttonRemoveCarneP1, false);
    }//GEN-LAST:event_buttonRemoveCarneP1MouseExited

    private void buttonAddSaladaP1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAddSaladaP1MouseEntered
        animacaoBotaoPressionado("add", buttonAddSaladaP1, true);
    }//GEN-LAST:event_buttonAddSaladaP1MouseEntered

    private void buttonAddSaladaP1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAddSaladaP1MouseExited
        animacaoBotaoPressionado("add", buttonAddSaladaP1, false);
    }//GEN-LAST:event_buttonAddSaladaP1MouseExited

    private void buttonRemoveSaladaP1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRemoveSaladaP1MouseEntered
        animacaoBotaoPressionado("remove", buttonRemoveSaladaP1, true);
    }//GEN-LAST:event_buttonRemoveSaladaP1MouseEntered

    private void buttonRemoveSaladaP1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRemoveSaladaP1MouseExited
        animacaoBotaoPressionado("remove", buttonRemoveSaladaP1, false);
    }//GEN-LAST:event_buttonRemoveSaladaP1MouseExited

    private void buttonAddArrozP2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAddArrozP2MouseEntered
        animacaoBotaoPressionado("add", buttonAddArrozP2, true);
    }//GEN-LAST:event_buttonAddArrozP2MouseEntered

    private void buttonAddArrozP2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAddArrozP2MouseExited
        animacaoBotaoPressionado("add", buttonAddArrozP2, false);
    }//GEN-LAST:event_buttonAddArrozP2MouseExited

    private void buttonRemoveArrozP2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRemoveArrozP2MouseEntered
        animacaoBotaoPressionado("remove", buttonRemoveArrozP2, true);
    }//GEN-LAST:event_buttonRemoveArrozP2MouseEntered

    private void buttonRemoveArrozP2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRemoveArrozP2MouseExited
        animacaoBotaoPressionado("remove", buttonRemoveArrozP2, false);
    }//GEN-LAST:event_buttonRemoveArrozP2MouseExited

    private void buttonAddCarneP2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAddCarneP2MouseEntered
       animacaoBotaoPressionado("add", buttonAddCarneP2, true);
    }//GEN-LAST:event_buttonAddCarneP2MouseEntered

    private void buttonAddCarneP2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAddCarneP2MouseExited
        animacaoBotaoPressionado("add", buttonAddCarneP2, false);
    }//GEN-LAST:event_buttonAddCarneP2MouseExited

    private void buttonRemoveCarneP2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRemoveCarneP2MouseEntered
        animacaoBotaoPressionado("remove", buttonRemoveCarneP2, true);
    }//GEN-LAST:event_buttonRemoveCarneP2MouseEntered

    private void buttonRemoveCarneP2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRemoveCarneP2MouseExited
        animacaoBotaoPressionado("remove", buttonRemoveCarneP2, false);
    }//GEN-LAST:event_buttonRemoveCarneP2MouseExited

    private void buttonAddSaladaP2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAddSaladaP2MouseEntered
       animacaoBotaoPressionado("add", buttonAddSaladaP2, true);
    }//GEN-LAST:event_buttonAddSaladaP2MouseEntered

    private void buttonAddSaladaP2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAddSaladaP2MouseExited
        animacaoBotaoPressionado("add", buttonAddSaladaP2, false);
    }//GEN-LAST:event_buttonAddSaladaP2MouseExited

    private void buttonRemoveSaladaP2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRemoveSaladaP2MouseEntered
        animacaoBotaoPressionado("remove", buttonRemoveSaladaP2, true);
    }//GEN-LAST:event_buttonRemoveSaladaP2MouseEntered

    private void buttonRemoveSaladaP2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRemoveSaladaP2MouseExited
       animacaoBotaoPressionado("remove", buttonRemoveSaladaP2, false);
    }//GEN-LAST:event_buttonRemoveSaladaP2MouseExited

    private void buttonAddArrozP3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAddArrozP3MouseEntered
        animacaoBotaoPressionado("add", buttonAddArrozP3, true);
    }//GEN-LAST:event_buttonAddArrozP3MouseEntered

    private void buttonAddArrozP3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAddArrozP3MouseExited
       animacaoBotaoPressionado("add", buttonAddArrozP3, false);
    }//GEN-LAST:event_buttonAddArrozP3MouseExited

    private void buttonRemoveArrozP3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRemoveArrozP3MouseEntered
        animacaoBotaoPressionado("remove", buttonRemoveArrozP3, true);
    }//GEN-LAST:event_buttonRemoveArrozP3MouseEntered

    private void buttonRemoveArrozP3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRemoveArrozP3MouseExited
        animacaoBotaoPressionado("remove", buttonRemoveArrozP3, false);
    }//GEN-LAST:event_buttonRemoveArrozP3MouseExited

    private void buttonAddCarneP3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAddCarneP3MouseEntered
        animacaoBotaoPressionado("add", buttonAddCarneP3, true);
    }//GEN-LAST:event_buttonAddCarneP3MouseEntered

    private void buttonAddCarneP3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAddCarneP3MouseExited
        animacaoBotaoPressionado("add", buttonAddCarneP3, false);
    }//GEN-LAST:event_buttonAddCarneP3MouseExited

    private void buttonRemoveCarneP3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRemoveCarneP3MouseEntered
        animacaoBotaoPressionado("remove", buttonRemoveCarneP3, true);
    }//GEN-LAST:event_buttonRemoveCarneP3MouseEntered

    private void buttonRemoveCarneP3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRemoveCarneP3MouseExited
        animacaoBotaoPressionado("remove", buttonRemoveCarneP3, false);
    }//GEN-LAST:event_buttonRemoveCarneP3MouseExited

    private void buttonAddSaladaP3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAddSaladaP3MouseEntered
        animacaoBotaoPressionado("add", buttonAddSaladaP3, true);
    }//GEN-LAST:event_buttonAddSaladaP3MouseEntered

    private void buttonAddSaladaP3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAddSaladaP3MouseExited
        animacaoBotaoPressionado("add", buttonAddSaladaP3, false);
    }//GEN-LAST:event_buttonAddSaladaP3MouseExited

    private void buttonRemoveSaladaP3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRemoveSaladaP3MouseEntered
        animacaoBotaoPressionado("remove", buttonRemoveSaladaP3, true);
    }//GEN-LAST:event_buttonRemoveSaladaP3MouseEntered

    private void buttonRemoveSaladaP3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRemoveSaladaP3MouseExited
        animacaoBotaoPressionado("remove", buttonRemoveSaladaP3, false);
    }//GEN-LAST:event_buttonRemoveSaladaP3MouseExited

    private void buttonFecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFecharMouseEntered
        animacaoBotaoPressionado("fechar", buttonFechar, true);
    }//GEN-LAST:event_buttonFecharMouseEntered

    private void buttonFecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFecharMouseExited
        animacaoBotaoPressionado("fechar", buttonFechar, false);
    }//GEN-LAST:event_buttonFecharMouseExited

    private void buttonMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMinimizarMouseEntered
        animacaoBotaoPressionado("minimizar", buttonMinimizar, true);
    }//GEN-LAST:event_buttonMinimizarMouseEntered

    private void buttonMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMinimizarMouseExited
        animacaoBotaoPressionado("minimizar", buttonMinimizar, false);
    }//GEN-LAST:event_buttonMinimizarMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddArrozP1;
    private javax.swing.JButton buttonAddArrozP2;
    private javax.swing.JButton buttonAddArrozP3;
    private javax.swing.JButton buttonAddCarneP1;
    private javax.swing.JButton buttonAddCarneP2;
    private javax.swing.JButton buttonAddCarneP3;
    private javax.swing.JButton buttonAddSaladaP1;
    private javax.swing.JButton buttonAddSaladaP2;
    private javax.swing.JButton buttonAddSaladaP3;
    private javax.swing.JButton buttonFechar;
    private javax.swing.JButton buttonMinimizar;
    private javax.swing.JButton buttonRemoveArrozP1;
    private javax.swing.JButton buttonRemoveArrozP2;
    private javax.swing.JButton buttonRemoveArrozP3;
    private javax.swing.JButton buttonRemoveCarneP1;
    private javax.swing.JButton buttonRemoveCarneP2;
    private javax.swing.JButton buttonRemoveCarneP3;
    private javax.swing.JButton buttonRemoveSaladaP1;
    private javax.swing.JButton buttonRemoveSaladaP2;
    private javax.swing.JButton buttonRemoveSaladaP3;
    private javax.swing.JLabel iconeArrozP1;
    private javax.swing.JLabel iconeArrozP2;
    private javax.swing.JLabel iconeArrozP3;
    private javax.swing.JLabel iconeCarneP1;
    private javax.swing.JLabel iconeCarneP2;
    private javax.swing.JLabel iconeCarneP3;
    private javax.swing.JLabel iconeCirculoArrozP1;
    private javax.swing.JLabel iconeCirculoArrozP2;
    private javax.swing.JLabel iconeCirculoArrozP3;
    private javax.swing.JLabel iconeCirculoCarneP1;
    private javax.swing.JLabel iconeCirculoCarneP2;
    private javax.swing.JLabel iconeCirculoCarneP3;
    private javax.swing.JLabel iconeCirculoSaladaP1;
    private javax.swing.JLabel iconeCirculoSaladaP2;
    private javax.swing.JLabel iconeCirculoSaladaP3;
    private javax.swing.JLabel iconeMenuPorcoes;
    private javax.swing.JLabel iconeMenuPrato;
    private javax.swing.JLabel iconeP1;
    private javax.swing.JLabel iconeP2;
    private javax.swing.JLabel iconeP3;
    private javax.swing.JLabel iconeSaladaP1;
    private javax.swing.JLabel iconeSaladaP2;
    private javax.swing.JLabel iconeSaladaP3;
    private javax.swing.JLabel labelPrato1;
    private javax.swing.JLabel labelPrato2;
    private javax.swing.JLabel labelPrato3;
    private javax.swing.JLabel labelPrecoP1;
    private javax.swing.JLabel labelPrecoP2;
    private javax.swing.JLabel labelPrecoP3;
    private javax.swing.JLabel labelQtdeArrozP1;
    private javax.swing.JLabel labelQtdeArrozP2;
    private javax.swing.JLabel labelQtdeArrozP3;
    private javax.swing.JLabel labelQtdeCarneP1;
    private javax.swing.JLabel labelQtdeCarneP2;
    private javax.swing.JLabel labelQtdeCarneP3;
    private javax.swing.JLabel labelQtdeSaladaP1;
    private javax.swing.JLabel labelQtdeSaladaP2;
    private javax.swing.JLabel labelQtdeSaladaP3;
    private javax.swing.JLabel labelRsP1;
    private javax.swing.JLabel labelRsP2;
    private javax.swing.JLabel labelRsP3;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel linhaInferiorP2;
    private javax.swing.JLabel linhaInferiorP3;
    private javax.swing.JLabel linhaInferiorPrato1;
    private javax.swing.JLabel linhaSuperiorP2;
    private javax.swing.JLabel linhaSuperiorP3;
    private javax.swing.JLabel linhaSuperiorPrato1;
    private javax.swing.JPanel painelArrozP1;
    private javax.swing.JPanel painelArrozP2;
    private javax.swing.JPanel painelArrozP3;
    private javax.swing.JPanel painelCarneP1;
    private javax.swing.JPanel painelCarneP2;
    private javax.swing.JPanel painelCarneP3;
    private javax.swing.JPanel painelCentral;
    private javax.swing.JPanel painelLateral;
    private javax.swing.JPanel painelMenuPorcoes;
    private javax.swing.JPanel painelMenuPratos;
    private javax.swing.JPanel painelP1;
    private javax.swing.JPanel painelP2;
    private javax.swing.JPanel painelP3;
    private javax.swing.JPanel painelPrecoP1;
    private javax.swing.JPanel painelPrecoP2;
    private javax.swing.JPanel painelPrecoP3;
    private javax.swing.JPanel painelSaladaP1;
    private javax.swing.JPanel painelSaladaP2;
    private javax.swing.JPanel painelSaladaP3;
    private javax.swing.JPanel painelSuperior;
    private javax.swing.JPanel painelTituloP1;
    private javax.swing.JPanel painelTituloP2;
    private javax.swing.JPanel painelTituloP3;
    private javax.swing.JLabel textoMenuPorcoes;
    private javax.swing.JLabel textoMenuPratos;
    private javax.swing.JLabel textoPrato1Arroz;
    private javax.swing.JLabel textoPrato1Arroz1;
    private javax.swing.JLabel textoPrato1Arroz2;
    private javax.swing.JLabel textoPrato1Arroz3;
    private javax.swing.JLabel textoPrato1Arroz4;
    private javax.swing.JLabel textoPrato1Arroz5;
    private javax.swing.JLabel textoPrato1Arroz6;
    private javax.swing.JLabel textoPrato1Arroz7;
    private javax.swing.JLabel textoPrato1Arroz8;
    // End of variables declaration//GEN-END:variables
}
