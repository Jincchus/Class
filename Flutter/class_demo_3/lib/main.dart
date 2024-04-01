class MyClass {
  late String name;

  MyClass() {
    // 서버에서 요청한 값을 받아서 클래스를 만들어야 될 때
    // 통신을 통해 초기값을 받아야 하는 경우 사용이 가능
    name = '박카스';
  }

  void printString() {
    print('name : $name');
  }
}

void main() {
  // final <-- 상수 (불변) : 런타임 시점에 상수가 됨
  // const <-- 상수 (불변) : 컴파일 시점에 상수가 됨

  final myObject = MyClass();
  myObject.printString();
}
