package com.adesk.component;

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
@Table (name="COLABORADOR")
public class Colaborador {
	@Id	
	@SequenceGenerator(name = "COLABORADOR_SEQ", sequenceName = "COLABORADOR_SEQ",  allocationSize = 1) // Ambiente
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COLABORADOR_SEQ")
	private int id;

	@Column(name="NOME")
	private String nome;
	@Column(name="IDADE")
	private int idade;
	@Column(name="FUNCAO")
	private String funcao;
	
	public Colaborador() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	
}
