package j05_Scanner;

import java.util.Scanner;

public class Input2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("x입력: ");
        int x = scanner.nextInt();

        System.out.print("y입력: ");
        int y = scanner.nextInt(); // 숫자는 띄어쓰기를 하지 않기 때문에 띄어쓰기로 스캔을 구분한다.

        System.out.println("x + y = " + (x + y)); // x + y 에 괄호를 하지 않으면 1020이 나온다.

    }

}
