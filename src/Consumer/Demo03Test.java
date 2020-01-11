package Consumer;

import java.util.function.Consumer;

public class Demo03Test {

    public static void printInfo(String[] arr, Consumer<String> con1, Consumer<String> con2) {
        for (String message : arr) {
            con1.andThen(con2).accept(message);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"牛澄宇,男", "孙卓,女", "孙红雷,男"};

        printInfo(arr,
                (message) -> System.out.print("姓名 ：" + message.split(",")[0]),
                (message) -> System.out.println("     性别：" + message.split(",")[1]));
    }
}
