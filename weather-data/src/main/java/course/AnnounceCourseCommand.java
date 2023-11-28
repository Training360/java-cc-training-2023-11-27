package course;

import lombok.Value;

@Value
public class AnnounceCourseCommand {

    private String name;

    private int limit;
}
