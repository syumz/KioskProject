package ChallengeLv1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CLv1Cart {

    // 1. 속성
    // 선택한 메뉴의 정보를 저장하는 리스트
    private final List<CLv1MenuItem> cartsList = new ArrayList<>();

    // 2. 생성자

    // 3. 기능
    public void cartsAdd() {
        System.out.println("\n");
        System.out.println("\"" + cartsList.get(cartsList.size() - 1) + "\"");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인        2. 취소");

        Scanner scanner = new Scanner(System.in);
        int cartNum = scanner.nextInt();
        if (cartNum == 2) {
            cartsList.remove(cartsList.size() - 1);
        } else if (cartNum == 1) {
            System.out.println(cartsList.get(cartsList.size() - 1).getName() + " 이 장바구니에 추가되었습니다.");
        }
    }

    public void orderMenu() {
        System.out.println("[ ORDER MENU ]\n" +
                "4. Orders       | 장바구니를 확인 후 주문합니다.\n" +
                "5. Cancel       | 진행중인 주문을 취소합니다.");
    }

    public void cancel() {
        cartsList.clear();
    }

    public void orders() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("아래와 같이 주문 하시겠습니까?");

        int size = cartsList.size();
        System.out.println("[ Orders ]\n" + cartsList + "\n");

        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += cartsList.get(i).getPrice();
        }
        double sumResult = Math.round(sum * 100) / 100.0;
        System.out.println("[ Total ]" + "\n" + "W " + sumResult + "\n");

        System.out.println("1. 주문      2. 메뉴판");
        int finalOrd = scanner.nextInt();

        if (finalOrd == 1) {
            System.out.println("\n" + "주문이 완료되었습니다. 금액은 W " + sumResult + "입니다.");
            cartsList.clear();
        }
    }


    public List<CLv1MenuItem> getCarts() {
        return cartsList;
    }
}