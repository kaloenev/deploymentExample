package example.userFunctions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserProfileResponse {
    private int id;

    public UserProfileResponse(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    private String name;
    private String surname;
    private String imageLocation;
}
