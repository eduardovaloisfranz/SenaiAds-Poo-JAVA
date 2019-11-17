package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoa {

	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		
		Statement statement = conexao.createStatement();
		
		String sql = "CREATE TABLE IF NOT EXISTS Pessoas ("
				+ "codigo INT(30) AUTO_INCREMENT PRIMARY KEY,"
				+ "nome VARCHAR(30) NOT NULL"
				+ ");";
		statement.execute(sql);
		
		System.out.println("Tabela criada");
		conexao.close();
		

	}

}
