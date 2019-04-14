package design.design06_decorator.demo01;

public class DecoratorTest {
    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable obj = new Decorator1(new Decorator2(source));
        obj.method();
    }

}
