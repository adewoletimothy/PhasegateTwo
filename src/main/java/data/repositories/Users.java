package data.repositories;

import data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface Users extends MongoRepository<User, String> {

    Optional<User> findUserByUsername(String username);

}
