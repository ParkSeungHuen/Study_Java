package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String num = "980520-1674014";
        System.out.println(num.substring(0,8)); // 0~7까지 출력
        String num2 = "020328-4403284";
        System.out.println(num2.substring(0, num2.indexOf("-") + 2)); // 0 위치부터 하이픈 위치 + 2 직전까지 출력
    }
}
