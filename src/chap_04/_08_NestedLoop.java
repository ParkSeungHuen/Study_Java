package chap_04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        // 이중 반복문

        // 별 (*) 사각형 만들기
        /*
        *****
        *****
        *
        */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // 별 왼쪽 삼각형 만들기 (아래로 내려갈 수록 별의 개수가 ++)
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j >= 5 - i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // 아래로 내려갈 수록 별의 개수가 --
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // 별 오른쪽 치우침 만들기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j+i < 4; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("S");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
