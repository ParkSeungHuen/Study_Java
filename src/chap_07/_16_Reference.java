package chap_07;

import chap_07.camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조
        // 기본 자료형 int, float, double, long, boolean, ...
        int[] i = new int[3];
        System.out.println(i[0]);

        double[] d = new double[3];
        System.out.println(d[0]);

        // 참조 자료형 (Non-Primitive, Reference Data Types) : String, Camera, FacktoryCam
        String[] s = new String[3];
        System.out.println(s[0]); // null

        Camera[] c = new Camera[3];
        System.out.println(c[0] == null); // true, 참조자료형은 값을 넣지 않으면 null값

        //////////////////////////////////
        System.out.println("------------------------------");
        int a = 10;
        int b = 20;
        b = a;
        System.out.println(a);
        System.out.println(b);
        b = 30;
        System.out.println(a);
        System.out.println(b);

        System.out.println("------------------------------");
        Camera c1 = new Camera();
        Camera c2 = new Camera();
        c1.name = "카메라1";
        c2.name = "카메라2";
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2 = c1; // c2 = c1을 할 경우 c1의 객체와 c2의 객체가 같아지게 되고,
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2.name = "고장난 카메라"; // c2.name을 고장난 카메라로 바꾸면 c1.name도 고장난 카메라로 바뀐다.
        System.out.println(c1.name);
        System.out.println(c2.name); // c2과 c1이 같은 객체를 "참조"한다
        System.out.println("-------------------------------");
        changeName(c2); // 여기서 c2는 c1의 객체를 같이 참조하기 때문에 changeName의 결과인 잘못된 카메라가 기입됨
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2 = null; // c2가 c1의 객체를 참조하는 것을 끊을려면 null을 해주면 되는데
        System.out.println(c2.name); // 이때 c2는 아무것도 참조하지 않고 빈 값이 된다. 실행결과 : NullPointException

    }

    public static void changeName(Camera camera) {
        camera.name = "잘못된 카메라";
    }
}
