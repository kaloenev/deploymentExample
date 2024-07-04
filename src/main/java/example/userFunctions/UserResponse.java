package example.userFunctions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private int id;
    private String email;
    private String name;
    private String surname;
    private String role;
    private String picture;
    private boolean isVerified;
    private boolean isBeingVerified;
}
