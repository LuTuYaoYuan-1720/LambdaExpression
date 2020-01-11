package Supplier;

import java.util.function.Supplier;

/**
 * 常见的函数式接口
 * Supplier称之为生产型接口，指定接口的类型是什么类型，接口的get方法就产生一个什么类型的数据
 */
public class Demo01Supplier {
    public static String getString(Supplier<String> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        getString(() -> "XiaoYu");
    }
}
