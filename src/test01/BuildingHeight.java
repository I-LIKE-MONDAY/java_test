package test01;

import java.util.Scanner;

// 01. 한 층의 높이가 5m일 때 건물이 몇 층인지 입력받아 건물의 총 높이가 어떻게 되는지 출력하는 프로그램을 작성하시오
public class BuildingHeight {

    public static void main(String[] args) {
        int height = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 층인지 입력하세요 >> ");
        int floor = scanner.nextInt();

        System.out.println((height * floor) + "m 입니다.");
    }

}
