package example.lessons;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SolutionRepo extends JpaRepository<Solution, Integer> {
    Solution getSolutionBySolutionID(int id);

    Solution getSolutionByAssignment_AssignmentID(int id);
}
