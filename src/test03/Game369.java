package test03;

import java.util.Scanner;

// 03. 369게임을 작성하시오. 1 ~ 99까지의 정수를 입력받고 수에 3, 6, 9 중 하나가 있는 경우는 “박수짝”,
// 두 개가 있는 경우는 “박수짝짝”, 하나도 없으면 “박수없음”을 출력하고 0을 입력 받으면 종료하는 프로그램을 작성하시오.
// 예를 들면, 13인 경우 “박수짝”, 36인 경우 “박수짝짝” 5인 경우 “박수없음” 0인 경우 “종료합니다” 출력 후 종료하면 된다.
public class Game369 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("1 ~ 99 사이의 정수를 입력하세요 >> ");
            int num = scanner.nextInt();
            if (num <= 10) {
                if (num == 0) {
                    System.out.println("종료합니다.");
                    break;
                }else if ((num % 3) == 0) {
                    System.out.println("박수짝");
                }  else {
                    System.out.println("박수없음");
                }
            } else if ((num / 10) % 3 == 0 && (num % 10) % 3 == 0) {
                System.out.println("박수짝짝");
            } else if ((num / 10) % 3 == 0) {
                System.out.println("박수짝");
            } else if ((num % 10) % 3 == 0) {
                System.out.println("박수짝");
            } else {
                System.out.println("박수 없음");
            }
        }
    }
}
