package design.design01_factory.simpleFactory;

import design.design01_factory.Sender;

public class TestSimple {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Sender sender = factory.produce("sms");
        sender.Send();
    }
}
