package StreamAndMethodReference.Stream.Stream;

import java.util.*;
import java.util.stream.Stream;

public class Demo02GetStream {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        Map<String, String> map = new HashMap<>();
        //获取键，存储到一个集合中
        Set<String> keySet = map.keySet();
        Stream<String> stream3 = keySet.stream();

        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();

        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream5 = entries.stream();

        Stream<Integer> stream6 = Stream.of(1, 4, 4, 6, 6, 8);
        //可变参数可传递数组
        Integer[] arr = {1, 4, 3, 6, 9};
        Stream<Integer> stream7 = Stream.of(arr);

        String[] arr2 = {"asdf", "fa", "iok"};
        Stream<String> stream8 = Stream.of(arr2);

    }
}
