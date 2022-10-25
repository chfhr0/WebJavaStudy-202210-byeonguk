package j07_반복;

public class Loop6 {

    public static void main(String[] args) {

        // for문은 일정한 규칙을 가지고 순차적으로 증가시킬 때 사용
        // while은 if처럼 특정 조건을 주고 사용.


        int n = 5;

        for(int i = 0; i < n; i++) {
            System.out.println(i + 1);
        }

        int i = 0;

        // while은 if처럼 ()안에 조건문을 적는다.
        while(i < n) {
            System.out.println(i + 1);
            i++;
        }

    }

}
