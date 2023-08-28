package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;
import chap_09.user.VIPUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("유재석");
        c2.ready();

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();

        int c3Name = (int) c3.name; // 객체 c3의 name은 현재 object 타입의 34이다. object 타입 같은 경우 바로 가져오는건 안되고 int로 형변환 해주어야 한다
        System.out.println("주문 고객 번호 : " + c3Name);

        String c4Name = (String) c4.name;
        System.out.println("주문 고객 번호 : " + c4Name);

//        c4Name = (String) c3.name; c3의 name은 int인데, String으로 형변환을 시도해서 에러
        //기본형 넣지 말고 wrapper class 사용
        Coffee<Integer> c5 = new Coffee<>(350); // 문자열을 넣을 수 없다, 자료형 정해주었기 때문에
        c5.ready();
        int c5Name = c5.name; // 바로 값을 넣어줄 수 있다

        Coffee<String> c6 = new Coffee<>("조세호"); // 따라서 정수형 등을 넣을 수 없다
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름 : " + c6Name);
        // 객체의 타입 선언은 어떤 타입이든 받을 수 있다, 코드를 줄일 수 있다
        System.out.println("----------------------------");
        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("강호동")); // User 객체가 들어가야 한다.
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("서장훈"));
        c8.ready();

        System.out.println("-----------------");
        orderCoffee("김영철");
        orderCoffee(36);
        orderCoffee("박승헌", "바닐라라떼");

    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);
    }

    public static <T, V> void orderCoffee(T name, V coffee) { // 값을 여러개, 그 이상 받을 때 안에 여러개...
        System.out.println(coffee + " 준비 완료 : " + name);
    }
}