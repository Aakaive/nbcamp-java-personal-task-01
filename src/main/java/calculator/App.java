package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while(true) {
            int result = 0;

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
                    break;
            }

            System.out.println("결과 : " + result);

            System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제) : ");
            String cmd = sc.nextLine();
            if(cmd.equals("remove")) {
                list.remove(0);
                list.add(result);
            }
            else {
                list.add(result);
            }

//            System.out.println(list);

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) : ");
            cmd = sc.nextLine();

            if(cmd.equals("exit")) break;
        }
    }
}
