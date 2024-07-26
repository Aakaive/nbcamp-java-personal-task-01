package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    List<Integer> list = new ArrayList<>();
    public int calculate(int a, int b, char c) {
        int result = 0;
        DevideTest dt = new DevideTest();

        switch (c) {
            case '/':
                try {
                    result = dt.devideTest(a, b);
                } catch (ArithmeticException e){
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }

                break;
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            default:
                System.out.println("잘못된 연산기호를 입력하셨습니다.");
                break;
        }

        list.add(result);

        return result;
    }
}

class DevideTest {
    public int devideTest(int a, int b) throws ArithmeticException {
        return a / b;
    }
}