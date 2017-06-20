package br.com.body.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.body.entidade.Aluno;

/**
 * Classe respons�vel por cadastrar, excluir, alterar e mostrar os dados de alunos atrav�s
 * de uma conex�o com o banco de dados.
 * 
 * @author Tha�s
 *
 */
public class AlunoDAO {
	
	private Connection conexao = Conexao.getConnection();
	
	/**
	 * M�todo que cadastra um aluno no banco de dados.
	 */
	public void cadastraAluno(Aluno aluno) {
		
		String sql = "INSERT INTO aluno (cpf,nome,email,matricula,data_matricula) VALUES (?,?,?,?,?)";
		
		try {
			PreparedStatement preparador = conexao.prepareStatement(sql);
			
			preparador.setString(1, aluno.getCpf());
			preparador.setString(2, aluno.getNome());
			preparador.setString(3, aluno.getEmail());
			preparador.setString(4, aluno.getMatricula());
			preparador.setDate(5, aluno.getDataMatricula());
			
			preparador.execute();
			preparador.close();
			
		} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
		
	}
	
	/**
	 * M�todo que altera o cadastro de um aluno no banco de dados.
	 */
	public void alteraCadastroAluno(Aluno aluno) {
		
		String sql = "UPDATE aluno SET nome = ?, cpf = ?, email = ? WHERE matricula = ?";
		
		try {
			PreparedStatement preparador = conexao.prepareStatement(sql);
			
			preparador.setString(1, aluno.getNome());
			preparador.setString(2, aluno.getCpf());
			preparador.setString(3, aluno.getEmail());
			preparador.setString(4, aluno.getMatricula());
			
			preparador.execute();
			preparador.close();
			
		} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
		
	}
	
	/**
	 * M�todo que deleta o cadastro de um aluno do banco de dados.
	 */
	public void deletaCadastroAluno(Aluno aluno) {
		
		String sql = "DELETE FROM aluno WHERE matricula = ?";
		
		try {
			PreparedStatement preparador = conexao.prepareStatement(sql);
			
			preparador.setString(1, aluno.getMatricula());
			
			preparador.execute();
			preparador.close();
			
		} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
		
	}
	
	/**
	 * M�todo que retorna uma lista com os alunos cadastrados no banco de dados.
	 */
	public List<Aluno> buscaListaAlunos(Aluno aluno) {
		
		String sql = "SELECT * FROM aluno";
		List<Aluno> listaAlunos = new ArrayList<>();
		
		try {
			PreparedStatement preparador = conexao.prepareStatement(sql);
			ResultSet resultados = preparador.executeQuery();
			
			while(resultados.next()) {
				Aluno alu = new Aluno();
				alu.setNome(resultados.getString("nome"));
				alu.setCpf(resultados.getString("cpf"));
				alu.setEmail(resultados.getString("email"));
				alu.setMatricula(resultados.getString("matricula"));
				alu.setDataMatricula(resultados.getDate("data_matricula"));
				
				listaAlunos.add(alu);
				
			}
		} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
		
		return listaAlunos;
		
	}
	
	/**
	 * M�todo que retorna um aluno a partir de sua matr�cula.
	 */
	public Aluno buscaAluno(String matricula) {
		Aluno aluno = null;
		String sql = "SELECT * FROM aluno WHERE matricula = ?";
		
		try {
			PreparedStatement preparador = conexao.prepareStatement(sql);
			preparador.setString(1, matricula);
			
			ResultSet resultado = preparador.executeQuery();
			if(resultado.next()) {
				aluno = new Aluno();
				aluno.setNome(resultado.getString("nome"));
				aluno.setCpf(resultado.getString("cpf"));
				aluno.setEmail(resultado.getString("email"));
				aluno.setMatricula(resultado.getString("matricula"));
				
			}
			
		} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
		
		return aluno;
	}
	
	/*public void calculaMensalidade(Aluno aluno) {
		
		String sql = "INSERT INTO aluno (valor_mensalidade) VALUES (?)";
		
		try {
			PreparedStatement preparador = conexao.prepareStatement(sql);
			
			preparador.setDouble(1, aluno.calculaValorMensalidade(aluno));
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Mensalidade atualizada com sucesso!");
		} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
		
	}*/
	
}
