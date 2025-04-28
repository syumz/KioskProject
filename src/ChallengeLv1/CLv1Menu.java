package ChallengeLv1;

import java.util.ArrayList;
import java.util.List;

public class CLv1Menu {// MenuItem 클래스를 관리하는 클래스
    // 1. 속성
    private final List<CLv1MenuItem> burgersMenu = new ArrayList<>();
    private final List<CLv1MenuItem> drinksMenu = new ArrayList<>();
    private final List<CLv1MenuItem> dessertsMenu = new ArrayList<>();
    private final List<CLv1Menu> lv4Menus = new ArrayList<>();
    private String name;

    // 2. 생성자
    public CLv1Menu(){
    }

    public CLv1Menu(String name){
        this.name = name;
    }

    // 3. 기능(메서드)
    public void burgersMenu(){
        System.out.println("[ BURGERS MENU ]");
        for (int i = 0; i < burgersMenu.size(); i++) {
            System.out.print(i + 1 + ". ");
            System.out.println(burgersMenu.get(i));
        }
        System.out.println("0. 뒤로가기");
    }

    public void mainMenu(){
        System.out.println("[ MAIN MENU ]");
        for (int i = 0; i < lv4Menus.size(); i++) {
            System.out.print(i + 1 + ". ");
            System.out.println(lv4Menus.get(i));
        }
        System.out.println("0. 종료");
    }

    public void drinkMenu(){
        System.out.println("[ DRINKS MENU ]");
        for (int i = 0; i < drinksMenu.size(); i++) {
            System.out.print(i + 1 + ". ");
            System.out.println(drinksMenu.get(i));
        }
        System.out.println("0. 뒤로가기");
    }

    public void dessertsMenu(){
        System.out.println("[ DESSERTS MENU ]");
        for (int i = 0; i < dessertsMenu.size(); i++) {
            System.out.print(i + 1 + ". ");
            System.out.println(dessertsMenu.get(i));
        }
        System.out.println("0. 뒤로가기");
    }

    public String toString(){
        return name;
    }

    public List<CLv1MenuItem> getBurgersMenu() {
        return burgersMenu;
    }

    public List<CLv1MenuItem> getDrinksMenu() {
        return drinksMenu;
    }

    public List<CLv1MenuItem> getDessertsMenu() {
        return dessertsMenu;
    }

    public List<CLv1Menu> getLv4Menus() {
        return lv4Menus;
    }
}