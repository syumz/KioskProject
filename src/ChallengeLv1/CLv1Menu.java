package ChallengeLv1;

import java.util.ArrayList;
import java.util.List;

public class CLv1Menu {// MenuItem 클래스를 관리하는 클래스
    // 1. 속성
    private final List<CLv1MenuItem> burgersMenu = new ArrayList<>(); // 버거 메뉴를 저장하는 리스트
    private final List<CLv1MenuItem> drinksMenu = new ArrayList<>(); // 음료 메뉴를 저장하는 리스트
    private final List<CLv1MenuItem> dessertsMenu = new ArrayList<>(); // 디저트 메뉴를 저장하는 리스트
    private final List<CLv1Menu> cLv1Menus = new ArrayList<>(); // 메인 메뉴를 저장하는 리스트
    private String name;

    // 2. 생성자
    public CLv1Menu() {
    }

    public CLv1Menu(String name) {
        this.name = name;
    }

    // 3. 기능(메서드)
    // 메인 메뉴를 보여주는 메서드
    public void mainMenu() {
        System.out.println("[ MAIN MENU ]");
        for (int i = 0; i < cLv1Menus.size(); i++) {
            System.out.print(i + 1 + ". ");
            System.out.println(cLv1Menus.get(i));
        }
        System.out.println("0. 종료");
    }

    // 버거 메뉴를 보여주는 메서드
    public void burgersMenu() {
        System.out.println("[ BURGERS MENU ]");
        for (int i = 0; i < burgersMenu.size(); i++) {
            System.out.print(i + 1 + ". ");
            System.out.println(burgersMenu.get(i));
        }
        System.out.println("0. 뒤로가기");
    }

    // 음료 메뉴를 보여주는 메서드
    public void drinkMenu() {
        System.out.println("[ DRINKS MENU ]");
        for (int i = 0; i < drinksMenu.size(); i++) {
            System.out.print(i + 1 + ". ");
            System.out.println(drinksMenu.get(i));
        }
        System.out.println("0. 뒤로가기");
    }

    // 디저트 메뉴를 보여주는 메서드
    public void dessertsMenu() {
        System.out.println("[ DESSERTS MENU ]");
        for (int i = 0; i < dessertsMenu.size(); i++) {
            System.out.print(i + 1 + ". ");
            System.out.println(dessertsMenu.get(i));
        }
        System.out.println("0. 뒤로가기");
    }

    // 주소값을 출력하는 것이 아닌 리스트안에 들어있는 값을 출력하기 위해 toString 메서드 작성
    public String toString() {
        return name;
    }

    // 버거 메뉴의 getter 메서드
    public List<CLv1MenuItem> getBurgersMenu() {
        return burgersMenu;
    }

    // 음료 메뉴의 getter 메서드
    public List<CLv1MenuItem> getDrinksMenu() {
        return drinksMenu;
    }

    // 디저트 메뉴의 getter 메서드
    public List<CLv1MenuItem> getDessertsMenu() {
        return dessertsMenu;
    }

    // 메인 메뉴의 getter 메서드
    public List<CLv1Menu> getCLv1Menus() {
        return cLv1Menus;
    }
}