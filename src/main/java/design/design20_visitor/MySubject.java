package design.design20_visitor;

/**
 * 被访问者
 */
public class MySubject implements Subject {

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * 被访问者的数据不变
     */
    public String getSubject() {
        return "Jack(被访问者)";
    }
}
