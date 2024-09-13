package com.springboot.fullstack.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class TodoCotroller {
	private TodoService todoService;

	public TodoCotroller(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	@RequestMapping("todos")
	public String listAllTodos(ModelMap model) {
		String username = (String) model.get("name");
		List<Todo> todos = todoService.findbyUsername(username);
		model.addAttribute("todos", todos);
		return "listTodos";
	}

	@RequestMapping(value = "addTodo", method = RequestMethod.GET)
	public String showNewTodo(ModelMap model) {
		String username = (String) model.get("name");
		Todo todo = new Todo(0, username, "", LocalDate.now().plusMonths(6), false); // default value need to be set
		model.put("todo", todo);
		return "addTodo";
	}

	@RequestMapping(value = "addTodo", method = RequestMethod.POST)
	public String addNewTodos(ModelMap model, @Valid Todo todo, BindingResult result) {
		if (result.hasErrors()) {
			return "addTodo";
		}
		String username = (String) model.get("name");
		todoService.addTodo(username, todo.getDescription(), todo.getTargetDate(), false);
		return "redirect:todos"; // Here we are redirecting to the different url
	}

	@RequestMapping(value = "updateTodo", method = RequestMethod.GET)
	public String updateTodo(@RequestParam int id, ModelMap model) {
		Todo todo = todoService.findById(id);
		model.addAttribute("todo", todo);
		return "addTodo";
	}

	@RequestMapping(value = "updateTodo", method = RequestMethod.POST)
	public String updateTodoSubmit(ModelMap model, @Valid Todo todo, BindingResult result) {
		if (result.hasErrors()) {
			return "addTodo";
		}
		String username = (String) model.get("name");
		todo.setUsername(username);
		todoService.updateTodo(todo);
		return "redirect:todos";
	}

	@RequestMapping("deleteTodo")
	public String deleteTodo(@RequestParam int id) {
		todoService.removeTodo(id);
		return "redirect:todos";
	}
}
