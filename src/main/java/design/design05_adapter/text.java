package design.design05_adapter;

public class text {
    /**
     *适配器模式将某个类的接口转换成客户端期望的另一个接口表示，
     * 目的是消除由于接口不匹配所造成的类的兼容性问题。
     *主要分为三类：
     *  类的适配器模式、
     *  对象的适配器模式、
     *  接口的适配器模式。
     *
     *
     * 不能访问是指不能直接方法，而是直接方法的方式不好
     * 在SpringMVC中，被适配的是Controller(Controller，以及HttpRequestHandler，Servlet)
     * 如果直接调用Controller，就会导致使用if-else判断使用哪类Controller，而且有新的Controller时
     * 还要修改原来代码
     * 判断使用哪种Controller就交由Adapter去判断，将所有的Adapter注入到一个Map中，然后判断
     * 使用哪种Adapter去调用Controller，有新的Controller时，只需添加Adapter
     *
     *
     *  类适配器：  将一个类转换成满足另一个新接口的   类(被适配类的方法名必须和接口方法名相同)
     *  对象适配器：将一个对象转换成满足另一个新接口的 对象
     *  接口适配器：当需要实现一个接口时，又不想重写接口中的方法，可以先让一个空类实现接口，然后在继承
     *             这个空类，根据实际情况重写方法
     */
}
