package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러개를 저장해놓는 연속된 공간
        String coffeeRose = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸치노";

        // 배열 선언 첫 번째 방법
//        String[] coffees = new String[4]; // 크기 4의 String 배열 생성
//
//        // 배열 선언 두 번째 방법
////        String coffees[] = new String[4]; 대괄호는 변수 뒤에 와도 됨
//        coffees[0] = "아메리카노"; // 0부터 시작
//        coffees[1] = "카페모카";
//        coffees[2] = "라떼";
//        coffees[3] = "카푸치노";

        // 배열 선언 세 번째 방법
//        String[] coffees = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};

        // 배열 선언 네 번째 방법
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"}; // 자동으로 해줌
        System.out.println("-----------------------------------------");
        // 커피 주문
        System.out.println(coffees[0] + "하나");
        System.out.println(coffees[1] + "하나");
        coffees[2] = "에스프레소"; // 값 변경
        System.out.println(coffees[2] + "하나");
        System.out.println(coffees[3] + "하나");
        System.out.println("주세요");

        System.out.println("----------------------------------------fori------------------");
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + "하나");
        }
        System.out.println("주세요");

        // 다른 자료형?
        int[] i = new int[3];
        i[0] = 1;
        double[] d = new double[3];
        boolean[] b = new boolean[3]; // 여러 타입의 배열들을 생성할 수 있다.


    }
}
