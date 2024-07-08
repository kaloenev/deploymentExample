package example.coursesServiceController;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FilterRequest {
    private int pageNumber;
    private String subject;
    private String grade;
    private int[] days;
    private double priceLowerBound;
    private double priceUpperBound;
    private String hoursLowerBound;
    private String hoursUpperBound;
    private String lowerBound;
    private String upperBound;
    private String searchTerm;
    private String sort;
    private boolean privateLesson;
}
