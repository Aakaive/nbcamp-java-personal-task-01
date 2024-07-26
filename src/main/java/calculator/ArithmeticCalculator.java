package calculator;

public class ArithmeticCalculator extends Calculator {
    private AddOperator add;
    private SubtractOperator sub;
    private MultiplyOperator mul;
    private DivideOperator div;

    public ArithmeticCalculator() {
        add = new AddOperator();
        sub = new SubtractOperator();
        mul = new MultiplyOperator();
        div = new DivideOperator();
    }

    public Double calculateArithmetic(int a, int b, char c) {
        double result = 0.0;

        switch (c) {
            case '/':
                try {
                    result = DivideTest.divideTest(a, b);
                } catch (ArithmeticException e){
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    return 0.0;
                }

                break;
            case '+':
                result = add.operate(a, b);
                break;
            case '-':
                result = sub.operate(a, b);
                break;
            case '*':
                result = mul.operate(a, b);
                break;
            default:
                System.out.println("잘못된 연산기호를 입력하셨습니다.");
                return result;
        }

        addList(result);

        return result;
    }
}

class DivideTest {
    public static int divideTest(int a, int b) throws ArithmeticException {
        // 해당 메서드는 인스턴스 저마다의 데이터와 관계없이 호출되기 때문에 static 키워드를 사용하여 인스턴스 생성 없이 호출 가능하도록 함.
        return a / b;
    }
}