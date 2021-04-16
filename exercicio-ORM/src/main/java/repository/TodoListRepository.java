package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import domain.TodoList;
import domain.TodoListItem;
@Repository
public interface TodoListRepository extends JpaRepository<TodoListItem, Integer>{

	void save(TodoList list1);

}
