package StreamAndMethodReference.ThisMethodReference;

/**
 * 通过this引用本类的成员方法
 */
public class Husband {

    public void buyHouse() {
        System.out.println("二环一套别墅");
    }

    public void marry(Richable r) {
        r.buy();
    }

    public void soHappy() {
/*        marry(()->{
            this.buyHouse();
        });*/

        marry(this::buyHouse);
    }

    public static void main(String[] args) {
        new Husband().buyHouse();
    }
}
