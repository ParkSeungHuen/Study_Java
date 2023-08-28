package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); // || : or 연산 - 하나라도 true 이면 true
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // && : and 연산 - 하나라도 false 이면 false

        System.out.println((5 > 3) && (3 > 1)); // 두 식이 true일 경우에만 true 출력
        System.out.println((5 > 3) && (3 < 1)); // (3 < 1)이 false라 false

        System.out.println((5 > 3) || (3 > 1)); // 두 식 중 하나라도 true일 경우 true
        System.out.println((5 > 3) || (3 < 1)); // (5 > 3)이 true라 true
        System.out.println((5 < 3) || (3 < 1)); // 둘다 false라 false

//        System.out.println(1 < 3 < 5); 이렇게 하면 안됨, 3개 연속으로 비교할 수 없다

        // 논리 부정 연산
        System.out.println(!true); // true의 반대를 출력, false
        System.out.println(!false); // false의 반대를 출력, true
        System.out.println(!(5 == 5)); // false
        System.out.println(!(5 == 3)); // true
    }
}
