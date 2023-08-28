package chap_06;

public class _04_ParameterAndReturn {
//    public static void power(int number) {
//        int result = number * number;
//        System.out.println(result);
//    }
    public static int getPower(int number) {
        int result = number * number;
        return result;
    }
//
//    public static void powerByExp(int number, int exponent) {
//        int result = 1;
//        for (int i = 0; i < exponent; i++) {
//            result *= number;
//        }
//        System.out.println(result);
//    }
    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }

        return result;
    }

    public static void main(String[] args) {
        // 전달값과 반환값이 있는 메소드
        int a = getPower(3);
        System.out.println(a);

        int b = getPowerByExp(2,3);
        System.out.println(b);
    }
}
