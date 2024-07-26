package calculator;

public class CircleCalculator extends Calculator {
    public static final double PI = 3.14159265358979323846;
    // 원주율은 불변값이므로 final 키워드를 사용하여 상수로 지정함.
    // 또한 인스턴스와 관게없이 항상 같은 값을 갖는 상수이기 때문에 static 키워드를 사용함.
    public Double calculateCircleArea(int r) {
        Double result = r * PI;

        addList(result);

        return result;
    }
}