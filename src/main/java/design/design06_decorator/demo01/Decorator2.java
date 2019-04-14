package design.design06_decorator.demo01;

public class Decorator2 implements Sourceable {
    private Sourceable source;

    public Decorator2(Sourceable source) {
        super();
        this.source = source;
    }

    public void method() {
        System.out.println("装饰者2号");
        source.method();
    }
}
