package design.design14_observer.demo03;

public class MySubject extends AbstractSubject {


    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}
