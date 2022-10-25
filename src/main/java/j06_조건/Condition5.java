package j06_조건;

import java.util.Scanner;

public class Condition5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int selected = 0;

        System.out.println("[ 선택 프로그램 ]");
        System.out.println("1. 메뉴1");
        System.out.println("2. 메뉴2");
        System.out.println("3. 메뉴3");
        System.out.println("4. 메뉴4");
        System.out.println("5. 메뉴5");
        System.out.print("실행할 명령을 선택하세요: ");
        selected = scanner.nextInt();


        // swith case는 입력한 부분부터 실행되는 것. 입력한 부분만 실행하는 것이 아니다.
        // 끊고 싶으면 break를 걸어주면 된다.
        // case는 중괄호로 묶을 필요없음.
        // default: 는 else와 같은 역할을 한다. 입력값이 케이스에 없을 때 찾아가는 곳.
        switch (selected) {
            case 1:
                System.out.println("메뉴1을 선택하셨습니다.");
                break;
            case 2:
                System.out.println("메뉴2을 선택하셨습니다.");
                break;
            case 3:
                System.out.println("메뉴3을 선택하셨습니다.");
                break;
            case 4:
                System.out.println("메뉴4을 선택하셨습니다.");
                break;
            case 5:
                System.out.println("메뉴5을 선택하셨습니다.");
                break;
            default:
                System.out.println("해당 번호는 선택할 수 없습니다.");
        }

    }

}
