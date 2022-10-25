package j08_메소드;

/*
    메소드 오버로딩
    매개변수의 형태가 다르면 동일한
    메소드 명을 가지고 정의할 수 있다.
 */


public class Overloading {

    public static void add() {
        System.out.println("add()");
    }

    public static void add(int a) {
        System.out.println("add(ina a)");
    }

    public static void add(String s) {
        System.out.println("add(String s)");
    }

    public static void add(int a, int b) {
        System.out.println("add(int a, int b)");
    }

    public static void add(int a, String b) {
        System.out.println("add(int a, String b)");
    }

    public static void add(String b, int a) {
        System.out.println("add(String b, int a)");
    }
//    반환 자료형은 관계 없이 매개변수가 중요하다.
//    반환 자료형이 int, String으로 다르더라도 매개변수가 같으면 같은 메소드의 이름을 선언할 수 없다.
//    메소드는 같은 이름을 사용할 수 없지만, 위의 경우처럼 매개변수가 다르면 사용할 수 있다.
//    add(); 면 위의 메소드를, add(10); 이면 아래의 메소드를 실행시키기 때문이다.
    public static void main(String[] args) {

        add();
        add(10);
        add("10");
        add(10, 20);
        add(10, "20");
        add("20", 10);

    }

}
