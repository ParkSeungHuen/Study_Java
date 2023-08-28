package chap_06;

public class _06_WhenToUse {
    public static int getPower(int number) {
        return getPower(number, 2);
        // 메소드 안에 또다른 메소드를 넣을 수 있다
    }
    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }

        return result;
    }
    public static void main(String[] args) {
        // 메소드가 필요한 이유
        // 비슷한 동작 or 같은 동작을 하는 것을 묶어놓음
        int result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 2;
        }
        System.out.println(result);

        result = 1;
        for (int i = 0; i < 3; i++) {
            result *= 3;
        }
        System.out.println(result);

        result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 4;
        }
        System.out.println(result);

    }
}
