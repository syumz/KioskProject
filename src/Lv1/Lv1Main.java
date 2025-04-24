package Lv1;

import java.util.Scanner;

public class Lv1Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("햄버거 메뉴를 보시려면 'menu'를 입력해주세요. : ");
            String shakeshackMenu = scanner.nextLine();
            if (shakeshackMenu.equals("menu")) {
                System.out.println("[ SHAKESHACK MENU ]\n" +
                        "1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거\n" +
                        "2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\n" +
                        "3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거\n" +
                        "4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거\n" +
                        "0. 종료      | 종료");
            }
            System.out.println("0을 입력하시면 종료됩니다.");
            int exit = scanner.nextInt();
            if (exit == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}