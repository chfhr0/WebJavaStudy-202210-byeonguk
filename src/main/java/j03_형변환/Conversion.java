package j03_형변환;

public class Conversion {

    public static void main(String[] args) {

        // upcasting(업캐스팅)(묵시적 형변환)
        char cast1 = 'a';
        System.out.println((int) cast1);
        int cast2 = (int) cast1; // 생략할 수 있어서 (int)의 색이 다르다.
        System.out.println(cast2);


        // downcasting(다운캐스팅)(명시적 형변환)(데이터 손실이 있는 걸 개발자가 알고 있지만 실행)
        int cast3 = 98;
        char cast4 = (char) cast3;
        System.out.println(cast4);

        double cast5 = 3.14;
        int cast6 = (int) cast5;
        System.out.println(cast6); // int는 정수만 담을 수 있다. 데이터 손실이 있다는 것을 알고 있기 때문에 3만 출력된다.
        double cast7 = cast6;
        System.out.println(cast7); // 이미 int에 넣을 때 소숫점 아래를 버렸기 때문에 다시 double에 넣더라도 0.14가 돌아오지 않는다.




    }

}
