package br.com.body.entidade;

/**
 * Classe que representa aluno_turma.
 * 
 * @author Grupo PCS-SGBD 2017.1
 *
 */
public class AlunoTurma {

	private String cpfAluno;
	private String codTurma;
	
	public String getCpfAluno() {
		return cpfAluno;
	}
	
	public void setCpfAluno(String cpfAluno) {
		this.cpfAluno = cpfAluno;
	}

	public String getCodTurma() {
		return codTurma;
	}

	public void setCodTurma(String codTurma) {
		this.codTurma = codTurma;
	}
}
