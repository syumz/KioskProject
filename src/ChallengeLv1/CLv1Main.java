package ChallengeLv1;

public class CLv1Main {
    public static void main(String[] args) {
        CLv1Menu cLv1Menu = new CLv1Menu();

        // CLv1Menu 에 있는 lv4Menus 라는 리스트에 getter 를 사용해 햄버거 정보를 추가
        cLv1Menu.getCLv1Menus().add(new CLv1Menu("Burgers"));
        cLv1Menu.getCLv1Menus().add(new CLv1Menu("Drinks"));
        cLv1Menu.getCLv1Menus().add(new CLv1Menu("Desserts"));

        // CLv1Menu 에 있는 burgersMenu 라는 리스트에 getter 를 사용해 햄버거 정보를 추가
        cLv1Menu.getBurgersMenu().add(new CLv1MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        cLv1Menu.getBurgersMenu().add(new CLv1MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        cLv1Menu.getBurgersMenu().add(new CLv1MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        cLv1Menu.getBurgersMenu().add(new CLv1MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // CLv1Menu 에 있는 drinksMenu 라는 리스트에 getter 를 사용해 음료 정보를 추가
        cLv1Menu.getDrinksMenu().add(new CLv1MenuItem("Fountain Soda", 2.9, "코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지"));
        cLv1Menu.getDrinksMenu().add(new CLv1MenuItem("Lemonade", 4.5, "매장에서 직접 만드는 상큼한 레몬에이드"));
        cLv1Menu.getDrinksMenu().add(new CLv1MenuItem("Fresh Brewed Iced Tea", 3.7, "직접 유기농 홍차를 우려낸 아이스 티"));
        cLv1Menu.getDrinksMenu().add(new CLv1MenuItem("Fifty/Fifty", 4.0, "레몬에이드와 유기농 홍차를 우려낸 아이스 티가 만나 탄생한 시그니처 음료"));

        // CLv1Menu 에 있는 dessertsMenu 라는 리스트에 getter 를 사용해 디저트 정보를 추가
        cLv1Menu.getDessertsMenu().add(new CLv1MenuItem("Shack Attack", 6.2, "진한 초콜릿 커스터드에 퍼지 소스와 세 가지 초콜릿 토핑이 블렌딩된 콘크리트"));
        cLv1Menu.getDessertsMenu().add(new CLv1MenuItem("Classic Hand-Spun Shakes", 6.8, "쫀득하고 진한 커스터드가 들어간 클래식 쉐이크"));
        cLv1Menu.getDessertsMenu().add(new CLv1MenuItem("Cup & Cones", 5.7, "신선하게 제조하는 쫀득하고 진한 아이스크림"));

        CLv1Kiosk cLv1Kiosk = new CLv1Kiosk(cLv1Menu);
        cLv1Kiosk.start(); // CLv1Kiosk 에 있는 start 함수 실행
    }
}

