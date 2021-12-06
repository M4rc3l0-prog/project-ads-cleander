package model.dao;

import java.sql.*;


import javax.swing.JOptionPane;

import connection.Conexao;
import model.entities.UsuarioDados;
public class UsuarioDAO {
	
	private static String sql;
	private static String checkUsuario;
	
	public UsuarioDAO() {
		
		sql = "INSERT INTO login(usuario,senha) VALUES (?,?)";
		checkUsuario = "SELECT * FROM login WHERE usuario=?";
	}
	
	public static void registrarUsuario(UsuarioDados usuarioDados) {
		
		try {
			
			Connection con = Conexao.fazConexao();
			
			PreparedStatement stmt = con.prepareStatement(sql);
			PreparedStatement check = con.prepareStatement(checkUsuario);
			
			stmt.setString(1, usuarioDados.getUsuario());
			stmt.setString(2, usuarioDados.getSenha());
			
			
			System.out.println(usuarioDados.getUsuario());
			System.out.println(usuarioDados.getSenha());
			
			
			check.setString(1, usuarioDados.getUsuario());
			
			ResultSet rs = check.executeQuery();
			
			if(rs.next()) {
				JOptionPane.showMessageDialog(null, "Usuário já existe","Usuário",JOptionPane.INFORMATION_MESSAGE);
			}
			else if(usuarioDados.getUsuario().equals("") || usuarioDados.getSenha().equals("") || usuarioDados.getSenhacon().equals("")) {
				
				JOptionPane.showMessageDialog(null, "Por favor preencher os campos", "Atenção", JOptionPane.WARNING_MESSAGE);
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
