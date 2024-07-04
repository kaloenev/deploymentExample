package example.lessons;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Timestamp;
import java.util.List;

public interface AssignmentRepo extends JpaRepository<Assignment, Integer> {
    Assignment getAssignmentByAssignmentID(int id);

    @Query("select a.solutions from Assignment a where a.assignmentID = :id")
    List<Solution> getAssignment_SolututionsByAssignmentID(int id);

    @Query("""
            select c from Assignment c
            where c.teacher.id = :teacherId and c.dueDateTime between :lowerBound and :upperBound""")
    List<Assignment> getLessonTerminsByDateAndTeacherID(@Param("teacherId") int teacherId,
                                                          @Param("lowerBound") String lowerBound,
                                                          @Param("upperBound") String upperBound);
    @Query("""
            select c from Assignment c inner join c.students enrolledStudents
            where enrolledStudents.id = :studentId and c.dueDateTime between :lowerBound and :upperBound""")
    List<Assignment> getAssignmentsByDateAndEnrolledStudentID(@Param("studentId") int studentId,
                                                                  @Param("lowerBound") Timestamp lowerBound,
                                                                  @Param("upperBound") Timestamp upperBound);
}
