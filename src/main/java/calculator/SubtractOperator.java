package calculator;

public class SubtractOperator extends Operator {
    public SubtractOperator(int a, int b) {
        super(a, b);
    }

    @Override
    public double operate() {
        return getA() - getB();
    }
}
