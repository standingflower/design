package design.design20_visitor;

public class Test {

    public static void main(String[] args) {
        Visitor visitor = new MyVisitor3();
        Subject sub = new MySubject();
        sub.accept(visitor);
    }

}
