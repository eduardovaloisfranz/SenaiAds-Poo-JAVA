package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testeConexao {
	public static void main(String[] args) throws SQLException {
		final String connectionString = "jdbc:mysql://127.0.0.1:3306/?user=root";
		final String usuario = "root";
		final String senha = "";	
		Connection conexao = DriverManager.getConnection(connectionString, usuario, senha);
		
		System.out.println("Conectado ao banco");
		conexao.close();
	}
}
