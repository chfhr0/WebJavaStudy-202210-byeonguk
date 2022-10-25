package j08_메소드;

/*
    메소드란? 함수이다.
    함수란? 일련의 동작을 묶어서 정의한 것이다.
    함수의 특징: 입력과 출력을 가질 수 있다. 필수는 아니다. 입력이 없을 수 있고 출력이 없을 수도 있다.
    그러면 왜 메소드라고 부르는가?
    
    클래스 안에 함수를 정의하면 메소드라고 부른다.
    JAVA는 일반 함수가 없다. <- 클래스로 로딩되기 때문에 클래스 밖에 함수를 입력할 수 없다.
    무조건 메소드!!!!!!!!

    함수를 실행하는 것을 우리는 호출(call)이라고 칭한다.

 */

public class Method1 {

    // 1. [ x | x ] 입력(매개변수), 출력(반환)
    public static void call1() {
        // call1() 안의 매개변수가 없고, 반환이 없는 것을 void 라고 한다.
        System.out.println("[ x | X ]");
    }

    // 2. [ o | x ]
    public static void call2(String str) {
        // 입력이 있다. call2안에 String str이 매개변수
        System.out.println("[ o | x ]");
        System.out.println("수업과목: " + str);
    }

    // 3. [ x | o ]
    public static String call3() {
        System.out.println("[ x | o ]");
        String result = "";

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < i + 1; j++) {
                result += "*";
            }
            result += "\n";
        }
        return result;
    }

    // 4. [ o | o ]
    public static String call4(int year, int month, int day) {
        System.out.println("[ o | o ]");
        return year + "년 " + month + "월 " + day + "일";
        // 하나의 값이 만들어질 때는 변수 선언 없이 출력에 쓸 수 있다.
        // 입력은 여러 개가 가능하지만, 출력은 하나만 가능하다.
    }


    // Main 메소드 - JVM이 호출해준다.
    public static void main(String[] args) {
        call1();
        call2("java");
        String star1 = call3();
        System.out.println(star1);
        String date = call4(2022,10,24);
        System.out.println(date);
    }

}
