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
import model.entities.Agendamento;

public class AgendamentoDAO {
	

	public void creat (Agendamento agendamento) {
	  Connection con = ConnectionFactory.getConnection();
      
      PreparedStatement stmt = null;

      try {
          stmt = con.prepareStatement("INSERT INTO agendamento (nome,servico,valor,data,horario,descricao)VALUES(?,?,?,?,?,?)");
          stmt.setString(1, agendamento.getNome());
          stmt.setString(2, agendamento.getServico());
          stmt.setString(3, agendamento.getValor());
          stmt.setString(4, agendamento.getDate());
          stmt.setString(5, agendamento.getHora());
          stmt.setString(6, agendamento.getDescricao());
          
       

          stmt.executeUpdate();

          JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
      } catch (SQLException ex) {
          System.out.println(ex);
      } finally {
          ConnectionFactory.closeConnection(con, stmt);
      }
      
      


}
	
	
	  public List<Agendamento> read() {

	        Connection con = ConnectionFactory.getConnection();
	        
	        PreparedStatement stmt = null;
	        ResultSet rs = null;

	        List<Agendamento> produtos = new ArrayList<>();

	        try {
	            stmt = con.prepareStatement("SELECT * FROM agendamento");
	            rs = stmt.executeQuery();

	            while (rs.next()) {

	                Agendamento agendamento = new Agendamento();

	                agendamento.setId(rs.getInt("id_agendamento"));
	                agendamento.setNome(rs.getString("nome"));
	                agendamento.setServico(rs.getString("servico"));
	                agendamento.setValor(rs.getString("valor"));
	                agendamento.setDate(rs.getString("data"));
	                agendamento.setHora(rs.getString("horario"));
	                agendamento.setDescricao(rs.getString("descricao"));
	                produtos.add(agendamento);
	            }

	        } catch (SQLException ex) {
	            Logger.getLogger(AgendamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
	        } finally {
	            ConnectionFactory.closeConnection(con, stmt, rs);
	        }

	        return produtos;

	    }
	  
	  public void update(Agendamento agendamento) {

	        Connection con = ConnectionFactory.getConnection();
	        
	        PreparedStatement stmt = null;

	        try {
	            stmt = con.prepareStatement("UPDATE agendamento SET descricao = ? ,data = ?,horario = ? WHERE id_agendamento = ?");
	            stmt.setString(1, agendamento.getDescricao());
	            stmt.setString(2, agendamento.getDate());
	            stmt.setString(3, agendamento.getHora());
	            stmt.setInt(4, agendamento.getId());

	            stmt.executeUpdate();

	            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
	        } catch (SQLException ex) {
	            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
	        } finally {
	            ConnectionFactory.closeConnection(con, stmt);
	        }

	    }
	  
	  public void delete(Agendamento p) {

	        Connection con = ConnectionFactory.getConnection();
	        
	        PreparedStatement stmt = null;

	        try {
	            stmt = con.prepareStatement("DELETE FROM agendamento WHERE id_agendamento = ?");
	            stmt.setInt(1, p.getId());

	            stmt.executeUpdate();

	            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
	        } catch (SQLException ex) {
	            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
	        } finally {
	            ConnectionFactory.closeConnection(con, stmt);
	        }

	    }

}
