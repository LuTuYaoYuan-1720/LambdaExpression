package StreamAndMethodReference.ArrayMethodReference;

/**
 * 数组的构造器引用
 */
public class Demo {

    public static int[] createArray(int length, ArrayBuilder builder) {
        return builder.builderArray(length);
    }

    public static void main(String[] args) {

        System.out.println(createArray(10, (length) -> new int[10]).length);

        System.out.println(createArray(10, int[]::new).length);
    }
}
