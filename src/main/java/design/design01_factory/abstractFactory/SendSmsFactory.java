package design.design01_factory.abstractFactory;

import design.design01_factory.Sender;
import design.design01_factory.SmsSender;

public class SendSmsFactory  implements Provider {
    public Sender produce() {
        return new SmsSender();
    }
}
