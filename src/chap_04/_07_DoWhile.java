package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 DoWhile
        int distance = 25; // 전체 거리 25m
        int move = 0; // 현재 이동 거리 0m
        int height = 2; // 키 2m

        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; // 21까지 출력, 21 + 3 + 2 = 26이므로 while 탈출
        }

        System.out.println("도착했습니다.");
        System.out.println("-----------------------------------");

        // 키가 엄청나게 큰 사람 ?
        move = 0;
        height = 25;
        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; // 처음부터 25이기 때문에 ... while 동작 x
        }
        System.out.println("도착했습니다.");

        System.out.println("------------do while-----------");
        height = 2;
        // Do while 반복문
        do { // 일단 do 영역을 한번 실행한 다음 while 조건이 맞을 때 까지 do 영역을 반복함.
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        } while (move + height < distance); {
            System.out.println("도착했습니다.");
        }

    }
}
