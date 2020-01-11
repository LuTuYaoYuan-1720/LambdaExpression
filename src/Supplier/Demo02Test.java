package Supplier;

import java.util.function.Supplier;

public class Demo02Test {

    public static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 56, 276, 343, -4};

        System.out.println(getMax(() -> {
            int max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        }));
    }
}
