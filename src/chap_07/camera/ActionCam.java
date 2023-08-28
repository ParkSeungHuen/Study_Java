package chap_07.camera;

public final class ActionCam extends Camera{
    public final String lens;

    public ActionCam() {
        super("액션 카메라");
        lens = "광각렌즈"; // 생성자를 통해 초기화 가능, 객체가 만들어지는 동시에 선언되기 때문에
    }

    public final void makeVedio() {
        System.out.println(this.name + " : " + this.lens + " 멋진 영상을 만들어줍니다.");
    }
}
