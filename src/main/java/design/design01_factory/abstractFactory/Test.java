package design.design01_factory.abstractFactory;

import design.design01_factory.Sender;

public class Test {

    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
    }
    /**
     * 对于简单工厂模式与静态工厂方法模式，当有新Sender时，就会修改Factory方法，不满足开闭原则
     *
     * 抽象：将工厂分离
     */

}
