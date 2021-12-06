package model.dao;

import java.sql.*;


import javax.swing.JOptionPane;

import connection.Conexao;

public class UsuarioDAO {
	
	private static String sql;
	private static String checkUsuario;
	
	public UsuarioDAO() {
		
		sql = "INSERT INTO login(usuario,senha) VALUES (?,?)";
		checkUsuario = "SELECT * FROM login WHERE usuario=?";
	}
	
	public static void registrarUsuario(String usuario, String senha) {
		try {
			
			Connection con = Conexao.fazConexao();
			
			PreparedStatement stmt = con.prepareStatement(sql);
			PreparedStatement check = con.prepareStatement(checkUsuario);
			
			stmt.setString(1, usuario);
			stmt.setString(2, senha);
			
			check.setString(1, usuario);
			ResultSet rs = check.executeQuery();
			
			if(rs.next()) {
				JOptionPane.showMessageDialog(null, "Usuário já existe","Usuário",JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				stmt.execute();
				JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!","Sucesso",JOptionPane.INFORMATION_MESSAGE);
			}
							
			stmt.close();
			con.close();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
