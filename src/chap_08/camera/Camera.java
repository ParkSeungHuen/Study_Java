package chap_08.camera;

public abstract class Camera { // 다른 곳에서 만드지 못하게
    public void takePicture() {
        System.out.println("사진을 촬영합니다.");
    }

    public void recordVideo() {
        System.out.println("동영상을 촬영합니다.");
    }

    public abstract void showMainFeature(); // 구현해야 하는 메소드, 자식이 상속받아서 마저 구현해야함
}
