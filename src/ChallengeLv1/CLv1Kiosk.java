package ChallengeLv1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CLv1Kiosk {
    CLv1Menu cLv1Menu;
    CLv1Cart cLv1Cart = new CLv1Cart();


    // 2. 생성자
    public CLv1Kiosk(CLv1Menu cLv1Menu) {
        this.cLv1Menu = cLv1Menu;
    }

    // 3. 기능(메서드)
    public void start() { // 입력과 반복문 로직

        Scanner scanner = new Scanner(System.in);

        while (true) { // 사용자가 종료를 누르기 전까지 계속 반복
            int num1 = 0; // 메인메뉴 선택을 위한 변수 생성
            int num2 = 0; // 버거메뉴, 음료메뉴, 디저트 메뉴 선택을 위한 변수 생성
            System.out.println("\n");
            cLv1Menu.mainMenu(); // 메인 메뉴를 출력하는 메서드

            if (!cLv1Cart.getCarts().isEmpty()) { // 장바구니에 값이 들어있을 경우 order menu 를 보여준다.
                System.out.println("\n");
                cLv1Cart.orderMenu();
            }

            while(!cLv1Cart.getCarts().isEmpty()){ // 장바구니에 값이 들어있을 경우 0, 1, 2, 3, 4, 5 이외의 값 입력시 예외처리
                System.out.print("원하시는 메뉴를 선택해주세요: ");
                try{
                    num1 = scanner.nextInt();
                    if(num1<0 || num1>5){
                        throw new IllegalArgumentException();
                    }
                } catch (IllegalArgumentException | InputMismatchException e){
                    System.out.println("올바른 숫자를 입력해주세요.");
                    scanner.nextLine(); // 버퍼에 남아있는 값을 제거하기 위해 사용
                }

                if(num1>=0 && num1<=5){
                    break; // 바른 값을 입력했을 시 while 문에서 빠져나온다.
                }
            }

            while (cLv1Cart.getCarts().isEmpty()) { // 장바구니가 비어있을 경우 0,1,2,3 이외의 값 입력시 예외처리
                System.out.println("\n");
                System.out.print("원하시는 메뉴를 선택해주세요: ");
                try{
                    num1 = scanner.nextInt();
                    if(num1<0 || num1>3){
                        throw new IllegalArgumentException();
                    }
                } catch (IllegalArgumentException | InputMismatchException e){
                    System.out.print("올바른 숫자를 입력해주세요.");
                    scanner.nextLine(); // 버퍼에 남아있는 값을 제거하기 위해 사용
                }

                if(num1>=0 && num1<=3){
                    break; // 바른 값을 입력했을 시 while 문에서 빠져나온다.
                }
            }

            if (num1 == 0) break; // 프로그램 종료

            while (true) { // 사용자가 종료하기 전까지 반복한다.
                if (num1 == 1) { // 1을 입력했을 때 버거메뉴 메서드가 실행된다.
                    System.out.println("\n");
                    cLv1Menu.burgersMenu();
                    try { // 다른 값을 입력했을 시 예외처리
                        System.out.print("원하시는 메뉴를 선택해주세요: ");
                        num2 = scanner.nextInt();
                        if (num2 == 0) break; // 0을 입력하면 메인메뉴로 돌아가게 된다.
                        System.out.println("선택한 메뉴: " + cLv1Menu.getBurgersMenu().get(num2 - 1));
                        cLv1Cart.getCarts().add(cLv1Menu.getBurgersMenu().get(num2 - 1)); // burgerMenu 리스트에 들어있는 선택한 메뉴를 cartsList 에 저장하기 위해 getter 를 사용한다.
                        cLv1Cart.cartsAdd(); // cartsAdd 메서드(장바구니에 메뉴를 추가하는 메서드)를 실행한다.
                        break; // 메인메뉴로 돌아가게 된다.
                    } catch (IndexOutOfBoundsException | InputMismatchException e) {
                        System.out.println("올바른 숫자를 입력해주세요");
                        scanner.nextLine(); // 버퍼에 남아있는 값을 제거하기 위해 사용
                    }

                } else if (num1 == 2) { // 2을 입력했을 때 음료 메뉴 메서드가 실행된다
                    System.out.println("\n");
                    cLv1Menu.drinkMenu();
                    try { // 다른 값을 입력했을 시 예외처리
                        System.out.print("원하시는 메뉴를 선택해주세요: ");
                        num2 = scanner.nextInt();
                        if (num2 == 0) break; // 0을 입력하면 메인메뉴로 돌아가게 된다.
                        System.out.println("선택한 메뉴: " + cLv1Menu.getDrinksMenu().get(num2 - 1));
                        cLv1Cart.getCarts().add(cLv1Menu.getDrinksMenu().get(num2 - 1)); // drinkMenu 리스트에 들어있는 선택한 메뉴를 cartsList 에 저장하기 위해 getter 를 사용한다.
                        cLv1Cart.cartsAdd(); // cartsAdd 메서드(장바구니에 메뉴를 추가하는 메서드)를 실행한다.
                        break; // 메인메뉴로 돌아가게 된다.
                    } catch (IndexOutOfBoundsException | InputMismatchException e) {
                        System.out.println("올바른 숫자를 입력해주세요");
                        scanner.nextLine(); // 버퍼에 남아있는 값을 제거하기 위해 사용
                    }

                } else if (num1 == 3) { // 3을 입력했을 때 디저트 메뉴 메서드가 실행된다
                    System.out.println("\n");
                    cLv1Menu.dessertsMenu();
                    try { // 다른 값을 입력했을 시 예외처리
                        System.out.print("원하시는 메뉴를 선택해주세요: ");
                        num2 = scanner.nextInt();
                        if (num2 == 0) break; // 0을 입력하면 메인메뉴로 돌아가게 된다.
                        System.out.println("선택한 메뉴: " + cLv1Menu.getDessertsMenu().get(num2 - 1));
                        cLv1Cart.getCarts().add(cLv1Menu.getDessertsMenu().get(num2 - 1)); // dessertMenu 리스트에 들어있는 선택한 메뉴를 cartsList 에 저장하기 위해 getter 를 사용한다.
                        cLv1Cart.cartsAdd(); // cartsAdd 메서드(장바구니에 메뉴를 추가하는 메서드)를 실행한다.
                        break; // 메인메뉴로 돌아가게 된다.
                    } catch (IndexOutOfBoundsException | InputMismatchException e) {
                        System.out.println("올바른 숫자를 입력해주세요");
                        scanner.nextLine(); // 버퍼에 남아있는 값을 제거하기 위해 사용
                    }
                } else if (num1 == 4) { // 4을 입력했을 때 orders 메서드(장바구니를 확인 후 주문하는 메서드)가 실행된다.
                    cLv1Cart.orders();
                    break;
                } else if (num1 == 5) { // 5을 입력했을 때 cancel 메서드(진행중인 주문을 취소하는 메서드)가 실행된다.
                    cLv1Cart.cancel();
                    break;
                }
            }
        }
    }
}