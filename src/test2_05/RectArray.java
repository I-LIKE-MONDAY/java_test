package test2_05;
// 사각형을 표현하는 다음 Rect 클래스를 활용하여 rect 객체 배열을 생성하고,
// 사용자로부터 4개의 사각형을 입력받아 배열에 저장한 후 배열을 검색하여 사격형 면적의 합을 출력하는 프로그램을 작성하시오

import java.util.Scanner;

//        1 너비와 높이 >> 3 5
//        2 너비와 높이 >> 3 9
//        3 너비와 높이 >> 2 7
//        4 너비와 높이 >> 9 5
//        저장하였습니다.
//        사각형의 전체의 합은 101
public class RectArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        for(int i = 0; i < 4; i++) {
            count++;
            System.out.print(count + "너비와 높이 >> ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int rect = new Rect(a, b).getArea();
            sum = sum + rect;
        }
        System.out.println("저장하였습니다.");
        System.out.println("사각형 전체의 합은" + sum);
    }
}


class Rect {
    private int width, height;

    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width*height;
    }
}