/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author patrick-ribeiro
 */
public class TelaPratos extends javax.swing.JFrame {

    public static TelaPratos telaPratos = new TelaPratos();
    public static TelaPorcoes telaPorcoes = new TelaPorcoes();
    
    public TelaPratos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelSuperior = new javax.swing.JPanel();
        ButtonFechar = new javax.swing.JButton();
        ButtonMinimizar = new javax.swing.JButton();
        painelLateral = new javax.swing.JPanel();
        painelMenuPratos = new javax.swing.JPanel();
        iconeMenuPrato = new javax.swing.JLabel();
        textoMenuPratos = new javax.swing.JLabel();
        painelMenuPorcoes = new javax.swing.JPanel();
        iconeMenuPorcoes = new javax.swing.JLabel();
        textoMenuPorcoes = new javax.swing.JLabel();
        painelCentral = new javax.swing.JPanel();
        painelPrato1 = new javax.swing.JPanel();
        painelTituloPrato1 = new javax.swing.JPanel();
        linhaInferiorPrato1 = new javax.swing.JLabel();
        textoPrato1 = new javax.swing.JLabel();
        linhaSuperiorPrato1 = new javax.swing.JLabel();
        iconePrato1 = new javax.swing.JLabel();
        painelPreco0 = new javax.swing.JPanel();
        textoRS = new javax.swing.JLabel();
        textoPrecoReais0 = new javax.swing.JLabel();
        textoPrecoMoeda0 = new javax.swing.JLabel();
        painelSaladaPrato1 = new javax.swing.JPanel();
        iconeCirculoSalada0 = new javax.swing.JLabel();
        buttonDiminuirSalada0 = new javax.swing.JButton();
        buttonAdicionarSalada0 = new javax.swing.JButton();
        iconeSalada0 = new javax.swing.JLabel();
        painelArrozPrato1 = new javax.swing.JPanel();
        iconeCirculoArroz0 = new javax.swing.JLabel();
        buttonDiminuirArroz0 = new javax.swing.JButton();
        buttonAdicionarArroz0 = new javax.swing.JButton();
        iconeArroz0 = new javax.swing.JLabel();
        painelCarnePrato1 = new javax.swing.JPanel();
        iconeCirculoCarne0 = new javax.swing.JLabel();
        buttonDiminuirCarne0 = new javax.swing.JButton();
        buttonAdicionarCarne0 = new javax.swing.JButton();
        iconeCarne0 = new javax.swing.JLabel();
        painelPrato2 = new javax.swing.JPanel();
        painelTituloPrato2 = new javax.swing.JPanel();
        linhaInferiorPrato2 = new javax.swing.JLabel();
        textoPrato2 = new javax.swing.JLabel();
        linhaSuperiorPrato2 = new javax.swing.JLabel();
        iconePrato2 = new javax.swing.JLabel();
        painelSaladaPrato2 = new javax.swing.JPanel();
        iconeCirculoSalada1 = new javax.swing.JLabel();
        buttonDiminuirSalada1 = new javax.swing.JButton();
        buttonAdicionarSalada1 = new javax.swing.JButton();
        iconeSalada1 = new javax.swing.JLabel();
        painelCarnePrato2 = new javax.swing.JPanel();
        iconeCirculoCarne1 = new javax.swing.JLabel();
        buttonDiminuirCarne1 = new javax.swing.JButton();
        buttonAdicionarCarne1 = new javax.swing.JButton();
        iconeCarne1 = new javax.swing.JLabel();
        painelArrozPrato2 = new javax.swing.JPanel();
        iconeCirculoArroz1 = new javax.swing.JLabel();
        buttonDiminuirArroz1 = new javax.swing.JButton();
        buttonAdicionarArroz1 = new javax.swing.JButton();
        iconeArroz1 = new javax.swing.JLabel();
        painelPrecoPrato2 = new javax.swing.JPanel();
        textoRS1 = new javax.swing.JLabel();
        textoPrecoReais1 = new javax.swing.JLabel();
        textoPrecoMoeda1 = new javax.swing.JLabel();
        painelPrato3 = new javax.swing.JPanel();
        painelTituloPrato3 = new javax.swing.JPanel();
        linhaInferiorPrato3 = new javax.swing.JLabel();
        textoPrato3 = new javax.swing.JLabel();
        linhaSuperiorPrato3 = new javax.swing.JLabel();
        iconePrato3 = new javax.swing.JLabel();
        painelPrecoPrato3 = new javax.swing.JPanel();
        textoRS2 = new javax.swing.JLabel();
        textoPrecoReais2 = new javax.swing.JLabel();
        textoPrecoMoeda2 = new javax.swing.JLabel();
        painelSaladaPrato3 = new javax.swing.JPanel();
        iconeCirculoSalada2 = new javax.swing.JLabel();
        buttonDiminuirSalada2 = new javax.swing.JButton();
        buttonAdicionarSalada2 = new javax.swing.JButton();
        iconeSalada2 = new javax.swing.JLabel();
        painelCarnePrato3 = new javax.swing.JPanel();
        iconeCirculoCarne2 = new javax.swing.JLabel();
        buttonDiminuirCarne2 = new javax.swing.JButton();
        buttonAdicionarCarne2 = new javax.swing.JButton();
        iconeCarne2 = new javax.swing.JLabel();
        painelArrozPrato3 = new javax.swing.JPanel();
        iconeCirculoArroz2 = new javax.swing.JLabel();
        buttonDiminuirArroz2 = new javax.swing.JButton();
        buttonAdicionarArroz2 = new javax.swing.JButton();
        iconeArroz2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelSuperior.setBackground(new java.awt.Color(167, 14, 19));
        painelSuperior.setPreferredSize(new java.awt.Dimension(1366, 35));

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

        javax.swing.GroupLayout painelSuperiorLayout = new javax.swing.GroupLayout(painelSuperior);
        painelSuperior.setLayout(painelSuperiorLayout);
        painelSuperiorLayout.setHorizontalGroup(
            painelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSuperiorLayout.createSequentialGroup()
                .addContainerGap(1299, Short.MAX_VALUE)
                .addComponent(ButtonMinimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelSuperiorLayout.setVerticalGroup(
            painelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButtonMinimizar)
                    .addComponent(ButtonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(painelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        painelLateral.setBackground(new java.awt.Color(26, 26, 26));
        painelLateral.setPreferredSize(new java.awt.Dimension(360, 740));
        painelLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelMenuPratos.setBackground(new java.awt.Color(26, 26, 26));
        painelMenuPratos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        painelLateral.add(painelMenuPorcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 360, -1));

        getContentPane().add(painelLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, 730));

        painelCentral.setBackground(new java.awt.Color(242, 242, 235));
        painelCentral.setPreferredSize(new java.awt.Dimension(1006, 730));
        painelCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelPrato1.setBackground(new java.awt.Color(242, 242, 235));
        painelPrato1.setPreferredSize(new java.awt.Dimension(930, 250));
        painelPrato1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelTituloPrato1.setBackground(new java.awt.Color(242, 242, 235));
        painelTituloPrato1.setPreferredSize(new java.awt.Dimension(929, 90));
        painelTituloPrato1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        linhaInferiorPrato1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        linhaInferiorPrato1.setForeground(new java.awt.Color(26, 26, 26));
        linhaInferiorPrato1.setText("_______________________________________________________________________");
        painelTituloPrato1.add(linhaInferiorPrato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 54, -1, -1));

        textoPrato1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        textoPrato1.setForeground(new java.awt.Color(26, 26, 26));
        textoPrato1.setText("PRATO 1");
        painelTituloPrato1.add(textoPrato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 35, -1, -1));

        linhaSuperiorPrato1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        linhaSuperiorPrato1.setForeground(new java.awt.Color(26, 26, 26));
        linhaSuperiorPrato1.setText("_______________________________________________________________________");
        painelTituloPrato1.add(linhaSuperiorPrato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        painelPrato1.add(painelTituloPrato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        iconePrato1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Prato.png"))); // NOI18N
        painelPrato1.add(iconePrato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        painelPreco0.setBackground(new java.awt.Color(242, 242, 235));
        painelPreco0.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoRS.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        textoRS.setForeground(new java.awt.Color(26, 26, 26));
        textoRS.setText("R$");
        painelPreco0.add(textoRS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        textoPrecoReais0.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        textoPrecoReais0.setForeground(new java.awt.Color(26, 26, 26));
        textoPrecoReais0.setText("0");
        painelPreco0.add(textoPrecoReais0, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        textoPrecoMoeda0.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        textoPrecoMoeda0.setForeground(new java.awt.Color(26, 26, 26));
        textoPrecoMoeda0.setText("00");
        painelPreco0.add(textoPrecoMoeda0, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, -1));

        painelPrato1.add(painelPreco0, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 190, -1));

        painelSaladaPrato1.setBackground(new java.awt.Color(242, 242, 235));
        painelSaladaPrato1.setPreferredSize(new java.awt.Dimension(140, 140));
        painelSaladaPrato1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconeCirculoSalada0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-35x35.png"))); // NOI18N
        painelSaladaPrato1.add(iconeCirculoSalada0, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        buttonDiminuirSalada0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Diminuir-30x30.png"))); // NOI18N
        buttonDiminuirSalada0.setBorder(null);
        buttonDiminuirSalada0.setBorderPainted(false);
        buttonDiminuirSalada0.setContentAreaFilled(false);
        buttonDiminuirSalada0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDiminuirSalada0.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonDiminuirSalada0.setMinimumSize(new java.awt.Dimension(18, 18));
        painelSaladaPrato1.add(buttonDiminuirSalada0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, -1, -1));

        buttonAdicionarSalada0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Adicionar-30x30.png"))); // NOI18N
        buttonAdicionarSalada0.setBorder(null);
        buttonAdicionarSalada0.setBorderPainted(false);
        buttonAdicionarSalada0.setContentAreaFilled(false);
        buttonAdicionarSalada0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAdicionarSalada0.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonAdicionarSalada0.setMinimumSize(new java.awt.Dimension(18, 18));
        painelSaladaPrato1.add(buttonAdicionarSalada0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        iconeSalada0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Salada.png"))); // NOI18N
        painelSaladaPrato1.add(iconeSalada0, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 30, -1, -1));

        painelPrato1.add(painelSaladaPrato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, -1, -1));

        painelArrozPrato1.setBackground(new java.awt.Color(242, 242, 235));
        painelArrozPrato1.setPreferredSize(new java.awt.Dimension(140, 140));
        painelArrozPrato1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconeCirculoArroz0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-35x35.png"))); // NOI18N
        painelArrozPrato1.add(iconeCirculoArroz0, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        buttonDiminuirArroz0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Diminuir-30x30.png"))); // NOI18N
        buttonDiminuirArroz0.setBorder(null);
        buttonDiminuirArroz0.setBorderPainted(false);
        buttonDiminuirArroz0.setContentAreaFilled(false);
        buttonDiminuirArroz0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDiminuirArroz0.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonDiminuirArroz0.setMinimumSize(new java.awt.Dimension(18, 18));
        painelArrozPrato1.add(buttonDiminuirArroz0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, -1, -1));

        buttonAdicionarArroz0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Adicionar-30x30.png"))); // NOI18N
        buttonAdicionarArroz0.setBorder(null);
        buttonAdicionarArroz0.setBorderPainted(false);
        buttonAdicionarArroz0.setContentAreaFilled(false);
        buttonAdicionarArroz0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAdicionarArroz0.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonAdicionarArroz0.setMinimumSize(new java.awt.Dimension(18, 18));
        painelArrozPrato1.add(buttonAdicionarArroz0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        iconeArroz0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Arroz.png"))); // NOI18N
        iconeArroz0.setPreferredSize(new java.awt.Dimension(100, 100));
        painelArrozPrato1.add(iconeArroz0, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 30, -1, -1));

        painelPrato1.add(painelArrozPrato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        painelCarnePrato1.setBackground(new java.awt.Color(242, 242, 235));
        painelCarnePrato1.setPreferredSize(new java.awt.Dimension(140, 140));
        painelCarnePrato1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconeCirculoCarne0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-35x35.png"))); // NOI18N
        painelCarnePrato1.add(iconeCirculoCarne0, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        buttonDiminuirCarne0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Diminuir-30x30.png"))); // NOI18N
        buttonDiminuirCarne0.setBorder(null);
        buttonDiminuirCarne0.setBorderPainted(false);
        buttonDiminuirCarne0.setContentAreaFilled(false);
        buttonDiminuirCarne0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDiminuirCarne0.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonDiminuirCarne0.setMinimumSize(new java.awt.Dimension(18, 18));
        painelCarnePrato1.add(buttonDiminuirCarne0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, -1, -1));

        buttonAdicionarCarne0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Adicionar-30x30.png"))); // NOI18N
        buttonAdicionarCarne0.setBorder(null);
        buttonAdicionarCarne0.setBorderPainted(false);
        buttonAdicionarCarne0.setContentAreaFilled(false);
        buttonAdicionarCarne0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAdicionarCarne0.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonAdicionarCarne0.setMinimumSize(new java.awt.Dimension(18, 18));
        painelCarnePrato1.add(buttonAdicionarCarne0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        iconeCarne0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Carne.png"))); // NOI18N
        painelCarnePrato1.add(iconeCarne0, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        painelPrato1.add(painelCarnePrato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        painelCentral.add(painelPrato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        painelPrato2.setBackground(new java.awt.Color(242, 242, 235));
        painelPrato2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelTituloPrato2.setBackground(new java.awt.Color(242, 242, 235));
        painelTituloPrato2.setPreferredSize(new java.awt.Dimension(929, 90));
        painelTituloPrato2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        linhaInferiorPrato2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        linhaInferiorPrato2.setForeground(new java.awt.Color(26, 26, 26));
        linhaInferiorPrato2.setText("_______________________________________________________________________");
        painelTituloPrato2.add(linhaInferiorPrato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 54, -1, -1));

        textoPrato2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        textoPrato2.setForeground(new java.awt.Color(26, 26, 26));
        textoPrato2.setText("PRATO 2");
        painelTituloPrato2.add(textoPrato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 35, -1, -1));

        linhaSuperiorPrato2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        linhaSuperiorPrato2.setForeground(new java.awt.Color(26, 26, 26));
        linhaSuperiorPrato2.setText("_______________________________________________________________________");
        painelTituloPrato2.add(linhaSuperiorPrato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        painelPrato2.add(painelTituloPrato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        iconePrato2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Prato.png"))); // NOI18N
        painelPrato2.add(iconePrato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        painelSaladaPrato2.setBackground(new java.awt.Color(242, 242, 235));
        painelSaladaPrato2.setPreferredSize(new java.awt.Dimension(140, 140));
        painelSaladaPrato2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconeCirculoSalada1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-35x35.png"))); // NOI18N
        painelSaladaPrato2.add(iconeCirculoSalada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        buttonDiminuirSalada1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Diminuir-30x30.png"))); // NOI18N
        buttonDiminuirSalada1.setBorder(null);
        buttonDiminuirSalada1.setBorderPainted(false);
        buttonDiminuirSalada1.setContentAreaFilled(false);
        buttonDiminuirSalada1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDiminuirSalada1.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonDiminuirSalada1.setMinimumSize(new java.awt.Dimension(18, 18));
        painelSaladaPrato2.add(buttonDiminuirSalada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, -1, -1));

        buttonAdicionarSalada1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Adicionar-30x30.png"))); // NOI18N
        buttonAdicionarSalada1.setBorder(null);
        buttonAdicionarSalada1.setBorderPainted(false);
        buttonAdicionarSalada1.setContentAreaFilled(false);
        buttonAdicionarSalada1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAdicionarSalada1.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonAdicionarSalada1.setMinimumSize(new java.awt.Dimension(18, 18));
        painelSaladaPrato2.add(buttonAdicionarSalada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        iconeSalada1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Salada.png"))); // NOI18N
        painelSaladaPrato2.add(iconeSalada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 30, -1, -1));

        painelPrato2.add(painelSaladaPrato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, -1, -1));

        painelCarnePrato2.setBackground(new java.awt.Color(242, 242, 235));
        painelCarnePrato2.setPreferredSize(new java.awt.Dimension(140, 140));
        painelCarnePrato2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconeCirculoCarne1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-35x35.png"))); // NOI18N
        painelCarnePrato2.add(iconeCirculoCarne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        buttonDiminuirCarne1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Diminuir-30x30.png"))); // NOI18N
        buttonDiminuirCarne1.setBorder(null);
        buttonDiminuirCarne1.setBorderPainted(false);
        buttonDiminuirCarne1.setContentAreaFilled(false);
        buttonDiminuirCarne1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDiminuirCarne1.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonDiminuirCarne1.setMinimumSize(new java.awt.Dimension(18, 18));
        painelCarnePrato2.add(buttonDiminuirCarne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, -1, -1));

        buttonAdicionarCarne1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Adicionar-30x30.png"))); // NOI18N
        buttonAdicionarCarne1.setBorder(null);
        buttonAdicionarCarne1.setBorderPainted(false);
        buttonAdicionarCarne1.setContentAreaFilled(false);
        buttonAdicionarCarne1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAdicionarCarne1.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonAdicionarCarne1.setMinimumSize(new java.awt.Dimension(18, 18));
        painelCarnePrato2.add(buttonAdicionarCarne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        iconeCarne1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Carne.png"))); // NOI18N
        painelCarnePrato2.add(iconeCarne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        painelPrato2.add(painelCarnePrato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        painelArrozPrato2.setBackground(new java.awt.Color(242, 242, 235));
        painelArrozPrato2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconeCirculoArroz1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-35x35.png"))); // NOI18N
        painelArrozPrato2.add(iconeCirculoArroz1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        buttonDiminuirArroz1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Diminuir-30x30.png"))); // NOI18N
        buttonDiminuirArroz1.setBorder(null);
        buttonDiminuirArroz1.setBorderPainted(false);
        buttonDiminuirArroz1.setContentAreaFilled(false);
        buttonDiminuirArroz1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDiminuirArroz1.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonDiminuirArroz1.setMinimumSize(new java.awt.Dimension(18, 18));
        painelArrozPrato2.add(buttonDiminuirArroz1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, -1, -1));

        buttonAdicionarArroz1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Adicionar-30x30.png"))); // NOI18N
        buttonAdicionarArroz1.setBorder(null);
        buttonAdicionarArroz1.setBorderPainted(false);
        buttonAdicionarArroz1.setContentAreaFilled(false);
        buttonAdicionarArroz1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAdicionarArroz1.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonAdicionarArroz1.setMinimumSize(new java.awt.Dimension(18, 18));
        painelArrozPrato2.add(buttonAdicionarArroz1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        iconeArroz1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Arroz.png"))); // NOI18N
        iconeArroz1.setPreferredSize(new java.awt.Dimension(100, 100));
        painelArrozPrato2.add(iconeArroz1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 30, -1, -1));

        painelPrato2.add(painelArrozPrato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 140, 140));

        painelPrecoPrato2.setBackground(new java.awt.Color(242, 242, 235));
        painelPrecoPrato2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoRS1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        textoRS1.setForeground(new java.awt.Color(26, 26, 26));
        textoRS1.setText("R$");
        painelPrecoPrato2.add(textoRS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        textoPrecoReais1.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        textoPrecoReais1.setForeground(new java.awt.Color(26, 26, 26));
        textoPrecoReais1.setText("0");
        painelPrecoPrato2.add(textoPrecoReais1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        textoPrecoMoeda1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        textoPrecoMoeda1.setForeground(new java.awt.Color(26, 26, 26));
        textoPrecoMoeda1.setText("00");
        painelPrecoPrato2.add(textoPrecoMoeda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, -1));

        painelPrato2.add(painelPrecoPrato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 180, -1));

        painelCentral.add(painelPrato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        painelPrato3.setBackground(new java.awt.Color(242, 242, 235));
        painelPrato3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelTituloPrato3.setBackground(new java.awt.Color(242, 242, 235));
        painelTituloPrato3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        linhaInferiorPrato3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        linhaInferiorPrato3.setForeground(new java.awt.Color(26, 26, 26));
        linhaInferiorPrato3.setText("_______________________________________________________________________");
        painelTituloPrato3.add(linhaInferiorPrato3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 54, -1, -1));

        textoPrato3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        textoPrato3.setForeground(new java.awt.Color(26, 26, 26));
        textoPrato3.setText("PRATO 3");
        painelTituloPrato3.add(textoPrato3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 35, -1, -1));

        linhaSuperiorPrato3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        linhaSuperiorPrato3.setForeground(new java.awt.Color(26, 26, 26));
        linhaSuperiorPrato3.setText("_______________________________________________________________________");
        painelTituloPrato3.add(linhaSuperiorPrato3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        painelPrato3.add(painelTituloPrato3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 90));

        iconePrato3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Prato.png"))); // NOI18N
        painelPrato3.add(iconePrato3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        painelPrecoPrato3.setBackground(new java.awt.Color(242, 242, 235));
        painelPrecoPrato3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoRS2.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        textoRS2.setForeground(new java.awt.Color(26, 26, 26));
        textoRS2.setText("R$");
        painelPrecoPrato3.add(textoRS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        textoPrecoReais2.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        textoPrecoReais2.setForeground(new java.awt.Color(26, 26, 26));
        textoPrecoReais2.setText("0");
        painelPrecoPrato3.add(textoPrecoReais2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        textoPrecoMoeda2.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        textoPrecoMoeda2.setForeground(new java.awt.Color(26, 26, 26));
        textoPrecoMoeda2.setText("00");
        painelPrecoPrato3.add(textoPrecoMoeda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, -1));

        painelPrato3.add(painelPrecoPrato3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 180, -1));

        painelSaladaPrato3.setBackground(new java.awt.Color(242, 242, 235));
        painelSaladaPrato3.setPreferredSize(new java.awt.Dimension(140, 140));
        painelSaladaPrato3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconeCirculoSalada2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-35x35.png"))); // NOI18N
        painelSaladaPrato3.add(iconeCirculoSalada2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        buttonDiminuirSalada2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Diminuir-30x30.png"))); // NOI18N
        buttonDiminuirSalada2.setBorder(null);
        buttonDiminuirSalada2.setBorderPainted(false);
        buttonDiminuirSalada2.setContentAreaFilled(false);
        buttonDiminuirSalada2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDiminuirSalada2.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonDiminuirSalada2.setMinimumSize(new java.awt.Dimension(18, 18));
        painelSaladaPrato3.add(buttonDiminuirSalada2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, -1, -1));

        buttonAdicionarSalada2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Adicionar-30x30.png"))); // NOI18N
        buttonAdicionarSalada2.setBorder(null);
        buttonAdicionarSalada2.setBorderPainted(false);
        buttonAdicionarSalada2.setContentAreaFilled(false);
        buttonAdicionarSalada2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAdicionarSalada2.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonAdicionarSalada2.setMinimumSize(new java.awt.Dimension(18, 18));
        painelSaladaPrato3.add(buttonAdicionarSalada2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        iconeSalada2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Salada.png"))); // NOI18N
        painelSaladaPrato3.add(iconeSalada2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 30, -1, -1));

        painelPrato3.add(painelSaladaPrato3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, -1, -1));

        painelCarnePrato3.setBackground(new java.awt.Color(242, 242, 235));
        painelCarnePrato3.setPreferredSize(new java.awt.Dimension(140, 140));
        painelCarnePrato3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconeCirculoCarne2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-35x35.png"))); // NOI18N
        painelCarnePrato3.add(iconeCirculoCarne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        buttonDiminuirCarne2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Diminuir-30x30.png"))); // NOI18N
        buttonDiminuirCarne2.setBorder(null);
        buttonDiminuirCarne2.setBorderPainted(false);
        buttonDiminuirCarne2.setContentAreaFilled(false);
        buttonDiminuirCarne2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDiminuirCarne2.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonDiminuirCarne2.setMinimumSize(new java.awt.Dimension(18, 18));
        painelCarnePrato3.add(buttonDiminuirCarne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, -1, -1));

        buttonAdicionarCarne2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Adicionar-30x30.png"))); // NOI18N
        buttonAdicionarCarne2.setBorder(null);
        buttonAdicionarCarne2.setBorderPainted(false);
        buttonAdicionarCarne2.setContentAreaFilled(false);
        buttonAdicionarCarne2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAdicionarCarne2.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonAdicionarCarne2.setMinimumSize(new java.awt.Dimension(18, 18));
        painelCarnePrato3.add(buttonAdicionarCarne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        iconeCarne2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Carne.png"))); // NOI18N
        painelCarnePrato3.add(iconeCarne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        painelPrato3.add(painelCarnePrato3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        painelArrozPrato3.setBackground(new java.awt.Color(242, 242, 235));
        painelArrozPrato3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconeCirculoArroz2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-35x35.png"))); // NOI18N
        painelArrozPrato3.add(iconeCirculoArroz2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        buttonDiminuirArroz2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Diminuir-30x30.png"))); // NOI18N
        buttonDiminuirArroz2.setBorder(null);
        buttonDiminuirArroz2.setBorderPainted(false);
        buttonDiminuirArroz2.setContentAreaFilled(false);
        buttonDiminuirArroz2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDiminuirArroz2.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonDiminuirArroz2.setMinimumSize(new java.awt.Dimension(18, 18));
        painelArrozPrato3.add(buttonDiminuirArroz2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, -1, -1));

        buttonAdicionarArroz2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Adicionar-30x30.png"))); // NOI18N
        buttonAdicionarArroz2.setBorder(null);
        buttonAdicionarArroz2.setBorderPainted(false);
        buttonAdicionarArroz2.setContentAreaFilled(false);
        buttonAdicionarArroz2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAdicionarArroz2.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonAdicionarArroz2.setMinimumSize(new java.awt.Dimension(18, 18));
        painelArrozPrato3.add(buttonAdicionarArroz2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        iconeArroz2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Arroz.png"))); // NOI18N
        iconeArroz2.setPreferredSize(new java.awt.Dimension(100, 100));
        painelArrozPrato3.add(iconeArroz2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 30, -1, -1));

        painelPrato3.add(painelArrozPrato3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 140, 140));

        painelCentral.add(painelPrato3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        getContentPane().add(painelCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonFecharMouseClicked

    }//GEN-LAST:event_ButtonFecharMouseClicked

    private void ButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ButtonFecharActionPerformed

    private void ButtonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMinimizarActionPerformed
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_ButtonMinimizarActionPerformed

    private void painelMenuPorcoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelMenuPorcoesMouseClicked
        telaPorcoes.setVisible(true);
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

    /**
     * @param args the command line arguments
     */
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonFechar;
    private javax.swing.JButton ButtonMinimizar;
    private javax.swing.JButton buttonAdicionarArroz0;
    private javax.swing.JButton buttonAdicionarArroz1;
    private javax.swing.JButton buttonAdicionarArroz2;
    private javax.swing.JButton buttonAdicionarCarne0;
    private javax.swing.JButton buttonAdicionarCarne1;
    private javax.swing.JButton buttonAdicionarCarne2;
    private javax.swing.JButton buttonAdicionarSalada0;
    private javax.swing.JButton buttonAdicionarSalada1;
    private javax.swing.JButton buttonAdicionarSalada2;
    private javax.swing.JButton buttonDiminuirArroz0;
    private javax.swing.JButton buttonDiminuirArroz1;
    private javax.swing.JButton buttonDiminuirArroz2;
    private javax.swing.JButton buttonDiminuirCarne0;
    private javax.swing.JButton buttonDiminuirCarne1;
    private javax.swing.JButton buttonDiminuirCarne2;
    private javax.swing.JButton buttonDiminuirSalada0;
    private javax.swing.JButton buttonDiminuirSalada1;
    private javax.swing.JButton buttonDiminuirSalada2;
    private javax.swing.JLabel iconeArroz0;
    private javax.swing.JLabel iconeArroz1;
    private javax.swing.JLabel iconeArroz2;
    private javax.swing.JLabel iconeCarne0;
    private javax.swing.JLabel iconeCarne1;
    private javax.swing.JLabel iconeCarne2;
    private javax.swing.JLabel iconeCirculoArroz0;
    private javax.swing.JLabel iconeCirculoArroz1;
    private javax.swing.JLabel iconeCirculoArroz2;
    private javax.swing.JLabel iconeCirculoCarne0;
    private javax.swing.JLabel iconeCirculoCarne1;
    private javax.swing.JLabel iconeCirculoCarne2;
    private javax.swing.JLabel iconeCirculoSalada0;
    private javax.swing.JLabel iconeCirculoSalada1;
    private javax.swing.JLabel iconeCirculoSalada2;
    private javax.swing.JLabel iconeMenuPorcoes;
    private javax.swing.JLabel iconeMenuPrato;
    private javax.swing.JLabel iconePrato1;
    private javax.swing.JLabel iconePrato2;
    private javax.swing.JLabel iconePrato3;
    private javax.swing.JLabel iconeSalada0;
    private javax.swing.JLabel iconeSalada1;
    private javax.swing.JLabel iconeSalada2;
    private javax.swing.JLabel linhaInferiorPrato1;
    private javax.swing.JLabel linhaInferiorPrato2;
    private javax.swing.JLabel linhaInferiorPrato3;
    private javax.swing.JLabel linhaSuperiorPrato1;
    private javax.swing.JLabel linhaSuperiorPrato2;
    private javax.swing.JLabel linhaSuperiorPrato3;
    private javax.swing.JPanel painelArrozPrato1;
    private javax.swing.JPanel painelArrozPrato2;
    private javax.swing.JPanel painelArrozPrato3;
    private javax.swing.JPanel painelCarnePrato1;
    private javax.swing.JPanel painelCarnePrato2;
    private javax.swing.JPanel painelCarnePrato3;
    private javax.swing.JPanel painelCentral;
    private javax.swing.JPanel painelLateral;
    private javax.swing.JPanel painelMenuPorcoes;
    private javax.swing.JPanel painelMenuPratos;
    private javax.swing.JPanel painelPrato1;
    private javax.swing.JPanel painelPrato2;
    private javax.swing.JPanel painelPrato3;
    private javax.swing.JPanel painelPreco0;
    private javax.swing.JPanel painelPrecoPrato2;
    private javax.swing.JPanel painelPrecoPrato3;
    private javax.swing.JPanel painelSaladaPrato1;
    private javax.swing.JPanel painelSaladaPrato2;
    private javax.swing.JPanel painelSaladaPrato3;
    private javax.swing.JPanel painelSuperior;
    private javax.swing.JPanel painelTituloPrato1;
    private javax.swing.JPanel painelTituloPrato2;
    private javax.swing.JPanel painelTituloPrato3;
    private javax.swing.JLabel textoMenuPorcoes;
    private javax.swing.JLabel textoMenuPratos;
    private javax.swing.JLabel textoPrato1;
    private javax.swing.JLabel textoPrato2;
    private javax.swing.JLabel textoPrato3;
    private javax.swing.JLabel textoPrecoMoeda0;
    private javax.swing.JLabel textoPrecoMoeda1;
    private javax.swing.JLabel textoPrecoMoeda2;
    private javax.swing.JLabel textoPrecoReais0;
    private javax.swing.JLabel textoPrecoReais1;
    private javax.swing.JLabel textoPrecoReais2;
    private javax.swing.JLabel textoRS;
    private javax.swing.JLabel textoRS1;
    private javax.swing.JLabel textoRS2;
    // End of variables declaration//GEN-END:variables
}
