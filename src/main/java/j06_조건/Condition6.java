package j06_조건;

import java.util.Scanner;

public class Condition6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;

        System.out.print("점수를 입력하세요: ");
        score = scanner.nextInt();

        if(score < 0 || score > 100) {
            System.out.println("계산 불가");
        }else{
            switch (score / 10) {
                case 10: // 브레이크가 없으니까 밑에까지 가서 A학점이 출력된다.
                case 9: // int 자료형이기 때문에 95 입력시 9.5가 되면서 0.5가 날아가고 9가 된다.
                    System.out.println("A학점");
                    break;
                case 8:
                    System.out.println("B학점");
                    break;
                case 7:
                    System.out.println("C학점");
                    break;
                case 6:
                    System.out.println("D학점");
                    break;
                default:
                    System.out.println("F학점");
            }
        }



    }

}
