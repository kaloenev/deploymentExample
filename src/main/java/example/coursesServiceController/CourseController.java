package example.coursesServiceController;


import example.exceptionHandling.CustomException;
import example.exceptionHandling.CustomWarning;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;

@RestController
@RequestMapping("/security/api/v1/lessons")
@RequiredArgsConstructor
@CrossOrigin
public class CourseController {
    private final CService cService;

    @GetMapping("/getSubjectGrades")
    public ResponseEntity<Object> getSubjectGrades() {
        return ResponseEntity.ok(cService.getSubjectGrade());
    }

}
