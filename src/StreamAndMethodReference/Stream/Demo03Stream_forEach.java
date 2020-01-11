package StreamAndMethodReference.Stream.Stream;

import java.util.stream.Stream;

/**
 * forEach 接收一个Consumer接口函数，将每一个数据交给函数进行处理
 * <p>
 * forEach是一个终结方法，便利之后就不能继续调用Stream流中的其他方法
 */
public class Demo03Stream_forEach {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王二麻", "赵六");
        stream.forEach((name) -> System.out.println(name));

         stream.forEach(name-> System.out.println(name));
    }
}
