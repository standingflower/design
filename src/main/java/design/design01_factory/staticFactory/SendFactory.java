package design.design01_factory.staticFactory;

import design.design01_factory.MailSender;
import design.design01_factory.Sender;
import design.design01_factory.SmsSender;

public class SendFactory {

    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }

}
