package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        String[] size = new String[10];

        for (int i = 0; i < 10; i++) {
            size[i] = String.valueOf(250 + i*5);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(size[i] + " ");
        }

        System.out.println("----------------- 배운거 적용 -----------------------");

        int[] size2 = new int[10];

        for (int i = 0; i < size2.length; i++) {
            size2[i] = 250 + i * 5;
        }

        for (int sizeArray : size2) {
            System.out.println("사이즈 " + sizeArray + " (재고 있음)");
        }

    }
}
