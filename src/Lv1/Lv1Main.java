package Lv1;

import java.util.Scanner;

public class Lv1Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("햄버거 메뉴를 보시려면 'hamburger'를 입력해주세요. : ");
        String shakeshackMenu = scanner.nextLine();

        if (shakeshackMenu.equals("hamburger")) { // 메뉴판 출력
            System.out.println("[ SHAKESHACK MENU ]\n" +
                    "1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거\n" +
                    "2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\n" +
                    "3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거\n" +
                    "4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거\n" +
                    "0. 종료      | 종료");
        }

        int num; // 메뉴를 선택하기 위한 숫자 변수 생성

        do { // 0을 입력하기 전까지 원하는 메뉴 선택
            System.out.print("원하는 메뉴를 선택해주세요. (0을 입력하시면 종료됩니다.): ");
            num = scanner.nextInt();
            if (num == 1) {
                System.out.println("ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            } else if (num == 2) {
                System.out.println("SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            } else if (num == 3) {
                System.out.println("Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            } else if (num == 4) {
                System.out.println("Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            }
        } while (num != 0);
        System.out.println("프로그램을 종료합니다."); // 0을 입력해 do-while 문을 빠져나왔을 때 실행

    }
}