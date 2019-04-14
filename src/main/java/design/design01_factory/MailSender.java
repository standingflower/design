package design.design01_factory;

import design.design01_factory.Sender;

public class MailSender implements Sender {
    public void Send() {
        System.out.println("发邮件");
    }
}
