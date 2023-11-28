package samples;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class SideEffect {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John Doe");

//        List<String> immutable = Collections.unmodifiableList(names);
        List<String> copy = new ArrayList<>(names);

        new SideEffect().printList(copy);
        System.out.println(names);
    }

    public void printList(final List<String> names) {
        names.add("Jack Doe");

        System.out.println(names);
    }

    public void updateTime(LocalTime time) {
        //
    }

    public void setDetails(String... values) {
        var name = values[0];
        var title = values[1];
    }

}
