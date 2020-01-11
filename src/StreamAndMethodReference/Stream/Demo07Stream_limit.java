package StreamAndMethodReference.Stream.Stream;

import java.util.stream.Stream;

/**
 * limit  是一个延迟方法  ，返回一个新的流  ，可以继续调用其他方法
 */
public class Demo07Stream_limit {

    public static void main(String[] args) {
        String[] arr = {"美羊羊", "喜羊羊", "懒羊羊", "灰太狼"};
        Stream<String> stream = Stream.of(arr);
        Stream<String> stream1 = stream.limit(3);

        stream1.forEach(name-> System.out.println(name));
    }
}
