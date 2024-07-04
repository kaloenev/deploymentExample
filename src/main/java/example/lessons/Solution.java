package example.lessons;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Solution {
    @Id
    @GeneratedValue
    private Integer solutionID;
    private Timestamp dateTime;
    private String solutionFilesLocation;
    private boolean isOverdue;
    private String name;
    private String surname;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assignment_id")
    @ToString.Exclude
    private Assignment assignment;
    private int teacherCommentCount = 0;

    @OneToMany(mappedBy = "solution")
    @ToString.Exclude
    private List<Comment> comments;

    public String getTime() {
        return dateTime.toString().substring(11, 16);
    }

    public String getDate() {
        return dateTime.toString().substring(0, 10);
    }

    public void leaveComment(Comment comment) {
        teacherCommentCount++;
        comments.add(comment);
    }

}
