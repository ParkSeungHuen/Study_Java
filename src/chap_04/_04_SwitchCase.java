package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case
        // 1등 : 전액 장학금
        // 2,3등 : 반액 장학큼
        // other : 노 장학금

        int ranking = 3; // 등수
        if (ranking == 1) {
            System.out.println("전액 장학금");
        }else if(ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
        }else {
            System.out.println("장학금 대상 아님");
        }

        System.out.println("조회 완료 #1");

        // Switch Case 문을 이용
        ranking = 1;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2, 3:
                System.out.println("반액 장학금"); // 이런식으로 case2, 3의 경우가 같은 경우 합칠 수 있다.
                break;
            default:
                System.out.println("장학금 대상 아님");
        }

        System.out.println("조회 완료 #2");

        // 중고상품의 등급에 따른 가격을 책정 (1급 : 최상, 4급 : 최하)
        int grade = 1;
        int price = 7000;
        switch (grade) {
            case 1: // 만약 break가 없을 경우 : 1등급일 때 price에 1000이 더해지고 곧바로 case2로 내려온다. 그리고 또 case3로 내려오면서 7000 + 1000 + 1000이 되면서 10000출력
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격 : " + price + "원");
        // 1등급 제품 : 10000
        // 2등급 제품 : 9000

        int score = 95;
        // 범위로 구분할 땐 if-else, 명확한 case가 있는 경우 switch-case
    }
}
