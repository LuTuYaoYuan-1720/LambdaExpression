package Function;

import java.util.function.Function;

/**
 * 将字符串类型的数据转换为Integer类型后加一
 * 然后转换为String类型
 */
public class Demo02Function_andThen {

    public static String change(Function<String, Integer> fun1, Function<Integer, String> fun2, String data) {
        return fun1.andThen(fun2).apply(data);
    }

    public static void main(String[] args) {
        String data = "4324";

        System.out.println(change((source) -> Integer.parseInt(source) + 10,
                (source) -> String.valueOf(source), data));
    }
}
