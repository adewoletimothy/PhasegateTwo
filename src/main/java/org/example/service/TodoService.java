package org.example.service;


import org.example.data.models.Todo;
import org.example.data.repositories.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    private final TodoRepo todoRepo;

    public TodoService(TodoRepo todoRepo) {
        this.todoRepo = todoRepo;
    }

    public Todo addTodo(Todo todo) {
        return todoRepo.save(todo);
    }

    public List<Todo> getAllTodo(){
        return todoRepo.findAll();
    }
    public Optional<Todo> getTodoById(String id){
        return todoRepo.findById(id);
    }
    public Optional<Todo> getTodoByName(String name){
        if(todoRepo.findByTaskName(name).isPresent()){
            return todoRepo.findByTaskName(name);
        }
        return  Optional.empty();
    }
    public void markAsComplete(String taskName){
        Optional<Todo> todo = todoRepo.findByTaskName(taskName);
        if(todo.isPresent()){
            Todo myTodo = todo.get();
            myTodo.setCompleted(true);
            todoRepo.save(myTodo);
        }
    }

    public void deleteTask(String id) {
         todoRepo.deleteById(id);
    }
}
