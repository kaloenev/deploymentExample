package example.coursesServiceController;

import example.user.Grade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CkService {
    public FilterResponse getSubjectGrade() {
        List<String> subjects = new ArrayList<>();
        for (Subject subject : Subject.values()) {
            subjects.add(subject.toString());
        }
        List<String> grades = new ArrayList<>();
        for (Grade grade : Grade.values()) {
            grades.add(grade.toString());
        }
        FilterResponse filterResponse = new FilterResponse();
        filterResponse.setGrades(grades);
        filterResponse.setSubjects(subjects);
        return filterResponse;
    }
}