package jdbc;

import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ConsultarPessoas1 {
	public static void main(String[] args) throws SQLException{
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "SELECT codigo, nome FROM pessoas";
		Statement stmt = conexao.createStatement();
		ResultSet resultado = stmt.executeQuery(sql);
		List<Pessoa> pessoas = new ArrayList<>();
		while(resultado.next()) {
			int codigo = resultado.getInt(1);
			String nome = resultado.getString("nome");			
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		for(Pessoa p : pessoas) {
			System.out.println(p);
		}
		
		
		conexao.close();
	}
}
