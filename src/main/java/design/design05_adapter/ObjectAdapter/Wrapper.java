package design.design05_adapter.ObjectAdapter;

import design.design05_adapter.Source;
import design.design05_adapter.Targetable;

public class Wrapper implements Targetable {
    private Source source;

    public Wrapper(Source source) {
        super();
        this.source = source;
    }

    public void method2() {
        System.out.println("this is the targetable method!");
    }

    public void method1() {
        source.method1();
    }
    /**
     * 被适配对象在另一个对象中调用
     */
}
