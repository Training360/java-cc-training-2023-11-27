package samples;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelExample {

    public static void main(String[] args) {
        Random random = new Random();
        List<String> names = Stream.generate(() -> random.nextInt(10))
                .parallel()
                .limit(50)
                .map(i -> "John Doe " + i)
                .toList();

        System.out.println(names);
        System.out.println(names.size());
    }
}
