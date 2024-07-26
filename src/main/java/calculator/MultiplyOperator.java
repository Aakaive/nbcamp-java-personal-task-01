package calculator;

public class MultiplyOperator extends Operator {
    public MultiplyOperator(int a, int b) {
        super(a, b);
    }

    @Override
    public double operate() {
        return getA() * getB();
    }
}
