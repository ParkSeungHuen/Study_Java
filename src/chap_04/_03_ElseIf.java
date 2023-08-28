package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 ElseIf
        // 한라봉 에이드가 있으면 +1
        // 망고 주스가 있으면 +1
        // 아이스 아메리카노 +1
        boolean hallabongAde = true;
        boolean mangoJuice = true;

        if (hallabongAde == true) {
            System.out.println("한라봉 에이드 +1");
        }else if (mangoJuice == true) {
            System.out.println("망고 주스 +1");
        }else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #1");

        // else if는 여러번 적용 가능, 마지막 else는 없어도 무방.
        hallabongAde = false;
        mangoJuice = false;
        boolean orangeJuice = true;

        if (hallabongAde == true) {
            System.out.println("한라봉 에이드 +1");
        }else if (mangoJuice == true) {
            System.out.println("망고 주스 +1");
        }else if(orangeJuice == true){
            System.out.println("오렌지주스 +1");
        }else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");
    }
}
