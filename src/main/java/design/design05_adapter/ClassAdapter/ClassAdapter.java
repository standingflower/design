package design.design05_adapter.ClassAdapter;

import design.design05_adapter.Source;
import design.design05_adapter.Targetable;

public class ClassAdapter extends Source implements Targetable {

    public void method2() {
        System.out.println("this is the targetable method!");
    }

    /**
     * 此时Adapter有两个方法，一个是父类的method1，重写接口的method2
     *
     * 接口中的方法应该全需要被重写，接口的method1已经被ClassAdapter继承父类method1方法重写
     *
     */

}