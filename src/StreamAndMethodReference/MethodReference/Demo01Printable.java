package StreamAndMethodReference.MethodReference;

public class Demo01Printable {

    public static void printString(Printable p) {
        p.print("hello world");
    }

    public static void main(String[] args) {
        printString((s) -> System.out.println(s.toUpperCase()));
        printString(System.out::println);
    }
}
