package example.lessons;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.Hibernate;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_termin")
public class Termin {
    @Id
    @GeneratedValue
    protected Integer terminID;
    protected String linkToClassroom;
    @Enumerated(EnumType.STRING)
    protected LessonStatus lessonStatus = LessonStatus.NOT_STARTED;
    private Timestamp dateTime;
    protected boolean isFull = false;
    protected boolean isEmpty = true;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lesson_id")
    @ToString.Exclude
    protected Lesson lesson;

    public String getTime() {
        return dateTime.toString().substring(11, 16);
    }

    public String getDate() {
        return dateTime.toString().substring(0, 10);
    }
}
