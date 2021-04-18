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
import com.santos.exercicio.exercicio2.domain.Library;
import com.santos.exercicio.exercicio2.repository.BookRepository;
import com.santos.exercicio.exercicio2.repository.LibraryRepository;
import com.santos.exercicio.exercicio3.domain.PostComment;
import com.santos.exercicio.exercicio3.repository.PostCommentRepository;
import com.santos.exercicio.exercicio3.repository.PostRepository;

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

	@Autowired
	PostCommentRepository postRepo;
	@Autowired
	PostRepository PostComRepo;
	public static void main(String[] args) {
		SpringApplication.run(ExerciciosOrm3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoList();
		library();
		
	}

	public void todoList() {
		itemRepo.deleteAll();
		listaRepo.deleteAll();

		TodoList lista = new TodoList("Frutas");
		TodoListItem ft1 = new TodoListItem(null, "banana", lista);
		TodoListItem ft2 = new TodoListItem(null, "abacate", lista);
		TodoListItem ft3 = new TodoListItem(null, "limão", lista);
		listaRepo.save(lista);
		itemRepo.save(ft1);
		itemRepo.save(ft2);
		itemRepo.save(ft3);
		lista.getItems().add(ft1);
		lista.getItems().add(ft2);
		lista.getItems().add(ft3);

		TodoList lista1 = new TodoList("Livros");
		TodoListItem lv1 = new TodoListItem(null, "O Caibalion", lista1);
		TodoListItem lv2 = new TodoListItem(null, "O Silmarillion", lista1);
		TodoListItem lv3 = new TodoListItem(null, "A República", lista1);

		listaRepo.save(lista1);
		itemRepo.save(lv1);
		itemRepo.save(lv2);
		itemRepo.save(lv3);
		lista.getItems().add(lv1);
		lista.getItems().add(lv2);
		lista.getItems().add(lv3);
	}

	public void library() {
		bookRepo.deleteAll();
		libraRepo.deleteAll();

		Library lista = new Library("Filosofia");
		Book lv1 = new Book("O Caibalion");
		Book lv2 = new Book("O Silmarillion");
		Book lv3 = new Book("A República");
		Book lv4 = new Book("Os Simpsons e a Filosofia");

		libraRepo.save(lista);
		bookRepo.save(lv1);
		bookRepo.save(lv2);
		bookRepo.save(lv3);
		bookRepo.save(lv4);
		lista.getBooks().add(lv1);
		lista.getBooks().add(lv2);
		lista.getBooks().add(lv3);
		lista.getBooks().add(lv4);
	}
}
