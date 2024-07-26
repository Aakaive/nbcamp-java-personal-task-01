package calculator;

public class AddOperator extends Operator {
    public AddOperator(int a, int b) {
        super(a, b);
    }

    @Override
    public double operate() {
        return getA() + getB();
    }
}
