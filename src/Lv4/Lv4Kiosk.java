package Lv4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lv4Kiosk {
    Lv4Menu lv4Menu;
    Scanner scanner = new Scanner(System.in);

    // 2. 생성자
    public Lv4Kiosk(Lv4Menu lv4Menu) {
        this.lv4Menu = lv4Menu;
    }

    // 3. 기능(메서드)
    public void start() { // 입력과 반복문 로직
        while (true) { // 사용자가 종료를 누르기 전까지 계속 반복
            int num1 = 0;
            int num2 = 0;
            System.out.println("\n");
            lv4Menu.mainMenu();
            while (true) {
                System.out.print("\n");
                System.out.print("원하시는 메뉴를 선택해주세요: ");
                try {
                    num1 = scanner.nextInt();
                    if (num1 < 0 || num1 > 3) {
                        throw new IllegalArgumentException();
                    }
                    break;
                } catch (IllegalArgumentException | InputMismatchException e) {
                    System.out.println("올바른 숫자를 입력해주세요.");
                    scanner.nextLine();
                }
            }
            if (num1 == 0) {
                System.out.println("프로그램을 종료합니다.");
                break; //종료
            }

            while (true) {
                System.out.println("\n");
                if (num1 == 1) {
                    lv4Menu.burgersMenu();
                } else if (num1 == 2) {
                    lv4Menu.drinkMenu();
                } else if (num1 == 3) {
                    lv4Menu.dessertsMenu();
                }
                try { // 다른 값을 입력했을 시 예외처리
                    System.out.print("원하시는 메뉴를 선택해주세요: ");
                    num2 = scanner.nextInt();
                    if (num2 == 0) break; // 0을 입력하면 메인메뉴로 돌아가게 된다.
                    if (num1 == 1) {
                        System.out.println("선택한 메뉴: " + lv4Menu.getBurgersMenu().get(num2 - 1));
                    } else if (num1 == 2) {
                        System.out.println("선택한 메뉴: " + lv4Menu.getDrinksMenu().get(num2 - 1));
                    } else if (num1 == 3) {
                        System.out.println("선택한 메뉴: " + lv4Menu.getDessertsMenu().get(num2 - 1));
                    }
                } catch (IndexOutOfBoundsException | InputMismatchException e) {
                    System.out.println("올바른 숫자를 입력해주세요");
                    scanner.nextLine(); // 버퍼에 남아있는 값을 제거하기 위해 사용
                }
            }
        }
    }
}

