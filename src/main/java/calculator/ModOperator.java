package calculator;

public class ModOperator extends Operator {
    public ModOperator(int a, int b) {
        super(a, b);
    }

    @Override
    public double operate() {
        return  getA() % getB();
    }
}
