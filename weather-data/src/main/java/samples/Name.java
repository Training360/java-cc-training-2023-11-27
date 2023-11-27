package samples;

import lombok.Value;

// IMMUTABLE
@Value
// @Embeddable
public class Name {

    private String forName;

    private String middleName;

    private String secondName;
}
