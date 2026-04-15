package kg.attractor.lesson55lab.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private String email;
    private String password;
    private String name;
    private String about;
    private AccountType accountType;
    private String avatar;
}