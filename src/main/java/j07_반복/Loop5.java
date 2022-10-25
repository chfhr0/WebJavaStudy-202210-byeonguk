package j07_반복;

import java.util.Scanner;

public class Loop5 {

    public static void main(String[] args) {

//        for(int i = 0; i < 9; i++) {
//            int num = i + 1;
//            int dan = 1;
//            System.out.println(dan + " x " + num + " = " + (dan * num));
//        }
//        for(int i = 0; i < 9; i++) {
//            int num = i + 1;
//            int dan = 1;
//            System.out.println(dan + " x " + num + " = " + (dan * num));
//        }

        // 각각의 for문 ()안에 i를 여러 번 선언해도 문제가 없는 이유
        // 중괄호 안에서만 쓰이기 때문에 (지역이라고 한다.)

        for (int i = 0; i < 8; i++) {

            int dan = i + 2;

            for(int j = 0; j < 9; j++) {
                int num = j + 1;
                System.out.println(dan + " x " + num + " = " + (dan * num));
            }
        }



    }

}
