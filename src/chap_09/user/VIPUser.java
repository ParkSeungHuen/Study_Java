package chap_09.user;

public class VIPUser extends User{
    public VIPUser(String name) {
        super("특별한" + name); // User의 기본 생성자에서 "특별한"이 붙는다.
    }
}
