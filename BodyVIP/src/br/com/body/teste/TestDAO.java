package br.com.body.teste;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import br.com.body.entidade.Aluno;
import br.com.body.jdbc.AlunoDAO;

/**
 * Classe para testar os m�todos da classe AlunoDAO.
 * 
 * @author Tha�s
 *
 */
public class TestDAO {

	public static void main(String[] args) {
		//testCadastroAluno();
		//testAlteraCadastroAluno();
		//testDeletaCadastroAluno();
		testBuscaListaAlunos();

	}
	
	public static void testCadastroAluno() {
		Aluno aluno = new Aluno();
		Date data = new java.sql.Date(Calendar.getInstance().getTime().getTime());
		
		aluno.setNome("BichoDoMato");
		aluno.setCpf("55555555555");
		aluno.setMatricula("098765");
		aluno.setEmail("bicho.matoav@gmail.com");
		aluno.setDataMatricula(data);
		
		AlunoDAO alunoDAO = new AlunoDAO();
		alunoDAO.cadastroAluno(aluno);
		
		
	}
	
	public static void testAlteraCadastroAluno() {
		Aluno aluno = new Aluno();
		
		aluno.setNome("Yuna");
		aluno.setEmail("yuna@gmail.com");
		aluno.setMatricula("928382");
		
		AlunoDAO alunoDAO = new AlunoDAO();
		alunoDAO.alteraCadastroAluno(aluno);
		
	}
	
	public static void testDeletaCadastroAluno() {
		Aluno aluno = new Aluno();
		
		aluno.setMatricula("xxxxxxx");
		
		AlunoDAO alunoDAO = new AlunoDAO();
		alunoDAO.deletaCadastroAluno(aluno);
		
	}
	
	public static void testBuscaListaAlunos() {
		Aluno aluno = new Aluno();
		AlunoDAO alunoDAO = new AlunoDAO();
		List<Aluno> listaAlunos = alunoDAO.buscaListaAlunos(aluno);
		
		for(Aluno a:listaAlunos) {
			System.out.println("Nome: "+ a.getNome() + "\t\tMatr�cula: " + a.getMatricula() + "\t\tEmail: " + a.getEmail());
		}
		
		
	}

}