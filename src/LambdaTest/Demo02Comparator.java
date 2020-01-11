package LambdaTest;

import java.util.Arrays;
import java.util.Comparator;

public class Demo02Comparator {

    public static Comparator<String> getComparator() {
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length() - o1.length();
//            }
//        };

//        return (String o1, String o2) -> {
//            return o2.length() - o1.length();
//        };

        return (o1, o2) -> o2.length() - o1.length();
    }

    public static void main(String[] args) {
        String[] strings = {"4214321","fafaf","fdsafaf","24"};

        System.out.println(Arrays.toString(strings));

        Arrays.sort(strings,getComparator());
        System.out.println(Arrays.toString(strings));
    }
}
