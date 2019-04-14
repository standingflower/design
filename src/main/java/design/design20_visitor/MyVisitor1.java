package design.design20_visitor;

public class MyVisitor1 implements Visitor {


    public void visit(Subject sub) {
        System.out.println("我开车来访问" + sub.getSubject());
    }
}
