package com.aerbp_park;


import Avisos.Aviso_aluno_mota;
import Avisos.Aviso_marcacao_existente;
import Avisos.Aviso_sem_espaco;
import static com.aerbp_park.Inicial.arduino;
import static com.aerbp_park.Inicial.marca;
import static com.aerbp_park.Inicial.matricula;
import static com.aerbp_park.Inicial.nome;
import static com.aerbp_park.Inicial.numero;
import static com.aerbp_park.Inicial.turma;
import java.awt.Color;
import java.awt.Toolkit;
import static java.lang.Boolean.TRUE;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Daniel Carias
 */

public class Menu extends javax.swing.JFrame {
    
    public Menu() {
        
        initComponents();

        arduino.initialize();

        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo_pap_white_v5.png")));
        this.setLocationRelativeTo(null);
        
        menu_Nome.setText(nome);
        menu_nAluno.setText(numero);
        menu_Turma.setText(turma);
        matricula_Menu.setText(matricula);
        menu_Marca.setText(marca);
        
        
        Tabel.getTableHeader().setBackground(new Color(204,204,255));
        Tabel.getTableHeader().setOpaque(false);
        Tabel.getTableHeader().setForeground(new Color(32,33,35));
        

        LigacaoBD ligacao = new LigacaoBD();
        Connection conn = ligacao.LigacaoBD();
        try {
            
            String select = "SELECT * FROM marcacoes WHERE n_aluno = ?";
            PreparedStatement pstm = conn.prepareStatement(select);
            pstm.setString(1, menu_nAluno.getText());
            ResultSet rs = pstm.executeQuery();
            if (rs.next()){
                
                select = "SELECT * FROM marcacoes WHERE n_aluno = ?";
                pstm.setString(1, menu_nAluno.getText());
                rs = pstm.executeQuery();
                        
                DefaultTableModel tm = (DefaultTableModel)Tabel.getModel();
                tm.setRowCount(0);
                
            while (rs.next()) {
                
                String hora_e = (rs.getString(8).toString().replace(".", ":")+"H");
                String hora_s = (rs.getString(9).toString().replace(".", ":")+"H");
                String hora = (rs.getString(11).toString().replace(".", ":")+"H");
                
                Object dados[] = {rs.getInt(1),rs.getString(10),hora,rs.getString(2),rs.getString(6),rs.getString(7),hora_e,hora_s};
                tm.addRow(dados);           

            }
        }else{
                //O aluno ainda não tem nenhuma marcação efetuada!
            }

        } catch (SQLException ex) {
            System.out.println("SQLException "+ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Sair = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        menu_Marca = new javax.swing.JTextField();
        menu_nAluno = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        menu_Nome = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        menu_Turma = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        matricula_Menu = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        bt_Efetuar_Marcacao = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        menu_data = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        menu_hora_entrada = new javax.swing.JComboBox<>();
        menu_hora_saida = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        altera_dados = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mudar_mota = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        mudar_aluno = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(198, 255, 255));

        Sair.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Sair.setForeground(new java.awt.Color(48, 78, 104));
        Sair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sair.setText("X");
        Sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SairMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 30, 54));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("MENU");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 30, 54));
        jLabel2.setText("Marca");

        jSeparator1.setBackground(new java.awt.Color(0, 30, 54));
        jSeparator1.setForeground(new java.awt.Color(0, 30, 54));
        jSeparator1.setOpaque(true);

        menu_Marca.setEditable(false);
        menu_Marca.setBackground(new java.awt.Color(198, 255, 255));
        menu_Marca.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        menu_Marca.setForeground(new java.awt.Color(0, 30, 54));
        menu_Marca.setBorder(null);
        menu_Marca.setCaretColor(new java.awt.Color(0, 30, 54));
        menu_Marca.setDisabledTextColor(new java.awt.Color(0, 30, 54));
        menu_Marca.setDragEnabled(true);

        menu_nAluno.setEditable(false);
        menu_nAluno.setBackground(new java.awt.Color(198, 255, 255));
        menu_nAluno.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        menu_nAluno.setForeground(new java.awt.Color(0, 30, 54));
        menu_nAluno.setBorder(null);
        menu_nAluno.setCaretColor(new java.awt.Color(0, 30, 54));

        jSeparator3.setBackground(new java.awt.Color(0, 30, 54));
        jSeparator3.setForeground(new java.awt.Color(0, 30, 54));
        jSeparator3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jSeparator3.setOpaque(true);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 30, 54));
        jLabel8.setText("Nº do Processo");

        menu_Nome.setEditable(false);
        menu_Nome.setBackground(new java.awt.Color(198, 255, 255));
        menu_Nome.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        menu_Nome.setForeground(new java.awt.Color(0, 30, 54));
        menu_Nome.setBorder(null);
        menu_Nome.setCaretColor(new java.awt.Color(0, 30, 54));

        jSeparator4.setBackground(new java.awt.Color(0, 30, 54));
        jSeparator4.setForeground(new java.awt.Color(0, 30, 54));
        jSeparator4.setOpaque(true);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 30, 54));
        jLabel11.setText("Nome");

        menu_Turma.setEditable(false);
        menu_Turma.setBackground(new java.awt.Color(198, 255, 255));
        menu_Turma.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        menu_Turma.setForeground(new java.awt.Color(0, 30, 54));
        menu_Turma.setBorder(null);
        menu_Turma.setCaretColor(new java.awt.Color(0, 30, 54));

        jSeparator5.setBackground(new java.awt.Color(0, 30, 54));
        jSeparator5.setForeground(new java.awt.Color(0, 30, 54));
        jSeparator5.setOpaque(true);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 30, 54));
        jLabel12.setText("Turma");

        matricula_Menu.setEditable(false);
        matricula_Menu.setBackground(new java.awt.Color(198, 255, 255));
        matricula_Menu.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        matricula_Menu.setForeground(new java.awt.Color(0, 30, 54));
        matricula_Menu.setBorder(null);
        matricula_Menu.setCaretColor(new java.awt.Color(0, 30, 54));

        jSeparator6.setBackground(new java.awt.Color(0, 30, 54));
        jSeparator6.setForeground(new java.awt.Color(0, 30, 54));
        jSeparator6.setOpaque(true);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 30, 54));
        jLabel13.setText("Matricula");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 30, 54));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("HISTÓRICO DO ALUNO");

        bt_Efetuar_Marcacao.setBackground(new java.awt.Color(0, 30, 54));
        bt_Efetuar_Marcacao.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        bt_Efetuar_Marcacao.setForeground(new java.awt.Color(226, 226, 226));
        bt_Efetuar_Marcacao.setText("EFETUAR MARCAÇÃO");
        bt_Efetuar_Marcacao.setBorder(null);
        bt_Efetuar_Marcacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Efetuar_MarcacaoActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 30, 54));
        jLabel15.setText("Data");

        menu_data.setBackground(new java.awt.Color(198, 255, 255));
        menu_data.setForeground(new java.awt.Color(198, 255, 255));
        menu_data.setToolTipText("");
        menu_data.setDateFormatString("d MMMMM, yyyy"); // NOI18N
        menu_data.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        menu_data.setOpaque(false);

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 30, 54));
        jLabel17.setText("Hora de entrada");

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 30, 54));
        jLabel18.setText("Hora de saida");

        menu_hora_entrada.setBackground(new java.awt.Color(198, 255, 255));
        menu_hora_entrada.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        menu_hora_entrada.setForeground(new java.awt.Color(198, 255, 255));
        menu_hora_entrada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00 H", "08:30 H", "09:00 H", "09:30 H", "10:00 H", "10:30 H", "11:00 H", "11:30 H", "12:00 H", "12:30 H", "13:00 H", "13:30 H", "14:00 H", "14:30 H", "15:00 H", "15:30 H", "16:00 H", "16:30 H", "17:00 H", "17:30 H", "18:00 H", "18:30 H" }));

        menu_hora_saida.setBackground(new java.awt.Color(198, 255, 255));
        menu_hora_saida.setEditable(true);
        menu_hora_saida.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        menu_hora_saida.setForeground(new java.awt.Color(198, 255, 255));
        menu_hora_saida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:30 H", "09:00 H", "09:30 H", "10:00 H", "10:30 H", "11:00 H", "11:30 H", "12:00 H", "12:30 H", "13:00 H", "13:30 H", "14:00 H", "14:30 H", "15:00 H", "15:30 H", "16:00 H", "16:30 H", "17:00 H", "17:30 H", "18:00 H", "18:30 H" }));

        jScrollPane1.setBackground(new java.awt.Color(32, 33, 35));
        jScrollPane1.setForeground(new java.awt.Color(32, 33, 35));

        Tabel.setBackground(new java.awt.Color(0, 30, 54));
        Tabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Tabel.setForeground(new java.awt.Color(226, 226, 226));
        Tabel.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID MARCAÇÃO", "DATA MARCAÇÃO", "HORA MARCAÇÃO", "Nº ALUNO", "MATRICULA", "DATA", "HORA ENTRADA", "HORA SAÍDA"
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
            Tabel.getColumnModel().getColumn(1).setPreferredWidth(90);
            Tabel.getColumnModel().getColumn(2).setResizable(false);
            Tabel.getColumnModel().getColumn(2).setPreferredWidth(90);
            Tabel.getColumnModel().getColumn(3).setResizable(false);
            Tabel.getColumnModel().getColumn(4).setResizable(false);
            Tabel.getColumnModel().getColumn(5).setResizable(false);
            Tabel.getColumnModel().getColumn(6).setPreferredWidth(80);
        }

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 30, 54));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("MARCAÇÃO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bt_Efetuar_Marcacao, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSeparator5)
                                            .addComponent(menu_Turma)
                                            .addComponent(jSeparator4)
                                            .addComponent(menu_Nome)
                                            .addComponent(jSeparator1)
                                            .addComponent(menu_Marca)
                                            .addComponent(jSeparator3)
                                            .addComponent(menu_nAluno)
                                            .addComponent(matricula_Menu)
                                            .addComponent(jSeparator6)
                                            .addComponent(menu_data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(menu_hora_entrada, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(menu_hora_saida, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel19))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(menu_nAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(menu_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(menu_Turma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(matricula_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(menu_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(menu_data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(menu_hora_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(menu_hora_saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(bt_Efetuar_Marcacao, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 1370, 900));

        jPanel2.setBackground(new java.awt.Color(0, 30, 54));

        jSeparator2.setBackground(new java.awt.Color(226, 226, 226));
        jSeparator2.setForeground(new java.awt.Color(226, 226, 226));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(226, 226, 226));
        jLabel9.setText("AERBP Park");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_edit_property_100px.png"))); // NOI18N

        altera_dados.setBackground(new java.awt.Color(48, 78, 104));
        altera_dados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        altera_dados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                altera_dadosMouseClicked(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_edit_30px.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(226, 226, 226));
        jLabel5.setText("ALTERAR DADOS");

        javax.swing.GroupLayout altera_dadosLayout = new javax.swing.GroupLayout(altera_dados);
        altera_dados.setLayout(altera_dadosLayout);
        altera_dadosLayout.setHorizontalGroup(
            altera_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(altera_dadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        altera_dadosLayout.setVerticalGroup(
            altera_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mudar_mota.setBackground(new java.awt.Color(48, 78, 104));
        mudar_mota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mudar_mota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mudar_motaMouseClicked(evt);
            }
        });

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_change_30px.png"))); // NOI18N

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(226, 226, 226));
        jLabel25.setText("MUDAR MOTA");

        javax.swing.GroupLayout mudar_motaLayout = new javax.swing.GroupLayout(mudar_mota);
        mudar_mota.setLayout(mudar_motaLayout);
        mudar_motaLayout.setHorizontalGroup(
            mudar_motaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mudar_motaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mudar_motaLayout.setVerticalGroup(
            mudar_motaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mudar_aluno.setBackground(new java.awt.Color(48, 78, 104));
        mudar_aluno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mudar_aluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mudar_alunoMouseClicked(evt);
            }
        });

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_change_30px.png"))); // NOI18N

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(226, 226, 226));
        jLabel27.setText("MUDAR ALUNO");

        javax.swing.GroupLayout mudar_alunoLayout = new javax.swing.GroupLayout(mudar_aluno);
        mudar_aluno.setLayout(mudar_alunoLayout);
        mudar_alunoLayout.setHorizontalGroup(
            mudar_alunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mudar_alunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mudar_alunoLayout.setVerticalGroup(
            mudar_alunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mudar_aluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mudar_mota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(altera_dados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mudar_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(mudar_mota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(altera_dados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_Efetuar_MarcacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Efetuar_MarcacaoActionPerformed

        try {
            LigacaoBD ligacao = new LigacaoBD(); 
            Connection conn = ligacao.LigacaoBD();
            
            SimpleDateFormat dcn = new SimpleDateFormat("dd-MM-YYYY");
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            SimpleDateFormat ano = new SimpleDateFormat("YYYY");
            SimpleDateFormat mes = new SimpleDateFormat("MM");
            SimpleDateFormat dia = new SimpleDateFormat("dd");
            
            String query = "create table if not exists marcacoes (n_marcacao int primary key AUTO_INCREMENT, n_aluno varchar(8) NOT NULL, nome varchar(30), turma varchar(10), marca varchar(20), matricula varchar(10) NOT NULL, data varchar(25), hora_entrada varchar (8), hora_saida varchar (8), lugar varchar(6))";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.execute();

            //ANO
            String ano_BD = ano.format(menu_data.getDate()).toString();
            int ano_BD_1 = Integer.parseInt(ano_BD);
                
            //MES
            String mes_BD = mes.format(menu_data.getDate()).toString();
            int mes_BD_1 = Integer.parseInt(mes_BD);

            //DIA
            String dia_BD = dia.format(menu_data.getDate()).toString();
            int dia_BD_1 = Integer.parseInt(dia_BD);

            
            //Remover ":" e alterar para "." e tirar o "H"
            String hora_sair = menu_hora_saida.getSelectedItem().toString().replace(":", ".").replace(" H","");
            //Remover ":" e alterar para "." e tirar o "H"
            String hora_entrar = menu_hora_entrada.getSelectedItem().toString().replace(":", ".").replace(" H","");

            
            
            //Ve quantas flags estam ativas dps de passar no "filtro" (atualiza_true_false_menu())
            ResultSet rs = pstm.executeQuery("SELECT count(*) from marcacoes WHERE flag = TRUE");
            rs.next();
            int count_true_1 = rs.getInt(1);
            
            if(count_true_1>=5){
                new Aviso_sem_espaco().setVisible(true);
                dispose();
            }
            else{
            
            System.out.println("Numero de colunas q têm flag TRUE: "+count_true_1);
            
            
            //Ve quantas flags estam FALSE antes de passar no "filtro" (atualiza_true_false_menu())
            rs = pstm.executeQuery("SELECT count(*) from marcacoes WHERE flag = FALSE");
            rs.next();
            long count_false_1 = rs.getLong(1);
            System.out.println("Numero de colunas q têm flag FALSE, antes: "+count_false_1);
            
            
            //verificar se o aluno já tem marcacao para o dia que pretende efetuar a marcação            
            /*String select = "SELECT hora_saida from marcacoes WHERE n_aluno = ? and data = ?";
            pstm = conn.prepareStatement(select);
            pstm.setString(1, menu_nAluno.getText());
            pstm.setString(2, dcn.format(menu_data.getDate()).toString());
            rs = pstm.executeQuery();
            float hora_saida_ = rs.getFloat(1);
            if(rs.next() && hora_saida_ >= Float.parseFloat(sdf.format(new Date()).replace(":", "."))){
                
                    new Aviso_marcacao_existente().setVisible(true);
                    dispose();

            }else{*/
 
            String marcacao = "INSERT INTO marcacoes (n_marcacao, n_aluno, nome, turma, marca, matricula, data, hora_entrada, hora_saida, data_marca, hora_marca, flag, dia_marcacao, mes_marcacao, ano_marcacao) VALUES (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pstm = conn.prepareStatement(marcacao);
            pstm.setString (1,menu_nAluno.getText());                       //nº aluno
            pstm.setString (2,menu_Nome.getText());                         //nome nome
            pstm.setString (3,menu_Turma.getText());                        //turma aluno
            pstm.setString (4,menu_Marca.getText());                        //marca da mota
            pstm.setString (5,matricula_Menu.getText());                    //matricula da mota
            pstm.setString (6,dcn.format(menu_data.getDate()).toString());  //data para a marcacao
            pstm.setFloat (7,Float.parseFloat(hora_entrar));                //hora de entrada da mota
            pstm.setFloat (8,Float.parseFloat(hora_sair));                  //hora de saida da mota
            pstm.setString (9,dcn.format(new Date()));                      //data que foi efetuada a marcacao
            pstm.setString (10,sdf.format(new Date()));                     //hora que foi efetuada a marcacao
            pstm.setBoolean (11,TRUE);                                      //flag 
            pstm.setInt (12,dia_BD_1);                                      //dia para a marcacao
            pstm.setInt (13,mes_BD_1);                                      //mes para a marcacao
            pstm.setInt (14,ano_BD_1);                                      //ano para a marcacao
            pstm.executeUpdate();
            System.out.println("Marcacao efetuada!");
            
            
            //confirma as flags true e false e muda caso não estejam dentro dos parametros
            atualiza_true_false_menu();
            
            
            /*             USAR PREPARED STATEMENT NO CODIGO ABAIXO         */
            //Ve quantas flags estam TRUE dps de ter efetuadoa a marcacao e passado pelo "filtro"
            rs = pstm.executeQuery("SELECT count(*) from marcacoes WHERE flag = TRUE");
            rs.next();
            long count_true_2 = rs.getLong(1);
            System.out.println("Numero de colunas q têm flag TRUE: "+count_true_2);
            //analisa para ver se ha novas marcacoes TRUE
            long count_true = count_true_2 - count_true_1;
            
            //Se houver novas marcacoes TRUE manda esse nº de novas marcacoes para o arduino ligar esse mesmo nº de leds 
            for (int i = 0; i < count_true; i++){
                arduino.send("1");
                System.out.println("enviado arduino para vermelho!!!");
            }
            
            
            /*             USAR PREPARED STATEMENT NO CODIGO ABAIXO         */
            //Ve quantas flags estam FALSE dps de ter efetuadoa a marcacao e passado pelo "filtro"
            rs = pstm.executeQuery("SELECT count(*) from marcacoes WHERE flag = FALSE");
            rs.next();
            long count_false_2 = rs.getLong(1);
            System.out.println("Numero de colunas q têm flag FALSE: "+count_false_2);
            //analisa para ver se ha novas marcacoes FALSE
            long count_false = count_false_2 - count_false_1;
            //Se houver novas marcacoes FALSE manda esse nº de novas marcacoes para o arduino desliga esse mesmo nº de leds 
            for (int i = 0; i < count_false; i++){
                arduino.send("0");
                System.out.println("enviado arduino para verde!!!");    
            }

            new Sucesso().setVisible(true);//Mostra a Jframe "Sucesso"
            dispose();
            
            }
            //}
            
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "O driver de ligação à base de dados não foi encontrado " + ex);
        }
    }//GEN-LAST:event_bt_Efetuar_MarcacaoActionPerformed

    private void altera_dadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_altera_dadosMouseClicked
        new Alterar_dados().setVisible(true);
        dispose();//fecha a janela
    }//GEN-LAST:event_altera_dadosMouseClicked

    private void mudar_motaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mudar_motaMouseClicked
        new Altera_Motociclo().setVisible(true);
        dispose();//fecha a janela
    }//GEN-LAST:event_mudar_motaMouseClicked

    private void mudar_alunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mudar_alunoMouseClicked
        new Inicial().setVisible(true);
        dispose();//fecha a janela
    }//GEN-LAST:event_mudar_alunoMouseClicked

    private void SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseClicked
        System.exit(1);
    }//GEN-LAST:event_SairMouseClicked

    public void atualiza_true_false_menu(){
        LigacaoBD ligacao = new LigacaoBD();
        Connection conn = ligacao.LigacaoBD();
        try {
            Statement optx = conn.createStatement();
            
            /*Cria os vários tipos de formatação de dados*/
            SimpleDateFormat dcn = new SimpleDateFormat("dd-MM-YYYY");
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            SimpleDateFormat ano = new SimpleDateFormat("YYYY");
            SimpleDateFormat mes = new SimpleDateFormat("MM");
            SimpleDateFormat dia = new SimpleDateFormat("dd");
            
            /*Cria caso não exista a tabela "Marcações"*/
            optx.executeUpdate("create table if not exists marcacoes (n_marcacao int primary key AUTO_INCREMENT, n_aluno varchar(8) NOT NULL, nome varchar(50) NOT NULL, turma varchar(20), marca varchar(20) NOT NULL, matricula varchar(10) NOT NULL, data varchar(25) NOT NULL, hora_entrada Float(8,2), hora_saida Float(8,2) NOT NULL, data_marca VARCHAR(12) NOT NULL, hora_marca VARCHAR(6), flag BOOLEAN NOT NULL, dia_marcacao int(3) NOT NULL, mes_marcacao int(3) NOT NULL, ano_marcacao int(5) NOT NULL)");
            
            /*Hora atual (usada para comparar)*/
            String hora_pc = sdf.format(new Date()).toString().replace(":", ".");
            float hora_pc1 = Float.parseFloat(hora_pc);

            /*Dia de hoje e de amanhã(usado para comparar)*/
            String dia_ = dia.format(new Date()).toString();
            int dia_amh = Integer.parseInt(dia_) + 1;
            
            
            /*Verifica quantas flags estam TRUE antes de passar no "filtro" (atualiza_true_false_menu())*/
            String col_true_ant = "SELECT count(*) from marcacoes WHERE flag = ?";
            PreparedStatement pstm = conn.prepareStatement(col_true_ant);
            pstm.setString(1, "TRUE");
            ResultSet rs = pstm.executeQuery();
            rs.next();
            long count_true_1 = rs.getLong(1);
            System.out.println("Numero de colunas q têm flag TRUE, antes: "+count_true_1);
            
            
            //Verifica quantas flags estam FALSE antes de passar no "filtro" (atualiza_true_false_menu())
            String col_false_ant = "SELECT count(*) from marcacoes WHERE flag = ?";
            pstm = conn.prepareStatement(col_false_ant);
            pstm.setString(1, "FALSE");
            rs = pstm.executeQuery();
            rs.next();
            long count_false_1 = rs.getLong(1);
            System.out.println("Numero de colunas q têm flag FALSE, antes: "+count_false_1);
            
            
            /*                                            FILTRO                                                                                     */
            /*MUDAR PARA FALSE TODAS AS FLAGS DO FUTURO (dia a seguir ou mais, dentro do mesmo ano e mês)*/
            String up_data_fut = "UPDATE marcacoes set flag = ? WHERE flag = ? AND ano_marcacao = ? AND mes_marcacao = ? AND dia_marcacao > ?";
            pstm = conn.prepareStatement(up_data_fut);
            pstm.setBoolean(1, false);
            pstm.setBoolean(2, true);
            pstm.setString(3, ano.format(new Date()));
            pstm.setString(4, mes.format(new Date()));
            pstm.setString(5, dia.format(new Date()));       
            pstm.executeUpdate();  
            
            /*MUDAR PARA FALSE TODAS AS FLAGS DO FUTURO (proximo mês)*/
            String up_data_fut_ = "UPDATE marcacoes set flag = ? WHERE flag = ? AND ano_marcacao = ? AND mes_marcacao > ?";
            pstm = conn.prepareStatement(up_data_fut_);
            pstm.setBoolean(1, false);
            pstm.setBoolean(2, true);
            pstm.setString(3, ano.format(new Date()));
            pstm.setString(4, mes.format(new Date()));
            pstm.executeUpdate();
            
            /*MUDAR PARA FALSE TODAS AS FLAGS DO FUTURO (proximo ano)*/
            String up_data_fut_1 = "UPDATE marcacoes set flag = ? WHERE flag = ? AND ano_marcacao > ?";
            pstm = conn.prepareStatement(up_data_fut_1);
            pstm.setBoolean(1, false);
            pstm.setBoolean(2, true);
            pstm.setString(3, ano.format(new Date()));
            pstm.executeUpdate();

            /*MUDAR PARA TRUE TODAS AS MARCAOES DE AMANHA, CASO JA PASSE DAS 18*/
            String up_data_fut_2 = "UPDATE marcacoes set flag = ? WHERE flag = ? AND ano_marcacao = ? AND mes_marcacao = ? AND dia_marcacao = ? AND ? >= 18";
            pstm = conn.prepareStatement(up_data_fut_2);
            pstm.setBoolean(1, true);
            pstm.setBoolean(2, false);
            pstm.setString(3, ano.format(new Date()));
            pstm.setString(4, mes.format(new Date()));
            pstm.setInt(5, dia_amh);  
            pstm.setFloat(6, hora_pc1);
            pstm.executeUpdate();
                
            /*MUDAR PARA TRUE TODAS AS MARCAOES DO DIA, CASO AINDA NÂO TENHA PASSADO DAS HORAS DE SAIDA (serve para assegurar o codigo em cima)*/
            String up_data_fut_3 = "UPDATE marcacoes set flag = ? WHERE flag = ? AND data = ? AND hora_saida > ?";
            pstm = conn.prepareStatement(up_data_fut_3);
            pstm.setBoolean(1, true);
            pstm.setBoolean(2, false);
            pstm.setString(3, dcn.format(new Date()));
            pstm.setFloat(4, hora_pc1);  
            pstm.executeUpdate();
                
            /*MUDAR PARA FALSE TODAS AS FLAGS DE HOJE, QUE JÁ TENHAM PASSADO DA HORA DE SAIDA*/
            String up_data_fut_4 = "UPDATE marcacoes set flag = ? WHERE flag = ? AND data = ? AND hora_saida < ?";
            pstm = conn.prepareStatement(up_data_fut_4);
            pstm.setBoolean(1, false);
            pstm.setBoolean(2, true);
            pstm.setString(3, dcn.format(new Date()));
            pstm.setFloat(4, hora_pc1);
            pstm.executeUpdate();
            
            /*MUDAR PARA FALSE TODAS AS FLAGS ANTIGAS DO MESMO MES E ANO (serve para assegurar o codigo a cima)*/
            String up_data_fut_5 = "UPDATE marcacoes set flag = ? WHERE flag = ? AND ano_marcacao = ? AND mes_marcacao = ? AND dia_marcacao < ?";
            pstm = conn.prepareStatement(up_data_fut_5);
            pstm.setBoolean(1, false);
            pstm.setBoolean(2, true);
            pstm.setString(3, ano.format(new Date()));
            pstm.setString(4, mes.format(new Date()));
            pstm.setString(5, dia.format(new Date()));   
            pstm.executeUpdate();
            
            /*MUDAR PARA FALSE TODAS AS FLAGS DO ANO PASSADO (serve para assegurar o codigo a cima)*/
            String up_data_fut_6 = "UPDATE marcacoes set flag = ? WHERE flag = ? AND ano_marcacao < ?";
            pstm = conn.prepareStatement(up_data_fut_6);
            pstm.setBoolean(1, false);
            pstm.setBoolean(2, true);
            pstm.setString(3, ano.format(new Date()));
            pstm.executeUpdate();
            
            /*MUDAR PARA FALSE TODAS AS FLAGS DO MES PASSADO (serve para assegurar o codigo a cima)*/
            String up_data_fut_7 = "UPDATE marcacoes set flag = ? WHERE flag = ? AND mes_marcacao < ?";
            pstm = conn.prepareStatement(up_data_fut_7);
            pstm.setBoolean(1, false);
            pstm.setBoolean(2, true);
            pstm.setString(3, mes.format(new Date()));
            pstm.executeUpdate();
            
            
            /*Verifica quantas flags estam TRUE depois de ter passado pelo "filtro"*/
            String col_true_dps = "SELECT count(*) from marcacoes WHERE flag = ?";
            pstm = conn.prepareStatement(col_true_dps);
            pstm.setString(1, "TRUE");
            rs = pstm.executeQuery();
            rs.next();
            long count_true_2 = rs.getLong(1);
            System.out.println("Numero de colunas q têm flag TRUE: "+count_true_2);
            /*Faz a diferença entre as flags que existiam e as atuais para ver se há novas marcacoes TRUE*/
            long count_true = count_true_2 - count_true_1;
            
            /*O nº 5 simboliza o nº de lugares*/
            if(count_true>5){
                new Aviso_sem_espaco().setVisible(true);
                dispose();
            }
            else{
            //Se houver novas marcacoes TRUE manda esse nº de novas marcacoes para o arduino ligar esse mesmo nº de leds 
            for (int i = 0; i < count_true; i++){
                arduino.send("1");
                System.out.println("enviado arduino para vermelho!!!");
            }
            }
            
            //Ve quantas flags estam FALSE dps de ter efetuadoa a marcacao e passado pelo "filtro"
            String col_false_dps = "SELECT count(*) from marcacoes WHERE flag = ?";
            pstm = conn.prepareStatement(col_false_dps);
            pstm.setString(1, "FALSE");
            rs = pstm.executeQuery();
            rs.next();
            long count_false_2 = rs.getLong(1);
            System.out.println("Numero de colunas q têm flag FALSE: "+count_false_2);
            //analisa para ver se ha novas marcacoes FALSE
            long count_false = count_false_2 - count_false_1;
            //Se houver novas marcacoes FALSE manda esse nº de novas marcacoes para o arduino desliga esse mesmo nº de leds 
            for (int i = 0; i < count_false; i++){
                arduino.send("0");
                System.out.println("enviado arduino para verde!!!");    
            }

        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "O driver de ligação à base de dados não foi encontrado " + ex);
        }
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Sair;
    private javax.swing.JTable Tabel;
    private javax.swing.JPanel altera_dados;
    private javax.swing.JButton bt_Efetuar_Marcacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    public static javax.swing.JTextField matricula_Menu;
    public static javax.swing.JTextField menu_Marca;
    public static javax.swing.JTextField menu_Nome;
    public static javax.swing.JTextField menu_Turma;
    public static com.toedter.calendar.JDateChooser menu_data;
    public static javax.swing.JComboBox<String> menu_hora_entrada;
    public static javax.swing.JComboBox<String> menu_hora_saida;
    public static javax.swing.JTextField menu_nAluno;
    private javax.swing.JPanel mudar_aluno;
    private javax.swing.JPanel mudar_mota;
    // End of variables declaration//GEN-END:variables
}
