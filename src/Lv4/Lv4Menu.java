package Lv4;

import java.util.ArrayList;
import java.util.List;

public class Lv4Menu {// MenuItem 클래스를 관리하는 클래스
    // 1. 속성
    List<Lv4MenuItem> menuItems = new ArrayList<>();
    List<Lv4Menu> lv4Menus = new ArrayList<>();
    private String name;

    // 2. 생성자
    public Lv4Menu(){
    }

    public Lv4Menu(String name){
        this.name = name;
    }

    // 3. 기능(메서드)

    public void burgersMenu(){
        System.out.println("[ SHAKESHACK MENU ]");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.print(i + 1 + ". ");
            System.out.println(menuItems.get(i));
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

    public String toString(){
        return name;
    }



}
