package design.design01_factory;

public class SmsSender implements Sender {
    public void Send() {
        System.out.println("发短信");
    }
}
