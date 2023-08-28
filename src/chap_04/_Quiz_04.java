package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 주차요금은 한시간당 4000원
        // 최대 30000원 부과
        // 장애인 차량 or 경차일 경우 최종 가격에서 50% 할인

        int fee = 0;
        int time = 10;
        boolean car = false;
        boolean disorder = true;

//        fee = time * 4000;

        for (int i = 0; i < time; i++) {
            if (fee < 30000) {
                fee += 4000;
            }else{
                fee = 30000;
            }
        }

        if (car == true || disorder == true) {
            fee = (int) (fee * 0.5);
        }

        System.out.println(fee);

    }
}
