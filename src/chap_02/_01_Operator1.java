package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자
        // 일반 연산
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2, 몫을 출력, 정수형일 경우 5 / 2의 결과는 2
        System.out.println(2 / 4); // 0
        System.out.println(4 % 2); // 0, 나머지를 출력
        System.out.println(5 % 2); // 1

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); // 6 곱하기 우선, 괄호를 이용하여 연산의 순서를 정하기
        System.out.println((2 + 2) * 2); // 8
        System.out.println(2 + (2 * 2)); // 괄호를 이용하여 보기 쉽게 만들어줘라

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c); // 30

        c = a - b;
        System.out.println(c); // 10

        c = a * b;
        System.out.println(c); // 200

        c = a / b;
        System.out.println(c); // 2

        c = a % b;
        System.out.println(c); // 0

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // 11, val을 먼저 더해준 다음 출력
        System.out.println(val++); // 11, val을 출력한 다음 더해주기

        // 은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); // 0
        System.out.println("대기 인원 : " + waiting++); // 1
        System.out.println("대기 인원 : " + waiting++); // 2
        System.out.println("총 대기 인원 : " + waiting); // 3
    }
}
