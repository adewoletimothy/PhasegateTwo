package data.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
public class Todo {

    @Id
    private String id;
    private String TaskName;
    private Category category;
    private LocalDateTime dueDate;
    private LocalDateTime createdDate;
    private boolean isCompleted;

}
