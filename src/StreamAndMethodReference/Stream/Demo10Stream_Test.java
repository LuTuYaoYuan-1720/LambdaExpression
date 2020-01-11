package StreamAndMethodReference.Stream.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo10Stream_Test {

    public static void main(String[] args) {
        List<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("庄子");
        one.add("洪七公");

        List<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("尼古拉斯赵四");
        two.add("张天爱");
        two.add("张二狗");

        //选取出长度为 3 的集合中的前三个
        Stream<String> oneStream = one.stream().filter(name -> name.length() == 3).limit(3);
        //选取出第一个字符为“张”的串中除去前两个
        Stream<String> twoStream = two.stream().filter(name -> name.startsWith("张")).skip(2);

        Stream.concat(oneStream, twoStream).map(name -> new Person(name)).forEach(p -> System.out.println(p));
    }
}
