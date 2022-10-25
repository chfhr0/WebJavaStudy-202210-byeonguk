package j08_메소드;

import java.util.Random;

public class RandomNumber {

    public static int calcRandom(int m) {
        // 함수 선언할 때 public static "int"!!! 라고 했기 때문에 int 자료형을 return 해준다.
        Random random = new Random();

        int result = random.nextInt(10) * 1000 + m;

        return result;
    }

    public static void main(String[] args) {
//        Random random = new Random();

        int money = 5000;

        /*
        int a = random.nextInt(10) * 1000 + money;
        System.out.println(a);
        int b = random.nextInt(10) * 1000 + money;
        System.out.println(b);
        int c = random.nextInt(10) * 1000 + money;
        System.out.println(c);
        int d = random.nextInt(10) * 1000 + money;
        System.out.println(d);
        */


        /*
        for(int i = 0; i < 10; i++) {
            int randNum = random.nextInt(100) + 100;
            // 뒤에 +10, +100을 이해해야 한다. 단순하게 생각하기.
            // bound는 입력하는 것이 아니라 인텔리제이에서 입력해주는 것. 나는 숫자 10만 입력하면 된다.
            // bound: 10은 0~9까지다.
            System.out.println(randNum);
        }*/

        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));

        int r = calcRandom(money);
        System.out.println(r + 100);
        System.out.println(r + 1000);
        System.out.println(r + 10000);
        System.out.println(r + 100000);

    }

}
