package ChallengeLv2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum DiscountRatePerType {
    국가유공자("국가유공자", 0.1),
    군인("군인", 0.05),
    학생("학생", 0.03),
    일반("일반", 0);

    // 1. 속성
    private String name;
    private double per;

    // Enum 에서 정의한 name 을 리스트로 저장
    static List<String> discountName = Stream.of(DiscountRatePerType.values())
            .map(DiscountRatePerType::getName)
            .collect(Collectors.toList());

    // Enum 에서 정의한 per(할인율) 을 리스트로 저장
    static List<Double> discountPer = Stream.of(DiscountRatePerType.values())
            .map(DiscountRatePerType::getPer)
            .collect(Collectors.toList());

    // 2. 생성자
    DiscountRatePerType(String name, double per) {
        this.name = name;
        this.per = per;
    }

    // 3. 기능(메서드)
    // 할인정보를 출력하는 메서드
    public static void discountinfo() {
        System.out.println("\n할인 정보를 입력해주세요");
        for (int i = 0; i < discountName.size(); i++) {
            System.out.print(i + 1 + ". ");
            System.out.println(discountName.get(i) + ": " + Math.round(discountPer.get(i) * 100) + "%");
        }
    }

    // per 의 getter 메서드
    public double getPer() {
        return per;
    }

    // name 의 getter 메서드
    public String getName() {
        return name;
    }
}
