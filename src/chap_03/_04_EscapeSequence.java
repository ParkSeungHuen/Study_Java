package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자 (Escape Sequence, Escape Character

        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        System.out.println("자바가\n너무\n재밌어요"); // \n : 줄바꿈

        // 해물파전 9000원
        // 김치전 8000원
        // 부추전 8000원

        System.out.println("해물파전\t\t9000원");
        System.out.println("김치전\t\t8000원");
        System.out.println("부추전\t\t8000원"); // \t : 간격 줄맞춤이 잘되어서 출력됨

        System.out.println("C:\\Program Files\\Java"); // \\ : 윈도우에서 \ 표기를 하기 위해 \\해줘야함

        // 단비가 "냐옹" 이라고 했어요
        System.out.println("단비가 \"냐옹\" 이라고 했어요"); // 따옴표를 쓰고싶으면 앞에 \
        System.out.println("단비가 \'뭘봐\' 라는 표정을 지었어요"); // 작은 따옴표에는 \를 굳이 넣지 않아도 상관없음,

        char c = 'A';
        // char에 '문자를 넣고 싶을 때 \를 넣어주면 됨
        c = '\'';
        System.out.println(c);



    }
}
