package com.aerbp_park;


import Avisos.Aviso_aluno_mota;
import Avisos.Aviso_aluno_menu;
import Avisos.Aviso_aluno_BD;
import Avisos.Aviso_sem_espaco;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Daniel Carias
 */

public class Inicial extends javax.swing.JFrame {

    /*variaveis globais*/
    static ArduinoSerial arduino = new ArduinoSerial("COM3");
    static String nome;
    static String numero;
    static String turma;
    static String marca;
    static String matricula;
    static String modelo;
    
    
    public Inicial() {
        initComponents();
        
        this.setLocationRelativeTo(null); /*Colocar no centro do ecra*/
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo_pap_white_v5.png"))); /*Colocar img na janela*/
        arduino.initialize();/*Chama a função da class do arduino*/
        
        atualiza_true_false_inicial();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        login_nAluno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bt_Seguinte = new javax.swing.JButton();
        vazio = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel_Preto = new javax.swing.JPanel();
        Marcacoes = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        pesquisa1 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Atualiza = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(198, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 30, 54));
        jLabel1.setText("Nº do Processo");

        login_nAluno.setBackground(new java.awt.Color(198, 255, 255));
        login_nAluno.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        login_nAluno.setForeground(new java.awt.Color(0, 30, 54));
        login_nAluno.setBorder(null);
        login_nAluno.setCaretColor(new java.awt.Color(0, 30, 54));
        login_nAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                login_nAlunoKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 30, 54));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Introduza o nº do processo do aluno");

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

        bt_Seguinte.setBackground(new java.awt.Color(0, 30, 54));
        bt_Seguinte.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        bt_Seguinte.setForeground(new java.awt.Color(226, 226, 226));
        bt_Seguinte.setText("SEGUINTE");
        bt_Seguinte.setBorder(null);
        bt_Seguinte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_Seguinte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_SeguinteActionPerformed(evt);
            }
        });

        vazio.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        vazio.setForeground(new java.awt.Color(0, 30, 54));

        jSeparator3.setBackground(new java.awt.Color(0, 30, 54));
        jSeparator3.setForeground(new java.awt.Color(0, 30, 54));
        jSeparator3.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(404, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(vazio, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_Seguinte, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(login_nAluno, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel2)
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(login_nAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vazio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(bt_Seguinte, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 430, 490));

        jPanel_Preto.setBackground(new java.awt.Color(0, 30, 54));
        jPanel_Preto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Marcacoes.setBackground(new java.awt.Color(48, 78, 104));
        Marcacoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Marcacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MarcacoesMouseClicked(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_report_card_30px.png"))); // NOI18N

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(226, 226, 226));
        jLabel7.setText("MARCAÇÕES");

        javax.swing.GroupLayout MarcacoesLayout = new javax.swing.GroupLayout(Marcacoes);
        Marcacoes.setLayout(MarcacoesLayout);
        MarcacoesLayout.setHorizontalGroup(
            MarcacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MarcacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
        );
        MarcacoesLayout.setVerticalGroup(
            MarcacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel_Preto.add(Marcacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 260, 50));

        jLabel8.setBackground(new java.awt.Color(226, 226, 226));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(226, 226, 226));
        jLabel8.setText("AERBP Park");
        jPanel_Preto.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(226, 226, 226));
        jSeparator2.setForeground(new java.awt.Color(226, 226, 226));
        jPanel_Preto.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 180, 10));

        pesquisa1.setBackground(new java.awt.Color(48, 78, 104));
        pesquisa1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pesquisa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pesquisa1MouseClicked(evt);
            }
        });

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_search_35px.png"))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(226, 226, 226));
        jLabel23.setText("PESQUISAR ALUNO");

        javax.swing.GroupLayout pesquisa1Layout = new javax.swing.GroupLayout(pesquisa1);
        pesquisa1.setLayout(pesquisa1Layout);
        pesquisa1Layout.setHorizontalGroup(
            pesquisa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisa1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pesquisa1Layout.setVerticalGroup(
            pesquisa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel_Preto.add(pesquisa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 260, 50));

        Atualiza.setBackground(new java.awt.Color(48, 78, 104));
        Atualiza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Atualiza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AtualizaMouseClicked(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_update_left_rotation_30px.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(226, 226, 226));
        jLabel11.setText("ATUALIZAR");

        javax.swing.GroupLayout AtualizaLayout = new javax.swing.GroupLayout(Atualiza);
        Atualiza.setLayout(AtualizaLayout);
        AtualizaLayout.setHorizontalGroup(
            AtualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AtualizaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        AtualizaLayout.setVerticalGroup(
            AtualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel_Preto.add(Atualiza, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 260, 50));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_pap (1).png"))); // NOI18N
        jPanel_Preto.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 260, 230));

        getContentPane().add(jPanel_Preto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0); /*Desliga o programa*/
    }//GEN-LAST:event_jLabel3MouseClicked

    private void bt_SeguinteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_SeguinteActionPerformed
        login(); /*Chama a função "Login"*/
    }//GEN-LAST:event_bt_SeguinteActionPerformed

    private void MarcacoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MarcacoesMouseClicked
        new Hist_Marcacoes().setVisible(true);
        dispose(); 
    }//GEN-LAST:event_MarcacoesMouseClicked

    private void pesquisa1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesquisa1MouseClicked
        new Pesquisa().setVisible(true);
        dispose();
    }//GEN-LAST:event_pesquisa1MouseClicked

    private void AtualizaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtualizaMouseClicked
        atualiza_true_false_inicial();
    }//GEN-LAST:event_AtualizaMouseClicked

    /*Clicar no ENTER e é acionado o botão*/
    private void login_nAlunoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_login_nAlunoKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            login();
        }
    }//GEN-LAST:event_login_nAlunoKeyPressed

    public void atualiza_true_false_inicial(){
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
    
    private void login (){
        login_nAluno.grabFocus();

        LigacaoBD ligacao = new LigacaoBD(); //liga a ligacao a BD
        Connection conn = ligacao.LigacaoBD();

        try{

            Statement xpto = null;
            String query_marcacao = null, query_aluno=null, query_motas=null;

            xpto = conn.createStatement();

            java.sql.Statement st = conn.createStatement();

            query_aluno = "create table if not exists alunos (n_aluno varchar(8) NOT NULL primary key, nome varchar(30), turma varchar(20))";
            xpto.executeUpdate(query_aluno);
            // create table if not exists marcacoes (n_marcacao int primary key AUTO_INCREMENT, n_aluno varchar(8) NOT NULL, nome varchar(30), turma varchar(10), marca varchar(20), matricula varchar(10) NOT NULL, data varchar(25) NOT NULL, hora_entrada varchar(8) NOT NULL, hora_saida varchar(8) NOT NULL, lugar varchar(6), data_marca VARCHAR(12), hora_marca VARCHAR(6), flag BOLLEAN)";
            query_marcacao = "create table if not exists marcacoes (n_marcacao int primary key AUTO_INCREMENT, n_aluno varchar(8) NOT NULL, nome varchar(30), turma varchar(10), marca varchar(20), matricula varchar(10) NOT NULL, data varchar(25) NOT NULL, hora_entrada Float(8,2) NOT NULL, hora_saida Float(8,2) NOT NULL, data_marca VARCHAR(12), hora_marca VARCHAR(6), flag BOOLEAN, dia_marcacao int(3), mes_marcacao int(3), ano_marcacao int(5))";
            xpto.executeUpdate(query_marcacao);
            query_motas = "create table if not exists motas (matricula varchar (8) NOT NULL primary key, n_aluno varchar(8), marca varchar(30), modelo varchar(30))";
            xpto.executeUpdate(query_motas);

            if (login_nAluno.getText().isEmpty()){//verificar se a laybel do nº do aluno esta preenchida ou nao
                vazio.setText("Tem de inserir o nº do aluno!");
                return;
            }
            else{//se a laybel tiver preenchida, ver se o nº introduzido existe na BD ou nao

                ResultSet rs = st.executeQuery("SELECT * FROM alunos WHERE n_aluno = '"+ login_nAluno.getText()+"'");
                if (rs.next()){
                    rs = st.executeQuery("SELECT * FROM alunos WHERE n_aluno = '"+ login_nAluno.getText()+"'");
                    while (rs.next()){
                        numero = rs.getString(1);
                        nome = rs.getString(2);
                        turma = rs.getString(3);

                        rs = st.executeQuery("SELECT * FROM motas WHERE n_aluno = '"+ login_nAluno.getText()+"'");
                        if(rs.next()){
                            rs = st.executeQuery("SELECT * FROM motas WHERE n_aluno = '"+ login_nAluno.getText()+"'");
                            while (rs.next()){
                                matricula = rs.getString(1);
                                marca = rs.getString(3);
                                modelo = rs.getString(4);
                            }

                            Aviso_aluno_menu aviso_aluno_reg = new Aviso_aluno_menu();
                            aviso_aluno_reg.setVisible(true);
                            dispose();//fecha a janela inicial
                        }else{

                            Aviso_aluno_mota aviso_aluno_mota = new Aviso_aluno_mota();
                            aviso_aluno_mota.setVisible(true);
                            dispose();//fecha a janela inicial
                        }
                    }

                }else{

                    Aviso_aluno_BD aviso_aluno_BD = new Aviso_aluno_BD();
                    aviso_aluno_BD.setVisible(true);
                    dispose();//fecha a janela inicial
                }

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
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Atualiza;
    private javax.swing.JPanel Marcacoes;
    private javax.swing.JButton bt_Seguinte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Preto;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public static javax.swing.JTextField login_nAluno;
    private javax.swing.JPanel pesquisa1;
    private javax.swing.JLabel vazio;
    // End of variables declaration//GEN-END:variables
}
