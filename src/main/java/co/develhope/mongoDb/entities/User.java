package co.develhope.mongoDb.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;


@Data
public class User {

    @Id
    private String Id;
    private String firstName;
    private String lastName;
}
