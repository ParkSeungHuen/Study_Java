package chap_09.coffee;

public class CoffeeByName {

    public Object name; // Integer, Double, BlackBox 등 여러 타입이 들어올 수 있다

    public CoffeeByName(Object name) {
        this.name = name;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + name);
    }
}
