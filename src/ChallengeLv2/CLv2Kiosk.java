package ChallengeLv2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CLv2Kiosk {
    CLv2Menu cLv2Menu;
    CLv2Cart cLv2Cart = new CLv2Cart();
    Scanner scanner = new Scanner(System.in);
    int num1 = 0; // 메인메뉴 선택을 위한 변수 생성
    int num2 = 0; // 버거메뉴, 음료메뉴, 디저트 메뉴 선택을 위한 변수 생성

    // 2. 생성자
    public CLv2Kiosk(CLv2Menu cLv2Menu) {
        this.cLv2Menu = cLv2Menu;
    }

    // 3. 기능(메서드)
    // 메뉴 입력값을 받아 유효성 검사 후 반환하는 메서드
    public int getInput(Scanner scanner, int min, int max, String message){
        int input = -1;
        while(true){
            System.out.print(message);
            try{
                input = scanner.nextInt();
                if(input < min || input > max){
                    throw new IllegalArgumentException();
                }
                break;
            } catch(IllegalArgumentException | InputMismatchException e){
                System.out.println("올바른 숫자를 입력해주세요.");
                scanner.nextLine();
            }
        }
        return input;
    }

    // 입력과 반복문 로직
    public void start() {
        while (true) { // 사용자가 종료를 누르기 전까지 계속 반복
            System.out.println("\n");
            cLv2Menu.mainMenu(); // 메인 메뉴를 출력하는 메서드

            if (!cLv2Cart.getCarts().isEmpty()) { // 장바구니에 값이 들어있을 경우 0, 1, 2, 3, 4, 5 이외의 값 입력시 예외처리
                System.out.println("\n");
                cLv2Cart.orderMenu();
                num1 = getInput(scanner,0, 5, "원하시는 메뉴를 선택해주세요: "); // 코드가 반복되는 부분을 getInput 메서드로 처리(메뉴 입력값을 받아 유효성 검사 후 반환하는 메서드)
            }

            if (cLv2Cart.getCarts().isEmpty()) { // 장바구니가 비어있을 경우 0,1,2,3 이외의 값 입력시 예외처리
                System.out.println("\n");
                num1 = getInput(scanner,0, 3, "원하시는 메뉴를 선택해주세요: "); // 코드가 반복되는 부분을 getInput 메서드로 처리(메뉴 입력값을 받아 유효성 검사 후 반환하는 메서드)
            }

            if (num1 == 0) break; // 메인 메뉴에서 0을 눌렀을 시 프로그램 종료

            while (true) { // 사용자가 종료하기 전까지 반복한다.
                System.out.println("\n");
                if (num1 == 1) {
                    cLv2Menu.burgersMenu();
                } else if (num1 == 2) {
                    cLv2Menu.drinkMenu();
                } else if (num1 == 3) {
                    cLv2Menu.dessertsMenu();
                } else if (num1 == 4) { // 메인메뉴에서 4를 입력했을 때 orders 메서드(장바구니를 확인 후 주문하는 메서드)가 실행된다.
                    cLv2Cart.orders();
                    break;
                } else if (num1 == 5) { // 메인메뉴에서 5를 입력했을 때 cancel 메서드(진행중인 주문을 취소하는 메서드)가 실행된다.
                    cLv2Cart.cancel();
                    break;
                }
                try { // 다른 값을 입력했을 시 예외처리
                    System.out.print("원하시는 메뉴를 선택해주세요: ");
                    num2 = scanner.nextInt();
                    if (num2 == 0) break; // 0을 입력하면 메인메뉴로 돌아가게 된다.
                    if (num1 == 1) {
                        System.out.println("선택한 메뉴: " + cLv2Menu.getBurgersMenu().get(num2 - 1));
                        cLv2Cart.getCarts().add(cLv2Menu.getBurgersMenu().get(num2 - 1)); // burgerMenu 리스트에 들어있는 선택한 메뉴를 cartsList 에 저장하기 위해 getter 를 사용한다.
                    } else if (num1 == 2) {
                        System.out.println("선택한 메뉴: " + cLv2Menu.getDrinksMenu().get(num2 - 1));
                        cLv2Cart.getCarts().add(cLv2Menu.getDrinksMenu().get(num2 - 1)); // burgerMenu 리스트에 들어있는 선택한 메뉴를 cartsList 에 저장하기 위해 getter 를 사용한다.
                    } else if (num1 == 3) {
                        System.out.println("선택한 메뉴: " + cLv2Menu.getDessertsMenu().get(num2 - 1));
                        cLv2Cart.getCarts().add(cLv2Menu.getDessertsMenu().get(num2 - 1)); // burgerMenu 리스트에 들어있는 선택한 메뉴를 cartsList 에 저장하기 위해 getter 를 사용한다.
                    }
                    cLv2Cart.cartsAdd(); // cartsAdd 메서드(장바구니에 메뉴를 추가하는 메서드)를 실행한다.
                    break; // 메인메뉴로 돌아가게 된다.
                } catch (IndexOutOfBoundsException | InputMismatchException e) {
                    System.out.println("올바른 숫자를 입력해주세요");
                    scanner.nextLine(); // 버퍼에 남아있는 값을 제거하기 위해 사용
                }
            }
        }
    }
}




