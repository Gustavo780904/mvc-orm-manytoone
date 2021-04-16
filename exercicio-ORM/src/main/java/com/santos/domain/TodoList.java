package com.santos.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TodoList implements Serializable{
	String nome;
	Integer id;
	List<TodoListItem> items = new ArrayList<TodoListItem>();
public TodoList() {}
public TodoList(String nome, Integer id) {
	super();
	this.nome = nome;
	this.id = id;
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
