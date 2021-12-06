package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	private static  String driver = "com.mysql.cj.jdbc.Driver";
	private static  String path = "jdbc:mysql://localhost/dbcleander";
	private static  String user = "root";
	private static  String password = "";
	
	
	public static Connection fazConexao() throws SQLException {
		
		try {	
			Class.forName(driver);
			
			return DriverManager.getConnection(path,user,password);
					
		} catch (ClassNotFoundException e) {
			throw new SQLException(e.getException());
		}
	}

}
