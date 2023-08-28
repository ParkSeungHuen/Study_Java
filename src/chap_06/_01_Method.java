package chap_06;

public class _01_Method {
    // 메소드 정의
    public static void sayHello() {
        System.out.println("ㅎㅇㅎㅇ");
    }

    public static void main(String[] args) {
        // 메소드 : 어떤 기능들을 묶어놓은
        // 메소드 호출
        System.out.println("메소드 호출 전");
        sayHello();
        System.out.println("메소드 호출 후");
    }

}
