package chap_09;

public class _03_WrapperClass {
    public static void main(String[] args) {
        // 래퍼 (Wrapper) 클래스
        // int double float char

        Integer i = 1234;
        Double d = 1.0;
        Character c = 'A';

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println("---------------------------");

        System.out.println(i.intValue());
        System.out.println(d.intValue()); // 실수를 int로 형변환
        System.out.println(c.charValue());

        System.out.println("-----------------------------");
        String a = i.toString();
        System.out.println(a); // String으로 형변환
    }
}
