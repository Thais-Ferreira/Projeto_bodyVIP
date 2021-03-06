package br.com.body.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe que estabelece a conex�o com o banco de dados.
 * 
 * @author Tha�s
 *
 */
public class Conexao {
	
	/**
	 * M�todo que retorna uma conex�o com o banco de dados.
	 */
	public static Connection getConnection() {
		
		 Connection conexao = null;
		 
		 try {
			Class.forName("org.postgresql.Driver");
			conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/BodyVIP","postgres","k0rr4");
			System.out.println("Conectado com sucesso!");
		} catch (SQLException e) {
			System.out.println("Erro - Conex�o " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("Erro - Driver " + e.getMessage());
		}
		 
		 return conexao;
		 
	}

}
