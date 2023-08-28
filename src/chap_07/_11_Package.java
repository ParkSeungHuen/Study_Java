package chap_07;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        // 패키지
        Random random = new Random();
        System.out.println("랜덤 정수 : " + random.nextInt());
        System.out.println("랜덤 정수(0~10) : " + random.nextInt(10));
        System.out.println("랜덤 실수 : " + random.nextDouble()); // 0.0~1.0 미만 실수값
//        System.out.println("랜덤 실수 : " + random.nextDouble());

        double min = 5.0;
        double max = 10.0;
        System.out.println("랜덤 실수 (범위) : " + (min + (max - min) * random.nextDouble()));
        System.out.println("랜덤 boolean : " + random.nextBoolean());

        // 로또 번호
        System.out.println("로또 번호 : " + (random.nextInt(45) + 1)); // 0이상 45미만 수
    }
}
