package test06;

import java.util.Scanner;

public class Phone {
// 05. 다음은 이름(name 필드)과 전화번호(tel 필드)를 가진 Phone 클래스이다.
// 이름과 전화번호를 입력받아 2개의 phone 객체를 생성하고, 출력하는 프로그램을 작성하시오

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 2; i++) {
            System.out.print("이름과 전화번호 입력 >> ");
            String name = scanner.next();
            String tel = scanner.next();

            Phone ph = new Phone(name, tel);

            System.out.println(ph.getName() + "의 번호 " + ph.getTel());
        }
    }
    private String name, tel;
    public Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
    public String getName() { return name; }
    public String getTel() { return tel; }
}

