package example.userFunctions;

import example.user.City;
import example.user.Degree;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VerificationFormResponse {
    private City[] cities;
    private Degree[] degrees;
}
