package Lv4;

import java.util.Scanner;

public class Lv4Kiosk {
    Lv4Menu lv4Menu;


    // 2. 생성자
    public Lv4Kiosk(Lv4Menu lv4Menu){
        this.lv4Menu = lv4Menu;
    }

    // 3. 기능(메서드)
    public void start() { // 입력과 반복문 로직

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n");
        lv4Menu.mainMenu();
        System.out.print("원하시는 메뉴를 선택해주세요: ");
        int num1 = scanner.nextInt();
        int num2;

        while(true) {
            if (num1 == 1) {
                System.out.println("\n");
                lv4Menu.burgersMenu();
                System.out.print("원하시는 메뉴를 선택해주세요: ");
                num2 = scanner.nextInt();

                if (num2 == 1) {
                    System.out.print("선택한 메뉴: " + lv4Menu.menuItems.get(0));
                    break;
                } else if (num2 == 2) {
                    System.out.print("선택한 메뉴: " + lv4Menu.menuItems.get(1));
                    break;
                } else if (num2 == 3) {
                    System.out.print("선택한 메뉴: " + lv4Menu.menuItems.get(2));
                    break;
                } else if (num2 == 4) {
                    System.out.print("선택한 메뉴: " + lv4Menu.menuItems.get(3));
                    break;
                } else if (num2 == 0) {
                    System.out.println("\n");
                    lv4Menu.mainMenu();
                    System.out.print("원하시는 메뉴를 선택해주세요: ");
                    num1 = scanner.nextInt();
                }
            } else if(num1 == 0) break;
        }




    }
}
