package example.user;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.sql.Timestamp;
import java.util.Objects;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_payment")
public class Payment {
    @Id
    @GeneratedValue
    private Integer paymentID;
    private Timestamp dateTime;
    private String number;
    private int amount;
    private String paymentStatus;
    private String lesson;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teacher_id")
    @ToString.Exclude
    private Teacher teacher;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    @ToString.Exclude
    private Student student;

    public String getTime() {
        return dateTime.toString().substring(11, 16);
    }

    public String getDate() {
        return dateTime.toString().substring(0, 10);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Payment payment = (Payment) o;
        return paymentID != null && Objects.equals(paymentID, payment.paymentID);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
