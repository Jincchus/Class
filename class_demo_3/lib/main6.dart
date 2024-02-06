class Dog {
  void sound() {
    print('왁왁');
  }
}

class Cat {
  void sound() {
    print('에옹');
  }
}

class KyeongJin {
  void hungry() {
    print('배고파');
  }
}

void main() {
  Dog bacchus = Dog();
  Cat samsoon = Cat();
  KyeongJin kyeongJin = KyeongJin();

  bacchus.sound();
  samsoon.sound();
  // 오류
  // kyeongJin.sound(); -> main7.dart 확인
}
