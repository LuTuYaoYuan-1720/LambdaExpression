package StreamAndMethodReference.ObjectMethodReference;

/**
 * 通过对象名引用成员方法
 */
public class Demo01ObjectMethodReference {

    public static void printString(Printable p) {
        p.print("hello");
    }

    public static void main(String[] args) {
        printString(s -> {
                    MethodReferenceObject obj = new MethodReferenceObject();
                    obj.printUppercaseString(s);
                }
        );

        //优化lambda表达式   前提是对象是已经存在的，成员方法也是存在的
        MethodReferenceObject obj = new MethodReferenceObject();
        printString(obj::printUppercaseString);
    }
}
