package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        // 치킨 주문 손님중에 노쇼 손님이 있다고 가정
        // For
        int max = 20; // 최대 치킨 판매 수량
        int sold = 0; // 현재 치킨 판매 수량
        int noShow = 17; // 대기번호 17번 손님이 노쇼

        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨이 나왔습니다.");

            if (i == noShow) {
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue; // continue 아래의 동작은 하지 않고 새로 반복을 시작한다.
            }

            sold++;
            if (sold >= max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

        System.out.println("------------------------while------------------------");
        // while 문
        sold = 0;
        int index = 0;
        while (index < 50) {
            index++;

            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");
            if (index == noShow) {
                System.out.println(index + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                // index++을 하는 이유 : for문 같은 경우 반복될 경우 자동으로 i값이 커지는데 while은 그런 기능이 없어서.
            }
            sold++;
            if (sold >= max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

        //while(true)를 사용하면 무한반복 가능, 어떤 조건을 만났을 경우 if문으로 break를 걸어서 탈출시킬 수 있다.
    }
}
