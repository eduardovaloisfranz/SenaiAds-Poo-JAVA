package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		System.out.print("Digite um nome: ");
		String nome = entrada.nextLine();		
		System.out.println(nome);		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
		
		stmt.execute();

		
			
		
		
		System.out.println("Pessoa incluida com sucesso");
		entrada.close();
		conexao.close();
	}
}
