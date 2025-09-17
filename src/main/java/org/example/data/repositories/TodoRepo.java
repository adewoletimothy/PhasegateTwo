package org.example.data.repositories;

import org.example.data.models.Todo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepo extends MongoRepository<Todo, String> {
     Optional<Todo> findByTaskName(String taskName);

}
