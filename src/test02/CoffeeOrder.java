package test02;

import java.util.Scanner;

// 02. 음료수 종류와 잔 수를 입력받으면 가격을 알려주는 프로그램을 작성하시오.
// 에스프레소 2000원, 아메리카노 2500원, 카푸치노 3000원, 카페라떼 3500원이다
public class CoffeeOrder {
    public static void main(String[] args) {

        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("커피 주문하세요 >> ");

        String menu = scanner.next();
        int num = scanner.nextInt();

        if (menu.equals("에스프레소")) {
            sum = num * 2000;
        } else if (menu.equals("아메리카노")) {
            sum = num * 2500;
        } else if (menu.equals("카푸치노")) {
            sum = num * 3000;
        } else if (menu.equals("카페라떼")) {
            sum = num * 3500;
        }

        System.out.println(sum + "원입니다.");
    }
}
