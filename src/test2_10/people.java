package test2_10;
//5개의 나라 이름과 인구를 입력받아 해시맵에 저장하고 가장 인구가 많은 나라를 검색하여 출력하는 프로그램을 작성하시오
// HashMap<String, Integer> nations = new HashMap<String, Integer>();

import java.util.HashMap;
import java.util.Scanner;

// 나라 이름과 인구를 5개 입력하세요. (예: Korea 5000)
// 나라 이름, 인구 >> Korea 5000
// 나라 이름, 인구 >> China 1000000
// 나라 이름, 인구 >> USA 30000
// 나라 이름, 인구 >> Swiss 2000
// 나라 이름, 인구 >> France 2500
// 제일 인구가 많은 나라는 (China, 1000000)
public class people {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("나라 이름과 인구를 5개 입력하세요. (예: Korea 5000)");

        HashMap<String, Integer> nations = new HashMap<String, Integer>();
        int a = 0;
        String b = "";

        for(int i = 0; i < 5; i++) {
            System.out.print("나라 이름, 인구 >> ");
            String nation = scanner.next();
            int people = scanner.nextInt();

            nations.put(nation, people);

            if(a < nations.get(nation)) {
                a = nations.get(nation);
                b = nation;
            }
        }
        //제일 인구가 많은 나라는 (China, 1000000)
        System.out.println("제일 인구가 많은 나라는 (" + b + "," + nations.get(b) + ")");
    }
}
