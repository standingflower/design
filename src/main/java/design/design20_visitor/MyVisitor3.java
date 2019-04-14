package design.design20_visitor;

public class MyVisitor3 implements Visitor {

    public void visit(Subject sub) {
        System.out.println("我开火箭来访问" + sub.getSubject());
    }
}
