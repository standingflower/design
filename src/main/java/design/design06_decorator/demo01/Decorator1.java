package design.design06_decorator.demo01;

public class Decorator1 implements Sourceable {
    private Sourceable source;

    public Decorator1(Sourceable source) {
        super();
        this.source = source;
    }

    public void method() {
        System.out.println("装饰者1号");
        source.method();
    }
}
