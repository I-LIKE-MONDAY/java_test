package test05;

import java.util.Scanner;

// 다음과 같이 영어와 한글의 짝을 이루는 2개의 배열을 만둘고,
// 사용자로부터 영어 단어를 입력 받아 한글을 출력하는 프로그램을 작성하시오.
// “exit”를 입력하면 프로그램을 종료하시오
public class ThreeSixNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String eng[] = {"student", "love", "java", "happy", "future"};
        String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};

//        while (true) {
//            System.out.println("영어 단어를 입력하세요");
//            String scanEng = scanner.next();
//            for (int i = 0; i < eng.length; i++) {
//                if (scanEng.contains(eng[i])) {
//                    System.out.println(kor[i]);
//                    break;
//                } else if (scanEng.equals("exit")) {
//                    System.out.println("종료합니다.");
//                    break;
//                }
//            }
//        }

        while (true) {
            System.out.print("영어 단어를 입력하세요 >> ");
            String scanEng = scanner.next();

            if(scanEng.equals("exit")) {
                System.out.println("종료합니다.");
                break;
            }

            int index = -1;

            for (int i = 0; i < eng.length; i++) {
                if (scanEng.equals(eng[i])) {
                    index = i;
                    break;
                }
            }

            if (index > -1) {
                System.out.println(kor[index]);
            }
            else {
                System.out.println("그런 영어 단어가 없습니다.");
            }
        }
    }
}
