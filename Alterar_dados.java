package com.aerbp_park;

import Avisos.Aviso_alterar_dados;
import Avisos.Aviso_dados_sucesso;
import static com.aerbp_park.Inicial.numero;
import static com.aerbp_park.Inicial.nome;
import static com.aerbp_park.Inicial.turma;
import static com.aerbp_park.Inicial.matricula;
import static com.aerbp_park.Inicial.marca;
import static com.aerbp_park.Inicial.modelo;
import static com.aerbp_park.Menu.matricula_Menu;
import static com.aerbp_park.Menu.menu_Marca;
import static com.aerbp_park.Menu.menu_Nome;
import static com.aerbp_park.Menu.menu_Turma;
import static com.aerbp_park.Menu.menu_nAluno;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author Daniel Carias
 */
public class Alterar_dados extends javax.swing.JFrame {

    public Alterar_dados() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo_pap_white_v5.png")));
        this.setLocationRelativeTo(null);
        
        n_atual.setText(menu_nAluno.getText());
        n_atual.setEditable(false);
        novo_n.grabFocus();
        
        nome_atual.setText(menu_Nome.getText());
        nome_atual.setEditable(false);
        
        turma_atual.setText(menu_Turma.getText());
        turma_atual.setEditable(false);
        
        matricula_atual.setText(matricula_Menu.getText());
        matricula_atual.setEditable(false);
        
        marca_atual.setText(menu_Marca.getText());
        marca_atual.setEditable(false);
        
        modelo_atual.setText(modelo);
        modelo_atual.setEditable(false);
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Sair = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        marca_atual = new javax.swing.JTextField();
        n_atual = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        nome_atual = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        turma_atual = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        matricula_atual = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        modelo_atual = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        bt_Registar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        novo_n = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        novo_nome = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        nova_turma = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        nova_matricula = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        nova_marca = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        novo_modelo = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
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

        Sair.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Sair.setForeground(new java.awt.Color(0, 30, 54));
        Sair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sair.setText("X");
        Sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SairMouseClicked(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(0, 30, 54));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 30, 54));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Alterar dados");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 30, 54));
        jLabel2.setText("Marca");

        jSeparator1.setBackground(new java.awt.Color(0, 30, 54));
        jSeparator1.setForeground(new java.awt.Color(0, 30, 54));
        jSeparator1.setOpaque(true);

        marca_atual.setBackground(new java.awt.Color(198, 255, 255));
        marca_atual.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        marca_atual.setForeground(new java.awt.Color(0, 30, 54));
        marca_atual.setBorder(null);
        marca_atual.setCaretColor(new java.awt.Color(0, 30, 54));

        n_atual.setEditable(false);
        n_atual.setBackground(new java.awt.Color(198, 255, 255));
        n_atual.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        n_atual.setForeground(new java.awt.Color(0, 30, 54));
        n_atual.setBorder(null);
        n_atual.setCaretColor(new java.awt.Color(0, 30, 54));

        jSeparator3.setBackground(new java.awt.Color(0, 30, 54));
        jSeparator3.setForeground(new java.awt.Color(0, 30, 54));
        jSeparator3.setOpaque(true);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 30, 54));
        jLabel8.setText("Nº do Processo");

        nome_atual.setBackground(new java.awt.Color(198, 255, 255));
        nome_atual.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nome_atual.setForeground(new java.awt.Color(0, 30, 54));
        nome_atual.setBorder(null);
        nome_atual.setCaretColor(new java.awt.Color(0, 30, 54));

        jSeparator4.setBackground(new java.awt.Color(0, 30, 54));
        jSeparator4.setForeground(new java.awt.Color(0, 30, 54));
        jSeparator4.setOpaque(true);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 30, 54));
        jLabel11.setText("Nome");

        turma_atual.setBackground(new java.awt.Color(198, 255, 255));
        turma_atual.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        turma_atual.setForeground(new java.awt.Color(0, 30, 54));
        turma_atual.setBorder(null);
        turma_atual.setCaretColor(new java.awt.Color(0, 30, 54));

        jSeparator5.setBackground(new java.awt.Color(0, 30, 54));
        jSeparator5.setForeground(new java.awt.Color(0, 30, 54));
        jSeparator5.setOpaque(true);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 30, 54));
        jLabel12.setText("Turma");

        matricula_atual.setBackground(new java.awt.Color(198, 255, 255));
        matricula_atual.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        matricula_atual.setForeground(new java.awt.Color(0, 30, 54));
        matricula_atual.setBorder(null);
        matricula_atual.setCaretColor(new java.awt.Color(0, 30, 54));

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

        modelo_atual.setBackground(new java.awt.Color(198, 255, 255));
        modelo_atual.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        modelo_atual.setForeground(new java.awt.Color(0, 30, 54));
        modelo_atual.setBorder(null);
        modelo_atual.setCaretColor(new java.awt.Color(0, 30, 54));

        jLabel15.setBackground(new java.awt.Color(0, 30, 54));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 30, 54));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Novos Dados");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 30, 54));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Dados Atuais");

        bt_Registar.setBackground(new java.awt.Color(0, 30, 54));
        bt_Registar.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        bt_Registar.setForeground(new java.awt.Color(226, 226, 226));
        bt_Registar.setText("ALTERAR");
        bt_Registar.setBorder(null);
        bt_Registar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_Registar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_RegistarActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 30, 54));
        jLabel17.setText("Nº do Processo");

        novo_n.setBackground(new java.awt.Color(198, 255, 255));
        novo_n.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        novo_n.setForeground(new java.awt.Color(0, 30, 54));
        novo_n.setBorder(null);
        novo_n.setCaretColor(new java.awt.Color(0, 30, 54));

        jSeparator8.setBackground(new java.awt.Color(0, 30, 54));
        jSeparator8.setForeground(new java.awt.Color(0, 30, 54));
        jSeparator8.setOpaque(true);

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 30, 54));
        jLabel18.setText("Nome");

        novo_nome.setBackground(new java.awt.Color(198, 255, 255));
        novo_nome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        novo_nome.setForeground(new java.awt.Color(0, 30, 54));
        novo_nome.setBorder(null);
        novo_nome.setCaretColor(new java.awt.Color(0, 30, 54));

        jSeparator9.setBackground(new java.awt.Color(0, 30, 54));
        jSeparator9.setForeground(new java.awt.Color(0, 30, 54));
        jSeparator9.setOpaque(true);

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 30, 54));
        jLabel19.setText("Turma");

        nova_turma.setBackground(new java.awt.Color(198, 255, 255));
        nova_turma.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nova_turma.setForeground(new java.awt.Color(0, 30, 54));
        nova_turma.setBorder(null);
        nova_turma.setCaretColor(new java.awt.Color(0, 30, 54));

        jSeparator10.setBackground(new java.awt.Color(0, 30, 54));
        jSeparator10.setForeground(new java.awt.Color(0, 30, 54));
        jSeparator10.setOpaque(true);

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 30, 54));
        jLabel20.setText("Matricula");

        nova_matricula.setBackground(new java.awt.Color(198, 255, 255));
        nova_matricula.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nova_matricula.setForeground(new java.awt.Color(0, 30, 54));
        nova_matricula.setBorder(null);
        nova_matricula.setCaretColor(new java.awt.Color(0, 30, 54));

        jSeparator11.setBackground(new java.awt.Color(0, 30, 54));
        jSeparator11.setForeground(new java.awt.Color(0, 30, 54));
        jSeparator11.setOpaque(true);

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 30, 54));
        jLabel21.setText("Marca");

        nova_marca.setEditable(false);
        nova_marca.setBackground(new java.awt.Color(198, 255, 255));
        nova_marca.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nova_marca.setForeground(new java.awt.Color(0, 30, 54));
        nova_marca.setBorder(null);
        nova_marca.setCaretColor(new java.awt.Color(0, 30, 54));

        jSeparator12.setBackground(new java.awt.Color(0, 30, 54));
        jSeparator12.setForeground(new java.awt.Color(0, 30, 54));
        jSeparator12.setOpaque(true);

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 30, 54));
        jLabel22.setText("Modelo");

        novo_modelo.setBackground(new java.awt.Color(198, 255, 255));
        novo_modelo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        novo_modelo.setForeground(new java.awt.Color(0, 30, 54));
        novo_modelo.setBorder(null);
        novo_modelo.setCaretColor(new java.awt.Color(0, 30, 54));

        jSeparator13.setBackground(new java.awt.Color(0, 30, 54));
        jSeparator13.setForeground(new java.awt.Color(0, 30, 54));
        jSeparator13.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt_Registar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator5)
                            .addComponent(turma_atual)
                            .addComponent(jSeparator4)
                            .addComponent(nome_atual)
                            .addComponent(jSeparator1)
                            .addComponent(marca_atual, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(jSeparator7)
                            .addComponent(modelo_atual, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(jSeparator3)
                            .addComponent(n_atual)
                            .addComponent(matricula_atual)
                            .addComponent(jSeparator6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel2)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(264, 264, 264)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator13)
                            .addComponent(novo_modelo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator10)
                                        .addComponent(nova_turma)
                                        .addComponent(jSeparator9)
                                        .addComponent(novo_nome)
                                        .addComponent(jSeparator12)
                                        .addComponent(nova_marca)
                                        .addComponent(jSeparator8)
                                        .addComponent(novo_n)
                                        .addComponent(nova_matricula)
                                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel19)
                                        .addComponent(jLabel20)
                                        .addComponent(jLabel21))
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n_atual, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome_atual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(novo_n, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(novo_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nova_turma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nova_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nova_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(novo_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(turma_atual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(matricula_atual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(marca_atual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modelo_atual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addComponent(bt_Registar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 810, 780));

        jPanel2.setBackground(new java.awt.Color(0, 30, 54));

        jSeparator2.setForeground(new java.awt.Color(226, 226, 226));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
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
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_edit_property_100px.png"))); // NOI18N

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SairMouseClicked

    private void bt_RegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_RegistarActionPerformed

        LigacaoBD ligacao = new LigacaoBD(); //liga a ligacao a BD
        Connection conn = ligacao.LigacaoBD();
        
        novo_n.grabFocus();
        
        try{
                    
            if(novo_n.getText().isEmpty() && novo_nome.getText().isEmpty() && nova_turma.getText().isEmpty() && nova_matricula.getText().isEmpty() && nova_marca.getText().isEmpty() && novo_modelo.getText().isEmpty() ){
                new Aviso_alterar_dados().setVisible(true); 
                dispose();
                return;
            }
            else{
                
                //numero
                if(novo_n.getText().isEmpty()){
                    
                }
                else{
                    
                    String select = "SELECT * FROM alunos WHERE n_aluno = ? ";
                    PreparedStatement pstm = conn.prepareStatement(select);
                    pstm.setString(1, novo_n.getText());
                    ResultSet rs = pstm.executeQuery();
                    if(rs.next()){
                        System.out.println("Número já existente na Base de Dados");
                    }
                    else{

                    select = "update alunos set n_aluno = ? where n_aluno = ?";
                    pstm = conn.prepareStatement(select);
                    pstm.setString(1, novo_n.getText());
                    pstm.setString(2, n_atual.getText());
                    pstm.executeUpdate();
            
                    select = "update motas set n_aluno= ? where n_aluno = ?";
                    pstm = conn.prepareStatement(select);
                    pstm.setString(1, novo_n.getText());
                    pstm.setString(2, n_atual.getText());
                    pstm.executeUpdate();
                    
                    select = "update marcacoes set n_aluno= ? where n_aluno = ?";
                    pstm = conn.prepareStatement(select);
                    pstm.setString(1, novo_n.getText());
                    pstm.setString(2, n_atual.getText());
                    pstm.executeUpdate();
                    
                    numero = novo_n.getText();
                    }
                }
                
                //nomes
                if(novo_nome.getText().isEmpty()){
                    
                }
                else{
                    
                    String altera_aluno = "update alunos set nome = ? where nome = ?";
                    PreparedStatement pstm = conn.prepareStatement(altera_aluno);
                    pstm.setString(1, novo_nome.getText());
                    pstm.setString(2, nome_atual.getText());
                    pstm.executeUpdate();
            
                    String altera_marcacao = "update marcacoes set nome = ? where nome = ?";
                    pstm = conn.prepareStatement(altera_marcacao);
                    pstm.setString(1, novo_nome.getText());
                    pstm.setString(2, nome_atual.getText());
                    pstm.executeUpdate();
                    
                    nome = novo_nome.getText();
                }
                
                //turmas
                if(nova_turma.getText().isEmpty()){
                    
                }
                else{
                    String altera_aluno = "update alunos set turma = ? where turma = ?";
                    PreparedStatement pstm = conn.prepareStatement(altera_aluno);
                    pstm.setString(1, nova_turma.getText());
                    pstm.setString(2, turma_atual.getText());
                    pstm.executeUpdate();
            
                    String altera_marcacao = "update marcacoes set turma= ? where turma = ?";
                    pstm = conn.prepareStatement(altera_marcacao);
                    pstm.setString(1, nova_turma.getText());
                    pstm.setString(2, turma_atual.getText());
                    pstm.executeUpdate();
                    
                    turma = nova_turma.getText();
                    
                }
  
                //matriculas
                if(nova_matricula.getText().isEmpty()){
                    
                }
                else{
                    String select = "SELECT * FROM motas WHERE matricula = ?";
                    PreparedStatement pstm = conn.prepareStatement(select);
                    pstm.setString(1, nova_matricula.getText());
                    ResultSet rs = pstm.executeQuery();

                    
                    if(rs.next()){
                        
                        nova_matricula.setText("MATRICULA JÁ EXISTENTE");
                        return;
                    }
                    else{
                    String altera_aluno = "update motas set matricula = ? where matricula = ?";
                    pstm = conn.prepareStatement(altera_aluno);
                    pstm.setString(1, nova_matricula.getText());
                    pstm.setString(2, matricula_atual.getText());
                    pstm.executeUpdate();
            
                    String altera_marcacao = "update marcacoes set matricula = ? where matricula = ?";
                    pstm = conn.prepareStatement(altera_marcacao);
                    pstm.setString(1, nova_matricula.getText());
                    pstm.setString(2, matricula_atual.getText());
                    pstm.executeUpdate();
                    
                    matricula = nova_matricula.getText();
                    }
                }
                
                //marcas
                if(nova_marca.getText().isEmpty()){
                    
                }
                else{
                    String altera_aluno = "update motas set marca = ? where marca = ?";
                    PreparedStatement pstm = conn.prepareStatement(altera_aluno);
                    pstm.setString(1, nova_marca.getText());
                    pstm.setString(2, marca_atual.getText());
                    pstm.executeUpdate();
            
                    String altera_marcacao = "update marcacoes set marca = ? where marca = ?";
                    pstm = conn.prepareStatement(altera_marcacao);
                    pstm.setString(1, nova_marca.getText());
                    pstm.setString(2, marca_atual.getText());
                    pstm.executeUpdate();
                    
                    marca = nova_marca.getText();
                }
                
                //modelo
                if(novo_modelo.getText().isEmpty()){
                    
                }
                else{
                    String altera_aluno = "update motas set modelo = ? where modelo = ?";
                    PreparedStatement pstm = conn.prepareStatement(altera_aluno);
                    pstm.setString(1, novo_modelo.getText());
                    pstm.setString(2, modelo_atual.getText());
                    pstm.executeUpdate();
            
                    modelo = novo_modelo.getText();
                }
            }
            
        new Aviso_dados_sucesso().setVisible(true); 
        dispose();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "O driver de ligação à base de dados não foi encontrado " + ex);
        }
    }//GEN-LAST:event_bt_RegistarActionPerformed

    private void VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMouseClicked
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_VoltarMouseClicked

    private void LimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimparMouseClicked

        novo_n.setText("");
        novo_modelo.setText("");
        novo_nome.setText("");
        nova_marca.setText("");
        nova_matricula.setText("");
        nova_turma.setText("");
        
        novo_n.grabFocus();
    }//GEN-LAST:event_LimparMouseClicked

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
            java.util.logging.Logger.getLogger(Alterar_dados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alterar_dados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alterar_dados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alterar_dados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alterar_dados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Limpar;
    private javax.swing.JLabel Sair;
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
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField marca_atual;
    private javax.swing.JTextField matricula_atual;
    private javax.swing.JTextField modelo_atual;
    public static javax.swing.JTextField n_atual;
    private javax.swing.JTextField nome_atual;
    private javax.swing.JTextField nova_marca;
    private javax.swing.JTextField nova_matricula;
    private javax.swing.JTextField nova_turma;
    private javax.swing.JTextField novo_modelo;
    public static javax.swing.JTextField novo_n;
    private javax.swing.JTextField novo_nome;
    private javax.swing.JTextField turma_atual;
    // End of variables declaration//GEN-END:variables
}
