package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int a = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int b = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char c = sc.next().charAt(0);
            sc.nextLine();

            int result = cal.calculate(a, b, c);

            System.out.println("결과 : " + result);

            System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제) : ");
            String cmd = sc.nextLine();
            if(cmd.equals("remove")) {
                cal.removeFirstIndex();
            }

            System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) : ");
            cmd = sc.nextLine();

            if(cmd.equals("inquiry")) {
                System.out.println(cal.getList());
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) : ");
            cmd = sc.nextLine();

            if(cmd.equals("exit")) break;
        }
    }
}
