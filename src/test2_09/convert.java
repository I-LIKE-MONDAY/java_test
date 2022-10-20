package test2_09;

import java.util.Scanner;

// Scanner를 사용하여 학점(A, B, C, D, E)을 5개 입력받아
// ArrayList에 저장한 후 다시 ArrayList를 검색하여 5개의 학점을
// 점수(A=5.0, B=4.0, C=3.0, D=2.0, F=1.0)로 변환하여 출력하는 프로그램을 작성하시오

// 빈 칸으로 분리하여 5 개의 학점을 입력(A/B/C/D/F) >> B A F C D
// 4.0 5.0 1.0 3.0 2.0
public class convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String level[] = new String[5];
        String num[] = new String[5];
        System.out.print("빈 칸으로 분리하여 5 개의 학점을 입력(A/B/C/D/F) >> ");
        for(int i = 0; i < 5; i++) {
            level[i] = scanner.next();

            if(level[i].equals("A")) {
                System.out.print(5.0);
            } else if(level[i].equals("B")) {
                System.out.print(4.0);
            } else if(level[i].equals("C")) {
                System.out.print(3.0);
            } else if(level[i].equals("D")) {
                System.out.print(2.0);
            } else if(level[i].equals("F")) {
                System.out.print(1.0);
            }
            System.out.print(" ");
        }
    }
}
