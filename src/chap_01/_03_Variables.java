package chap_01;

public class _03_Variables {

    public static void main(String[] args) {
        String name = "박승헌님 ";
        int hour = 15;

        System.out.println(name + hour + "시에 배송이 시작됩니다");
        System.out.println(name + " 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A'; // char은 작은 따옴표
        name = "권유안";

        System.out.println(name + "님의 평균 점수는" + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123214;
        float f = 3.141234F;// float는 뒤에 f or F를 입력해야함
        System.out.println(d);
        System.out.println(f);

        int i = 10000000; // int형은 -21억 ~ +21억 사이
        long l = 1000000000000000l; // l or L을 뒤에 붙이면 long 자료형 선언 가능
        l = 1_000_000_000_000l; // 3칸씩 구분지어서 보기 편하게 할 수 있음
        System.out.println(l);

        // int, float, double, long, char, String, boolean
    }
}
