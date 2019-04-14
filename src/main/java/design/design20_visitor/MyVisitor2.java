package design.design20_visitor;

public class MyVisitor2 implements Visitor {


    public void visit(Subject sub) {
        System.out.println("我开飞机来访问" + sub.getSubject());
    }
}
