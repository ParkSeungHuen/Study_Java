package chap_09.coffee;

import chap_09.user.User;

public class CoffeeByUser <T extends User>{ // CoffeeByUser 클래스는 User 클래스를 상속하는 VIP 클래스등이 들어올 수 있다.

    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + user.name);
        user.addPoint();
    }
}
