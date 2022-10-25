package j05_Scanner;

import java.util.Scanner;

public class Input3 {

    public static void main(String[] args) {

        /*
            이름: 김준일                 name
            나이:                       age
            주소: 부산 동래구 사직동       address
            연락처: 010 9988 1916       phone

            사용자의 이름은 김준일이고 나이는 29입니다.
            주소는 부산 동래구 사직동이며 연락처는 010 9988 1946입니다.
        */

        Scanner scanner = new Scanner(System.in);

        // 미리 이렇게 선언해두는 것이 좋다.
        String name = null;
        int age = 0;
        String address = null;
        String phone = null;


        // 버퍼의 용도는 한 번에 묶어서 사용하기 위한 용도이다.
        // 버퍼가 없으면 ㄱㅣㅁ 이렇게 된다.
        // 버퍼는 한 공간을 만든다. 만들어지는 타이밍은 scanner.next();가 호출되는 시기.
        // 이때 입력을 하면 ㄱㅣㅁ 이렇게 모았다가, 스페이스나 엔터를 누르면 한 번에 모아서 "김" 이렇게 출력하고 엔터가 아직 버퍼에 남아있다.
        // nextInt()는 엔터를 포함하지 않기 때문에 바로 날아가고, nextLine();은 엔터가 포함되기 때문에 바로 다음으로 넘어가버린다.
        // scanner.next();는 엔터와 스페이스가 문자열에 포함되지 않는다. 꼭 글자를 넣고 엔터와 스페이스를 눌러야 넘어간다.
        // scanner.nextLine();은 엔터와 스페이스가 문자열에 포함된다. 스페이스를 막 누르고 엔터를 치면 넘어간다. 스페이스도 문자로 인식한다는 뜻.
        // 원래 동영상은 100% 다운 받고 재생해야 하지만, 요즘은 스트리밍을 사용한다.
        // 스트리밍은 조금씩 다운 받으면서 즉각 재생하는 것.
        // 영상 버퍼링이 걸리는 이유는 다운 받아진 영상은 정상 속도로 진행되는데
        // 다운 받고 있는 영상의 인터넷 속도가 영상 재생 속도보다 느려지면 다운이 아직 완료되지 않았기 때문에 버퍼링이 걸린다.
        System.out.print("이름: ");
        name = scanner.next();

        System.out.print("나이: ");
        age = scanner.nextInt();
        scanner.nextLine(); // 여기서 scanner.nextInt(); 버퍼에 남아있는 엔터가 넘어간다.

        System.out.print("주소: ");
        address = scanner.nextLine(); // 여기 남아있는 엔터는 다음 nextLine();가 엔터를 포함하기 때문에 괜찮다. 바로 엔터가 날아가고 다음 nextLine();에는 엔터가 남지 않은 채로 실행된다.

        System.out.print("연락처: ");
        phone = scanner.nextLine();

        System.out.println("사용자의 이름은 " + name + "이고 나이는 " + age + "입니다.");

        System.out.println("주소는 " + address + "이며 연락처는 " + phone + "입니다.");
    }

}
