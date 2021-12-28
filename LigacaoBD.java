package com.aerbp_park;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author Daniel Carias
 */
public class LigacaoBD {
    
    public Connection LigacaoBD(){
        
        Connection con = null; //variavel do tipo connection
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/aerbp_park","root",""); //ligacao a BD (pap)
            //con=DriverManager.getConnection("jdbc:mysql://localhost/pap","root",""); //ligacao a BD (pap) 
            System.out.println("Ligacao efetuada com sucesso"); //feito para teste e para ter a certeza que liga a base de dados
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao aceder ao servidor. Verifique se esta ligado ou se tem DRIVERS "+ex);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro verifique os dados "+ex); //nao existe BD 
        }

        return con;
    }
    
    //metodo que fecha a ligacao a BD
    public void FechaLigacao(Connection xpto){
        try{
            xpto.close();
            System.out.println("Ligacao fechada com sucesso"); //so e feito para testes
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao fechas o servidor"+ex);
        }
        
    }

}