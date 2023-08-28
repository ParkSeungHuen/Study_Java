package chap_06;

public class _07_VariableScope {

    public static void methodA() {

    }

    public static void methodB() {
        int result = 1; // 지역 변수
    }

    public static void main(String[] args) {
        int number = 1; // 지역변수

        for (int i = 0; i < 5; i++) { // for문 안의 i는 중괄호 바깥에는 적용 x
            System.out.println(i);
        }
        // 중괄호 바깥은 중괄호 안에 있는 변수를 다룰 수 없지만 중괄호 바깥에 있는 변수는 중괄호 안에서 쓸 수 있다

    }
}
