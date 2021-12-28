package com.aerbp_park;


import static com.aerbp_park.Inicial.login_nAluno;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Daniel Carias
 */
public class Pesquisa extends javax.swing.JFrame {

    public Pesquisa() {
        initComponents();
        pesquisa_n.grabFocus();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo_pap_white_v5.png")));
        this.setLocationRelativeTo(null);
        
        label1.setVisible(false);
        label2.setVisible(false);
        label3.setVisible(false);
        label4.setVisible(false);
        pesquisa_nome.setVisible(false);
        pesquisa_turma.setVisible(false);
        pesquisa_marca.setVisible(false);
        pesquisa_matricula.setVisible(false);
        separador1.setVisible(false);
        separador2.setVisible(false);
        separador3.setVisible(false);
        separador4.setVisible(false);
        Tabel.setVisible(false);
        label5.setVisible(false);
        
        pesquisa_nome.setEditable(false);
        pesquisa_turma.setEditable(false);
        pesquisa_marca.setEditable(false);
        pesquisa_matricula.setEditable(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        separador2 = new javax.swing.JSeparator();
        pesquisa_matricula = new javax.swing.JTextField();
        pesquisa_n = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        pesquisa_nome = new javax.swing.JTextField();
        separador1 = new javax.swing.JSeparator();
        label1 = new javax.swing.JLabel();
        pesquisa_turma = new javax.swing.JTextField();
        separador3 = new javax.swing.JSeparator();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        separador4 = new javax.swing.JSeparator();
        pesquisa_marca = new javax.swing.JTextField();
        bt_Pesquisar = new javax.swing.JButton();
        vazio3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        Voltar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Limpar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(198, 255, 255));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 30, 54));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 30, 54));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("PESQUISAR ALUNO");

        label2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 30, 54));
        label2.setText("Matricula");

        separador2.setBackground(new java.awt.Color(0, 30, 54));
        separador2.setForeground(new java.awt.Color(0, 30, 54));
        separador2.setOpaque(true);

        pesquisa_matricula.setEditable(false);
        pesquisa_matricula.setBackground(new java.awt.Color(198, 255, 255));
        pesquisa_matricula.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pesquisa_matricula.setForeground(new java.awt.Color(0, 30, 54));
        pesquisa_matricula.setBorder(null);
        pesquisa_matricula.setCaretColor(new java.awt.Color(0, 30, 54));

        pesquisa_n.setBackground(new java.awt.Color(198, 255, 255));
        pesquisa_n.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pesquisa_n.setForeground(new java.awt.Color(0, 30, 54));
        pesquisa_n.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pesquisa_n.setBorder(null);
        pesquisa_n.setCaretColor(new java.awt.Color(0, 30, 54));
        pesquisa_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisa_nActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(0, 30, 54));
        jSeparator3.setForeground(new java.awt.Color(0, 30, 54));
        jSeparator3.setOpaque(true);

        pesquisa_nome.setEditable(false);
        pesquisa_nome.setBackground(new java.awt.Color(198, 255, 255));
        pesquisa_nome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pesquisa_nome.setForeground(new java.awt.Color(0, 30, 54));
        pesquisa_nome.setBorder(null);
        pesquisa_nome.setCaretColor(new java.awt.Color(0, 30, 54));

        separador1.setBackground(new java.awt.Color(0, 30, 54));
        separador1.setForeground(new java.awt.Color(0, 30, 54));
        separador1.setOpaque(true);

        label1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 30, 54));
        label1.setText("Nome");

        pesquisa_turma.setEditable(false);
        pesquisa_turma.setBackground(new java.awt.Color(198, 255, 255));
        pesquisa_turma.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pesquisa_turma.setForeground(new java.awt.Color(0, 30, 54));
        pesquisa_turma.setBorder(null);
        pesquisa_turma.setCaretColor(new java.awt.Color(0, 30, 54));

        separador3.setBackground(new java.awt.Color(0, 30, 54));
        separador3.setForeground(new java.awt.Color(0, 30, 54));
        separador3.setOpaque(true);

        label3.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 30, 54));
        label3.setText("Turma");

        label4.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        label4.setForeground(new java.awt.Color(0, 30, 54));
        label4.setText("Marca");

        separador4.setBackground(new java.awt.Color(0, 30, 54));
        separador4.setForeground(new java.awt.Color(0, 30, 54));
        separador4.setOpaque(true);

        pesquisa_marca.setEditable(false);
        pesquisa_marca.setBackground(new java.awt.Color(198, 255, 255));
        pesquisa_marca.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pesquisa_marca.setForeground(new java.awt.Color(0, 30, 54));
        pesquisa_marca.setBorder(null);
        pesquisa_marca.setCaretColor(new java.awt.Color(0, 30, 54));

        bt_Pesquisar.setBackground(new java.awt.Color(0, 30, 54));
        bt_Pesquisar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        bt_Pesquisar.setForeground(new java.awt.Color(226, 226, 226));
        bt_Pesquisar.setText("PESQUISAR");
        bt_Pesquisar.setBorder(null);
        bt_Pesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_PesquisarActionPerformed(evt);
            }
        });

        vazio3.setForeground(new java.awt.Color(204, 204, 255));
        vazio3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 30, 54));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Nº do Processo");

        label5.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        label5.setForeground(new java.awt.Color(0, 30, 54));
        label5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label5.setText("MOTA/S DO ALUNO");

        jScrollPane1.setBackground(new java.awt.Color(32, 33, 35));
        jScrollPane1.setForeground(new java.awt.Color(32, 33, 35));

        Tabel.setBackground(new java.awt.Color(0, 30, 54));
        Tabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Tabel.setForeground(new java.awt.Color(226, 226, 226));
        Tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Matricula", "Marca", "Modelo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabel.setToolTipText("");
        Tabel.setGridColor(new java.awt.Color(204, 204, 255));
        Tabel.setIntercellSpacing(new java.awt.Dimension(5, 5));
        Tabel.setRowHeight(30);
        Tabel.setSelectionBackground(new java.awt.Color(204, 204, 255));
        Tabel.setSelectionForeground(new java.awt.Color(32, 33, 35));
        Tabel.setShowGrid(false);
        Tabel.setShowHorizontalLines(true);
        Tabel.getTableHeader().setReorderingAllowed(false);
        Tabel.setUpdateSelectionOnSort(false);
        Tabel.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(Tabel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pesquisa_n)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(bt_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(231, 231, 231))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label1)
                            .addComponent(label3)
                            .addComponent(separador1)
                            .addComponent(pesquisa_turma, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(separador3)
                            .addComponent(pesquisa_nome))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label2)
                            .addComponent(label4)
                            .addComponent(separador4)
                            .addComponent(pesquisa_matricula, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(separador2)
                            .addComponent(pesquisa_marca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vazio3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(29, 29, 29)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pesquisa_n, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(bt_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label5)
                                    .addComponent(label4)
                                    .addComponent(label1))
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pesquisa_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pesquisa_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(111, 111, 111)
                                        .addComponent(label2)
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(pesquisa_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pesquisa_turma, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(1, 1, 1)
                                        .addComponent(separador4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(182, 182, 182))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label3)
                        .addGap(43, 43, 43)
                        .addComponent(separador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGap(39, 39, 39)
                .addComponent(vazio3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 910, 680));

        jPanel2.setBackground(new java.awt.Color(0, 30, 54));

        jSeparator2.setBackground(new java.awt.Color(226, 226, 226));
        jSeparator2.setForeground(new java.awt.Color(226, 226, 226));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(226, 226, 226));
        jLabel9.setText("AERBP Park");

        Voltar.setBackground(new java.awt.Color(48, 78, 104));
        Voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VoltarMouseClicked(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_back_30px.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(226, 226, 226));
        jLabel5.setText("VOLTAR");

        javax.swing.GroupLayout VoltarLayout = new javax.swing.GroupLayout(Voltar);
        Voltar.setLayout(VoltarLayout);
        VoltarLayout.setHorizontalGroup(
            VoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VoltarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        VoltarLayout.setVerticalGroup(
            VoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Limpar.setBackground(new java.awt.Color(48, 78, 104));
        Limpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Limpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LimparMouseClicked(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_clear_symbol_30px.png"))); // NOI18N

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(226, 226, 226));
        jLabel7.setText("LIMPAR");

        javax.swing.GroupLayout LimparLayout = new javax.swing.GroupLayout(Limpar);
        Limpar.setLayout(LimparLayout);
        LimparLayout.setHorizontalGroup(
            LimparLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LimparLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LimparLayout.setVerticalGroup(
            LimparLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_person_110px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Voltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Limpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMouseClicked
        new Inicial().setVisible(true);
        dispose();
    }//GEN-LAST:event_VoltarMouseClicked

    private void LimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimparMouseClicked

        pesquisa_turma.setText("");
        pesquisa_matricula.setText("");
        pesquisa_marca.setText("");
        pesquisa_n.setText("");
        pesquisa_nome.setText("");
        
        label1.setVisible(false);
        label2.setVisible(false);
        label3.setVisible(false);
        label4.setVisible(false);
        pesquisa_nome.setVisible(false);
        pesquisa_turma.setVisible(false);
        pesquisa_marca.setVisible(false);
        pesquisa_matricula.setVisible(false);
        separador1.setVisible(false);
        separador2.setVisible(false);
        separador3.setVisible(false);
        separador4.setVisible(false);
        Tabel.setVisible(false);
        label5.setVisible(false);
        
        pesquisa_n.grabFocus();

    }//GEN-LAST:event_LimparMouseClicked

    private void bt_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_PesquisarActionPerformed

        try {
            LigacaoBD ligacao = new LigacaoBD(); //liga a ligacao a BD
            Connection conn = ligacao.LigacaoBD();
            
            java.sql.Statement st = conn.createStatement();

            if (pesquisa_n.getText().equals("")){         //verificar se a laybel do nº do aluno esta preenchida ou nao
                vazio3.setText("* Campo Obrigatório");
                pesquisa_n.grabFocus();
                return;
            }
            else{
                String select = "SELECT * FROM alunos WHERE n_aluno = ?";
                PreparedStatement pstm = conn.prepareStatement(select);
                pstm.setString(1, pesquisa_n.getText());
                ResultSet rs = pstm.executeQuery();
                if (rs.next()){
                    select = "SELECT * FROM alunos WHERE n_aluno = ?";
                    pstm = conn.prepareStatement(select);
                    pstm.setString(1, pesquisa_n.getText());
                    rs = pstm.executeQuery();
                    while (rs.next()) {
                        String numero1 = rs.getString(1);
                        String nome1 = rs.getString(2);
                        String turma1 = rs.getString(3);

                        select = "SELECT * FROM motas WHERE n_aluno = ? ";
                        pstm = conn.prepareStatement(select);
                        pstm.setString(1, pesquisa_n.getText());
                        rs = pstm.executeQuery();
                        if(rs.next()){
                            select = "SELECT * FROM motas WHERE n_aluno = ? ";
                            pstm = conn.prepareStatement(select);
                            pstm.setString(1, pesquisa_n.getText());
                            rs = pstm.executeQuery();
                            while (rs.next()) {
                                String matricula1 = rs.getString(1);
                                String n_Mota1 = rs.getString(2);
                                String marca1 = rs.getString(3);
                                String modelo1 = rs.getString(4);


                                select = "SELECT * FROM motas WHERE n_aluno = ? ";
                                pstm = conn.prepareStatement(select);
                                pstm.setString(1, pesquisa_n.getText());
                                rs = pstm.executeQuery();
                            if (rs.next()){
                                select = "SELECT * FROM motas WHERE n_aluno = ? ";
                                pstm = conn.prepareStatement(select);
                                pstm.setString(1, pesquisa_n.getText());
                                rs = pstm.executeQuery();
                                    
                                DefaultTableModel tm = (DefaultTableModel)Tabel.getModel();
                                tm.setRowCount(0);
                
                            while (rs.next()) {
                
                                Object dados[] = {rs.getString(1),rs.getString(3),rs.getString(4)};
                                tm.addRow(dados); 

                            }
                            }else{
                
                            }
                                
                                pesquisa_nome.setText(nome1);  //passa o valor nome da BD para o campo nome da jFrame pesquisa
                                pesquisa_turma.setText(turma1);  //passa o valor turma da BD para o campo turma da jFrame pesquisa
                                pesquisa_matricula.setText(matricula1);  //passa o valor matricula da BD para o campo matricula da jFrame pesquisa
                                pesquisa_marca.setText(marca1);  //passa o valor marca da BD para o campo marca da jFrame pesquisa

                                label1.setVisible(true);
                                label2.setVisible(true);
                                label3.setVisible(true);
                                label4.setVisible(true);
                                pesquisa_nome.setVisible(true);
                                pesquisa_turma.setVisible(true);
                                pesquisa_marca.setVisible(true);
                                pesquisa_matricula.setVisible(true);
                                separador1.setVisible(true);
                                separador2.setVisible(true);
                                separador3.setVisible(true);
                                separador4.setVisible(true);
                                label5.setVisible(true);
                                Tabel.setVisible(true);

                            }
                        }else{
                            label1.setVisible(true);
                            label2.setVisible(true);
                            label3.setVisible(true);
                            label4.setVisible(true);
                            pesquisa_nome.setVisible(true);
                            pesquisa_turma.setVisible(true);
                            pesquisa_marca.setVisible(true);
                            pesquisa_matricula.setVisible(true);
                            separador1.setVisible(true);
                            separador2.setVisible(true);
                            separador3.setVisible(true);
                            separador4.setVisible(true);
                             label5.setVisible(true);
                             Tabel.setVisible(true);
                            
                            pesquisa_nome.setText(nome1);  //passa o valor nome da BD para o campo nome da jFrame pesquisa
                            pesquisa_turma.setText(turma1);  //passa o valor turma da BD para o campo turma da jFrame pesquisa

                            pesquisa_matricula.setText("Não tem mota registada!");
                            pesquisa_marca.setText("Não tem mota registada!");
                            
                        }
                    }

                }else{ // se nao houver esse nº na BD
                    new Perguntar_reg_aluno().setVisible(true);
                    dispose();
                    }
            }
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "O driver de ligação à base de dados não foi encontrado " + ex);
        }
    }//GEN-LAST:event_bt_PesquisarActionPerformed

    private void pesquisa_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisa_nActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisa_nActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pesquisa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Limpar;
    private javax.swing.JTable Tabel;
    private javax.swing.JPanel Voltar;
    private javax.swing.JButton bt_Pesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JTextField pesquisa_marca;
    private javax.swing.JTextField pesquisa_matricula;
    public static javax.swing.JTextField pesquisa_n;
    private javax.swing.JTextField pesquisa_nome;
    private javax.swing.JTextField pesquisa_turma;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JSeparator separador3;
    private javax.swing.JSeparator separador4;
    private javax.swing.JLabel vazio3;
    // End of variables declaration//GEN-END:variables
}
