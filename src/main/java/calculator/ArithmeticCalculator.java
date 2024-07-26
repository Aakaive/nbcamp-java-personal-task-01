package calculator;

public class ArithmeticCalculator extends Calculator {
    public ArithmeticCalculator() {
    }

    public Double calculateArithmetic(int a, int b, char c) {
        double result = 0.0;

        Operator operator;
        switch (c) {
            case '/':
                operator = new DivideOperator(a, b);
                break;
            case '+':
                operator = new AddOperator(a, b);
                break;
            case '-':
                operator = new SubtractOperator(a, b);
                break;
            case '*':
                operator = new MultiplyOperator(a, b);
                break;
            case '%':
                operator = new ModOperator(a, b);
                break;
            default:
                System.out.println("잘못된 연산기호를 입력하셨습니다.");
                return result;
        }

        result = operator.operate();

        addList(result);

        return result;
    }
}