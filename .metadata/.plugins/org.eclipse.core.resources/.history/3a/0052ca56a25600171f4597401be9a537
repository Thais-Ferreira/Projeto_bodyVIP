package br.com.body.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.body.entidade.Professor;

/**
 * Classe responsável por cadastrar, excluir, alterar e mostrar os dados de professores através
 * de uma conexão com o banco de dados.
 * 
 * @author Thaís
 *
 */
public class ProfessorDAO {
	
	private Connection conexao = Conexao.getConnection();
	
	/**
	 * Método que cadastra um professor no banco de dados.
	 */
	public void cadastroProfessor(Professor professor) {
		
		String sql = "INSERT INTO professor (nome,cpf,email,data_contratacao) VALUES (?,?,?,?)";
		
		try {
			PreparedStatement preparador = conexao.prepareStatement(sql);
			
			preparador.setString(1, professor.getNome());
			preparador.setString(2, professor.getCpf());
			preparador.setString(3, professor.getEmail());
			preparador.setDate(4, professor.getDataContratacao());
			
			preparador.execute();
			preparador.close();
			
		} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
	}
	
	/**
	 * Método que altera o cadastro de um professor no banco de dados.
	 */
	public void alteraCadastroProfessor(Professor professor) {
		
		String sql = "UPDATE professor SET nome = ?, cpf = ?, email = ? WHERE cpf = ?";
		
		try {
			PreparedStatement preparador = conexao.prepareStatement(sql);
			
			preparador.setString(1, professor.getNome());
			preparador.setString(2, professor.getCpf());
			preparador.setString(3, professor.getEmail());
			preparador.setString(4, professor.getCpf());
			
			preparador.execute();
			preparador.close();
			
		} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
		
	}
		
	/**
	* Método que deleta o cadastro de um professor do banco de dados.
	*/
	public void deletaCadastroProfessor(Professor professor) {
			
		String sql = "DELETE FROM professor WHERE cpf = ?";
			
		try {
			PreparedStatement preparador = conexao.prepareStatement(sql);
				
			preparador.setString(1, professor.getCpf());
				
				
			preparador.execute();
			preparador.close();
		
		} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
			
	}
		
	/**
	 * Método que retorna uma lista com os professores cadastrados no banco de dados.
	*/
	public List<Professor> buscaListaProfessores(Professor pofessor) {
			
		String sql = "SELECT * FROM professor";
		List<Professor> listaProfessores = new ArrayList<>();
			
		try {
			PreparedStatement preparador = conexao.prepareStatement(sql);
			ResultSet resultados = preparador.executeQuery();
				
			while(resultados.next()) {
				Professor prof = new Professor();
				prof.setNome(resultados.getString("nome"));
				prof.setCpf(resultados.getString("cpf"));
				prof.setEmail(resultados.getString("email"));
				prof.setDataContratacao(resultados.getDate("data_contratacao"));
					
				listaProfessores.add(prof);
					
			}
		} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
			
		return listaProfessores;
			
	}
	
	/**
	 * Método que retorna um professor a partir de seu cpf.
	 */
	public Professor buscaProfessor(String cpf) {
		Professor professor = null;
		String sql = "SELECT * FROM professor WHERE cpf = ?";
		
		try {
			PreparedStatement preparador = conexao.prepareStatement(sql);
			preparador.setString(1, cpf);
			
			ResultSet resultado = preparador.executeQuery();
			if(resultado.next()) {
				professor = new Professor();
				professor.setNome(resultado.getString("nome"));
				professor.setCpf(resultado.getString("cpf"));
				professor.setEmail(resultado.getString("email"));
				
			}
			
		} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
		
		return professor;
	}
		
}


