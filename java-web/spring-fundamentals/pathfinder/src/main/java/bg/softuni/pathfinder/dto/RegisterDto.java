package bg.softuni.pathfinder.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RegisterDto {

    private String username;
    private String fullname;
    private String email;
    private int age;
    private String password;
    private String confirmPassword;
}
