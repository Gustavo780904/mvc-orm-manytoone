package com.santos.domain;

import java.io.Serializable;

public class TodoListItem implements Serializable {
	
	private static final long serialVersionUID = 1L;
	String nomeDoItem;
	Integer id;
	TodoList lista;
	public TodoListItem() {	}

	public TodoListItem(String nomeDoItem, Integer id, TodoList lista) {
		super();
		this.nomeDoItem = nomeDoItem;
		this.id = id;
		this.lista = lista;
	}


	public String getNomeDoItem() {
		return nomeDoItem;
	}

	public void setNomeDoItem(String nomeDoItem) {
		this.nomeDoItem = nomeDoItem;
	}

	public TodoList getLista() {
		return lista;
	}

	public void setLista(TodoList lista) {
		this.lista = lista;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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
		TodoListItem other = (TodoListItem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	 
}
