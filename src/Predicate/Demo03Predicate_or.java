package Predicate;

import java.util.function.Predicate;

/**
 * 用or连接两个判断条件，满足一个就返回true
 */
public class Demo03Predicate_or {
    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {
        //        return pre1.test(s) && pre2.test(s);
        return pre1.or(pre2).test(s);
    }

    public static void main(String[] args) {
        String s = "H";
        checkString(s, (data) -> data.contains("H"), (data) -> data.length() > 5);
    }
}
