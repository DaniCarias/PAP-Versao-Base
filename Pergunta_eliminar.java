package com.aerbp_park;

import static com.aerbp_park.Hist_Marcacoes.id;
import static com.aerbp_park.Inicial.arduino;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * @author Daniel Carias
 */
public class Pergunta_eliminar extends javax.swing.JFrame {

    public Pergunta_eliminar() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo_pap_white_v5.png")));
        this.setLocationRelativeTo(null);
        marcacao_id.setText("a marcação de ID "+id+"?");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        pergunta = new javax.swing.JLabel();
        sair = new javax.swing.JLabel();
        bt_nao = new javax.swing.JButton();
        bt_sim = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        marcacao_id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(0, 30, 54));

        pergunta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pergunta.setForeground(new java.awt.Color(204, 204, 255));
        pergunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        sair.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        sair.setForeground(new java.awt.Color(226, 226, 226));
        sair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sair.setText("X");
        sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
        });

        bt_nao.setBackground(new java.awt.Color(48, 78, 104));
        bt_nao.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        bt_nao.setForeground(new java.awt.Color(226, 226, 226));
        bt_nao.setText("NÃO");
        bt_nao.setBorder(null);
        bt_nao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_nao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_naoActionPerformed(evt);
            }
        });

        bt_sim.setBackground(new java.awt.Color(48, 78, 104));
        bt_sim.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        bt_sim.setForeground(new java.awt.Color(226, 226, 226));
        bt_sim.setText("SIM");
        bt_sim.setBorder(null);
        bt_sim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_simActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(226, 226, 226));
        jLabel9.setText("AERBP Park");

        jSeparator2.setBackground(new java.awt.Color(226, 226, 226));
        jSeparator2.setForeground(new java.awt.Color(226, 226, 226));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(226, 226, 226));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tem a certeza que pretende eliminar");

        marcacao_id.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        marcacao_id.setForeground(new java.awt.Color(226, 226, 226));
        marcacao_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        marcacao_id.setText("a marcação de ID ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(bt_nao, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_sim, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pergunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
            .addComponent(marcacao_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(pergunta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(marcacao_id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_nao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_sim, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked
        dispose();
    }//GEN-LAST:event_sairMouseClicked

    private void bt_naoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_naoActionPerformed
        new Hist_Marcacoes().setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_naoActionPerformed

    private void bt_simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_simActionPerformed

        LigacaoBD ligacao = new LigacaoBD(); //liga a ligacao a BD
        Connection conn = ligacao.LigacaoBD();
        
        try{
            
        

        
        /*-------------------------------- AVISO!!!!!! COLOCAR PREPARED STATEMENT ----------------------------*/
        Statement optx = conn.createStatement();
            
            
            
            /*Cria caso não exista a tabela "Marcações"*/
            optx.executeUpdate("create table if not exists marcacoes (n_marcacao int primary key AUTO_INCREMENT, n_aluno varchar(8) NOT NULL, nome varchar(50) NOT NULL, turma varchar(20), marca varchar(20) NOT NULL, matricula varchar(10) NOT NULL, data varchar(25) NOT NULL, hora_entrada Float(8,2), hora_saida Float(8,2) NOT NULL, data_marca VARCHAR(12) NOT NULL, hora_marca VARCHAR(6), flag BOOLEAN NOT NULL, dia_marcacao int(3) NOT NULL, mes_marcacao int(3) NOT NULL, ano_marcacao int(5) NOT NULL)");
            
            

                     
            /*Verifica se a marcação está true*/
            String select = ("SELECT flag from marcacoes WHERE n_marcacao = ?");
            PreparedStatement pstm = conn.prepareStatement(select);
            pstm.setInt(1,id);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                
                boolean flag = rs.getBoolean(1);
                
                if(flag == true){
                
                arduino.send("0");
                System.out.println("enviado arduino para verde!!!");    
                
                String elimina = ("DELETE FROM marcacoes WHERE n_marcacao = ? ");
                pstm = conn.prepareStatement(elimina);
                pstm.setInt(1,id);
                pstm.execute();
        
                System.out.println("Eliminado");
                }
            }
            
            
            String elimina = ("DELETE FROM marcacoes WHERE n_marcacao = ? ");
            pstm = conn.prepareStatement(elimina);
            pstm.setInt(1,id);
            pstm.execute();
        
            System.out.println("Eliminado");
            


        new Hist_Marcacoes().setVisible(true);
        dispose();//fecha a janela
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "O driver de ligação à base de dados não foi encontrado " + ex);
        }
    }//GEN-LAST:event_bt_simActionPerformed

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
            java.util.logging.Logger.getLogger(Pergunta_eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pergunta_eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pergunta_eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pergunta_eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pergunta_eliminar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_nao;
    private javax.swing.JButton bt_sim;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JLabel marcacao_id;
    public static javax.swing.JLabel pergunta;
    private javax.swing.JLabel sair;
    // End of variables declaration//GEN-END:variables
}
