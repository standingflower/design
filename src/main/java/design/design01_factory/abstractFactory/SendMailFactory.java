package design.design01_factory.abstractFactory;

import design.design01_factory.MailSender;
import design.design01_factory.Sender;

public class SendMailFactory implements Provider {
    public Sender produce() {
        return new MailSender();
    }
}
