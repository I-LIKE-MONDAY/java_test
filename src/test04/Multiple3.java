package test04;

import java.util.Scanner;

// 정수를 10개 입력받아 배열에 저장한 후, 배열을 검색하여 3의 배수만 골라 출력하는 프로그램을 작성하시오
public class Multiple3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intArray[] = new int[10];
        System.out.print("정수 10개 입력 >> ");
        for (int i = 0; i < 10; i++) {
            intArray[i] = scanner.nextInt();
            if(intArray[i] % 3 == 0) {
                System.out.print(intArray[i] + " ");
            }
        }


    }


}
