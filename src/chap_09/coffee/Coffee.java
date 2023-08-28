package chap_09.coffee;

public class Coffee <T>{ // 제네릭 클래스 선언, 정해진 타입만 받을 수 있게
    public T name;

    public Coffee(T name) {
        this.name = name;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + name);
    }
}
