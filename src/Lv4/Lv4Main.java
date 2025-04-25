package Lv4;

public class Lv4Main {
    public static void main(String[] args) {
        Lv4Menu lv4Menu = new Lv4Menu();

        lv4Menu.getLv4Menus().add(new Lv4Menu("Burgers"));
        lv4Menu.getLv4Menus().add(new Lv4Menu("Drinks"));
        lv4Menu.getLv4Menus().add(new Lv4Menu("Desserts"));

        // Lv4Menu 에 있는 Lv4MenuItems 라는 리스트에 getter 를 사용해 햄버거 정보를 추가
        lv4Menu.getBurgersMenu().add(new Lv4MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        lv4Menu.getBurgersMenu().add(new Lv4MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        lv4Menu.getBurgersMenu().add(new Lv4MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        lv4Menu.getBurgersMenu().add(new Lv4MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        //
        lv4Menu.getDrinksMenu().add(new Lv4MenuItem("Fountain Soda", 2.9, "코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지"));
        lv4Menu.getDrinksMenu().add(new Lv4MenuItem("Lemonade", 4.5, "매장에서 직접 만드는 상큼한 레몬에이드"));
        lv4Menu.getDrinksMenu().add(new Lv4MenuItem("Fresh Brewed Iced Tea", 3.7, "직접 유기농 홍차를 우려낸 아이스 티"));
        lv4Menu.getDrinksMenu().add(new Lv4MenuItem("Fifty/Fifty", 4.0, "레몬에이드와 유기농 홍차를 우려낸 아이스 티가 만나 탄생한 시그니처 음료"));

        lv4Menu.getDessertsMenu().add(new Lv4MenuItem("Shack Attack", 6.2, "진한 초콜릿 커스터드에 퍼지 소스와 세 가지 초콜릿 토핑이 블렌딩된 콘크리트"));
        lv4Menu.getDessertsMenu().add(new Lv4MenuItem("Classic Hand-Spun Shakes", 6.8, "쫀득하고 진한 커스터드가 들어간 클래식 쉐이크"));
        lv4Menu.getDessertsMenu().add(new Lv4MenuItem("Cup & Cones", 5.7, "신선하게 제조하는 쫀득하고 진한 아이스크림"));

        Lv4Kiosk lv4Kiosk = new Lv4Kiosk(lv4Menu);
        lv4Kiosk.start();

    }
}
