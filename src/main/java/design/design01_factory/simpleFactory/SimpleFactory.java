package design.design01_factory.simpleFactory;

import design.design01_factory.MailSender;
import design.design01_factory.Sender;
import design.design01_factory.SmsSender;

public class SimpleFactory {

    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }

    }
}
