package Predicate;

import java.util.function.Predicate;

/**
 * 用and方法连接，都满足则返回true
 */
public class Demo02Predicate_and {

    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {
        return pre1.and(pre2).test(s);
    }

    public static void main(String[] args) {

        String s = "fadhhfaHfa";
        System.out.println(checkString(s, (data) -> data.contains("W"), (data) -> data.contains("H")));
    }
}
