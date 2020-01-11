package Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo05Test {

    public static ArrayList<String> checkString(String[] arr, Predicate<String> pre1, Predicate<String> pre2) {
        ArrayList<String> list = new ArrayList<>();
        for (String message : arr) {
            if (pre1.and(pre2).test(message)) {
                list.add(message);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] arr = {"迪丽热巴,女", "赵丽颖,女", "马尔巴哈,男"};
        System.out.println(checkString(arr,
                (message) -> message.split(",")[0].length() == 4,
                (message) -> message.split(",")[1].equals("女")).toString());
    }
}
