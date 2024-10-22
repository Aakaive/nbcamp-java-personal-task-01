package calculator;

public class DivideOperator extends Operator {
    @Override
    public double operate(double a, double b) {
        double result;
        try {
            result = DivideTest.divideTest(a, b);
        } catch (ArithmeticException e){
            System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            return 0.0;
        }

        return result;
    }
}

class DivideTest {
    public static double divideTest(double a, double b) throws ArithmeticException {
        // 해당 메서드는 인스턴스 저마다의 데이터와 관계없이 호출되기 때문에 static 키워드를 사용하여 인스턴스 생성 없이 호출 가능하도록 함.
        return a / b;
    }
}