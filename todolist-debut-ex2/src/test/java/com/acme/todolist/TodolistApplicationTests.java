package com.acme.todolist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.acme.todolist.configuration.TodolistApplication;
import com.acme.todolist.domain.TodoItem;

@SpringBootTest
class TodolistApplicationTests {

	@Test
	void contextLoads() {
		
		// Créer un objet TodoItem avec une date
		TodoItem item = new TodoItem("1", Instant.now().minus(2, ChronoUnit.DAYS), "Todo");
		// l'élément est en retard
		assertEquals("[LATE!]", item.finalContent());
	}

}
