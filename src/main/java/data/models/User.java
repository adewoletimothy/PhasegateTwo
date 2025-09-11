package data.models;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class User {
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;


}
