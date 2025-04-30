# Kiosk_Project

## 👨‍🏫 프로젝트 소개


---

## ⏲️ 개발 기간 
- 2025.04.24(목) ~ 2023.05.01(목)

---

## 💻 개발환경
- **Version** : Java 17
- **IDE** : IntelliJ

---

## 📂 프로젝트 구조
```bash
/KioskProject
│
├── src
│   ├── Lv1
│   │   └── Lv1Main.java
│   ├── Lv2
│   │   ├── Lv2Main.java
│   │   └── Lv2MenuItem.java
│   ├── Lv3
│   │   ├── Lv3Main.java
│   │   ├── Lv3MenuItem.java
│   │   └── Lv3Kiosk.java
│   ├── Lv4
│   │   ├── Lv4Main.java
│   │   ├── Lv4MenuItem.java
│   │   ├── Lv4Kiosk.java
│   │   └── Lv4Menu.java
│   ├── ChallengeLv1
│   │   ├── CLv1Main.java
│   │   ├── CLv1MenuItem.java
│   │   ├── CLv1Kiost.java
│   │   ├── CLv1Menu.java
│   │   └── CLv1Cart.java
│   └── ChallengeLv2
│       ├── CLv2Main.java
│       ├── CLv2MenuItem.java
│       ├── CLv2Kiost.java
│       ├── CLv2Menu.java
│       ├── CLv2Cart.java
│       └── DiscountRatePerType.java
│
├── .gitignore
├── KioskProject.iml
└── README.md
```

---
  
## ⚙️ 프로젝트 설명
### Lv1.
- `Scanner`, `조건문`, `반복문`을 사용해 입력 데이터를 처리
- `hamburber` 입력 시 햄버거 메뉴를 출력
- 입력받은 숫자에 따라 다른 로직을 실행
- 특정 번호가 입력되면 프로그램 종료

### Lv2.
- 음식 항목을 관리하는 `MenuItem` 클래스 생성
- `main` 함수에서 `MenuItem` 클래스를 활용해 햄버거 메뉴 출력
- `List`를 선언하여 여러 `MenuItem`을 추가
- 반복문을 활용해 리스트에 있는 메뉴에 접근

### Lv3.
- 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리하는 `Kiosk` 클래스 생성
  - `MenuItem`을 관리하는 리스트가 존재
  - `Main`의 로직을 `start()` 메서드로 분리
- 유효하지 않은 입력에 대해 오류 메세지 출력

### Lv4.
- `MenuItem` 클래스를 관리하는 `Menu` 클래스 생성
- 메뉴 리스트 관리를 `Kiosk → Menu`로 이전
- 메뉴 카테고리 이름 반환 메서드 구현
- `MenuItem`, `Menu`, `Kiosk` 클래스 필드에 직접 접근하지 못하도록 `Getter`를 사용해 데이터 관리

### Challenge Lv1.
 - 장바구니 생성 및 관리 기능
    - 사용자가 선택한 메뉴를 장바구니에 추가할 수 있는 기능 제공
    - 메뉴 항목을 장바구니에 추가 및 조회 가능
    - 입력값 유효성 검사 및 예외 처리
- 장바구니 출력 및 금액 계산
  - 결제 전 장바구니 목록과 총 금액 출력
- 장바구니 담기 기능
  - 메뉴 선택 시 입력 값에 따라 “추가” 또는 “취소” 처리
  - 장바구니에 담은 목록을 출력
- 주문 기능
  - 장바구니에 담긴 모든 항목을 출력
  - 메뉴 주문 후 장바구니 초기화

### Challenge Lv2.
 - 사용자 유형별 할인 기능 (`Enum` 사용)
  - 주문 시 할인율 적용 후 금액 계산
 - `Lambda` & `Stream`을 활용한 장바구니 조회 기능
   - 기존에 생성한 `Menu`에 `MenuItem`을 조회할 때 스트림을 사용하여 출력하도록 수정
   - 기존 장바구니에서 특정 메뉴 빼기 기능 추가 
  
---

## 📌 주요 기능
- `Scanner`를 사용하여 사용자 입력 처리
- 사용자가 종료를 선택할 때까지 반복 실행되는 루프 구현
- 메뉴 카테고리 및 항목을 관리하는 클래스(`Menu`, `MenuItem`, `Kiosk`) 분리 및 구성
- 장바구니 생성 및 메뉴 항목 추가, 조회, 삭제 기능 구현
- 사용자 유형(`Enum`)에 따른 할인율 적용 기능 제공
- 결과값(메뉴 목록, 주문 내역, 금액 등)을 반환하는 메서드 설계
- 예외 상황에 대한 안정성 확보를 위한 `try-catch`문 사용
- `Stream`과 `Lambda`를 활용한 장바구니 항목 출력 및 필터링
- 클래스 필드에 직접 접근하지 않고 `Getter`를 통한 캡슐화 구현
- 주요 로직을 `Main`이 아닌 클래스 내부 메서드로 분리하여 구조화
