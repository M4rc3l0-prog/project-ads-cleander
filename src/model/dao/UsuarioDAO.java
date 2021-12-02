package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import connection.ConnectionFactory;
import model.entities.Usuario;

public class UsuarioDAO {
	

	public void creat (Usuario usuario) {
	  Connection con = ConnectionFactory.getConnection();
      
      PreparedStatement stmt = null;

      try {
          stmt = con.prepareStatement("INSERT INTO usuario (login,senha)VALUES(?,?)");
          stmt.setString(1, usuario.getLogin());
          stmt.setString(2, usuario.getSenha());
        
       
          stmt.executeUpdate();

          JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
      } catch (SQLException ex) {
          System.out.println(ex);
      } finally {
          ConnectionFactory.closeConnection(con, stmt);
      }


}
	
	public boolean checklogin(String login, String senha ) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        boolean check = false; 

  

        try {
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE login = ? and senha = ? ");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();

            if (rs.next()) {

            	check = true;
        
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;

    }

}
