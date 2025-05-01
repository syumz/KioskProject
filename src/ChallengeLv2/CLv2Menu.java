package ChallengeLv2;

import java.util.ArrayList;
import java.util.List;

public class CLv2Menu {// MenuItem 클래스를 관리하는 클래스
    // 1. 속성
    private final List<CLv2MenuItem> burgersMenu = new ArrayList<>(); // 버거 메뉴를 저장하는 리스트
    private final List<CLv2MenuItem> drinksMenu = new ArrayList<>(); // 음료 메뉴를 저장하는 리스트
    private final List<CLv2MenuItem> dessertsMenu = new ArrayList<>(); // 디저트 메뉴를 저장하는 리스트
    private final List<CLv2Menu> cLv2Menus = new ArrayList<>(); // 메인 메뉴를 저장하는 리스트
    private String name;

    // 2. 생성자
    public CLv2Menu() {
    }

    public CLv2Menu(String name) {
        this.name = name;
    }

    // 3. 기능(메서드)
    // 메인 메뉴를 보여주는 메서드
    public void mainMenu() {
        System.out.println("[ MAIN MENU ]");
        cLv2Menus.forEach(a -> System.out.println(cLv2Menus.indexOf(a) + 1 + ". " + a));
        System.out.println("0. 종료");
    }

    // 버거 메뉴를 보여주는 메서드
    public void burgersMenu() {
        System.out.println("[ BURGERS MENU ]");
        burgersMenu.forEach(a -> System.out.println(burgersMenu.indexOf(a) + 1 + ". " + a));
        System.out.println("0. 뒤로가기");
    }

    // 음료 메뉴를 보여주는 메서드
    public void drinkMenu() {
        System.out.println("[ DRINKS MENU ]");
        drinksMenu.forEach(a -> System.out.println(drinksMenu.indexOf(a) + 1 + ". " + a));
        System.out.println("0. 뒤로가기");
    }

    // 디저트 메뉴를 보여주는 메서드
    public void dessertsMenu() {
        System.out.println("[ DESSERTS MENU ]");
        dessertsMenu.forEach(a -> System.out.println(dessertsMenu.indexOf(a) + 1 + ". " + a));
        System.out.println("0. 뒤로가기");
    }

    // 주소값을 출력하는 것이 아닌 리스트안에 들어있는 값을 출력하기 위해 toString 메서드 작성
    public String toString() {
        return name;
    }

    // 버거 메뉴의 getter 메서드
    public List<CLv2MenuItem> getBurgersMenu() {
        return burgersMenu;
    }

    // 음료 메뉴의 getter 메서드
    public List<CLv2MenuItem> getDrinksMenu() {
        return drinksMenu;
    }

    // 디저트 메뉴의 getter 메서드
    public List<CLv2MenuItem> getDessertsMenu() {
        return dessertsMenu;
    }

    // 메인 메뉴의 getter 메서드
    public List<CLv2Menu> getCLv2Menus() {
        return cLv2Menus;
    }
}