package test07;

import java.util.Scanner;

// 이름(name)과 전화번호(tel) 필드, 생성자 및 필요한 메소드를 가진 Phone 클래스를 작성하고,
// 다음 실행 사례와 같이 작동하도록 main()을 가진 PhoneManager 클래스를 작성하세요.
// 한 사람의 전화번호는 하나의 Phone 개체로 다룹니다.
//        인원수 >> 3
//        이름과 전화번호(번호는 연속적으로 입력) >> 김인수 111-1111
//        이름과 전화번호(번호는 연속적으로 입력) >> 조수미 222-2222
//        이름과 전화번호(번호는 연속적으로 입력) >> 한원선 333-3333
//        저장되었습니다...
//        검색할 이름 >> 한원선
//        한원선의 번호는 333-3333 입니다.
//        검색할 이름 >> 박인수
//        박인수 은(는) 없습니다.
//        검색할 이름 >> exit
//        프로그램을 종료합니다...
public class PhoneManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 인원수를 받는 부분
        System.out.print("인원수 >> ");
        int p = scanner.nextInt();
        String nameArray[] = new String[p];
        String telArray[] = new String[p];

        // 입력된 인원수만큼 for 문 돌리기
        for (int i = 0; i < p; i++) {
            System.out.print("이름과 전화번호(번호는 연속적으로 입력) >> ");
            nameArray[i] = scanner.next();
            telArray[i] = scanner.next();
        }
        System.out.println("저장되었습니다...");

        // 저장된 내용 검색
        while (true) {
            System.out.print("검색할 이름 >>");
            String searchName = scanner.next();
            if (searchName.equals("exit")) {
                System.out.println("프로그램을 종료합니다...");
                break;
            }

            int index = -1;

            for (int i = 0; i < nameArray.length; i++) {
                if (searchName.equals(nameArray[i])) {
                    index = i;
                    break;
                }
            }
            if (index > -1) {
                System.out.println(searchName + "의 번호는 " + telArray[index] + "입니다.");
            } else {
                System.out.println(searchName + "은(는) 없습니다.");
            }
        }
    }
}

