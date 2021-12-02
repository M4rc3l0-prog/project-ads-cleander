package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import connection.ConnectionFactory;
import model.entities.Cliente;

public class ClienteDAO {
	
	
	public void creat (Cliente cliente) {
	  Connection con = ConnectionFactory.getConnection();
      
      PreparedStatement stmt = null;

      try {
          stmt = con.prepareStatement("INSERT INTO cliente (nome,email,endereco,cidade,telefone,sexo)VALUES(?,?,?,?,?,?)");
          stmt.setString(1, cliente.getNome());
          stmt.setString(2, cliente.getEmail());
          stmt.setString(3, cliente.getEndereco());
          stmt.setString(4, cliente.getCidade());
          stmt.setString(5, cliente.getTelefone());
          stmt.setString(6, cliente.getSexo());

          stmt.executeUpdate();

          JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
      } catch (SQLException ex) {
          System.out.println(ex);
      } finally {
          ConnectionFactory.closeConnection(con, stmt);
      }


}
}
