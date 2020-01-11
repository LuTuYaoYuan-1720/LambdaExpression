package Predicate;

import java.util.function.Predicate;

/**
 * Predicate 接口中test 对执行类型对象进行判断
 * 符合条件  ： 返回true
 */
public class Demo01Predicate {

    public static boolean checkString(String s, Predicate<String> pred) {

        return pred.test(s);
    }

    public static void main(String[] args) {

        String s = "fadfsakhaf";

        System.out.println(checkString(s, (String ss) -> ss.length() > 5));
    }
}
