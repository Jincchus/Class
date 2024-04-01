class Burger {
  String? name;
  Burger(this.name); // 단일 라인 생성자
}

// 이니셜라이저 키워드 -> :
class CheeseBurger extends Burger {
  CheeseBurger(String name) : super(name);
}

void main() {
  CheeseBurger cheeseBurger = CheeseBurger("띠드버거 사쥬떼여");
  print(cheeseBurger.name);
}
