package com.aerbp_park;

import Avisos.Aviso_registo_sucesso;
import Avisos.Aviso_registo_existente;
import static com.aerbp_park.Inicial.login_nAluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static com.aerbp_park.Inicial.matricula;
import static com.aerbp_park.Inicial.marca;
import static com.aerbp_park.Inicial.modelo;
import static com.aerbp_park.Inicial.nome;
import static com.aerbp_park.Inicial.numero;
import static com.aerbp_park.Inicial.turma;
import java.awt.Toolkit;
import java.sql.ResultSet;

/**
 * @author Daniel Carias
 */
public class Registar extends javax.swing.JFrame {

    static String nome_aluno;
    

    public Registar() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo_pap_white_v5.png")));
        this.setLocationRelativeTo(null);
        registar_nAluno.setText(Inicial.login_nAluno.getText());
        numero = Inicial.login_nAluno.getText();
        registar_nome.grabFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        registar_marca = new javax.swing.JTextField();
        registar_nAluno = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        registar_nome = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        registar_turma = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        registar_matricula = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        registar_modelo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        bt_Registar = new javax.swing.JButton();
        vazio2 = new javax.swing.JLabel();
        vazio3 = new javax.swing.JLabel();
        vazio4 = new javax.swing.JLabel();
        vazio1 = new javax.swing.JLabel();
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

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 30, 54));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 30, 54));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("REGISTAR");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 30, 54));
        jLabel2.setText("Marca");

        jSeparator1.setBackground(new java.awt.Color(0, 30, 54));
        jSeparator1.setForeground(new java.awt.Color(0, 30, 54));
        jSeparator1.setOpaque(true);

        registar_marca.setBackground(new java.awt.Color(198, 255, 255));
        registar_marca.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        registar_marca.setForeground(new java.awt.Color(0, 30, 54));
        registar_marca.setBorder(null);
        registar_marca.setCaretColor(new java.awt.Color(0, 30, 54));

        registar_nAluno.setEditable(false);
        registar_nAluno.setBackground(new java.awt.Color(198, 255, 255));
        registar_nAluno.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        registar_nAluno.setForeground(new java.awt.Color(0, 30, 54));
        registar_nAluno.setBorder(null);
        registar_nAluno.setCaretColor(new java.awt.Color(0, 30, 54));

        jSeparator3.setBackground(new java.awt.Color(0, 30, 54));
        jSeparator3.setForeground(new java.awt.Color(0, 30, 54));
        jSeparator3.setOpaque(true);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 30, 54));
        jLabel8.setText("Nº do Processo");

        registar_nome.setBackground(new java.awt.Color(198, 255, 255));
        registar_nome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        registar_nome.setForeground(new java.awt.Color(0, 30, 54));
        registar_nome.setBorder(null);
        registar_nome.setCaretColor(new java.awt.Color(0, 30, 54));

        jSeparator4.setBackground(new java.awt.Color(0, 30, 54));
        jSeparator4.setForeground(new java.awt.Color(0, 30, 54));
        jSeparator4.setOpaque(true);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 30, 54));
        jLabel11.setText("Nome");

        registar_turma.setBackground(new java.awt.Color(198, 255, 255));
        registar_turma.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        registar_turma.setForeground(new java.awt.Color(0, 30, 54));
        registar_turma.setBorder(null);
        registar_turma.setCaretColor(new java.awt.Color(0, 30, 54));

        jSeparator5.setBackground(new java.awt.Color(0, 30, 54));
        jSeparator5.setForeground(new java.awt.Color(0, 30, 54));
        jSeparator5.setOpaque(true);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 30, 54));
        jLabel12.setText("Turma");

        registar_matricula.setBackground(new java.awt.Color(198, 255, 255));
        registar_matricula.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        registar_matricula.setForeground(new java.awt.Color(0, 30, 54));
        registar_matricula.setBorder(null);
        registar_matricula.setCaretColor(new java.awt.Color(0, 30, 54));

        jSeparator6.setBackground(new java.awt.Color(0, 30, 54));
        jSeparator6.setForeground(new java.awt.Color(0, 30, 54));
        jSeparator6.setOpaque(true);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 30, 54));
        jLabel13.setText("Matricula");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 30, 54));
        jLabel14.setText("Modelo");

        jSeparator7.setBackground(new java.awt.Color(0, 30, 54));
        jSeparator7.setForeground(new java.awt.Color(0, 30, 54));
        jSeparator7.setOpaque(true);

        registar_modelo.setBackground(new java.awt.Color(198, 255, 255));
        registar_modelo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        registar_modelo.setForeground(new java.awt.Color(0, 30, 54));
        registar_modelo.setBorder(null);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 30, 54));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("MOTA");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 30, 54));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("ALUNO");

        bt_Registar.setBackground(new java.awt.Color(0, 30, 54));
        bt_Registar.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        bt_Registar.setForeground(new java.awt.Color(226, 226, 226));
        bt_Registar.setText("REGISTAR");
        bt_Registar.setBorder(null);
        bt_Registar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_Registar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_RegistarActionPerformed(evt);
            }
        });

        vazio2.setForeground(new java.awt.Color(204, 204, 255));

        vazio3.setForeground(new java.awt.Color(204, 204, 255));
        vazio3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        vazio4.setForeground(new java.awt.Color(204, 204, 255));

        vazio1.setForeground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vazio3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bt_Registar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(registar_nAluno)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel12)
                                    .addComponent(jSeparator5)
                                    .addComponent(registar_turma)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(vazio2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator4)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator3)
                                    .addComponent(registar_nome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(vazio1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jSeparator6)
                                        .addComponent(registar_matricula)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(vazio4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jSeparator1)
                                        .addComponent(registar_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel14)
                                        .addComponent(jSeparator7)
                                        .addComponent(registar_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(vazio1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(registar_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registar_nAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(vazio4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(registar_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(vazio2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(registar_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(registar_turma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(registar_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator7)))
                .addGap(38, 38, 38)
                .addComponent(bt_Registar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vazio3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 640, 580));

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
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMouseClicked

        new Inicial().setVisible(true);
        dispose();//fecha a janela login

    }//GEN-LAST:event_VoltarMouseClicked

    private void LimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimparMouseClicked
        
        registar_nome.setText("");
        registar_turma.setText("");
        registar_matricula.setText("");
        registar_marca.setText("");
        registar_modelo.setText("");
        registar_nome.grabFocus();
        
    }//GEN-LAST:event_LimparMouseClicked

    private void bt_RegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_RegistarActionPerformed

        LigacaoBD ligacao = new LigacaoBD(); //liga a ligacao a BD
        Connection conn = ligacao.LigacaoBD();
        
        try {
            
            String query = "CREATE TABLE IF NOT EXISTS alunos (n_aluno varchar(8) NOT NULL PRIMARY KEY, nome VARCHAR(30), turma VARCHAR(10))";
            PreparedStatement xpto = conn.prepareStatement(query);
            xpto.execute();

            if (registar_nAluno.getText().isEmpty() || registar_nome.getText().isEmpty() || registar_matricula.getText().isEmpty() || registar_marca.getText().isEmpty()){
                
                vazio1.setText("*");
                vazio2.setText("*");
                vazio4.setText("*");
                vazio3.setText("* Campos Obrigatórios");
                return;
            }
            else{
                String select = "SELECT * FROM motas WHERE matricula = ? ";
                PreparedStatement pstm = conn.prepareStatement(select);
                pstm.setString(1, registar_matricula.getText());
                ResultSet rs = pstm.executeQuery();
                if (rs.next()){
                    select = "SELECT * FROM motas WHERE matricula = ? ";
                    pstm = conn.prepareStatement(select);
                    pstm.setString(1, registar_matricula.getText());
                    rs = pstm.executeQuery();
                    while (rs.next()){
                        
                        matricula = rs.getString(1);
                        nome_aluno = rs.getString(2);
                        marca = rs.getString(3);
                        modelo = rs.getString(4);
                        
                        }
                        String motas = "update motas set n_aluno = ? where n_aluno = ? ";
                        pstm = conn.prepareStatement(motas);
                        pstm.setString(1, registar_nAluno.getText());
                        pstm.setString(2, nome_aluno);
                        rs = pstm.executeQuery();


                        numero = registar_nAluno.getText();
                        nome = registar_nome.getText();
                        turma = registar_turma.getText();
                        
                        String alunos = "INSERT INTO alunos VALUES (?,?,?)";
                        pstm = conn.prepareStatement(alunos);
                        pstm.setString (1,(this.registar_nAluno.getText()));
                        pstm.setString (2,this.registar_nome.getText());
                        pstm.setString (3,this.registar_turma.getText());
                        pstm.executeUpdate();


                        new Aviso_registo_existente().setVisible(true); 
                        dispose();
                    }else{
                    
                String query_alunos = "INSERT INTO alunos VALUES (?,?,?)";
                pstm = conn.prepareStatement(query_alunos);
                pstm.setString (1,(this.registar_nAluno.getText()));
                pstm.setString (2,this.registar_nome.getText());
                pstm.setString (3,this.registar_turma.getText());
                pstm.executeUpdate();
                String query_mota = "INSERT INTO motas VALUES (?,?,?,?)";
                pstm = conn.prepareStatement(query_mota);
                pstm.setString (1,this.registar_matricula.getText());
                pstm.setString (2,(this.registar_nAluno.getText()));
                pstm.setString (3,this.registar_marca.getText());
                pstm.setString (4,this.registar_modelo.getText());
                pstm.executeUpdate();

                numero = registar_nAluno.getText();
                nome = registar_nome.getText();
                turma = registar_turma.getText();
                marca = registar_marca.getText();
                modelo = registar_modelo.getText();
                matricula = registar_matricula.getText();
                
                new Aviso_registo_sucesso().setVisible(true);
                dispose();
                }
            }
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "O driver de ligação à base de dados não foi encontrado " + ex);
        }
        ligacao.FechaLigacao(conn); //desliga a ligacao a BD
    }//GEN-LAST:event_bt_RegistarActionPerformed

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
            java.util.logging.Logger.getLogger(Registar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Limpar;
    private javax.swing.JPanel Voltar;
    private javax.swing.JButton bt_Registar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField registar_marca;
    private javax.swing.JTextField registar_matricula;
    private javax.swing.JTextField registar_modelo;
    public static javax.swing.JTextField registar_nAluno;
    private javax.swing.JTextField registar_nome;
    private javax.swing.JTextField registar_turma;
    private javax.swing.JLabel vazio1;
    private javax.swing.JLabel vazio2;
    private javax.swing.JLabel vazio3;
    private javax.swing.JLabel vazio4;
    // End of variables declaration//GEN-END:variables
}
