package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 29

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 전부 대문자 변환
        System.out.println(s.toLowerCase()); // 전부 소문자 변환

        // 포함 관계
        System.out.println(s.contains("Java")); // 포함된다면 true
        System.out.println(s.contains("C#")); // 포함 안된다면 false
        System.out.println(s.indexOf("Java")); // Java라는 문자가 있다면 몇번째 위치에 있는지 알려줌, 위치 정보 7
        System.out.println(s.indexOf("C#")); // 문자열이 포함되어 있지 않다면 -1을 반환
        System.out.println(s.indexOf("and")); // 처음으로 나온 and의 위치
        System.out.println(s.lastIndexOf("and")); // 마지막으로 나온 and의 위치
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 true, 아니면 false
        System.out.println(s.endsWith(".")); // 이 문자열로 끝나면 true, 아니면 false

    }
}
