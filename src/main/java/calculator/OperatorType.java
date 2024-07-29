package calculator;

public enum OperatorType {
    Mod(new ModOperator(), '%'),
    Add(new AddOperator(), '+'),
    Sub(new SubtractOperator(), '-'),
    Mul(new MultiplyOperator(), '*'),
    Div(new DivideOperator(), '/');

    private Operator operator;
    private char symbol;

    OperatorType(Operator operator, char symbol) {
        setOperator(operator);
        setSymbol(symbol);
    }

    public Operator getOperator() {
        return operator;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public static OperatorType getOperator(char symbol) {
        for(OperatorType ot : OperatorType.values()) {
            if(ot.symbol == symbol) {
                return ot;
            }
        }
        return null;
    }
}
