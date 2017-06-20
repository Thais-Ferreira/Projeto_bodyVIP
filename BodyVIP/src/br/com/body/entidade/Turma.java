package br.com.body.entidade;

/**
 * Classe que representa uma Turma.
 * 
 * @author Grupo PCS-SGBD 2017.1
 *
 */
public class Turma {
	
	private String codigo;
	private String modalidade;
	private int quantidadeVagas;
	private String diaDaSemana;
	private int horaInicio;
	private int horaFim;
	private double valorTurma;
	private String cpfProfessor;
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public int getQuantidadeVagas() {
		return quantidadeVagas;
	}

	public void setQuantidadeVagas(int quantidadeVagas) {
		this.quantidadeVagas = quantidadeVagas;
	}

	public String getDiaDaSemana() {
		return diaDaSemana;
	}

	public void setDiaDaSemana(String diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}
	
	public int getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}

	public int getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(int horaFim) {
		this.horaFim = horaFim;
	}

	public double getValorTurma() {
		return valorTurma;
	}

	public void setValorTurma(double valorTurma) {
		this.valorTurma = valorTurma;
	}

	public String getCpfProfessor() {
		return cpfProfessor;
	}

	public void setCpfProfessor(String cpfProfessor) {
		this.cpfProfessor = cpfProfessor;
	}
	

}
