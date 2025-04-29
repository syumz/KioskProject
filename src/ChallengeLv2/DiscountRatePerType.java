package ChallengeLv2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum DiscountRatePerType {
    국가유공자("국가유공자", 10),
    군인("군인", 5),
    학생("학생", 3),
    일반("일반", 0);

    // 1. 속성
    private String name;
    private int per;

    // 2. 생성자
    DiscountRatePerType(String name, int per){
        this.name = name;
        this.per = per;
    }

    public int getPer() {
        return per;
    }

    public String getName() {
        return name;
    }

    static List<String> discountName = Stream.of(DiscountRatePerType.values())
            .map(DiscountRatePerType::getName)
            .collect(Collectors.toList());

    static List<Integer> discountPer = Stream.of(DiscountRatePerType.values())
            .map(DiscountRatePerType::getPer)
            .collect(Collectors.toList());

    // 3. 기능(메서드)
    public static void discount(){
        System.out.println("할인 정보를 입력해주세요");
        for (int i = 0; i < discountName.size(); i++) {
            System.out.print(i + 1 + ". ");
            System.out.println(discountName.get(i) + ": "+ discountPer.get(i) + "%");
        }
    }
}
