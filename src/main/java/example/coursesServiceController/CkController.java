package example.coursesServiceController;


import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/security/api/v1/lessons")
@RequiredArgsConstructor
@CrossOrigin
public class CkController {
    private final CkService ckService;

    @GetMapping("/getSubjectGrades")
    public ResponseEntity<Object> getSubjectGrades() {
        return ResponseEntity.ok(ckService.getSubjectGrade());
    }

}
