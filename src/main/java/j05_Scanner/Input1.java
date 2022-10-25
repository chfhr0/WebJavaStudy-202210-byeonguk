package j05_Scanner;

import java.util.Scanner;

public class Input1 {

    public static void main(String[] args) {

        /*
        * 문자열 입력
        * next();       -> 띄어쓰기 포함 x
        * nextLine();   -> 띄어쓰기 포함 o
        */


        String name = "전병욱";

        Scanner scanner = new Scanner(System.in); // 선언과 초기화는 딱 한 번만 하면 된다.

        // 띄어쓰기 한 번이 스캔 한 번.
//        String s = scanner.next();
//        String s2 = scanner.next();
//        String s3 = scanner.next();

        // 띄어쓰기를 해도 다음 스캔으로 넘어가지 않는다.
        String s = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();


        System.out.println("입력 받은 값1: " + s);
        System.out.println("입력 받은 값2: " + s2);
        System.out.println("입력 받은 값3: " + s3);
    }

}
