package Lv3;

public class Lv3Main {
    public static void main(String[] args) {
        Lv3Kiosk lv3Kiosk = new Lv3Kiosk();

        // Lv3Kiosk 에 있는 menuItems 라는 리스트에 햄버거 정보를 추가
        lv3Kiosk.menuItems.add(new Lv3MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        lv3Kiosk.menuItems.add(new Lv3MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        lv3Kiosk.menuItems.add(new Lv3MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        lv3Kiosk.menuItems.add(new Lv3MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        lv3Kiosk.start(); // Lv3Kiosk 에 있는 start 함수 실행
    }
}
