package com.santos.exercicio.exercicio1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.santos.exercicio.exercicio1.domain.TodoListItem;
@Repository
public interface TodoListItemRepository extends JpaRepository<TodoListItem, Integer>{

}
