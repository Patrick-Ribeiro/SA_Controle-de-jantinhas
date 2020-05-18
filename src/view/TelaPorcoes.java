package view;

public class TelaPorcoes extends javax.swing.JFrame {

    public TelaPorcoes() {
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
        painelArrozPrato1 = new javax.swing.JPanel();
        iconeCirculoArroz0 = new javax.swing.JLabel();
        iconeArroz0 = new javax.swing.JLabel();
        painelCarnePrato1 = new javax.swing.JPanel();
        iconeCirculoCarne0 = new javax.swing.JLabel();
        iconeCarne0 = new javax.swing.JLabel();
        painelSaladaPrato1 = new javax.swing.JPanel();
        iconeCirculoSalada0 = new javax.swing.JLabel();
        iconeSalada0 = new javax.swing.JLabel();
        painelPreco0 = new javax.swing.JPanel();
        textoRS = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        painelPrato2 = new javax.swing.JPanel();
        painelTituloPrato2 = new javax.swing.JPanel();
        linhaInferiorPrato2 = new javax.swing.JLabel();
        textoPrato2 = new javax.swing.JLabel();
        linhaSuperiorPrato2 = new javax.swing.JLabel();
        iconePrato2 = new javax.swing.JLabel();
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
        painelPrecoPrato3 = new javax.swing.JPanel();
        textoRS2 = new javax.swing.JLabel();
        textoPrecoReais2 = new javax.swing.JLabel();
        textoPrecoMoeda2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelSuperior.setBackground(new java.awt.Color(167, 14, 19));
        painelSuperior.setPreferredSize(new java.awt.Dimension(1366, 35));

        ButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Fechar-26x26.png"))); // NOI18N
        ButtonFechar.setBorder(null);
        ButtonFechar.setBorderPainted(false);
        ButtonFechar.setContentAreaFilled(false);
        ButtonFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                .addContainerGap(1300, Short.MAX_VALUE)
                .addComponent(ButtonMinimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonFechar)
                .addContainerGap())
        );
        painelSuperiorLayout.setVerticalGroup(
            painelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButtonFechar)
                    .addComponent(ButtonMinimizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelLateral.setBackground(new java.awt.Color(26, 26, 26));
        painelLateral.setPreferredSize(new java.awt.Dimension(360, 740));
        painelLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelMenuPratos.setBackground(new java.awt.Color(26, 26, 26));
        painelMenuPratos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        iconeMenuPrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Prato-65x65.png"))); // NOI18N

        textoMenuPratos.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        textoMenuPratos.setForeground(new java.awt.Color(242, 242, 235));
        textoMenuPratos.setText("Pratos");

        javax.swing.GroupLayout painelMenuPratosLayout = new javax.swing.GroupLayout(painelMenuPratos);
        painelMenuPratos.setLayout(painelMenuPratosLayout);
        painelMenuPratosLayout.setHorizontalGroup(
            painelMenuPratosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMenuPratosLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(iconeMenuPrato)
                .addGap(18, 18, 18)
                .addComponent(textoMenuPratos, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        painelMenuPratosLayout.setVerticalGroup(
            painelMenuPratosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMenuPratosLayout.createSequentialGroup()
                .addGroup(painelMenuPratosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelMenuPratosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(iconeMenuPrato))
                    .addGroup(painelMenuPratosLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(textoMenuPratos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        painelLateral.add(painelMenuPratos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 131, 360, 80));

        painelMenuPorcoes.setBackground(new java.awt.Color(48, 48, 47));
        painelMenuPorcoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        painelMenuPorcoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                painelMenuPorcoesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                painelMenuPorcoesMouseExited(evt);
            }
        });

        iconeMenuPorcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Porcoes-65x65.png"))); // NOI18N

        textoMenuPorcoes.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        textoMenuPorcoes.setForeground(new java.awt.Color(242, 242, 235));
        textoMenuPorcoes.setText("Porções");

        javax.swing.GroupLayout painelMenuPorcoesLayout = new javax.swing.GroupLayout(painelMenuPorcoes);
        painelMenuPorcoes.setLayout(painelMenuPorcoesLayout);
        painelMenuPorcoesLayout.setHorizontalGroup(
            painelMenuPorcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMenuPorcoesLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(iconeMenuPorcoes)
                .addGap(18, 18, 18)
                .addComponent(textoMenuPorcoes)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        painelMenuPorcoesLayout.setVerticalGroup(
            painelMenuPorcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMenuPorcoesLayout.createSequentialGroup()
                .addGroup(painelMenuPorcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelMenuPorcoesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(iconeMenuPorcoes))
                    .addGroup(painelMenuPorcoesLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(textoMenuPorcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        painelLateral.add(painelMenuPorcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        painelCentral.setBackground(new java.awt.Color(242, 242, 235));
        painelCentral.setPreferredSize(new java.awt.Dimension(1006, 500));
        painelCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelPrato1.setBackground(new java.awt.Color(242, 242, 235));
        painelPrato1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelTituloPrato1.setBackground(new java.awt.Color(242, 242, 235));
        painelTituloPrato1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        linhaInferiorPrato1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        linhaInferiorPrato1.setForeground(new java.awt.Color(26, 26, 26));
        linhaInferiorPrato1.setText("_______________________________________________________________________");
        painelTituloPrato1.add(linhaInferiorPrato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 54, -1, -1));

        textoPrato1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        textoPrato1.setForeground(new java.awt.Color(26, 26, 26));
        textoPrato1.setText("ARROZ");
        painelTituloPrato1.add(textoPrato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 35, -1, -1));

        linhaSuperiorPrato1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        linhaSuperiorPrato1.setForeground(new java.awt.Color(26, 26, 26));
        linhaSuperiorPrato1.setText("_______________________________________________________________________");
        painelTituloPrato1.add(linhaSuperiorPrato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        painelPrato1.add(painelTituloPrato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 90));

        iconePrato1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Prato.png"))); // NOI18N
        painelPrato1.add(iconePrato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        painelArrozPrato1.setBackground(new java.awt.Color(242, 242, 235));
        painelArrozPrato1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconeCirculoArroz0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-Preto-26x26.png"))); // NOI18N
        iconeCirculoArroz0.setBorder(null);
        painelArrozPrato1.add(iconeCirculoArroz0, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        iconeArroz0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Prato-65x65.png"))); // NOI18N
        painelArrozPrato1.add(iconeArroz0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        painelPrato1.add(painelArrozPrato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 90, 70));

        painelCarnePrato1.setBackground(new java.awt.Color(242, 242, 235));
        painelCarnePrato1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconeCirculoCarne0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-Preto-26x26.png"))); // NOI18N
        painelCarnePrato1.add(iconeCirculoCarne0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        iconeCarne0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Prato-65x65.png"))); // NOI18N
        painelCarnePrato1.add(iconeCarne0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        painelPrato1.add(painelCarnePrato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 80, 70));

        painelSaladaPrato1.setBackground(new java.awt.Color(242, 242, 235));
        painelSaladaPrato1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconeCirculoSalada0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-Preto-26x26.png"))); // NOI18N
        painelSaladaPrato1.add(iconeCirculoSalada0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        iconeSalada0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Prato-65x65.png"))); // NOI18N
        painelSaladaPrato1.add(iconeSalada0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        painelPrato1.add(painelSaladaPrato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 80, 70));

        painelPreco0.setBackground(new java.awt.Color(242, 242, 235));
        painelPreco0.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoRS.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        textoRS.setForeground(new java.awt.Color(26, 26, 26));
        textoRS.setText("R$");
        painelPreco0.add(textoRS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jTextField1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(26, 26, 26));
        jTextField1.setText("jTextField1");
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelPreco0.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, 30));

        painelPrato1.add(painelPreco0, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 180, -1));

        painelCentral.add(painelPrato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 936, 250));

        painelPrato2.setBackground(new java.awt.Color(242, 242, 235));
        painelPrato2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelTituloPrato2.setBackground(new java.awt.Color(242, 242, 235));
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

        painelPrato2.add(painelTituloPrato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 90));

        iconePrato2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Prato.png"))); // NOI18N
        painelPrato2.add(iconePrato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        painelPrecoPrato2.setBackground(new java.awt.Color(242, 242, 235));
        painelPrecoPrato2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoRS1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        textoRS1.setForeground(new java.awt.Color(26, 26, 26));
        textoRS1.setText("R$");
        painelPrecoPrato2.add(textoRS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        textoPrecoReais1.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        textoPrecoReais1.setForeground(new java.awt.Color(26, 26, 26));
        textoPrecoReais1.setText("9");
        painelPrecoPrato2.add(textoPrecoReais1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        textoPrecoMoeda1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        textoPrecoMoeda1.setForeground(new java.awt.Color(26, 26, 26));
        textoPrecoMoeda1.setText("00");
        painelPrecoPrato2.add(textoPrecoMoeda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, -1));

        painelPrato2.add(painelPrecoPrato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 160, -1));

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

        painelSaladaPrato3.setBackground(new java.awt.Color(242, 242, 235));
        painelSaladaPrato3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconeCirculoSalada2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-26x26.png"))); // NOI18N
        painelSaladaPrato3.add(iconeCirculoSalada2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        buttonDiminuirSalada2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Diminuir-16x16.png"))); // NOI18N
        buttonDiminuirSalada2.setBorder(null);
        buttonDiminuirSalada2.setBorderPainted(false);
        buttonDiminuirSalada2.setContentAreaFilled(false);
        buttonDiminuirSalada2.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonDiminuirSalada2.setMinimumSize(new java.awt.Dimension(18, 18));
        buttonDiminuirSalada2.setPreferredSize(new java.awt.Dimension(18, 18));
        painelSaladaPrato3.add(buttonDiminuirSalada2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        buttonAdicionarSalada2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Adicionar-16x16.png"))); // NOI18N
        buttonAdicionarSalada2.setBorder(null);
        buttonAdicionarSalada2.setBorderPainted(false);
        buttonAdicionarSalada2.setContentAreaFilled(false);
        buttonAdicionarSalada2.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonAdicionarSalada2.setMinimumSize(new java.awt.Dimension(18, 18));
        buttonAdicionarSalada2.setPreferredSize(new java.awt.Dimension(18, 18));
        painelSaladaPrato3.add(buttonAdicionarSalada2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        iconeSalada2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Salada.png"))); // NOI18N
        painelSaladaPrato3.add(iconeSalada2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        painelPrato3.add(painelSaladaPrato3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 110, 90));

        painelCarnePrato3.setBackground(new java.awt.Color(242, 242, 235));
        painelCarnePrato3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconeCirculoCarne2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-26x26.png"))); // NOI18N
        painelCarnePrato3.add(iconeCirculoCarne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        buttonDiminuirCarne2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Diminuir-16x16.png"))); // NOI18N
        buttonDiminuirCarne2.setBorder(null);
        buttonDiminuirCarne2.setBorderPainted(false);
        buttonDiminuirCarne2.setContentAreaFilled(false);
        buttonDiminuirCarne2.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonDiminuirCarne2.setMinimumSize(new java.awt.Dimension(18, 18));
        buttonDiminuirCarne2.setPreferredSize(new java.awt.Dimension(18, 18));
        painelCarnePrato3.add(buttonDiminuirCarne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        buttonAdicionarCarne2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Adicionar-16x16.png"))); // NOI18N
        buttonAdicionarCarne2.setBorder(null);
        buttonAdicionarCarne2.setBorderPainted(false);
        buttonAdicionarCarne2.setContentAreaFilled(false);
        buttonAdicionarCarne2.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonAdicionarCarne2.setMinimumSize(new java.awt.Dimension(18, 18));
        buttonAdicionarCarne2.setPreferredSize(new java.awt.Dimension(18, 18));
        painelCarnePrato3.add(buttonAdicionarCarne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        iconeCarne2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Carne.png"))); // NOI18N
        painelCarnePrato3.add(iconeCarne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        painelPrato3.add(painelCarnePrato3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 110, 90));

        painelArrozPrato3.setBackground(new java.awt.Color(242, 242, 235));
        painelArrozPrato3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconeCirculoArroz2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Circulo-26x26.png"))); // NOI18N
        painelArrozPrato3.add(iconeCirculoArroz2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        buttonDiminuirArroz2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Diminuir-16x16.png"))); // NOI18N
        buttonDiminuirArroz2.setBorder(null);
        buttonDiminuirArroz2.setBorderPainted(false);
        buttonDiminuirArroz2.setContentAreaFilled(false);
        buttonDiminuirArroz2.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonDiminuirArroz2.setMinimumSize(new java.awt.Dimension(18, 18));
        buttonDiminuirArroz2.setPreferredSize(new java.awt.Dimension(18, 18));
        painelArrozPrato3.add(buttonDiminuirArroz2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        buttonAdicionarArroz2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Adicionar-16x16.png"))); // NOI18N
        buttonAdicionarArroz2.setBorder(null);
        buttonAdicionarArroz2.setBorderPainted(false);
        buttonAdicionarArroz2.setContentAreaFilled(false);
        buttonAdicionarArroz2.setMaximumSize(new java.awt.Dimension(18, 18));
        buttonAdicionarArroz2.setMinimumSize(new java.awt.Dimension(18, 18));
        buttonAdicionarArroz2.setPreferredSize(new java.awt.Dimension(18, 18));
        painelArrozPrato3.add(buttonAdicionarArroz2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        iconeArroz2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Icone-Arroz.png"))); // NOI18N
        painelArrozPrato3.add(iconeArroz2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        painelPrato3.add(painelArrozPrato3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 110, 90));

        painelPrecoPrato3.setBackground(new java.awt.Color(242, 242, 235));
        painelPrecoPrato3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoRS2.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        textoRS2.setForeground(new java.awt.Color(26, 26, 26));
        textoRS2.setText("R$");
        painelPrecoPrato3.add(textoRS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        textoPrecoReais2.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        textoPrecoReais2.setForeground(new java.awt.Color(26, 26, 26));
        textoPrecoReais2.setText("8");
        painelPrecoPrato3.add(textoPrecoReais2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        textoPrecoMoeda2.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        textoPrecoMoeda2.setForeground(new java.awt.Color(26, 26, 26));
        textoPrecoMoeda2.setText("00");
        painelPrecoPrato3.add(textoPrecoMoeda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, -1));

        painelPrato3.add(painelPrecoPrato3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 160, -1));

        painelCentral.add(painelPrato3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(360, 360, 360)
                            .addComponent(painelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(painelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(painelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(painelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(painelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(painelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonFecharMouseClicked

    }//GEN-LAST:event_ButtonFecharMouseClicked

    private void ButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFecharActionPerformed

    }//GEN-LAST:event_ButtonFecharActionPerformed

    private void ButtonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMinimizarActionPerformed
     
    }//GEN-LAST:event_ButtonMinimizarActionPerformed

    private void painelMenuPorcoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelMenuPorcoesMouseEntered

    }//GEN-LAST:event_painelMenuPorcoesMouseEntered

    private void painelMenuPorcoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelMenuPorcoesMouseExited

    }//GEN-LAST:event_painelMenuPorcoesMouseExited

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
            java.util.logging.Logger.getLogger(TelaPorcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPorcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPorcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPorcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPorcoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonFechar;
    private javax.swing.JButton ButtonMinimizar;
    private javax.swing.JButton buttonAdicionarArroz2;
    private javax.swing.JButton buttonAdicionarCarne2;
    private javax.swing.JButton buttonAdicionarSalada2;
    private javax.swing.JButton buttonDiminuirArroz2;
    private javax.swing.JButton buttonDiminuirCarne2;
    private javax.swing.JButton buttonDiminuirSalada2;
    private javax.swing.JLabel iconeArroz0;
    private javax.swing.JLabel iconeArroz2;
    private javax.swing.JLabel iconeCarne0;
    private javax.swing.JLabel iconeCarne2;
    private javax.swing.JLabel iconeCirculoArroz0;
    private javax.swing.JLabel iconeCirculoArroz2;
    private javax.swing.JLabel iconeCirculoCarne0;
    private javax.swing.JLabel iconeCirculoCarne2;
    private javax.swing.JLabel iconeCirculoSalada0;
    private javax.swing.JLabel iconeCirculoSalada2;
    private javax.swing.JLabel iconeMenuPorcoes;
    private javax.swing.JLabel iconeMenuPrato;
    private javax.swing.JLabel iconePrato1;
    private javax.swing.JLabel iconePrato2;
    private javax.swing.JLabel iconePrato3;
    private javax.swing.JLabel iconeSalada0;
    private javax.swing.JLabel iconeSalada2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel linhaInferiorPrato1;
    private javax.swing.JLabel linhaInferiorPrato2;
    private javax.swing.JLabel linhaInferiorPrato3;
    private javax.swing.JLabel linhaSuperiorPrato1;
    private javax.swing.JLabel linhaSuperiorPrato2;
    private javax.swing.JLabel linhaSuperiorPrato3;
    private javax.swing.JPanel painelArrozPrato1;
    private javax.swing.JPanel painelArrozPrato3;
    private javax.swing.JPanel painelCarnePrato1;
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
    private javax.swing.JLabel textoPrecoMoeda1;
    private javax.swing.JLabel textoPrecoMoeda2;
    private javax.swing.JLabel textoPrecoReais1;
    private javax.swing.JLabel textoPrecoReais2;
    private javax.swing.JLabel textoRS;
    private javax.swing.JLabel textoRS1;
    private javax.swing.JLabel textoRS2;
    // End of variables declaration//GEN-END:variables
}
