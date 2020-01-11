package Predicate;

import java.util.function.Predicate;

/**
 * 判断一个字符串长度是否大于  5
 * 大于返回false
 *
 *negate 方法  取反
 */
public class Demo04Predicate_negate {

    public static boolean checkString(String s, Predicate<String> pre1) {
        return pre1.negate().test(s);
    }

    public static void main(String[] args) {
        String s = "Sfqdswq";
        System.out.println(checkString(s, (data) -> data.length() > 5));
    }
}
