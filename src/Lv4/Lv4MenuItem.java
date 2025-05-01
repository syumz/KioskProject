package Lv4;

public class Lv4MenuItem {
    // 1. 속성
    private String name;
    private double price;
    private String foodDetails;

    // 2. 생성자
    public Lv4MenuItem(String name, double price, String foodDetails) {
        this.name = name;
        this.price = price;
        this.foodDetails = foodDetails;

    }

    // 3. 기능
    // 주소값을 출력하는 것이 아닌 리스트안에 들어있는 값을 출력하기 위해 toString 메서드 작성
    public String toString() {
        return name + " | " + "W" + price + " | " + foodDetails;
    }
}
