package org.example.controllers;



import org.example.data.models.Todo;
import org.example.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/todo")
public class TodosController {

    private final TodoService todoService;

    @Autowired
    public TodosController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping("/todo")
    public ResponseEntity<Todo> addTodo(@RequestBody Todo todo){
        Todo savedTodo = todoService.addTodo(todo);
        return ResponseEntity.ok(savedTodo);
    }
    @GetMapping("/todos")
    public List<Todo> getAllTodos(){
        return todoService.getAllTodo();
    }
    @GetMapping("/todo/{taskName}")
    public Optional<Todo> getTodoByName(@PathVariable String taskName){
        return todoService.getTodoByName(taskName);
    }

    @PutMapping("/todo/{taskName}")
    public void updateTodo(@PathVariable String taskName){
        todoService.markAsComplete(taskName);
    }

    @DeleteMapping("/todo/{id}")
    public void deleteTodo(@PathVariable String id){
        todoService.deleteTask(id);
    }


}
