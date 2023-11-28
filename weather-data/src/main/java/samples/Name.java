package samples;

import lombok.Value;

// IMMUTABLE
@Value
// @Embeddable
public class Name {

    String forName;

    String middleName;

    String secondName;
}
