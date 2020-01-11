package Function;

import java.util.function.Function;

/**
 * 根据一个类型的数据得到另一个类型的数据
 * 前者为前置条件，后者为后置条件
 * 传递一个字符串类型的整数
 * <p>
 * 主要方法 apply ()
 */
public class Demo01Function {

    public static int cast(String s, Function<String, Integer> fun) {
        return fun.apply(s);
    }


    public static void main(String[] args) {
        String s = "10438";
        System.out.println(cast(s, (data) -> Integer.parseInt(data)));
        System.out.println(cast(s, Integer::parseInt));
    }
}
