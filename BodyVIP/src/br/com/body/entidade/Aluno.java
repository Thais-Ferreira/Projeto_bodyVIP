package br.com.body.entidade;

import java.sql.Date;
import java.util.List;

/**
 * Classe que representa um aluno.
 * 
 * @author Grupo PCS-SGBD 2017.1
 *
 */
public class Aluno {
	
	private Integer id;
	private String nome;
	private String cpf;
	private String matricula;
	private String email;
	private Date dataMatricula;
	private double valorMensalidade;
	private List<Turma> listaTurma;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public double getValorMensalidade() {
		return valorMensalidade;
	}

	public void setValorMensalidade(double valorMensalidade) {
		this.valorMensalidade = valorMensalidade;
	}
	
	public List<Turma> geListaTurma() {
		return listaTurma;
	}
	
	public void setListaTurma(List<Turma> listaTurma) {
		this.listaTurma = listaTurma;
	}
	
	public double calculaValorMensalidade(Aluno aluno) {
		List<Turma> lista = aluno.geListaTurma();
		double valorMensalidade = 0.0;
		
		for(int i = 0; i < lista.size(); i++) {
			valorMensalidade = valorMensalidade + lista.get(i).getValorTurma(); 
			
		}
		
		return valorMensalidade;
		
	}


}
