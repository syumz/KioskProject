package ChallengeLv2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CLv2Cart {

    // 1. 속성
    // 선택한 메뉴의 정보를 저장하는 리스트
    private final List<CLv2MenuItem> cartsList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    // 2. 생성자

    // 3. 기능(메서드)
    // 메뉴 입력값을 받아 유효성 검사 후 반환하는 메서드
    private int getInput(Scanner scanner, int min, int max) {
        int input = -1;
        try {
            input = scanner.nextInt();
            if (input < min || input > max) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("올바른 숫자를 입력해주세요.");
            scanner.nextLine();
        }
        return input;
    }

    // 장바구니에 메뉴를 추가하는 메서드
    public void cartsAdd() {
        System.out.println("\n");
        System.out.println("\"" + cartsList.get(cartsList.size() - 1) + "\""); // cartsList 에 담겨있는 마지막 값을 보여준다.(선택한 메뉴가 cartsList 마지막에 저장되어 있다.)
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인        2. 취소");

        int cartNum = 0; // 장바구니에 추가 여부를 위한 변수 생성
        while (true) {
            cartNum = getInput(scanner, 1, 2); // 코드가 반복되는 부분을 getInput 메서드로 처리(메뉴 입력값을 받아 유효성 검사 후 반환하는 메서드)

            if (cartNum == 1) { // 1을 입력하면 장바구니에 추가된 메뉴 이름을 출력한다.
                System.out.println(cartsList.get(cartsList.size() - 1).getName() + " 이 장바구니에 추가되었습니다.");
                break; // 바른 값을 입력했을 시 while 문에서 빠져나온다.
            } else if (cartNum == 2) { // 2를 입력하면 장바구니에 추가하지 않기 때문에 cartsList 에 있는 마지막 값을 삭제한다.
                cartsList.remove(cartsList.size() - 1);
                System.out.println("메뉴 선택이 취소되었습니다.");
                break; // 바른 값을 입력했을 시 while 문에서 빠져나온다.
            }
        }
    }

    // ORDER MENU 를 출력하는 메서드
    public void orderMenu() {
        System.out.println("[ ORDER MENU ]\n" +
                "4. Orders       | 장바구니를 확인 후 주문합니다.\n" +
                "5. Cancel       | 진행중인 주문을 취소합니다.");
    }

    // 진행중인 주문을 취소하는 메서드
    public void cancel() {
        cartsList.clear(); // cartsList 에 담겨 있는 모든 값을 제거한다.
    }

    // 장바구니를 확인 후 주문하는 메서드
    public void orders() {
        int finalOrd = 0; // 최종으로 메뉴를 주문하기 위한 변수 생성
        double sumResult = 0; // 주문할 가격의 합을 나타내기 위한 변수 생성

        while (finalOrd < 1 || finalOrd > 3) { // 1, 2, 3을 입력하기 전까지 반복
            System.out.println("\n" + "아래와 같이 주문 하시겠습니까?");
            System.out.println("[ Orders ]\n" + cartsList + "\n"); // 장바구니에 담겨 있는 메뉴를 보여준다.

            int size = cartsList.size(); // cartsList 의 사이즈 변수 생성
            double sum = 0; // total 금액 변수 생성
            for (int i = 0; i < size; i++) { // cartsList 에 있는 가격의 합을 for 문을 활용해 구한다.
                sum += cartsList.get(i).getPrice();
            }
            sumResult = Math.round(sum * 10) / 10.0; // 가격의 합을 소숫점 첫째자리까지 나타내기 위해 Math.round 를 사용한다.
            System.out.println("[ Total ]" + "\n" + "W " + sumResult + "\n");

            System.out.println("1. 주문   2. 메뉴 삭제   3. 메뉴판");

            finalOrd = getInput(scanner, 1, 3); // 코드가 반복되는 부분을 getInput 메서드로 처리(메뉴 입력값을 받아 유효성 검사 후 반환하는 메서드)
        }
        if (finalOrd == 1) {
            int per = 0;
            while (per < 1 || per > 4) {
                DiscountRatePerType.discountinfo();
                per = getInput(scanner, 1, 4); // 코드가 반복되는 부분을 getInput 메서드로 처리(메뉴 입력값을 받아 유효성 검사 후 반환하는 메서드)
            }

            for (int i = 0; i <= 4; i++) {
                if (per == i) {
                    sumResult -= sumResult * (DiscountRatePerType.discountPer.get(i - 1));
                    sumResult = Math.round(sumResult * 10) / 10.0;
                }
            }
            System.out.println("\n" + "주문이 완료되었습니다. 금액은 W " + sumResult + "입니다.");
            cartsList.clear();

        } else if (finalOrd == 2) { // 장바구니에 담긴 메뉴 중 입력받은 메뉴 삭제
            System.out.print("무슨 메뉴를 삭제하시겠습니까?: ");
            String menu = scanner.next();

            //입력받은 menu 와 이름이 동일하다면 메뉴를 삭제
            cartsList.stream()
                    .filter(a -> a.getName().equals(menu))
                    .toList()
                    .forEach(cartsList::remove);
            System.out.println("메뉴가 삭제되었습니다.");

        }
    }

    // cartsList 의 getter 메서드
    public List<CLv2MenuItem> getCarts() {
        return cartsList;
    }

}
