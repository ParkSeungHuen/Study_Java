package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자
        // 결과 = (조건) ? 참 일 경우 결과값 : 거짓일 경우 결과값
        int x = 3;
        int y = 5;
        int max = (x > y) ? x : y; // x가 y보다 크면 x, 아니면 y
        System.out.println(max);

        int min = (x < y) ? x : y; // x가 y보다 작으면 x, 아니면 y
        System.out.println(min);

        boolean b = (x == y) ? true : false; // x가 y랑 같으면 true, 다르면 false
        System.out.println(b); // false

        String s = (x != y) ? "달라요" : "같아요"; // x와 y가 다르면 달라요 출력, 같으면 같아요 출력
        System.out.println(s);
    }
}
