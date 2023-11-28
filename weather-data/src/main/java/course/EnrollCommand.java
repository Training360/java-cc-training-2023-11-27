package course;

import lombok.Value;

import java.util.List;

@Value
public class EnrollCommand {

    Long courseId;

    List<Long> ids;
}
