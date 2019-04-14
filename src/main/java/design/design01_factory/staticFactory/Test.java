package design.design01_factory.staticFactory;

import design.design01_factory.Sender;

public class Test {

    /**
     * 直接调用工厂方法 static
     */
    public static void main(String[] args) {
        Sender sender = SendFactory.produceMail();
        sender.Send();
    }

}
