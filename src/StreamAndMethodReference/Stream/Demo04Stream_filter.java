package StreamAndMethodReference.Stream.Stream;

import java.util.stream.Stream;

public class Demo04Stream_filter {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰", "张翠山", "赵敏", "张无忌");

        Stream<String> stream1 = stream.filter((name) -> name.startsWith("张"));

        stream1.forEach(name -> System.out.println(name));
        /*
        Stream 属于管道流，只能被消费一次
        第一个Stream流调用完毕，数据就会流到下一个Stream上
        而这时第一个Stream已经使用完毕，就会关闭
         */
    }
}
