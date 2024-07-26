package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int[] intArr = new int[10];
        int count = 0;

        while(true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int a = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int b = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char c = sc.next().charAt(0);
            sc.nextLine();

            switch (c) {
                case '/':
                    if (b == 0) {
                        System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
                        break;
                    }
                    result = a / b;
                    if(count < 10) {
                        intArr[count] = result;
                        count++;
                    }
                    break;
                case '+':
                    result = a + b;
                    if(count < 10) {
                        intArr[count] = result;
                        count++;
                    }
                    break;
                case '-':
                    result = a - b;
                    if(count < 10) {
                        intArr[count] = result;
                        count++;
                    }
                    break;
                case '*':
                    result = a * b;
                    if(count < 10) {
                        intArr[count] = result;
                        count++;
                    }
                    break;
                default:
                    break;
            }

            System.out.println("결과 : " + result);
//            for(int i : intArr) {
//                System.out.println("지난 결과 : " + i);
//            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) : ");
            String str = sc.nextLine();

            if(str.equals("exit")) break;
        }
    }
}
