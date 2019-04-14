package design.design05_adapter.ClassAdapter;

import design.design05_adapter.Targetable;

public class AdapterTest {

    public static void main(String[] args) {
        Targetable target = new ClassAdapter();
        target.method1();
        target.method2();

        /**
         * 这里的target是指向的是Adapter对象，所以而已指向method1方法
         */
    }


}
