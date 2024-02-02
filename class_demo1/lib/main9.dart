void main(){

  // 1단계 - 이름이 없는 함수를 이야기 한다(선언을 하더라도 다시 호출 할 방법이 없다)
  (int number){
    return 100 + number;
  }; // 익명함수 마지막에는 세미콜론이 있어야 함
  // 변수에 할당하지 않고 바로 익명 함수를 호출하는 것은 dart에서는 불가능

  // 2단계 - 함수를 변수에 담을 수 있다(dart는 일급 객체를 지원)
  int Function(int) square = (int number){
    return number * number;
  };

  print("square : ${square.runtimeType}");

  // 2-1단계 : 명시적 타입과(Function) 리턴 타입이 생략, 파라미터 타입도 생략 가능
  Function sub = (a,b){
    return a - b;
  };

  // 3단계 - var 키워드에 사용(타입 추론 : 자동으로 타입을 할당)
  var cube = (int number) {
    return number * number * number;
  };

  // 4단계 - 익명 함수 파라미터 타입 생략 가능
  var add = (number) {
    return number + 10;
  };

  // 5단계
  var multiply = (a, b) {
    return a * b;
  };

  // 메서드의 호출은 괄호()이다.
  print("2의 제곱은 ${square(2)}");
  print("두 수의 빼기 연산 ${sub(10,10)}");
  print("3의 세제곱은 ${cube(3)}");
  print("곱셈의 결과값은 : ${multiply(10,20)}");

  // 도전 과제
  // 두 수를 받고 덧셈을 하는 익명 함수를 설계하고 호출 하시오
  var plus = (a,b){
    return a+b;
  };

  print("도전 과제 답 : ${plus(1,2)}");

}