package chap_09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크 (List, Set, Map)
        ArrayList<String> list = new ArrayList<>();

        // 데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 데이터 조회 (인덱스)

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("--------------------");

        // 삭제
        System.out.println("신청 학생 수 : " + list.size()); // 5
        list.remove("박명수"); // list 내의 박명수씨 삭제
        System.out.println("신청 학생 수 : " + list.size());
        System.out.println(list.get(3)); // 박명수씨가 사라져서 강호동씨가 3인덱스가 됨

        System.out.println("----------------------------------");

        System.out.println("남은 학생 수 : " + list.size());
        list.remove(list.size() - 1);
        System.out.println("남은 학생 수 : " + list.size());

        // 순회
        for (String s :
                list) {
            System.out.println(s);
        }

        // 변경
        System.out.println("-------------------------");
        System.out.println(list.get(0));
        list.set(0, "박승헌");
        System.out.println(list.get(0));
        System.out.println("--------------------------");

        // 확인
        System.out.println(list.indexOf("김종국")); // 찾으려는 index값을.. 따라서 2가 출력됨

        // 선착순 5명 내에 포함되었는가 ?
        if (list.contains("김종국")) {
            System.out.println("수강 신청 성공");
        } else {
            System.out.println("수강 신청 실패");
        }

        System.out.println("-----------------------------");

        // 전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("비었습니다");
            System.out.println(list.size());
        }

        System.out.println("-----------------------------");

        // 새로 넣기
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 정렬
        Collections.sort(list);
        for (String s :
                list) {
            System.out.println(s); // 가나다 순으로 잘 정렬 되어있음
        }

    }
}
