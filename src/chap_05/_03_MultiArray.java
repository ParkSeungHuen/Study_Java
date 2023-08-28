package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        // 다차원 배열 (2차원 배열)

        // 소규모 영화관 좌석
        // A1 - A5
        // B1 - B5
        // C1 - C5

        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5",},
                {"B1", "B2", "B3", "B4", "B5",},
                {"C1", "C2", "C3", "C4", "C5",},
        };

        // B2에 접근하려면 ?
        System.out.println(seats[1][1]);

        // C5에 접근하려면 ?
        System.out.println(seats[2][4]);

        System.out.println("-------------------------비정형 배열---------------------------");
        // 첫 줄 3칸, 둘째 줄에는 4칸, 세번째 줄에는 5칸
        String[][] seats2 = new String[][] {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5",},
        };

        // A3에 접근하려면 ?
        System.out.println(seats2[0][2]);

        // A5에 접근 ?
//        System.out.println(seats2[0][4]);

        // 3차원 배열 만들기, 가로 x 세로 x 높이
        String[][][] marray = new String[][][] {
                {{}, {}, {}},
                {{}, {}, {}},
                {{}, {}, {}},
        };
    }
}
