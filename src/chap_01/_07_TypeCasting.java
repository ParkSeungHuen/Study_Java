package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형 => 실수형
        // 실수형 => 정수형

        // int to float, double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float) score); // 93.0
        System.out.println((double) score);

        // float, double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int) score_f); // 93
        System.out.println((int) score_d); // 98

        // 정수, 실수 연산
        score = 93 + (int) 98.8; // 93 + 98, 형변환하면 버림
        System.out.println(score);

        score_d = 93 + 98.8; // 여기서 93이 double로 자동으로 형변환이 됨.
        System.out.println(score_d);

        // 변수의 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 -> 191.0
        // int -> long -> float -> double 자동 형변환

        int convertedScoreInt = (int) score_d; // 191.8 -> 191로 할땐 안됨. 큰 데이터를 int로 표현할 수 없기 때문에.. 따라서 int를 무조건 넣어주어야함
        // double -> float -> ling -> int 수동 형변환

        // 숫자를 문자열로 바꾸는 방법 2가지
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i); // 93
        double d = Double.parseDouble("98.8");
        System.out.println(d);

        int error = Integer.parseInt("자바"); // 에러 나옴, 자바라는 글자는 Integer로 바꿀 수 없음
    }
}
