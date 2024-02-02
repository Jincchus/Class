// 코드의 시작점
// 1단계 생성자 학습
void main() {
  // 생성자 -- 강제성
  // Dog d1 = Dog('Bacchus', 6, 'Beige', 50); // 메모리에 로드(객체 생성)
  Dog d1 = Dog(color: 'Beige', name: 'Bacchus', age: 6, thirsty: 50);

  print(d1.name);
} // end of main

class Dog {
  String name;
  int age;
  String color;
  int thirsty;

  // 메서드, 함수, 생성 --> 파라미터 설계 (단일 라인 생성자 - 생략했었음)
  // 파라미터 --> 선택적 매개 변수
  // 함수({}); --> 중괄호로 감싸면 된다.
  Dog(
      {required this.name,
      required this.age,
      required this.color,
      required this.thirsty});
}
