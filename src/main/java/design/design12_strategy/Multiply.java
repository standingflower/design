package design.design12_strategy;

public class Multiply extends AbstractCalculator implements ICalculator {

    public int calculate(String exp) {
        int arrayInt[] = split(exp, "\\*");
        return arrayInt[0] * arrayInt[1];
    }

}
