package calculator;

public class ArithmeticCalculator extends Calculator {
    public ArithmeticCalculator() {}

    public void calculateArithmetic(double a, double b, char symbol) {
        double result;

        OperatorType ot =  OperatorType.getOperator(symbol);
        if(ot == null){
            System.out.println("연산기호가 올바르지 않습니다.");
            return;
        }
        Operator operator = ot.getOperator();
        result = operator.operate(a, b);
        System.out.println("결과 : " + result);
        addList(result);
    }
}