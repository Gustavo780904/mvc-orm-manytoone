package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import domain.TodoList;
import domain.TodoListItem;
@Repository
public interface TodoListItemRepository extends JpaRepository<TodoList, Integer>{

	void save(TodoListItem f1);

}
