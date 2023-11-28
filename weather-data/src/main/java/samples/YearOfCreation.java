package samples;

import lombok.*;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode
public class YearOfCreation {

    int year;



    public static YearOfCreation of(int year) {
        return new YearOfCreation(year);
    }

}
