package Lv4;

import java.util.Scanner;

public class Lv4Kiosk {
    Lv4Menu lv4Menu;


    // 2. 생성자
    public Lv4Kiosk(Lv4Menu lv4Menu) {
        this.lv4Menu = lv4Menu;
    }

    // 3. 기능(메서드)
    public void start() { // 입력과 반복문 로직

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int num1 = 0;
            int num2 = 0;
            System.out.println("\n");
            lv4Menu.mainMenu();
            System.out.print("원하시는 메뉴를 선택해주세요: ");
            num1 = scanner.nextInt();
            while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3) {
                System.out.print("올바른 숫자를 입력해주세요.");
                System.out.println("\n");
                System.out.print("원하시는 메뉴를 선택해주세요: ");
                num1 = scanner.nextInt();
            }
            if (num1 == 0) {
                System.out.println("프로그램을 종료합니다.");
                break; //종료
            }

            while (true) {
                if (num1 == 1) {
                    System.out.println("\n");
                    lv4Menu.burgersMenu();
                    try {
                        System.out.print("원하시는 메뉴를 선택해주세요: ");
                        num2 = scanner.nextInt();
                        if (num2 == 0) break;
                        System.out.println("선택한 메뉴: " + lv4Menu.getBurgersMenu().get(num2 - 1));

                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("올바른 숫자를 입력해주세요");
                    }

                } else if (num1 == 2) {
                    System.out.println("\n");
                    lv4Menu.drinkMenu();
                    try {
                        System.out.print("원하시는 메뉴를 선택해주세요: ");
                        num2 = scanner.nextInt();
                        if (num2 == 0) break;
                        System.out.println("선택한 메뉴: " + lv4Menu.getDrinksMenu().get(num2 - 1));

                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("올바른 숫자를 입력해주세요");
                    }

                } else if (num1 == 3) {
                    System.out.println("\n");
                    lv4Menu.dessertsMenu();
                    try {
                        System.out.print("원하시는 메뉴를 선택해주세요: ");
                        num2 = scanner.nextInt();
                        if (num2 == 0) break;
                        System.out.println("선택한 메뉴: " + lv4Menu.getDessertsMenu().get(num2 - 1));

                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("올바른 숫자를 입력해주세요");
                    }
                }
            }
        }
    }
}

