package com.aerbp_park;

import Avisos.Aviso_alterar_mota;
import static com.aerbp_park.Inicial.login_nAluno;
import static com.aerbp_park.Inicial.matricula;
import static com.aerbp_park.Inicial.marca;
import static com.aerbp_park.Inicial.modelo;
import static com.aerbp_park.Inicial.numero;
import static com.aerbp_park.Menu.matricula_Menu;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Daniel Carias
 */
public class Altera_Motociclo extends javax.swing.JFrame {

    static String matri;
    
    LigacaoBD ligacao = new LigacaoBD();
    

    public Altera_Motociclo() {
        initComponents();
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo_pap_white_v5.png")));
        this.setLocationRelativeTo(null);
        mota_atualiza_matricula.grabFocus();
        n_aluno_mota.setText(numero);
        n_aluno_mota.setEditable(false);
        
        modelo_label.setVisible(false);
        marca_label.setVisible(false);
        modelo_atualiza_mota.setVisible(false);
        marca_atualiza_mota.setVisible(false);
        jSeparator4.setVisible(false);
        jSeparator6.setVisible(false);
        
        
        Connection conn = ligacao.LigacaoBD();
        try {
            //Cria o objeto Statement que permite maniular os dados da BD
            
            //Statement stmt = conn.createStatement();
            
            
            //Cria o objeto Resulteset e coloca lá o conteudo da consulta à BD            
            String select = "SELECT * FROM motas WHERE n_aluno = ? ";
            PreparedStatement pstm = conn.prepareStatement(select);
            pstm.setString(1, numero);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()){
                select = "SELECT * FROM motas WHERE n_aluno = ? ";/*Procura os dados do(a) aluno(a)*/
                pstm = conn.prepareStatement(select);
                pstm.setString(1, numero);
                rs = pstm.executeQuery();
                
                DefaultTableModel tm = (DefaultTableModel)Tabel.getModel();
                tm.setRowCount(0);
                
            while (rs.next()) {
                
                Object dados[] = {rs.getString(1),rs.getString(3),rs.getString(4)};
                tm.addRow(dados); 

            }
        }else{
                
            }
        } catch (SQLException ex) {
            System.out.println("SQLException "+ex);
        }
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Limpar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Voltar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        n_aluno_mota = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        marca_label = new javax.swing.JLabel();
        marca_atualiza_mota = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        mota_atualiza_matricula = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        modelo_label = new javax.swing.JLabel();
        modelo_atualiza_mota = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        elimina_mota = new javax.swing.JButton();
        vazio3 = new javax.swing.JLabel();
        vazio2 = new javax.swing.JLabel();
        vazio4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        sair1 = new javax.swing.JLabel();
        bt_Registar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 30, 54));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(226, 226, 226));
        jLabel9.setText("AERBP Park");

        jSeparator2.setForeground(new java.awt.Color(226, 226, 226));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        VoltarLayout.setVerticalGroup(
            VoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_motorcycle_100px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, Short.MAX_VALUE)
            .addComponent(Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 500));

        jPanel1.setBackground(new java.awt.Color(198, 255, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 30, 54));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Alterar Mota");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 30, 54));
        jLabel8.setText("Nº do Processo");

        n_aluno_mota.setEditable(false);
        n_aluno_mota.setBackground(new java.awt.Color(198, 255, 255));
        n_aluno_mota.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        n_aluno_mota.setForeground(new java.awt.Color(0, 30, 54));
        n_aluno_mota.setBorder(null);
        n_aluno_mota.setCaretColor(new java.awt.Color(0, 30, 54));

        jSeparator3.setBackground(new java.awt.Color(0, 30, 54));
        jSeparator3.setForeground(new java.awt.Color(0, 30, 54));
        jSeparator3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jSeparator3.setOpaque(true);

        marca_label.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        marca_label.setForeground(new java.awt.Color(0, 30, 54));
        marca_label.setText("Marca");

        marca_atualiza_mota.setBackground(new java.awt.Color(198, 255, 255));
        marca_atualiza_mota.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        marca_atualiza_mota.setForeground(new java.awt.Color(0, 30, 54));
        marca_atualiza_mota.setBorder(null);
        marca_atualiza_mota.setCaretColor(new java.awt.Color(0, 30, 54));

        jSeparator4.setBackground(new java.awt.Color(0, 30, 54));
        jSeparator4.setForeground(new java.awt.Color(0, 30, 54));
        jSeparator4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jSeparator4.setOpaque(true);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 30, 54));
        jLabel12.setText("Matricula");

        mota_atualiza_matricula.setBackground(new java.awt.Color(198, 255, 255));
        mota_atualiza_matricula.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        mota_atualiza_matricula.setForeground(new java.awt.Color(0, 30, 54));
        mota_atualiza_matricula.setBorder(null);
        mota_atualiza_matricula.setCaretColor(new java.awt.Color(0, 30, 54));

        jSeparator5.setBackground(new java.awt.Color(0, 30, 54));
        jSeparator5.setForeground(new java.awt.Color(0, 30, 54));
        jSeparator5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jSeparator5.setOpaque(true);

        modelo_label.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        modelo_label.setForeground(new java.awt.Color(0, 30, 54));
        modelo_label.setText("Modelo");

        modelo_atualiza_mota.setBackground(new java.awt.Color(198, 255, 255));
        modelo_atualiza_mota.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        modelo_atualiza_mota.setForeground(new java.awt.Color(0, 30, 54));
        modelo_atualiza_mota.setBorder(null);
        modelo_atualiza_mota.setCaretColor(new java.awt.Color(0, 30, 54));

        jSeparator6.setBackground(new java.awt.Color(0, 30, 54));
        jSeparator6.setForeground(new java.awt.Color(0, 30, 54));
        jSeparator6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jSeparator6.setOpaque(true);

        elimina_mota.setBackground(new java.awt.Color(0, 30, 54));
        elimina_mota.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        elimina_mota.setForeground(new java.awt.Color(226, 226, 226));
        elimina_mota.setText("ELIMINAR MOTA");
        elimina_mota.setBorder(null);
        elimina_mota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        elimina_mota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elimina_motaActionPerformed(evt);
            }
        });

        vazio3.setForeground(new java.awt.Color(204, 204, 255));
        vazio3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        vazio2.setForeground(new java.awt.Color(204, 204, 255));

        vazio4.setForeground(new java.awt.Color(204, 204, 255));

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
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        if (Tabel.getColumnModel().getColumnCount() > 0) {
            Tabel.getColumnModel().getColumn(0).setResizable(false);
            Tabel.getColumnModel().getColumn(1).setResizable(false);
            Tabel.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 30, 54));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Mota/s do Aluno");

        sair1.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        sair1.setForeground(new java.awt.Color(0, 30, 54));
        sair1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sair1.setText("X");
        sair1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sair1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sair1MouseClicked(evt);
            }
        });

        bt_Registar1.setBackground(new java.awt.Color(0, 30, 54));
        bt_Registar1.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        bt_Registar1.setForeground(new java.awt.Color(226, 226, 226));
        bt_Registar1.setText("ALTERAR/ADICIONAR");
        bt_Registar1.setBorder(null);
        bt_Registar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_Registar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Registar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(vazio3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(marca_label)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(vazio4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(marca_atualiza_mota)
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(n_aluno_mota)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(modelo_label)
                                        .addComponent(modelo_atualiza_mota)
                                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(vazio2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(mota_atualiza_matricula)
                                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(bt_Registar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                            .addComponent(elimina_mota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(sair1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sair1)
                .addGap(16, 16, 16)
                .addComponent(jLabel10)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(n_aluno_mota, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12)
                                            .addComponent(vazio2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mota_atualiza_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(63, 63, 63)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(marca_label)
                                    .addComponent(vazio4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(marca_atualiza_mota, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(modelo_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(modelo_atualiza_mota, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bt_Registar1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vazio3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(elimina_mota, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 760, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimparMouseClicked
        this.mota_atualiza_matricula.setText("");
        this.marca_atualiza_mota.setText("");
        this.modelo_atualiza_mota.setText("");
        marca_atualiza_mota.grabFocus();
    }//GEN-LAST:event_LimparMouseClicked

    private void VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMouseClicked
        
        try{
        LigacaoBD ligacao = new LigacaoBD();
        Connection conn = ligacao.LigacaoBD();

        /* Verificar se o aluno, dps de eliminar a mota, irá ficar com alguma mota registada ou não e se ficar alterar no menu essa mota*/
        
            String select = "SELECT matricula FROM motas WHERE matricula = ?";
            PreparedStatement pstm = conn.prepareStatement(select);
            pstm.setString(1, matricula_Menu.getText());
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                new Menu().setVisible(true);
                dispose();
            }else{
                
            select = "SELECT matricula, marca FROM motas WHERE n_aluno = ?";
            pstm = conn.prepareStatement(select);
            pstm.setString(1, numero);
            rs = pstm.executeQuery();
            if(rs.next()){
                select = "SELECT matricula, marca FROM motas WHERE n_aluno = ?";
                pstm = conn.prepareStatement(select);
                pstm.setString(1, numero);
                rs = pstm.executeQuery();
                while(rs.next()){
                    matricula = rs.getString(1);
                    marca = rs.getString(2);
                }
                new Menu().setVisible(true);
                dispose();
            }else{
                new Inserir_Motas().setVisible(true);
                dispose();
            }
            }
        
        }
        catch(SQLException ex) {
            System.out.println("SQLException "+ex);
        }
    }//GEN-LAST:event_VoltarMouseClicked

    private void elimina_motaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elimina_motaActionPerformed

        if(Tabel.getSelectionModel().isSelectionEmpty()){
            
        }else{
            DefaultTableModel model = (DefaultTableModel)Tabel.getModel();
            int selectedRowIndex = Tabel.getSelectedRow();
            
            matri = model.getValueAt(selectedRowIndex, 0).toString();
                        
            new Pergunta_eliminar_mota().setVisible(true);
            dispose();
        }
        
    }//GEN-LAST:event_elimina_motaActionPerformed

    private void sair1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sair1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_sair1MouseClicked

    private void bt_Registar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Registar1ActionPerformed
        
        mota_atualiza_matricula.grabFocus();
        
        try {
            
        Connection conn = ligacao.LigacaoBD();     
        
        String query = "create table if not exists motas (matricula varchar (8) NOT NULL primary key, n_aluno varchar(8), marca varchar(30), modelo varchar(30), cilindrada int(6))";
        PreparedStatement xpto = conn.prepareStatement(query);
        xpto.execute();

        if (n_aluno_mota.getText().isEmpty() || mota_atualiza_matricula.getText().isEmpty()){

            vazio2.setText("*");
            vazio2.setVisible(true);
            vazio3.setText("* campo obrigatório");
            vazio3.setVisible(true);
            return;
                
        }else{
        String select = "SELECT * FROM motas WHERE matricula = ? ";
        PreparedStatement pstm = conn.prepareStatement(select);
        pstm.setString(1, mota_atualiza_matricula.getText());
        ResultSet rs = pstm.executeQuery();
        if (rs.next()){
        select = "SELECT * FROM motas WHERE matricula = ? ";/*Procura os dados do(a) aluno(a)*/
        pstm = conn.prepareStatement(select);
        pstm.setString(1, mota_atualiza_matricula.getText());
        rs = pstm.executeQuery();
        
                    while (rs.next()){
                        mota_atualiza_matricula.setText(rs.getString(1)); 
                        marca_atualiza_mota.setText(rs.getString(3));      
                        modelo_atualiza_mota.setText(rs.getString(4));
                        
                        marca_label.setVisible(true);
                        modelo_label.setVisible(true);
                        modelo_atualiza_mota.setVisible(true);
                        marca_atualiza_mota.setVisible(true);
                        jSeparator4.setVisible(true);
                        jSeparator6.setVisible(true);
                        vazio4.setVisible(true);
                        
                        modelo_atualiza_mota.setEditable(false);
                        marca_atualiza_mota.setEditable(false);
                        
                        marca = marca_atualiza_mota.getText();
                        modelo = modelo_atualiza_mota.getText();
                        matricula = mota_atualiza_matricula.getText();
                        
                        new Menu().setVisible(true);
                        dispose();
                    }
            }else{
            
            marca_label.setVisible(true);
            modelo_label.setVisible(true);
            modelo_atualiza_mota.setVisible(true);
            marca_atualiza_mota.setVisible(true);
            jSeparator4.setVisible(true);
            jSeparator6.setVisible(true);
            
             if(marca_atualiza_mota.getText().isEmpty() || mota_atualiza_matricula.getText().isEmpty()){
             
                 vazio2.setVisible(true);
                 vazio2.setText("*");
                 vazio3.setVisible(true);
                 vazio3.setText("* campo obrigatório");
                 vazio4.setVisible(true);
                 vazio4.setText("*");
                 
             }else{
             String query_mota = "INSERT INTO motas VALUES (?,?,?,?)";
                    pstm = conn.prepareStatement(query_mota);
                    pstm.setString (1,mota_atualiza_matricula.getText());//------ATENCAO------> formatar os "-" e os "/" para a matricula e dps juntar tudo para guardar na BD
                    pstm.setString (2,(n_aluno_mota.getText()));
                    pstm.setString (3,marca_atualiza_mota.getText());
                    pstm.setString (4,modelo_atualiza_mota.getText());
                    pstm.executeUpdate();
                    
                    marca = marca_atualiza_mota.getText();
                    modelo = modelo_atualiza_mota.getText();
                    matricula = mota_atualiza_matricula.getText();

                    new Aviso_alterar_mota().setVisible(true);
                    dispose();//fecha a janela login
                    }
                }
            }
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "O driver de ligação à base de dados não foi encontrado " + ex);
        }
        
    }//GEN-LAST:event_bt_Registar1ActionPerformed


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
            java.util.logging.Logger.getLogger(Altera_Motociclo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Altera_Motociclo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Altera_Motociclo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Altera_Motociclo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Altera_Motociclo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Limpar;
    private javax.swing.JTable Tabel;
    private javax.swing.JPanel Voltar;
    private javax.swing.JButton bt_Registar1;
    private javax.swing.JButton elimina_mota;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField marca_atualiza_mota;
    private javax.swing.JLabel marca_label;
    private javax.swing.JTextField modelo_atualiza_mota;
    private javax.swing.JLabel modelo_label;
    private javax.swing.JTextField mota_atualiza_matricula;
    public static javax.swing.JTextField n_aluno_mota;
    private javax.swing.JLabel sair1;
    private javax.swing.JLabel vazio2;
    private javax.swing.JLabel vazio3;
    private javax.swing.JLabel vazio4;
    // End of variables declaration//GEN-END:variables
}
