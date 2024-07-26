package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public static final double PI = 3.14159265358979323846;
    // 원주율은 불변값이므로 final 키워드를 사용하여 상수로 지정함.
    // 또한 인스턴스와 관게없이 항상 같은 값을 갖는 상수이기 때문에 static 키워드를 사용함.
    private List<Integer> listArithmetic;
    private List<Double>  listCircle;
    public Calculator() {
        listArithmetic = new ArrayList<>();
        listCircle = new ArrayList<>();
    }

    public Double calculateCircleArea(int r) {
        Double result = r * PI;

        listCircle.add(result);

        return result;
    }

    public int calculateArithmetic(int a, int b, char c) {
        int result = 0;

        switch (c) {
            case '/':
                try {
                    result = DivideTest.divideTest(a, b);
                } catch (ArithmeticException e){
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    return 0;
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
                return result;
        }

        listArithmetic.add(result);

        return result;
    }
    public List<Integer> getListArithmetic() {
        return listArithmetic;
    }

    public void setListArithmetic(List<Integer> listArithmetic) {
        this.listArithmetic = listArithmetic;
    }
    public void removeFirstIndexOfArithmetic(){
        listArithmetic.remove(0);
    }
    public void viewResultsArithmetic(){
        System.out.println(listArithmetic);
    }


    public List<Double> getListCircle() {
        return listCircle;
    }
    public void setListCircle(List<Double> listCircle) {
        this.listCircle = listCircle;
    }
    public void removeFirstIndexOfCircle(){
        listCircle.remove(0);
    }
    public void viewResultsCircle(){
        System.out.println(listCircle);
    }
}

class DivideTest {
    public static int divideTest(int a, int b) throws ArithmeticException {
        // 해당 메서드는 인스턴스 저마다의 데이터와 관계없이 호출되기 때문에 static 키워드를 사용하여 인스턴스 생성 없이 호출 가능하도록 함.
        return a / b;
    }
}