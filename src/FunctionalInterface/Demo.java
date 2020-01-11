package FunctionalInterface;

/**
 * 函数式接口的使用：一般可以做为方法的参数和返回值类型
 */
public class Demo {
    static void show(MyFunctionalInterface myInter) {
        myInter.method();
    }

    public static void main(String[] args) {
        //调用show方法，方法的参数是一个接口，所以可以传递接口的实现类对象
        show(new MyFunctionalInterfaceImpl());

        //可以传递接口的匿名内部类
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口中的抽象方法");
            }
        });

        //函数式接口，可以传递lambda表达式
        show(() -> {
            System.out.println("使用lambda表达式，重写接口中的抽象方法");
        });

        //简化lambda表达式
        show(()-> System.out.println("使用lambda表达式，重写接口中的抽象方法"));


    }
}
