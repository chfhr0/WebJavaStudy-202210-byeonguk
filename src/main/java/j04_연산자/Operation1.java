package j04_연산자;

public class Operation1 {

    public static void main(String[] args) {

        int num = 10;
        num = num + 1;
        System.out.println(num);
        System.out.println(++num);
        // ++num 과 num++은 다르다. ++num은 1++num // num++는 num++1
        // ++num은 지금부터 1씩 증가시키고, num++는 그 다음부터 1씩 증가.
        // 직접 출력해보기.
        System.out.println(num);

        // ! 느낌표는 not으로 부른다.

    }

}
