package com.acme.todolist.application.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.acme.todolist.application.port.in.AddTodoItem;
import com.acme.todolist.application.port.out.UpdateTodoItem;
import com.acme.todolist.domain.TodoItem;

@Component
public class AddTodoItemService implements AddTodoItem {

	private UpdateTodoItem updateTodoItem;
	private AddTodoItem addTodoItem;


	//A compléter d
	@Inject
	public AddTodoItemService(UpdateTodoItem updateTodoItem, AddTodoItem addTodoItem) {
		this.updateTodoItem = updateTodoItem;
		this.addTodoItem = addTodoItem;
	}

	@Override
	public void addTodoItem(TodoItem item) {
		this.updateTodoItem.storeNewTodoItem(item);
	}

}
