package chap_04;

public class _06_While {
    public static void main(String[] args) {
        // 반복문 while
        int distance = 25;
        int move = 0;

        while(move < distance) { // 무한루프를 조심하기
            System.out.println("발차기를 계속 합니다.");
            System.out.println(move);
            move += 3; // 3미터 이동
        }

        System.out.println("도착하였습니다.");
    }
}
