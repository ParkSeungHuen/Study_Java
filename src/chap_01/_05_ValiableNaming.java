package chap_01;

public class _05_ValiableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄(_), 문자(abc), 숫자(123) 사용 가능
        // 3. 밑줄 또는 문자로 시작 가능, 숫자 사용 불가
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자
        // 6. 예약어 사용 불가 (public, static, void, int 등)

        // 입국 신고서 (여행)
        String nationality = "대한민국";
        String firstName = "승헌";
        String lastName = "박";
        String dataOfBirth = "1998-05-20";
        String residentialAddress = "** 호텔";
        String purposeOfVisit = "관광";
        String flightNo = "KE657";
        String _flightNo = "KE657";
        String flight_no_2 = "KE657";
        // String -flight_no -로는 시작 x

        int accompany = 2;
        int lengthOfStay = 5;

        String item1 = "시계";
        String item2 = "가방";
//        String 3item = "전자제품"; 변수는 숫자로 시작 x
    }
}
