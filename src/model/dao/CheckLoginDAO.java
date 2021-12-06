package model.dao;

import connection.Conexao;

import view.Principal;


import java.sql.*;
import javax.swing.JOptionPane;
import view.Login;

public class CheckLoginDAO {
	private static String sql;
	 
	
	public CheckLoginDAO() {
		
	 sql = "SELECT * FROM login WHERE usuario=? and senha=?";
	
	}
	public static void fazLogin(String usuario, String senha) {
		try {
			
			Connection con = Conexao.fazConexao();
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, usuario);
			stmt.setString(2, senha);
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				
			Principal principal = new Principal();
				principal.setVisible(true);
							
			} else if(usuario.equals("") || senha.equals("") ) {
				
				JOptionPane.showMessageDialog(null, "Usuário ou Senha estão em branco","Atenção",JOptionPane.INFORMATION_MESSAGE);
				
				Login login = new Login();
					login.setVisible(true);
			}
			else {
				
				JOptionPane.showMessageDialog(null,"Esse usuário não existe","Atenção", JOptionPane.INFORMATION_MESSAGE);
				
				Login login = new Login();
					login.setVisible(true);
			}
			
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
