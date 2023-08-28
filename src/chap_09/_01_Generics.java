package chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스
        Integer[] iArray = {1,2,3,4,5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);
        System.out.println("--------------------------------");
        printAnyArray(iArray); // 기본 자료형은 제네릭스 타입으로 할 수 없음, wrapper 해줘야함
        printAnyArray(dArray);
        printAnyArray(sArray);

    }

    private static <T> void printAnyArray(T[] array) { // T = Type
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void printStringArray(String[] sArray) {
        for (int i = 0; i < sArray.length; i++) {
            System.out.print(sArray[i] + " ");
        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] dArray) {
        for (int i = 0; i < dArray.length; i++) {
            System.out.print(dArray[i] + " ");
        }
        System.out.println();
    }

    private static void printIntArray(Integer[] iArray) {
        for (int i = 0; i < iArray.length; i++) {
            System.out.print(iArray[i] + " ");
        }
        System.out.println();
    }

}
