package test2_03;
//컴퓨터와 가위바위보 게임을 하는 프로그램을 작성하시오.
// 컴퓨터는 게임 시작 시 랜덤으로 가위, 바위, 보 중 하나를 선택하고 사용자의 가위, 바위, 보를 입력받습니다.
// 컴퓨터와 사용자를 비교하여 누구의 승리인지 출력하시오

import com.sun.tools.jconsole.JConsoleContext;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

//가위, 바위, 보 게임을 시작합니다.
//        입력 하세요 >> 가위
//        컴퓨터 >> 바위
//        컴퓨터가 이겼습니다.
public class GBBGameApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("가위, 바위, 보 게임을 시작합니다.");
        System.out.print("입력하세요 >> ");
        String userGBB = scanner.nextLine();
        int userGBB2 = 0;
        if (userGBB.equals("가위")) {
            userGBB2 = 1;
        } else if (userGBB.equals("바위")) {
            userGBB2 = 2;
        } else if (userGBB.equals("보")) {
            userGBB2 = 3;
        }

        Random random = new Random();
        int comGBB = random.nextInt(3) + 1;
        String comGBB2 = "";
        if (comGBB == 1) {
            comGBB2 = "가위";
        } else if (comGBB == 2) {
            comGBB2 = "바위";
        } else if (comGBB == 3) {
            comGBB2 = "보";
        }
        System.out.println("컴퓨터 >> " + comGBB2);

        if (userGBB2 == comGBB) {
            System.out.println("비겼습니다.");
        } el
    }
}
