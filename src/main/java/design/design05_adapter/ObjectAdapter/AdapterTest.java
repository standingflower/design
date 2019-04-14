package design.design05_adapter.ObjectAdapter;

import design.design05_adapter.Source;
import design.design05_adapter.Targetable;

public class AdapterTest {

    public static void main(String[] args) {
        Source source = new Source();
        Targetable target = new Wrapper(source);
        target.method1();
        target.method2();
    }


}
