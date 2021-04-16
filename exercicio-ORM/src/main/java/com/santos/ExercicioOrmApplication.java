package com.santos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import domain.TodoList;
import domain.TodoListItem;
import repository.TodoListItemRepository;
import repository.TodoListRepository;


@SpringBootApplication
public class ExercicioOrmApplication implements CommandLineRunner{
@Autowired
TodoListRepository listRepo;
@Autowired
TodoListItemRepository itemRepo;
	public static void main(String[] args) {
		SpringApplication.run(ExercicioOrmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		TodoList list1 = new TodoList("Frutas", null);
		TodoListItem f1 = new TodoListItem("abacate", null, list1);
		TodoListItem f2 = new TodoListItem("melão", null, list1);
		TodoListItem f3 = new TodoListItem("jaca", null, list1);
	
		listRepo.save(list1);
		itemRepo.save(f1);
		itemRepo.save(f2);
		itemRepo.save(f3);
	}

}
