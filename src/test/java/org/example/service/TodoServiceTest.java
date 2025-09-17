package org.example.service;

import org.example.data.models.Category;
import org.example.data.models.Todo;
import org.example.data.repositories.TodoRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class TodoServiceTest {


    Todo todo;

    @Test
    public void addTodo_TodoListContainsOne() {
        TodoService todoService = new TodoService();
//        TodoRepo todoRepo = new TodoRepo();
        Todo todo = new Todo(
                null,
                "Read a book",
                Category.ACADEMIC,
                LocalDateTime.now().plusDays(3),
                LocalDateTime.now(),
                false
        );
        todoService.addTodo(todo);
        var allTodo = todoService.getAllTodo();

        assertEquals(1, allTodo.size());
        assertEquals("Read a book", todo.getTaskName());
    }

    @Test
    void getAllTodo() {
    }

    @Test
    void getTodoById() {
    }

    @Test
    void getTodoByName() {
    }

    @Test
    void markAsComplete() {
    }

    @Test
    void deleteTask() {
    }
}