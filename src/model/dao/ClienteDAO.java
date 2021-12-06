package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import javax.swing.JOptionPane;

import connection.Conexao;
import model.entities.ClienteDados;


public class ClienteDAO {
	
	private static String registrarSql, alterarSql,excluirSql;
	private static String checkNome;
	
	public ClienteDAO() {
	
		registrarSql = "INSERT INTO clientes(nome,email,cidade,endereco,complemento,telefone,comodos) VALUES (?,?,?,?,?,?,?)";
		checkNome = "SELECT * FROM clientes WHERE nome=?";
		alterarSql = "UPDATE clientes SET email=?, cidade=?, endereco=?, complemento=?, telefone=?, comodos=? WHERE nome=?";
		excluirSql = "DELETE FROM clientes WHERE nome=?";
	}
	
	
	// INICIO DO METODO QUE REGISTRAR CLIENTE
	
	public static void registrarCliente(ClienteDados clienteDados) {
		
			
		try {
			
			Connection con = Conexao.fazConexao();
			
			PreparedStatement stmt = con.prepareStatement(registrarSql);
			PreparedStatement check = con.prepareStatement(checkNome);
			
			stmt.setString(1, clienteDados.getNome());
			stmt.setString(2, clienteDados.getEmail());
			stmt.setString(3, clienteDados.getCidade());
			stmt.setString(4, clienteDados.getEndereco());
			stmt.setString(5, clienteDados.getComplemento());
			stmt.setString(6, clienteDados.getTelefone());
			stmt.setString(7, clienteDados.getComodos());
			
			check.setString(1, clienteDados.getNome());
			
			ResultSet rs = check.executeQuery();
			
			if(rs.next()) {
				
				JOptionPane.showMessageDialog(null, "Esse cliente já está registrado","Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
			else if(clienteDados.getNome().equals("") || clienteDados.getCidade().equals("") || clienteDados.getComodos().equals("") || clienteDados.getEmail().equals("") || clienteDados.getEndereco().equals("") || clienteDados.getNome().equals("") || clienteDados.getTelefone().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Por favor preencher os campos", "Atenção", JOptionPane.WARNING_MESSAGE);
				
			}else {
				stmt.execute();
				JOptionPane.showMessageDialog(null, "Cadastro de cliente realizado com sucesso!","Sucesso",JOptionPane.INFORMATION_MESSAGE);
			}
			
			stmt.close();
			con.close();
			check.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// FINAL DO METODO QUE REGISTRAR CLIENTE
	
			
	// INCIO DO METODO QUE ALTERA O  REGISTRO CLIENTE
	
	public static void alterarCliente(ClienteDados clienteDados) {
		
		try {
			Connection con = Conexao.fazConexao();
			
			PreparedStatement stmt = con.prepareStatement(alterarSql);
			PreparedStatement check = con.prepareStatement(checkNome);
			
			
			stmt.setString(1, clienteDados.getEmail());
			stmt.setString(2, clienteDados.getCidade());
			stmt.setString(3, clienteDados.getEndereco());
			stmt.setString(4, clienteDados.getComplemento());
			stmt.setString(5, clienteDados.getTelefone());
			stmt.setString(6, clienteDados.getComodos());			
			stmt.setString(7, clienteDados.getNome());
			
			check.setString(1, clienteDados.getNome());
			ResultSet rs = check.executeQuery();
			
			if(rs.next() != true) {
				JOptionPane.showMessageDialog(null, "Cliente não existe","Atenção",JOptionPane.WARNING_MESSAGE);
			}
			else if(clienteDados.getEmail().equals("") == true || clienteDados.getCidade().equals("") == true || clienteDados.getEndereco().equals("") == true || clienteDados.getTelefone().equals("") == true|| clienteDados.getComodos().equals("") == true) {
				JOptionPane.showMessageDialog(null, "Por favor preencher os campos", "Atenção",JOptionPane.WARNING_MESSAGE);
			}
			
			else {
		stmt.execute();
		JOptionPane.showMessageDialog(null, "Alteração realizado com sucesso","Sucesso",JOptionPane.INFORMATION_MESSAGE);
			}
			
			stmt.close();
			con.close();
			check.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	//FINAL DO METODO QUE ALTERA O  REGISTRO CLIENTE
	
	
	// INICIO DO METODO QUE EXCLUIR CLIENTE
	
	public static void excluirCliente(ClienteDados clienteDados) {
		
		try {
			Connection con = Conexao.fazConexao();
			PreparedStatement stmt = con.prepareStatement(excluirSql);
			PreparedStatement check = con.prepareStatement(checkNome);
			
			check.setString(1, clienteDados.getNome());
			stmt.setString(1, clienteDados.getNome());
			
			ResultSet rs = check.executeQuery();
			
			if(rs.next()) {
					
				int reply = JOptionPane.showConfirmDialog(null, "Deseja realmente apagar esse cliente do sistema?", "Confirmação", JOptionPane.YES_NO_OPTION);
			    if (reply == JOptionPane.YES_OPTION) {
			    	
			    	stmt.execute();
			    	
			    	JOptionPane.showMessageDialog(null, "Registro de Cliente apagado com sucesso!","Sucesso",JOptionPane.INFORMATION_MESSAGE);
			    	
			    	
			    	stmt.close();
			    	con.close();
			    	check.close();
			    }
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Cliente não existe","Atenção",JOptionPane.WARNING_MESSAGE);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//FINAL DO METODO QUE EXCLUIR CLIENTE
	
	
	//INICIO DO METODO LISTAR CLIENTES
	
	public ResultSet listarClientes(ClienteDados clienteDados) {
		
		try {
			Connection con = Conexao.fazConexao();
			PreparedStatement stmt = con.prepareStatement(checkNome);
			stmt.setString(1, clienteDados.getNome());
			
			ResultSet rs = stmt.executeQuery();
			
		return rs;
			
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	//INICIO DO METODO LISTAR CLIENTES
}
