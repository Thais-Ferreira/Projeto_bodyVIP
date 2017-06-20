package br.com.body.entidade;

import java.sql.Date;

/**
 * Classe que representa um professor.
 * 
 * @author Grupo PCS-SGBD 2017.1
 *
 */
public class Professor {
	
	private String nome;
	private String cpf;
	private String email;
	private Date dataContratacao;
	
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
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(Date dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

}
