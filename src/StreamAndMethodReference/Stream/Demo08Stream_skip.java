package StreamAndMethodReference.Stream.Stream;

import java.util.stream.Stream;

/**
 * skip  跳过前几个元素
 */
public class Demo08Stream_skip {

    public static void main(String[] args) {
        String[] arr = {"美羊羊", "喜羊羊", "懒羊羊", "灰太狼"};
        Stream<String> stream = Stream.of(arr);
        Stream<String> stream1 = stream.skip(3);

        stream1.forEach(name-> System.out.println(name));
    }
}
