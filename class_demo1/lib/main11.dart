void main(){

  List<String> footballPlayers = ['메시', '손흥민', '김민재', '조규성'];
  // 1단계 - 자료구조와 익명 함수
  // 2단계 - dart List는 Iterable을 구현하고 있다.
  // 그래서 리스트는 '반복 가능한 객체이다'라고 말 할 수 있습니다.

  footballPlayers.forEach((e) {
    print("축구 선수 : ${e}");
  });

  print("----------------------");

  footballPlayers.forEach((e) =>  print("축구 선수 : ${e}") );

  List<int> numbers = [10,20,30,40,50];
  int sum1 = 0; // 익명 함수용
  int sum2 = 0; // 화살표 함수용
  // 문제 forEach문을 활용해서 list 안 요소들의 덧셈값을 연산하고 출력하시오
  // 1. 익명 함수 사용
  numbers.forEach((num) {
    sum1 += num;
  });
  // 2. 람다 표현식 사용
  numbers.forEach((num) => sum2 += num);
}