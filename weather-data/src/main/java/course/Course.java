package course;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Course {

    @Getter
    private Long id;

    @Getter
    private String name;

    @Getter
    private int limit;

    private List<Long> students = new ArrayList<>();

    private Course(String name, int limit) {
        this.name = name;
        this.limit = limit;
    }

    public static Course announce(AnnounceCourseCommand command) {
        return new Course(command.getName(), command.getLimit());
    }

    // Idempotens
    public EnrollResult enroll(EnrollCommand command) {
        var result = new EnrollResult();
        for (var employeeId: command.getIds()) {
            if (students.contains(employeeId)) {
                result.alreadyElrolled(employeeId);
            }
            else if (students.size() < limit) {
                students.add(employeeId);
                //result.enrolled();
            }
            else {
                //result.ignore();
            }
        }
        return result;
    }

    public List<Long> getStudents() {
        return Collections.unmodifiableList(students);
    }
}
