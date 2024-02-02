class Person {
  String? name;
  int money;

  // 선택적 매개 변수 - 기본값 설정
  Person({this.name, this.money = 0});
}

void main() {
  Person p1 = Person(name: '지니');
  Person p2 = Person(name: '경지니', money: 100000000);

  print("이름 ${p2.name}");
  print("별명 ${p1.name}");
  print("가진돈 ${p2.money}");
}
