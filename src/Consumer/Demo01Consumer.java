package Consumer;

import java.util.function.Consumer;

/**
 *
 */
public class Demo01Consumer {

    public static void method(String name, Consumer<String> con) {
        con.accept(name);
    }

    public static void main(String[] args) {

        String s = "47921799493210428";
        method(s, (obj) ->{
            String reName = new StringBuilder(obj).reverse().toString();
            System.out.println(reName);
        });
        System.out.println(s);
    }

}
