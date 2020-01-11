package StreamAndMethodReference.Stream.Stream;

import java.util.stream.Stream;

public class Demo05Stream_map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "3", "4");

        Stream<Integer> stream1 = stream.map((s) -> Integer.parseInt(s));

        stream1.forEach(data -> System.out.println(data));
    }
}
