package chap_06;

public class _Quiz_6 {
    public static String getHiddenData(String name, int i) {
        String result = name.substring(0,i);
        for (int j = 0; j < name.length() - i; j++) {
            result = result.concat("*"); // concat : 문자열 뒤에 해당하는 문자 추가
        }
        return result;
    }


    public static void main(String[] args) {
        String name = "나코딩";
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println(getHiddenData(name, 2));
        System.out.println(getHiddenData(id, 8));
        System.out.println(getHiddenData(phone, 9));

    }
}
