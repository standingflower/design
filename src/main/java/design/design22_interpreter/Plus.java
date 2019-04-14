package design.design22_interpreter;

public class Plus implements Expression {

    public int interpret(Context context) {
        return context.getNum1() + context.getNum2();
    }
}
