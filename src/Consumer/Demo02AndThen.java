package Consumer;

import java.util.function.Consumer;

/**
 * 需要两个Consumer接口，可以把两个Consumer接口组合到一起
 * 对数据进行消费
 * Consumer<String>  con1
 * Consumer<String>  con2
 * String s = "hello"
 * <p>
 * con1.andThen(con2).accept(s)   谁写前面谁先消费
 */
public class Demo02AndThen {

    public static void method(String s, Consumer<String> con1, Consumer<String> con2) {
//        con1.accept(s);
//        con2.accept(s);

        con1.andThen(con2).accept(s);
    }

    public static void main(String[] args) {
        String s = "hello";

        method(s, (t) -> {
                    System.out.println(t.toUpperCase());
                },
                (t) -> {
                    System.out.println(t.toLowerCase());
                });
    }
}
