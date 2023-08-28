package chap_08.camera;

import chap_08.detector.Detectable;
import chap_08.reporter.Reportable;

public class SpeedCam extends Camera implements Detectable, Reportable{

    private Detectable detector; // Detectable 인터페이스에 setter를 이용하여 객체를 넣어주기
    private Reportable reporter;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }


    @Override
    public void showMainFeature() {
        System.out.println("속도 측정");
    }


    public void detect() {
        this.detector.detect();
    }

    public void report() {
        this.reporter.report();
    }
}
