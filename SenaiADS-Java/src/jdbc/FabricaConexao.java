package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {	
	public static Connection getConexao() {		
		Connection conexao = null;
		try {
			final String connectionString = "jdbc:mysql://127.0.0.1:3306/curso_java?user=root";
			final String user = "root";
			final String password = "";
			return conexao = DriverManager.getConnection(connectionString, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		
		
	}
}
