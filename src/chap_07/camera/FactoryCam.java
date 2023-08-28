package chap_07.camera;
// SpeedCam is a Camera. (IS -A)
public class FactoryCam extends Camera{ // 자식 클래스
    public FactoryCam() {
//        this.name = "공장 카메라";
        super("공장 카메라"); // 부모 클래스의 생성자에 접근함, super.과 super는 다름
    }
    public void recordVideo() {
        super.recordVideo(); // 부모클래스의 recordVideo 메서드를 실행하고 아래를 실행, super.는 부모의 변수나 메소드에 접근
        detectFire();
    }

    public void detectFire() {
        System.out.println("화재를 감지합니다.");
    }

    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 화재 감지");
    }
}
