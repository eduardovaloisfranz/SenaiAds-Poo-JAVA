package dbdatabase;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dbdatabase.Cidade;

public class CidadeBD {

	public static void main(String[] args) throws IOException {

		// Uma instância do SQLite pode ser criada para uso em memória,
		// sem gerar um arquivo físico, através desta sintaxe da String de conexão:
		String sqlite = "jdbc:sqlite::memory:";

		// Para criar um arquivo físico ou conectar-se a um já existente,
		// configura-se a String de conexão informando o caminho do arquivo:
		sqlite = "jdbc:sqlite:./src/dbdatabase/cidades.db";

		List<Cidade> cidades = lerCidades();

		try (Connection conn = DriverManager.getConnection(sqlite)) {

			dbMetaData(conn);

			gerarCidades(cidades, conn);

			cidadesHabitantesUF(conn);

			cidadesMaisPopulosasUF(conn);

			cidadeMenosPopulosasUF(conn);

			populacoesTotais(conn);

			proporcaoMascFem(conn);

			proporcaoFemMasc(conn);
			
//			listarCidades(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static void dbMetaData(Connection conn) throws SQLException {
		DatabaseMetaData md = conn.getMetaData();
		System.out.println("Banco : " + md.getDatabaseProductName() + " " + md.getDatabaseProductVersion());
		System.out.println("Driver: " + md.getDriverName() + ". Versão: " + md.getDriverVersion());
		System.out.println();
	}

	private static void gerarCidades(List<Cidade> cidades, Connection conn) throws SQLException {

		Statement stmt = conn.createStatement();

		stmt.executeUpdate("drop table if exists cidades");

		String sql = "create table cidades (idcidade integer primary key, uf string, " + //
						"nome string, poptotal integer, popmasc integer, popfem integer)";
		stmt.executeUpdate(sql);

		conn.setAutoCommit(false);

		sql = "insert into cidades (uf, nome, poptotal, popmasc, popfem) values (?, ?, ?, ?, ?)";
//		sql = "insert into cidades values (?, ?, ?, ?, ?)";
		try (PreparedStatement ps = conn.prepareStatement(sql)) {

			for (Cidade c : cidades) {
				ps.setString(1, c.getUf());
				ps.setString(2, c.getNome());
				ps.setInt(3, c.getPopTotal());
				ps.setInt(4, c.getPopMasc());
				ps.setInt(5, c.getPopFem());
				ps.execute();
			}
			conn.commit();

		} catch (SQLException e) {
			e.printStackTrace();
			conn.rollback();
		} finally {
			conn.setAutoCommit(true);
		}
	}

	private static void proporcaoFemMasc(Connection conn) throws SQLException {
		System.out.println("\nPopulações feminina / masculina:");
		String sql = "select nome, uf estado, 1.0*popfem/popmasc AS ratio from cidades order by ratio desc limit 10";
		ResultSet rs = executarSQL(conn, sql);
		while (rs.next()) {
			System.out.printf("%23s %1.5f %n", rs.getString("nome") + "/" + rs.getString("estado"), rs.getFloat("ratio"));
		}
	}

	private static void proporcaoMascFem(Connection conn) throws SQLException {
		System.out.println("\nPopulações masculina / feminina:");
		String sql = "select nome, uf, 1.0*popmasc/popfem as ratio from cidades order by ratio desc limit 10";
		ResultSet rs = executarSQL(conn, sql);
		while (rs.next()) {
			System.out.printf("%25s %1.5f %n", rs.getString(1) + "/" + rs.getString(2), rs.getFloat("ratio"));
		}
	}

	private static void populacoesTotais(Connection conn) throws SQLException {
		System.out.println("\nPopulações totais:");
		String sql = "select sum(c.poptotal), sum(c.popmasc), sum(c.popfem) from cidades c";
		ResultSet rs = executarSQL(conn, sql);
		while (rs.next()) {
			System.out.printf("%,15d habitantes%n%,15d homens%n%,15d mulheres%n", rs.getInt(1), rs.getInt(2),
					rs.getInt(3));
		}
	}

	private static void cidadeMenosPopulosasUF(Connection conn) throws SQLException {
		System.out.println("\nCidades menos populosas por UF:");
		String sql = "select uf, nome, min(poptotal) from cidades group by uf order by 3";
		ResultSet rs = executarSQL(conn, sql);
		while (rs.next()) {
			System.out.printf("%-26s: %,12d habitantes.%n", rs.getString(2) + "/" + rs.getString(1), rs.getInt(3));
		}
	}

	private static void cidadesMaisPopulosasUF(Connection conn) throws SQLException {
		System.out.println("\nCidades mais populosas por UF:");
		String sql = "select uf, nome, max(poptotal) from cidades group by uf order by 3 desc";
		ResultSet rs = executarSQL(conn, sql);
		while (rs.next()) {
			System.out.printf("%-18s: %,12d habitantes.%n", rs.getString(2) + "/" + rs.getString(1), rs.getInt(3));
		}
	}

	private static void cidadesHabitantesUF(Connection conn) throws SQLException {
		System.out.println("UF  Cidades    Habitantes");
		System.out.println("--  -------    ----------");
		String sql = "select uf, count(nome), sum(poptotal) from cidades group by uf order by uf";
		ResultSet rs = executarSQL(conn, sql);
		while (rs.next()) {
			System.out.printf("%s %,8d  %,12d%n", rs.getString(1), rs.getInt(2), rs.getInt(3));
		}
	}

	private static void listarCidades(Connection conn) throws SQLException {
		System.out.println("  Id UF Cidade                            Habitantes");
		System.out.println("---- -- ------                            ----------");
		String sql = "select * from cidades order by uf, nome";
		ResultSet rs = executarSQL(conn, sql);
		while (rs.next()) {
			System.out.printf("%4d %s %-30s  %,12d%n", rs.getInt("idcidade"), rs.getString("uf"), rs.getString("nome"), rs.getInt("poptotal"));
		}
	}
	
	private static ResultSet executarSQL(Connection conn, String sql) throws SQLException {

		// Utilizando um Statement para executar o SQL recebido:
		Statement st = conn.createStatement();
		return st.executeQuery(sql);

		// Utilizando um PreparedStatement para executar o SQL recebido:
//		PreparedStatement ps = conn.prepareStatement(sql);
//		return ps.executeQuery();
	}

	private static List<Cidade> lerCidades() throws IOException {
		String csv = "./src/dbdatabase/população.CSV";
		List<Cidade> cidades = new ArrayList<>();
		try (BufferedReader reader = Files.newBufferedReader(Paths.get(csv), StandardCharsets.ISO_8859_1)) {
			String linha = reader.readLine(); // ignorar cabeçalho
			while ((linha = reader.readLine()) != null) {
				String[] palavras = linha.split(";");
				cidades.add(new Cidade(palavras));
			}
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
		return cidades;
	}
}
