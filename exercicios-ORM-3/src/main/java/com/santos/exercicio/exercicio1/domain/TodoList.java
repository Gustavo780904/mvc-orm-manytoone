package com.santos.exercicio.exercicio1.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TodoList implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	
	/*	
	 * 	A variável (List) do tipo da classe "TodoListItem", que faz referencia à classe, 
	é uma lista porque a relação é "muitos" (um para muitos). 
		Como é bidirecional, em TodoListItem tb tem uma variável referente à classe TodoList.
	Linkedlist é mais rapido que arrayList, quando for deletar e gravar registros com 
	maior frequencia. Nesse caso onde os dados não tendem a ser alterados, melhor usar arrayList
	 	O dono da relação é sempre a parte, nunca o todo
	 	*/
	
	@OneToMany(mappedBy = "lista")
	private List<TodoListItem> items = new ArrayList<TodoListItem>();

	public TodoList() {
	}

	public TodoList(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<TodoListItem> getItems() {
		return items;
	}

	public void setItems(List<TodoListItem> items) {
		this.items = items;
	}

	public Integer getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TodoList other = (TodoList) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
