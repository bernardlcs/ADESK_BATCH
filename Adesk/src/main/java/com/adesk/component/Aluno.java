package com.adesk.component;

import java.util.Date;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Bernard/Patricia
 *
 */

@Entity
@Table (name="ALUNO")
public class Aluno {
	
	@Id	
	@SequenceGenerator(name = "ALUNO_SEQ", sequenceName = "ALUNO_SEQ",  allocationSize = 1) // Ambiente
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ALUNO_SEQ")
	private int id;

	@Column(name="NOME")
	private String nome;
	@Column(name="MAE")
	private String mae;
	@Column(name="PAI")
	private String pai;
	@Column(name="IDADE")
	private int idade;
	@Column(name="MODALIDADE")
	private String modalidade;
	@Column(name="DATA_MENSALIDADE")
	private Date dataMensalidade;
	@Column(name="MENSALIDADE_EM_DIA")
	private String mensalidadeEmDia="OK";
	
	
	
	public Aluno() {
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMae() {
		return mae;
	}


	public void setMae(String mae) {
		this.mae = mae;
	}


	public String getPai() {
		return pai;
	}


	public void setPai(String pai) {
		this.pai = pai;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getModalidade() {
		return modalidade;
	}


	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	

}
