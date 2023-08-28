package chap_07;

import javax.print.DocFlavor;

public class BlackBox {
    // 인스턴스 변수, 각 인스턴스마다 다르게 적용됨
    String modelName;
    String resolution;
    int price;
    String color;
    int serialNumber; // 시리얼 번호
    static boolean canAutoReport = false; // 자동 신고 기능, 클래스 변수는 한번 바뀌면 모든 객체에 적용됨

    static int counter = 0; // 처음엔 0이었다가 ++연산을 통해 증가

    BlackBox() {
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버를 발급받았습니다 : " + this.serialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color) {
//        this(); // this 괄호안에 아무 값도 없으면 기본생성자 호출, 만약 파라미터 값을 넣으면 해당 생성자 호출
//
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }

    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        }
        else {
            System.out.println("자동 신고 기능이 없습니다");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다");
    }

    int getVideoFileCount(int type) {
        if (type == 1) {
            return 9;
        }
        else if (type == 2) {
            return 1;
        }
        return 10;
    }

    void record(boolean showDataTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");

        if (showDataTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }

        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다.");
        }

        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    void record() {
        record(true, true, 5);
    } // static을 붙이지 않으면 각 메소드 오버로딩 된 기능을 각각 수행할 것임. 왜냐하면 인스턴스 변수가 다르기 때문에

    static void callServiceCenter() { // 클래스 메소드 : 내부의 동작이 항상 일정하게 수행됨
        System.out.println("서비스 센터로 연결합니다.");

        canAutoReport = false; // static 선언된 클래스 변수는 사용 가능하지만
//        modelName = "test"; // 인스턴스 변수는 바꿔줄 수 없다, 객체를 생성해서 ..
    }

    void appendModelName(String modelName) {
        this.modelName += modelName; // this.modelName 클래스 인스턴스 변수, modelName 인자값
    }

    // Getter & Setter
    String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution() {
        if(resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        }
        else {
            this.price = price;
        }
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }
}
