package j02_변수상수;

//변수
public class Variable {

    public static void main(String[] args) {

        // var로 변수를 선언할 수도 있다. var 적혀있으면 다 변수이다.

        // 논리자료형 변수
        boolean checkFlag = false;
        System.out.println(checkFlag);

        checkFlag = true;
        System.out.println(checkFlag);

        // 문자자료형 변수
        // char는 기본적으로 유니코드로 들어가있다. name1 + name2 + name3을 하면 '전병욱'이 아닌 숫자가 나온다.
        char name1 = '전';
        char name2 = '병';
        char name3 = '욱';
        System.out.println("" + name1 + name2 + name3); // 숫자가 아닌 문자로 출력하고 싶으면 앞에 ""를 더해준다.
        // 코드는 위에서 아래로. 오른쪽에서 왼쪽으로 읽기 때문에 ""를 앞에 붙여야 한다. 숫자를 다 더하고 문자열로 더해라.
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println('가'+0); // 유니코드가 기본값이기 때문에 더하면 숫자가 나온다.
        int a = '가' + 0;

        System.out.println(Integer.toHexString(a)); // 유니코드로 변환 Interger.toHexString(a);
        
        // 문자열자료형 변수
        String name = "전병욱 ";
        String name4 = "김준일";
        String name5 = name + name4;
        System.out.println(name5);

        // 정수자료형 변수
        int width = 100;
        int width2 = 200;
        String width3 = "300";
        String width4 = "400";
        int widthResult = width + width2;
        String widthResult2 = width3 + width4;
        System.out.println(widthResult);
        System.out.println(widthResult2); // String은 문자열이기 때문에 더하더라도 수학적 연산이 일어나는 것이 아니다.
        // 300과 400을 문자로 인식하기 때문에 더하면 그냥 문자를 이어준다. 300400

        long time = System.currentTimeMillis(); // 현재 시간을 컴퓨터 언어로 알려준다. 년월일시간
        System.out.println(time);

        long time2 = 1666178895709L;
        System.out.println(time2);
        
        // 실수자료형 변수
        double pi = 3000000000.1415926535999999999999;
        System.out.println(pi);

        // 상수 - 상수를 표시하기 위해서 대문자로 선언한다. 대문자로 선언하기 때문에 카멜표기법을 쓸 수 없어서 스네이크표기법으 사용한다.
        final String FILE_PATH = "C:/Users/junil";
//        FILE_PATH = "D:/Users/aaa"; 오류가 뜬다. 다시 초기화가 안 된다.
        System.out.println(FILE_PATH);







        
    }

}
