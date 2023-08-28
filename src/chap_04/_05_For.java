package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        // 나코 매장
        System.out.println("어서오세요. 나코입니다.");

        // 반복문 사용 for
        for (int i = 0; i < 10; i+=2) { // int i 선언, i가 10 미만일 경우 반복, for을 한번 반복하면 i를 2만큼 증가
            System.out.println("어서오세요. 나코입니다.");
        }

        //fori만 적고 엔터치면 자동완성
        for (int i = 0; i < 10; i+=2) {
            System.out.println(i); // 0, 2, 4, 6, 8 짝수만 출력
        }

        for (int i = 1; i < 10; i+= 2) {
            System.out.println(i); // 1, 3, 5, 7, 9 홀수만 출력
        }

        for (int i = 10; i > 0; i--) {
            System.out.println(i); // 10, 9, ..., 1 거꾸로 출력
        }

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
            System.out.println(sum); // sum 변수에 i가 증가하면서 더해줌, 결국 sum은 45
        }

    }
}
