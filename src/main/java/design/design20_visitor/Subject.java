package design.design20_visitor;

/**
 * 这里应该是一个抽象类
 */
public interface Subject {
    void accept(Visitor visitor);

    /**
     * 被访者者提供的数据
     */
    String getSubject();
}
