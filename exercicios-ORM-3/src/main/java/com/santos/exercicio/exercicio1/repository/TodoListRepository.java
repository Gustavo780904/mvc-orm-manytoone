package com.santos.exercicio.exercicio1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.santos.exercicio.exercicio1.domain.TodoList;
@Repository
public interface TodoListRepository extends JpaRepository<TodoList, Integer>{

}
