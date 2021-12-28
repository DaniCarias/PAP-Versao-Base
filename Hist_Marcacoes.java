package com.aerbp_park;

import Avisos.Aviso_sem_marcacao;
import Avisos.Aviso_sem_aluno;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 * @author Daniel Carias
 */
public class Hist_Marcacoes extends javax.swing.JFrame {

    static int id;
    
    LigacaoBD ligacao = new LigacaoBD(); //liga a ligacao a BD
    
    Statement stmt = null;
    ResultSet rs = null;
    
    public Hist_Marcacoes() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo_pap_white_v5.png")));
        this.setLocationRelativeTo(null);
        
        bt_pesq_n1.setVisible(false);
        data_n_cres.setVisible(false);
        data_n_desc.setVisible(false);
        n_label.setVisible(false);
        hist_n.setVisible(false);
        tr_n.setVisible(false);
        data_n_desc.setVisible(false);
        
        Connection conn = ligacao.LigacaoBD();
        try {
            stmt = conn.createStatement();
                       
            rs = stmt.executeQuery("SELECT * FROM marcacoes");
            if (rs.next()){
                rs = stmt.executeQuery("SELECT * FROM marcacoes");
                
                DefaultTableModel tm = (DefaultTableModel)Table.getModel();
                tm.setRowCount(0);
                
            while (rs.next()) {
                
                String hora_e = (rs.getString(8).toString().replace(".", ":")+" H");
                String hora_s = (rs.getString(9).toString().replace(".", ":")+" H");
                String hora_marcacao = (rs.getString(11).toString()+" H");
                
                Object dados[] = {rs.getInt(1),rs.getString(10),hora_marcacao,rs.getString(2),rs.getString(6),rs.getString(7),hora_e,hora_s};
                tm.addRow(dados);
                
            }
        }else{
                //("--  O aluno ainda não tem nenhuma marcação efetuada!  --");
            }
        } catch (SQLException ex) {
            System.out.println("SQLException "+ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        hist_n = new javax.swing.JTextField();
        tr_n = new javax.swing.JSeparator();
        n_label = new javax.swing.JLabel();
        data_n_desc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        bt_pesq_n1 = new javax.swing.JButton();
        data_n_cres = new javax.swing.JButton();
        vazio3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        Voltar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        decrescente = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        crescente = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        n_aluno = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        eliminar = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ativas = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

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
        jLabel10.setText("Marcações");

        hist_n.setBackground(new java.awt.Color(198, 255, 255));
        hist_n.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        hist_n.setForeground(new java.awt.Color(0, 30, 54));
        hist_n.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hist_n.setToolTipText("");
        hist_n.setBorder(null);
        hist_n.setCaretColor(new java.awt.Color(0, 30, 54));

        tr_n.setBackground(new java.awt.Color(0, 30, 54));
        tr_n.setForeground(new java.awt.Color(0, 30, 54));
        tr_n.setOpaque(true);

        n_label.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        n_label.setForeground(new java.awt.Color(0, 30, 54));
        n_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n_label.setText("Nº do Processo");

        data_n_desc.setBackground(new java.awt.Color(0, 30, 54));
        data_n_desc.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        data_n_desc.setForeground(new java.awt.Color(226, 226, 226));
        data_n_desc.setText("DATA DECRESCENTE");
        data_n_desc.setBorder(null);
        data_n_desc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        data_n_desc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_n_descActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(32, 33, 35));
        jScrollPane1.setForeground(new java.awt.Color(32, 33, 35));

        Table.setBackground(new java.awt.Color(0, 30, 54));
        Table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Table.setForeground(new java.awt.Color(204, 204, 255));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Marcação", "Data Marcação", "Hora Marcação", "Nº Aluno", "Matricula", "Data", "Hora Entrada", "Hora Saida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setToolTipText("");
        Table.setGridColor(new java.awt.Color(204, 204, 255));
        Table.setIntercellSpacing(new java.awt.Dimension(5, 5));
        Table.setRowHeight(30);
        Table.setSelectionBackground(new java.awt.Color(204, 204, 255));
        Table.setSelectionForeground(new java.awt.Color(32, 33, 35));
        Table.setShowGrid(false);
        Table.setShowHorizontalLines(true);
        Table.getTableHeader().setReorderingAllowed(false);
        Table.setUpdateSelectionOnSort(false);
        Table.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(Table);

        bt_pesq_n1.setBackground(new java.awt.Color(0, 30, 54));
        bt_pesq_n1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        bt_pesq_n1.setForeground(new java.awt.Color(226, 226, 226));
        bt_pesq_n1.setText("PESQUISAR");
        bt_pesq_n1.setBorder(null);
        bt_pesq_n1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_pesq_n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pesq_n1ActionPerformed(evt);
            }
        });

        data_n_cres.setBackground(new java.awt.Color(0, 30, 54));
        data_n_cres.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        data_n_cres.setForeground(new java.awt.Color(226, 226, 226));
        data_n_cres.setText("DATA CRESCENTE");
        data_n_cres.setBorder(null);
        data_n_cres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        data_n_cres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_n_cresActionPerformed(evt);
            }
        });

        vazio3.setForeground(new java.awt.Color(0, 30, 54));
        vazio3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(data_n_cres, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_pesq_n1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(n_label, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(tr_n)
                    .addComponent(hist_n, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(vazio3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(117, 117, 117)
                .addComponent(data_n_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(n_label)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(hist_n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(tr_n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(vazio3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(bt_pesq_n1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(data_n_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(data_n_cres, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 920, 790));

        jPanel2.setBackground(new java.awt.Color(0, 30, 54));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        VoltarLayout.setVerticalGroup(
            VoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_report_card_100px.png"))); // NOI18N

        decrescente.setBackground(new java.awt.Color(48, 78, 104));
        decrescente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        decrescente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                decrescenteMouseClicked(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_descending_sorting_40px.png"))); // NOI18N

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(226, 226, 226));
        jLabel11.setText("DATA DECRESCENTE");

        javax.swing.GroupLayout decrescenteLayout = new javax.swing.GroupLayout(decrescente);
        decrescente.setLayout(decrescenteLayout);
        decrescenteLayout.setHorizontalGroup(
            decrescenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(decrescenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        decrescenteLayout.setVerticalGroup(
            decrescenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        crescente.setBackground(new java.awt.Color(48, 78, 104));
        crescente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crescente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crescenteMouseClicked(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_ascending_sorting_40px_1.png"))); // NOI18N

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(226, 226, 226));
        jLabel13.setText("DATA CRESCENTE");

        javax.swing.GroupLayout crescenteLayout = new javax.swing.GroupLayout(crescente);
        crescente.setLayout(crescenteLayout);
        crescenteLayout.setHorizontalGroup(
            crescenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crescenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        crescenteLayout.setVerticalGroup(
            crescenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        n_aluno.setBackground(new java.awt.Color(48, 78, 104));
        n_aluno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        n_aluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n_alunoMouseClicked(evt);
            }
        });

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_person_40px.png"))); // NOI18N

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(226, 226, 226));
        jLabel15.setText("PESQUISAR Nº ALUNO");

        javax.swing.GroupLayout n_alunoLayout = new javax.swing.GroupLayout(n_aluno);
        n_aluno.setLayout(n_alunoLayout);
        n_alunoLayout.setHorizontalGroup(
            n_alunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(n_alunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        n_alunoLayout.setVerticalGroup(
            n_alunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        eliminar.setBackground(new java.awt.Color(48, 78, 104));
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarMouseClicked(evt);
            }
        });

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_delete_bin_30px.png"))); // NOI18N

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(226, 226, 226));
        jLabel17.setText("ELIMINAR MARCAÇÃO");

        javax.swing.GroupLayout eliminarLayout = new javax.swing.GroupLayout(eliminar);
        eliminar.setLayout(eliminarLayout);
        eliminarLayout.setHorizontalGroup(
            eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        eliminarLayout.setVerticalGroup(
            eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ativas.setBackground(new java.awt.Color(48, 78, 104));
        ativas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ativas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ativasMouseClicked(evt);
            }
        });

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_search_35px.png"))); // NOI18N

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(226, 226, 226));
        jLabel19.setText("MARCAÇÕES ATIVAS");

        javax.swing.GroupLayout ativasLayout = new javax.swing.GroupLayout(ativas);
        ativas.setLayout(ativasLayout);
        ativasLayout.setHorizontalGroup(
            ativasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ativasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ativasLayout.setVerticalGroup(
            ativasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Voltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(crescente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(decrescente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(n_aluno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(ativas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(106, 106, 106))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ativas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(crescente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(decrescente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(n_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMouseClicked
        new Inicial().setVisible(true);
        dispose();//fecha a janela login
    }//GEN-LAST:event_VoltarMouseClicked

    private void data_n_descActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_n_descActionPerformed

        Connection conn = ligacao.LigacaoBD();
        
        try {
            stmt = conn.createStatement();
            
            
            String select = "SELECT * FROM marcacoes WHERE n_aluno = ? order by n_marcacao desc";
            PreparedStatement pstm = conn.prepareStatement(select);
            pstm.setString(1, hist_n.getText());
            ResultSet rs = pstm.executeQuery();
            if (rs.next()){
                select = "SELECT * FROM marcacoes WHERE n_aluno = ? order by n_marcacao desc";
                pstm.setString(1, hist_n.getText());
                rs = pstm.executeQuery();
                
                DefaultTableModel tm = (DefaultTableModel)Table.getModel();
                tm.setRowCount(0);
                
            while (rs.next()) {
                
                String hora_e = (rs.getString(8).toString().replace(".", ":")+" H");
                String hora_s = (rs.getString(9).toString().replace(".", ":")+" H");
                String hora_marcacao = (rs.getString(11).toString()+" H");
                
                Object dados[] = {rs.getInt(1),rs.getString(10),hora_marcacao,rs.getString(2),rs.getString(6),rs.getString(7),hora_e,hora_s};
                tm.addRow(dados);              
            }
        }else{
                new Aviso_sem_marcacao().setVisible(true);
            }
        } catch (SQLException ex) {
            System.out.println("SQLException "+ex);
        }
    }//GEN-LAST:event_data_n_descActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void decrescenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decrescenteMouseClicked
        
        Connection conn = ligacao.LigacaoBD();
        
        try {
            stmt = conn.createStatement();
            
            rs = stmt.executeQuery("SELECT * FROM marcacoes order by n_marcacao desc");
            if (rs.next()){
                rs = stmt.executeQuery("SELECT * FROM marcacoes order by n_marcacao desc");
                
                DefaultTableModel tm = (DefaultTableModel)Table.getModel();
                tm.setRowCount(0);
                
            while (rs.next()) {
                
                String hora_e = (rs.getString(8).toString().replace(".", ":")+" H");
                String hora_s = (rs.getString(9).toString().replace(".", ":")+" H");
                String hora_marcacao = (rs.getString(11).toString()+" H");
                
                Object dados[] = {rs.getInt(1),rs.getString(10),hora_marcacao,rs.getString(2),rs.getString(6),rs.getString(7),hora_e,hora_s};
                tm.addRow(dados);              
            }
        }else{
                //("--  O aluno ainda não tem nenhuma marcação efetuada!  --");
            }
        } catch (SQLException ex) {
            System.out.println("SQLException "+ex);
        }
        
        
    }//GEN-LAST:event_decrescenteMouseClicked

    private void crescenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crescenteMouseClicked
        Connection conn = ligacao.LigacaoBD();
        
        try {
            stmt = conn.createStatement();
            
            rs = stmt.executeQuery("SELECT * FROM marcacoes order by n_marcacao asc");
            if (rs.next()){
                rs = stmt.executeQuery("SELECT * FROM marcacoes order by n_marcacao asc");
                
                DefaultTableModel tm = (DefaultTableModel)Table.getModel();
                tm.setRowCount(0);
                
            while (rs.next()) {
                
                String hora_e = (rs.getString(8).toString().replace(".", ":")+" H");
                String hora_s = (rs.getString(9).toString().replace(".", ":")+" H");
                String hora_marcacao = (rs.getString(11).toString()+" H");
                
                Object dados[] = {rs.getInt(1),rs.getString(10),hora_marcacao,rs.getString(2),rs.getString(6),rs.getString(7),hora_e,hora_s};
                tm.addRow(dados);               
            }
        }else{
                //("--  O aluno ainda não tem nenhuma marcação efetuada!  --");
            }
        } catch (SQLException ex) {
            System.out.println("SQLException "+ex);
        }
        
    }//GEN-LAST:event_crescenteMouseClicked

    private void n_alunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n_alunoMouseClicked
        
        n_label.setVisible(true);
        hist_n.setVisible(true);
        tr_n.setVisible(true);
        data_n_desc.setVisible(true);
        data_n_cres.setVisible(true);
        data_n_desc.setVisible(true);
        bt_pesq_n1.setVisible(true);
        hist_n.grabFocus();
        
    }//GEN-LAST:event_n_alunoMouseClicked

    private void bt_pesq_n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesq_n1ActionPerformed
        
        Connection conn = ligacao.LigacaoBD();
        
        try {
            stmt = conn.createStatement();
            
            if (hist_n.getText().isEmpty()){

                vazio3.setText("Campo Obrigatório");
                return;
            }
            else{
                
            String select = "SELECT n_aluno FROM alunos WHERE n_aluno = ? ";
            PreparedStatement pstm = conn.prepareStatement(select);
            pstm.setString(1, hist_n.getText());
            ResultSet rs = pstm.executeQuery();
            if (rs.next()){

            select = "SELECT * FROM marcacoes WHERE n_aluno = ? ";
            pstm = conn.prepareStatement(select);
            pstm.setString(1, hist_n.getText());
            rs = pstm.executeQuery();
            if (rs.next()){
                select = "SELECT * FROM marcacoes WHERE n_aluno = ? ";
                pstm = conn.prepareStatement(select);
                pstm.setString(1, hist_n.getText());
                rs = pstm.executeQuery();
                
                DefaultTableModel tm = (DefaultTableModel)Table.getModel();
                tm.setRowCount(0);
                
            while (rs.next()) {
                
                String hora_e = (rs.getString(8).toString().replace(".", ":")+" H");
                String hora_s = (rs.getString(9).toString().replace(".", ":")+" H");
                String hora_marcacao = (rs.getString(11).toString()+" H");
                
                Object dados[] = {rs.getInt(1),rs.getString(10),hora_marcacao,rs.getString(2),rs.getString(6),rs.getString(7),hora_e,hora_s};
                tm.addRow(dados);           
            }
            }else{
                new Aviso_sem_marcacao().setVisible(true);
                }
            }else{
                new Aviso_sem_aluno().setVisible(true);
            }
        }
        } catch (SQLException ex) {
            System.out.println("SQLException "+ex);
        }
        
    }//GEN-LAST:event_bt_pesq_n1ActionPerformed

    private void data_n_cresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_n_cresActionPerformed

        Connection conn = ligacao.LigacaoBD();
        
        try {

            stmt = conn.createStatement();
            
            if(hist_n.getText().isEmpty()){
            
            }
            
            String select = "SELECT * FROM marcacoes WHERE n_aluno = ? order by n_marcacao asc";
            PreparedStatement pstm = conn.prepareStatement(select);
            pstm.setString(1, hist_n.getText());
            ResultSet rs = pstm.executeQuery();
            if (rs.next()){
                select = "SELECT * FROM marcacoes WHERE n_aluno = ? order by n_marcacao asc";
                pstm = conn.prepareStatement(select);
                pstm.setString(1, hist_n.getText());
                rs = pstm.executeQuery();
                
                DefaultTableModel tm = (DefaultTableModel)Table.getModel();
                tm.setRowCount(0);
                
            while (rs.next()) {
                
                String hora_e = (rs.getString(8).toString().replace(".", ":")+" H");
                String hora_s = (rs.getString(9).toString().replace(".", ":")+" H");
                String hora_marcacao = (rs.getString(11).toString()+" H");
                
                Object dados[] = {rs.getInt(1),rs.getString(10),hora_marcacao,rs.getString(2),rs.getString(6),rs.getString(7),hora_e,hora_s};
                tm.addRow(dados);           
            }
        }else{
                new Aviso_sem_marcacao().setVisible(true);
            }
        } catch (SQLException ex) {
            System.out.println("SQLException "+ex);
        }
        
    }//GEN-LAST:event_data_n_cresActionPerformed

    private void eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseClicked
        
        if(Table.getSelectionModel().isSelectionEmpty()){
            return;
        }
        else{
            DefaultTableModel model = (DefaultTableModel)Table.getModel();
            int selectedRowIndex = Table.getSelectedRow();
            id = (Integer) model.getValueAt(selectedRowIndex, 0);
        
            new Pergunta_eliminar().setVisible(true);
            dispose();
        }
        
    }//GEN-LAST:event_eliminarMouseClicked

    private void ativasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ativasMouseClicked
        Connection conn = ligacao.LigacaoBD();
        
        try {
            stmt = conn.createStatement();
            
            String select = "SELECT * FROM marcacoes WHERE flag = ?";
            PreparedStatement pstm = conn.prepareStatement(select);
            pstm.setString(1, "1");
            ResultSet rs = pstm.executeQuery();
            if (rs.next()){
                select = "SELECT * FROM marcacoes WHERE flag = ?";
                pstm = conn.prepareStatement(select);
                pstm.setString(1, "1");
                rs = pstm.executeQuery();
                
                DefaultTableModel tm = (DefaultTableModel)Table.getModel();
                tm.setRowCount(0);
                
            while (rs.next()) {
                
                String hora_e = (rs.getString(8).toString().replace(".", ":")+" H");
                String hora_s = (rs.getString(9).toString().replace(".", ":")+" H");
                String hora_marcacao = (rs.getString(11).toString()+" H");
                
                Object dados[] = {rs.getInt(1),rs.getString(10),hora_marcacao,rs.getString(2),rs.getString(6),rs.getString(7),hora_e,hora_s};
                tm.addRow(dados);               
            }
        }else{
                DefaultTableModel tm = (DefaultTableModel)Table.getModel();
                while(tm.getRowCount() > 0)
                {
                    tm.removeRow(0);
                }
                System.err.println("testestesteste");
            }
        } catch (SQLException ex) {
            System.out.println("SQLException "+ex);
        }
        
    }//GEN-LAST:event_ativasMouseClicked

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
            java.util.logging.Logger.getLogger(Hist_Marcacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hist_Marcacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hist_Marcacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hist_Marcacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hist_Marcacoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JPanel Voltar;
    private javax.swing.JPanel ativas;
    private javax.swing.JButton bt_pesq_n1;
    private javax.swing.JPanel crescente;
    private javax.swing.JButton data_n_cres;
    private javax.swing.JButton data_n_desc;
    private javax.swing.JPanel decrescente;
    private javax.swing.JPanel eliminar;
    private javax.swing.JTextField hist_n;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel n_aluno;
    private javax.swing.JLabel n_label;
    private javax.swing.JSeparator tr_n;
    private javax.swing.JLabel vazio3;
    // End of variables declaration//GEN-END:variables
}
