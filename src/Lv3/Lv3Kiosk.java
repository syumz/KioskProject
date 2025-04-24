package Lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lv3Kiosk { // 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리하는 클래스
    // 1. 속성
    List<Lv3MenuItem> menuItems = new ArrayList<>();

    // 2. 생성자

    // 3. 기능(메서드)
    public void start(){ // 입력과 반복문 로직
        Scanner scanner = new Scanner(System.in);

        System.out.print("햄버거 메뉴를 보시려면 'hamburger'를 입력해주세요. : ");
        String shakeshackMenu = scanner.nextLine();
        if(!shakeshackMenu.equals("hamburger")){ // 다른 문자를 입력했을 시 다시 입력
            System.out.println("다시 입력해주세요.");
            System.out.print("햄버거 메뉴를 보시려면 'hamburger'를 입력해주세요. : ");
            shakeshackMenu = scanner.nextLine();
        }

        // 리스트에 들어가 있는 값을 for문을 통해 출력
        System.out.println("[ SHAKESHACK MENU ]");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.print(i + 1 + ". ");
            System.out.println(menuItems.get(i));
        }
        System.out.println("0. 종료");

        int num; // 메뉴를 선택하기 위한 숫자 변수 생성

        do { // 0을 입력하기 전까지 원하는 메뉴 선택
            System.out.print("\n원하는 메뉴를 선택해주세요. (0을 입력하시면 종료됩니다.): ");
            num = scanner.nextInt();
            if (num == 1) {
                System.out.println(menuItems.get(0));
            } else if (num == 2) {
                System.out.println(menuItems.get(1));
            } else if (num == 3) {
                System.out.println(menuItems.get(2));
            } else if (num == 4) {
                System.out.println(menuItems.get(3));
            } else {
                System.out.println("올바른 숫자를 입력해주세요.");
            }
        } while (num != 0);
        System.out.println("프로그램을 종료합니다."); // 0을 입력해 do-while 문을 빠져나왔을 때 실행

    }
}
