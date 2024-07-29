package calculator;

import java.util.List;
import java.util.Scanner;

public class ArithmeticCalculator extends Calculator {
    public ArithmeticCalculator() {}

    public void calculateArithmetic(double a, double b, char symbol) {
        double result;
        Scanner sc = new Scanner(System.in);

        OperatorType ot =  OperatorType.getOperator(symbol);
        if(ot == null){
            System.out.println("연산기호가 올바르지 않습니다.");
            return;
        }
        Operator operator = ot.getOperator();
        result = operator.operate(a, b);
        System.out.println("결과 : " + result);
        addList(result);
        System.out.print("d(실수)보다 큰 값을 조회합니다. d : ");
        double d = sc.nextDouble();
        sc.nextLine();

        List<Double> list = getList().stream().filter(ld -> ld > d).toList();

        System.out.println("d보다 큰 값 : " + list);

    }
}