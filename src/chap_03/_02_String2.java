package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 변환
        System.out.println(s.replace(" and", ",")); //  and를 ,로 바꾸어줌

        System.out.println(s.substring(7)); // 인덱스 기준 7 부터 시작
        System.out.println(s.substring(s.indexOf("Java"))); // Java 문자가 있는 기준으로 시작
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // Java 문자가 있는 기준으로 시작하고 . 직전까지 끊어줌.

        // 공백 제거
        s = "            I love Java.        ";
        System.out.println(s);
        System.out.println(s.trim()); // 앞 뒤 공백 모두 제거

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1 + "," + s2);
        System.out.println(s1.concat(",").concat(s2).concat(s2)); // concat을 이용하여 계속 붙일 수 있다, 계속 concat 가능

    }
}
