package chap_07.camera;

// SpeedCam is a Camera
public class SpeedCam extends Camera{ // 자식 클래스
    public SpeedCam() {
//        this.name = "과속단속 카메라";
        super("과속단속 카메라");
    }

    public void takePicture() {
        // 사진 촬영
        super.recordVideo(); // 부모클래스의 takePicture 메서드를 실행하고 아래를 실행
        checkSpeed();
        recognizeLicensePlate();
    }

    public void checkSpeed() {
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate() {
        System.out.println("차량 번호를 인식합니다.");
    }
    @Override // 만약 부모클래스에 showMainFeature 메소드가 없으면 오류 반환
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 속도 측정, 번호 인식");
    }
}
