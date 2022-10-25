package j04_연산자;

public class Operation5 {

    public static void main(String[] args) {

        int totalCount = 102;
        int maxPage = totalCount % 10 == 0 ? totalCount / 10 : totalCount / 10 + 1;

        int page = 15;
        
        // 삼항연산자
        int startIndex = page % 5 == 0 ? page - 4 : page - (page % 5) + 1;
        int endIndex = startIndex + 4 <= maxPage ? startIndex + 4 : maxPage;

        System.out.println("page: " + page);
        System.out.println("startIndex: " + startIndex);
        System.out.println("endIndex: " + endIndex);

        // 결과의 값과 자료형이 같아야 한다. 여기서 page == endIndex는 조건에 불과하다.
        String isMaxIndexStr = page == endIndex ? "마지막 페이지입니다." : "마지막 페이지가 아닙니다.";
        System.out.println(isMaxIndexStr);


    }

}
