package example.userFunctions;

import example.user.City;
import example.user.Degree;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    public VerificationFormResponse getVerificationForm() {
        return new VerificationFormResponse(City.values(), Degree.values());
    }
}