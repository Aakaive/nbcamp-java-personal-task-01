package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("1. 원의 넓이 구하기");
            System.out.println("2. 사칙연산");
            System.out.print("위 항목 중 원하는 작업에 해당하는 번호를 입력해주세요. : ");
            int num;

            try{
                num = sc.nextInt();
            } catch (InputMismatchException e){
                System.out.println(e.getMessage());
                sc.next();
                continue;
            }

            if(num == 1) {
                System.out.print("반지름을 입력하세요: ");
                int r = sc.nextInt();
                sc.nextLine();

                System.out.println("결과 : " + cal.calculateCircleArea(r));

                System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제) : ");
                String cmd = sc.nextLine();
                if (cmd.equals("remove")) {
                    cal.removeFirstIndexOfCircle();
                }

                System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) : ");
                cmd = sc.nextLine();

                if (cmd.equals("inquiry")) {
                    cal.viewResultsCircle();
                }
            }
            else if(num == 2) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int a;
                try{
                    a = sc.nextInt();
                } catch (InputMismatchException e){
                    System.out.println(e.getMessage());
                    sc.next();
                    continue;
                }
                System.out.print("두 번째 숫자를 입력하세요: ");
                int b;
                try{
                    b = sc.nextInt();
                } catch (InputMismatchException e){
                    System.out.println(e.getMessage());
                    sc.next();
                    continue;
                }
                System.out.print("사칙연산 기호를 입력하세요: ");
                char c = sc.next().charAt(0);
                sc.nextLine();

                int result = cal.calculateArithmetic(a, b, c);

                System.out.println("결과 : " + result);

                System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제) : ");
                String cmd = sc.nextLine();
                if (cmd.equals("remove")) {
                    cal.removeFirstIndexOfArithmetic();
                }

                System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) : ");
                cmd = sc.nextLine();

                if (cmd.equals("inquiry")) {
                    cal.viewResultsArithmetic();
                }
            }
            else {
                continue;
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) : ");
            String cmd = sc.nextLine();

            if(cmd.equals("exit")) break;
        }
    }
}
