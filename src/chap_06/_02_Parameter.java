package chap_06;

public class _02_Parameter {
    public static void power(int number) {
        int result = number * number;
        System.out.println(result);
    }

    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        // 전달값, Parameter
        // 2 -> 2 * 2 = 4

        // Argument, 인수
        power(2);
        power(3);
        powerByExp(2, 3); // 2 * 2 * 2 = 8
        powerByExp(3, 3); // 3 * 3 * 3 = 27
        powerByExp(10, 0); // 모든 수의 0승은 1
    }
}
