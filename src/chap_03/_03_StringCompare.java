package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); // s1과 s2의 내용이 같으면 True, 다르면 False
        System.out.println(s2.equals("python")); // 대소문자를 구분하므로 False 출력
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분 없이 내용 자체가 똑같으면 true, 다르면 False

        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 비밀정보 정보, s1 = "1234", s2 = "1234" 각각이 아니라
        s2 = "1234"; // "1234" 문자열이 있는데 s1, s2변수가 참조하는 형식이어서

        System.out.println(s1.equals(s2)); // true, 값이 같은지
        System.out.println(s1 == s2); // true, 참조하는 대상이 같은지

        s1 = new String("1234");
        s2 = new String("1234");

        System.out.println(s1.equals(s2)); // true, 값은 다르기 때문에
        System.out.println(s1 == s2); // false, 그 이유는 s1과 s2 객체가 참조하는 "1234"가 다르기 때문, 즉 각각 다른 메모리에 저장되있으므로 false
        // 결론 : 문자열 비교 시 ==는 가급적 쓰지 말고 equals를 사용해야 한다.

    }
}
