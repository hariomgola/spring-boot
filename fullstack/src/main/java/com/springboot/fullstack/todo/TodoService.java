package com.springboot.fullstack.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {
	private static int todoListCount = 0;
	private static List<Todo> todos = new ArrayList<>();
	static {
		todos.add(new Todo(++todoListCount, "Hari", "Learn Java", LocalDate.now().plusWeeks(1), false));
		todos.add(new Todo(++todoListCount, "Hari", "Learn React", LocalDate.now().plusMonths(1), false));
		todos.add(new Todo(++todoListCount, "Hari", "Learn Devops", LocalDate.now().plusWeeks(1), false));
	}

	public List<Todo> findbyUsername(String username) {
		Predicate<? super Todo> predicate = todo -> todo.getUsername().equalsIgnoreCase(username);
		return todos.stream().filter(predicate).toList();
	}

	public Todo findById(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		var todoById = todos.stream().filter(predicate).findFirst().get();
		return todoById;
	}

	public void addTodo(String username, String description, LocalDate targetDate, boolean isDone) {
		todos.add(new Todo(++todoListCount, username, description, targetDate, isDone));
	}

	public void removeTodo(int id) {
		// lambda function
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
	}

	public void updateTodo(@Valid Todo todo) {
		removeTodo(todo.getId());
		todos.add(todo);
	}

}
