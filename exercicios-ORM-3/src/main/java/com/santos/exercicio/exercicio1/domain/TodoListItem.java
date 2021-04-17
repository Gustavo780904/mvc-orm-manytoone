package com.santos.exercicio.exercicio1.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TodoListItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	@ManyToOne
	private TodoList lista;
	
	public TodoListItem() {
	}
	public TodoListItem(Integer id, String nome, TodoList lista) {
		super();
		this.id = id;
		this.nome = nome;
		this.lista = lista;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TodoList getLista() {
		return lista;
	}
	public void setLista(TodoList lista) {
		this.lista = lista;
	}
	public Integer getId() {
		return id;
	}
	
}
