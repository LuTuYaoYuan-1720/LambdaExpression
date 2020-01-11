package Function;

import java.util.function.Function;

/**
 * 将字符串中的年龄拆出来加 10 后返回
 */
public class Demo03Test {

    public static int change(String data, Function<String,String>fun1,Function<String,Integer> fun2,
                             Function<Integer,Integer> fun3){
        return fun1.andThen(fun2).andThen(fun3).apply(data);
    }

    public static void main(String[] args) {
        String data = "小雨,19";
        System.out.println(change(data, (S) -> S.split(",")[1],
                (S) -> Integer.parseInt(S),
                (S) -> S + 10));
    }
}
