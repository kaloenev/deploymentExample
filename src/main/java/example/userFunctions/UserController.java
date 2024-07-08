package example.userFunctions;


import example.exceptionHandling.CustomException;
import example.exceptionHandling.CustomWarning;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@RestController
@RequestMapping("/demo/api/v1/users")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {
    private final UserService userService;


    @GetMapping("/form")
    public ResponseEntity<Object> getVerificationForm() {
        return ResponseEntity.ok(userService.getVerificationForm());
    }

}
