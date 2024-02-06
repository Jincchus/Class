abstract class Animal {
  void sound();
}

class Dog implements Animal {
  void sound() {
    print('왁왁');
  }
}

class Cat implements Animal {
  void sound() {
    print('에옹');
  }
}

class KyeongJin implements Animal {
  void sound() {
    print('배고파');
  }

  void hungry() {
    print('배고오오파');
  }
}

void main() {
  Dog bacchus = Dog();
  Cat samsoon = Cat();
  KyeongJin kyeongJin = KyeongJin();

  bacchus.sound();
  samsoon.sound();
  kyeongJin.sound();
  kyeongJin.hungry();
}
