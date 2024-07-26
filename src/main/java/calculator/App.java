package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String str = sc.nextLine();
            if(str.equals("exit")) break;
            else if(str.equals("asdf")) System.out.println("그거 아닌데");
            else System.out.println("존재하지 않는 명령어");
        }
    }
}
