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

// 전역 함수
void start(Animal a) {
  // Animal 추상 클래스의 sound 함수가 오버라이드(무효화)되고
  // 자식 Dog, Cat ...의 sound 함수가 실행됨
  //  이것을 동적 바인딩이라고 함
  a.sound();
}

void main() {
  start(Dog());
  start(Cat());
}
