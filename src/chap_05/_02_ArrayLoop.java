package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 길이를 이용한 순환
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};
        for (int i = 0; i < coffees.length; i++) { // coffees.length = 배열의 크기값
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("----------------------for-each-----------------------");

        // enhanced for (for-each) 반복문
        for (String coffee : coffees) { // coffees 배열 안에 있는 값들을 차례로 coffee에 저장하여 배열 순환
            System.out.println(coffee + " 하나"); // 모든 배열을 순환하려면 for-each를 사용하는 것이 좋고, 일부만 순환하려면 for문을 사용하는게 좋다
        }
        System.out.println("주세요");

    }
}
