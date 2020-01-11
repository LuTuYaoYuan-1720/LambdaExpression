package Lambda;

/**
 * 使用lambda优化日志案例
 * lambda的特点：延迟加载
 * 使用前提：必须存在函数是接口
 */
public class Demo02Lambda {
    public static void showLog(int level, MessageBuilder mb) {
        if (level == 1) {
            System.out.println(mb.builderMessage());
        }
    }

    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        showLog(1, () -> {
            return msg1 + msg2 + msg3;
        });

        showLog(1, () -> msg1 + msg2 + msg3);
        /*
        使用lambda表达式做为传递参数，仅仅是将参数传递到showLog方法中
        只有满足条件，才会调用接口中的方法，才会进行字符串的拼接
        不满足，就没有执行接口中的方法
        不会存在性能的浪费
         */
    }
}
