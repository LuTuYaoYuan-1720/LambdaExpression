package StreamAndMethodReference.StaticMethodReference;


/**
 * 通过类名引用静态成员方法
 */
public class Demo01StaticMethodReference {

    public static int method(int num, Calcable calc) {
        return calc.calcAbs(num);
    }

    public static void main(String[] args) {
        int num = -3;
        System.out.println(method(num, data -> Math.abs(data)));


        System.out.println(method(num, Math::abs));
    }
}
