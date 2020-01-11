package StreamAndMethodReference.Stream.Stream;

import java.util.ArrayList;
import java.util.List;

/**
 * count 是一个终结方法，返回值为一个Long类型的整数
 */
public class Demo06Stream_count {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        Long count = list.stream().count();
        System.out.println(count);
    }
}
