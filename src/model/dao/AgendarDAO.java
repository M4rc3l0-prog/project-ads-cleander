package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import javax.swing.JOptionPane;


import connection.Conexao;
import model.entities.AgendarDados;

public class AgendarDAO {
	
	private static String registrarSql, alterarSql, excluirSql;
	private static String checkNome,listarSql,checkAgenda;

public AgendarDAO() {
	
	// TODO Auto-generated constructor stub
	registrarSql = "INSERT INTO agendamento(cliente,servico,cidade,endereco,data,hora,preco,comodos) VALUES (?,?,?,?,?,?,?,?)";
	alterarSql = "UPDATE agendamento SET servico=?, data=?, hora=?, preco=? WHERE cliente=?";
	excluirSql = "DELETE FROM agendamento WHERE cliente=?";
	checkNome = "SELECT * FROM clientes WHERE nome=?";
	checkAgenda = "SELECT * FROM agendamento WHERE cliente=?";
	listarSql = "SELECT * FROM agendamento order by cliente";
}

	//INICIO DO METODO PARA AGENDAR O SERVIÇO

	public static void registrarServico(AgendarDados agendarDados) {
		
		try {
			
			Connection con = Conexao.fazConexao();
			
			PreparedStatement stmt = con.prepareStatement(registrarSql);
			PreparedStatement check = con.prepareStatement(checkNome);
			
			check.setString(1, agendarDados.getCliente());
			
			ResultSet rs = check.executeQuery();
					
			if(rs.next()) {				
		
				
				stmt.setString(1, rs.getString("nome"));
				stmt.setString(2, agendarDados.getServico());
				stmt.setString(3, rs.getString("cidade"));
				stmt.setString(4, rs.getString("endereco"));
				stmt.setString(5, agendarDados.getData());
				stmt.setString(6, agendarDados.getHora());
				stmt.setString(7, agendarDados.getPreco());
				stmt.setString(8, rs.getString("comodos"));
								
				
				
			if(agendarDados.getCliente().equals("") || agendarDados.getServico().equals("") || agendarDados.getData().equals("") || agendarDados.getHora().equals("") || agendarDados.getPreco().equals("")) {
				
				JOptionPane.showMessageDialog(null, "Por favor preencher os campos", "Atenção",JOptionPane.WARNING_MESSAGE);
				
			} else {
					stmt.execute();
					JOptionPane.showMessageDialog(null, "Agendamento realizado com sucesso!","Sucesso",JOptionPane.INFORMATION_MESSAGE);
			}
			
			} else {
				JOptionPane.showMessageDialog(null, "Cliente não existe no banco de Dados","Atenção",JOptionPane.INFORMATION_MESSAGE);
			}
			
			stmt.close();
			con.close();
			check.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// FINAL DO METODO PARA AGENDAR O SERVIÇO
	
	
	//INICIO DO METODO PARA ALTERAR O SERVIÇO

	public static void alterarServico(AgendarDados agendarDados) {
		
		try {
			Connection con = Conexao.fazConexao();
			
			PreparedStatement stmt = con.prepareStatement(alterarSql);
			PreparedStatement check = con.prepareStatement(checkAgenda);
			
						
			stmt.setString(1, agendarDados.getServico());
			stmt.setString(2, agendarDados.getData());
			stmt.setString(3, agendarDados.getHora());
			stmt.setString(4, agendarDados.getPreco());
			stmt.setString(5, agendarDados.getCliente());
			
			check.setString(1, agendarDados.getCliente());
							
			ResultSet rs = check.executeQuery();
			
			if(rs.next() != true) {
				JOptionPane.showMessageDialog(null, "Cliente não existe","Atenção",JOptionPane.WARNING_MESSAGE);			
			
			}
			else if(agendarDados.getServico().equals("") || agendarDados.getData().equals("") || agendarDados.getHora().equals("") || agendarDados.getPreco().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Por favor preencher os campos", "Atenção",JOptionPane.WARNING_MESSAGE);
				}
				else {
					
					stmt.execute();
					JOptionPane.showMessageDialog(null, "Alteração realizado com sucesso","Sucesso",JOptionPane.INFORMATION_MESSAGE);
												
		}
		stmt.close();
		con.close();
		check.close();
		
		}catch (Exception e) {
			// TODO: handle exception
			
		}
	}
	
	//FINAL DO METODO PARA ALTERAR O SERVIÇO
	
	
	// INICIO DO METODO DE EXCLUIR SERVICO
	
	public static void excluirServico(AgendarDados agendarDados) {
		
		try {
			Connection con = Conexao.fazConexao();
			PreparedStatement stmt = con.prepareStatement(excluirSql);
			
			PreparedStatement check = con.prepareStatement(checkAgenda);
			
			stmt.setString(1, agendarDados.getCliente());
			check.setString(1, agendarDados.getCliente());
			
			
			ResultSet rs = check.executeQuery();
			
			if(rs.next()) {
				
				int reply = JOptionPane.showConfirmDialog(null, "Deseja realmente apagar esse cliente do sistema?", "Confirmação", JOptionPane.YES_NO_OPTION);
			    if (reply == JOptionPane.YES_OPTION) {			    	
			    	stmt.execute();
			    	
			    	JOptionPane.showMessageDialog(null, "Agendamento do  cliente apagado com sucesso!","Sucesso",JOptionPane.INFORMATION_MESSAGE);
			    				    	
			    	stmt.close();
			    	con.close();
			    	check.close();
			    }
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Cliente não existe","Atenção",JOptionPane.WARNING_MESSAGE);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	// FINAL DO METODO DE EXCLUIR SERVICO
	
		
	
	//INICIO DO METODO PARA LISTAR OS AGENDAMENTOS
	
	public ResultSet listarAgendamentos() {
		
		try {
			
			Connection con = Conexao.fazConexao();
			PreparedStatement stmt = con.prepareStatement(listarSql);
			
			ResultSet rs = stmt.executeQuery();
			
			return rs;
											
					
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	//FINAL DO METODO PARA LISTAR OS AGENDAMENTOS
	
	
	//INICIO DO METODO PARA BUSCAR OS AGENDAMENTOS PARA ALTERAR
	
	public ResultSet buscarAlterarAgendamento(AgendarDados agendarDados) {
		
		String sql = "SELECT * FROM agendamento WHERE cliente=?";
		
		try {
			
			Connection con = Conexao.fazConexao();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, agendarDados.getCliente());
			ResultSet rs = stmt.executeQuery();
			
			return rs;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
}