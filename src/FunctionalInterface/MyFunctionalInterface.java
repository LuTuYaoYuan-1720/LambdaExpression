package FunctionalInterface;

/**
 * 函数式接口：有且只有一个方法的接口
 * 接口中可以包含其他的方法（默认，静态，私有）
 *
 * @FunctionalInterface  注解
 * 可以检测接口是否为一个函数式接口
 *
 */
@java.lang.FunctionalInterface
public interface MyFunctionalInterface {

    public abstract void method();

}
