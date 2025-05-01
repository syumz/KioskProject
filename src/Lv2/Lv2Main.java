package Lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lv2Main {
    public static void main(String[] args) {
        List<Lv2MenuItem> menuItems = new ArrayList<>();

        // menuItem 이라는 리스트에 햄버거 정보를 추가
        menuItems.add(new Lv2MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new Lv2MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new Lv2MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new Lv2MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Scanner scanner = new Scanner(System.in);

        System.out.print("햄버거 메뉴를 보시려면 'hamburger'를 입력해주세요. : ");
        String shakeshackMenu = scanner.nextLine();

        // 리스트에 들어가 있는 값을 for문을 통해 출력
        System.out.println("[ SHAKESHACK MENU ]");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.print(i + 1 + ". ");
            System.out.println(menuItems.get(i));
        }
        System.out.println("0. 종료");

        int num; // 메뉴를 선택하기 위한 숫자 변수 생성

        do { // 0을 입력하기 전까지 원하는 메뉴 선택
            System.out.println("\n");
            System.out.print("원하는 메뉴를 선택해주세요. (0을 입력하시면 종료됩니다.): ");
            num = scanner.nextInt();
            if (num == 1) {
                System.out.println(menuItems.get(0));
            } else if (num == 2) {
                System.out.println(menuItems.get(1));
            } else if (num == 3) {
                System.out.println(menuItems.get(2));
            } else if (num == 4) {
                System.out.println(menuItems.get(3));
            }
        } while (num != 0);
        System.out.println("프로그램을 종료합니다."); // 0을 입력해 do-while 문을 빠져나왔을 때 실행

    }
}
