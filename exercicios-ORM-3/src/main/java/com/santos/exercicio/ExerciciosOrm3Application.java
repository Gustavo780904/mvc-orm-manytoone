package com.santos.exercicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.santos.exercicio.exercicio1.domain.TodoList;
import com.santos.exercicio.exercicio1.domain.TodoListItem;
import com.santos.exercicio.exercicio1.repository.TodoListItemRepository;
import com.santos.exercicio.exercicio1.repository.TodoListRepository;
import com.santos.exercicio.exercicio2.domain.Book;
import com.santos.exercicio.exercicio2.repository.BookRepository;
import com.santos.exercicio.exercicio2.repository.LibraryRepository;

@SpringBootApplication
public class ExerciciosOrm3Application implements CommandLineRunner {
	@Autowired
	TodoListRepository listaRepo;
	@Autowired
	TodoListItemRepository itemRepo;
	
	@Autowired
	LibraryRepository libraRepo;
	@Autowired
	BookRepository bookRepo;

	public static void main(String[] args) {
		SpringApplication.run(ExerciciosOrm3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoList();
		library();
	}

	public void todoList() {
		TodoList lista = new TodoList("Frutas");
		TodoListItem ft1 = new TodoListItem(null, "banana", lista);
		TodoListItem ft2 = new TodoListItem(null, "abacate", lista);
		listaRepo.save(lista);
		itemRepo.save(ft1);
		itemRepo.save(ft2);
	}
	public void library() {
//		Library lista = new Library("Filosofia");
		Book lv1 = new Book("O Caibalion");
		Book lv2 = new Book("O Silmarillion");
		Book lv3 = new Book("A República");
		
//		libraRepo.save(lista);
		bookRepo.save(lv1);
		bookRepo.save(lv2);
		bookRepo.save(lv3);
	}
}
