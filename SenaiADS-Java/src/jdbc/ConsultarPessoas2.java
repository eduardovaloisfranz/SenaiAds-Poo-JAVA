package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {
	public static void main(String[] args) throws SQLException{
	//consultar pessoas que contenham parte do nome 'like'
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT codigo, nome FROM pessoas WHERE NOME LIKE ?";
		Scanner input = new Scanner(System.in);		
		System.out.print("Informe parte do nome que deseja buscar: ");
		String parteNome = input.next();		
		PreparedStatement stmt = conexao.prepareStatement(sql);		
		stmt.setString(1, "'%" + parteNome + "%'");		
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		ResultSet resultado = stmt.executeQuery(sql);
		while(resultado.next()) {
			int codigo = resultado.getInt(1);
			String nome = resultado.getString(2);			
			pessoas.add(new Pessoa(codigo, nome));
			
			//System.out.print("Codigo: " + codigo + " Nome: " + codigo);
		}
		
		for(Pessoa p : pessoas) {
			System.out.println(p);
		}
		
		input.close();
		stmt.close();
		conexao.close();
		
	}
}
