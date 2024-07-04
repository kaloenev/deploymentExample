package example.user;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MessageContact {
    @Id
    @GeneratedValue
    private Integer messageID;

    private boolean isRead;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "teacher_id")
    @ToString.Exclude
    private Teacher teacher;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "student_id")
    @ToString.Exclude
    private Student student;

    @OneToMany(mappedBy = "contact")
    @ToString.Exclude
    private List<Message> messages;

    public void addNewMessage(Message message) {
        messages.add(0, message);
    }
}
