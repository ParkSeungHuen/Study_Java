package chap_06;

public class _03_Return {
    // 호텔 전화번호
    public static String getPhoneNumber() {
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }

    // 호텔 주소
    public static String getAddress() {
        String address = "창원시 성산구 용호동 52-2 305호";
        return address;
    }
    // 호텔 액티비티
    public static String[] activity() {
        String[] activity = {"볼링장", "탁구장", "노래방"};
        return activity;
    }
    public static void main(String[] args) {
        // 반환값
        String contactNumber = getPhoneNumber();
        System.out.println("호텔 전화번호 : " + contactNumber);
        System.out.println(getAddress());
        for (int i = 0; i < activity().length; i++) {
            System.out.println(activity()[i]);
        }
    }
}
