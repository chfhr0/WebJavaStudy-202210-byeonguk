package j07_반복;

public class Loop2 {

    public static void main(String[] args) {

        int result = 0;
        /*
        반복을 해라.
        i가 0부터 100이 되기 전까지 i를 1씩 증가시키면서 반복해라.
         */

        // 반복의 기준은 건드릴 필요가 없다.
        // 1~100까지를 나타내고 싶으면 i + 1을 출력하면 된다.
        // 반복의 기준을 건드리지 않고 문제를 해결할 수 있어야 알고리즘을 잘 해결할 수 있다.
        for(int i = 0; i < 100; i++) {
            System.out.println(i + 1);
        }

        System.out.println("1~100까지 더한 값: " + result);

    }

}
