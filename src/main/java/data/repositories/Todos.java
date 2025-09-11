package data.repositories;

import data.models.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface Todos extends MongoRepository<Todo, String> {

    Optional<Todo> findTodosById(String id);
}
