package StreamAndMethodReference.SuperMethodReference;

public class Man extends Human {
    @Override
    public void sayHello() {
        System.out.println("hello  , i  am  man");
    }

    public void method(Greetable greet) {
        greet.greet();
    }

    public void show() {

//        method(() -> {
//            Human human = new Human();
//            human.sayHello();
//        });

/*        method(()->super.sayHello());*/

        method(super::sayHello);
    }

    public static void main(String[] args) {
        Man man = new Man();
        man.show();
    }
}
