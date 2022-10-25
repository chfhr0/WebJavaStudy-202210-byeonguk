package j07_반복;

public class BreakAndContinue {

    public static void main(String[] args) {

        int i = 0;

        while(true) {
            if(i > 9) {
                break;
            }
            System.out.println(i);
            i++;
        }

        for(int j = 0; j < 10; j++) {
            if(j == 7) {
                System.out.println("7을 만났습니다.");
                break;
            }
            System.out.println(j);
        }

        System.out.println("<<<<<<<<<<<Continue>>>>>>>>>>");

        for(int j = 0; j < 100; j++) {
            if(j % 5 != 0 || j == 0) {
                continue; // 이후 코드는 무시하고 다음 반복으로 가라. 밑의 System.out.println(j); 얘가 실행이 안 된다.
                // j가 5일 때는 나머지가 0이기 때문에 System.out.println(j); 얘가 실행된다.
                // e.g. 민증 검사할 때
            }
            System.out.println(j);
        }

    }

}
