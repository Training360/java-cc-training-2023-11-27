package course;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class EnrollResult {

//    private List<Long> alreadyEnrolled = new ArrayList<>();
//
//    private List<Long> enrolled = new ArrayList<>();
//
//    private List<Long> ignored= new ArrayList<>();

    private enum Status {ALREADY_ENROLLED, ENROLLED, IGNORED}

    private Map<Long, Status> employees = new HashMap<>();

    public void alreadyElrolled(Long employeeId) {
//        enrolled.add(employeeId);
        employees.put(employeeId, Status.ALREADY_ENROLLED);
    }
}
