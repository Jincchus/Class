

void main()async {
  // Future 타입과 값을 꺼내는 방법 -->
  // 비동기 함수를 동기성으로 변경하면 값이 자동으로 꺼내졌다.
  // Future 타입 선언
  Future<String> name = Future.value("Bacchus");
  Future<int> number = Future.value(100);
  Future<bool> isTrue = Future.value(true);

  print(name);
  print(number);
  print(isTrue);
  print("----------------------------");

  print(await name);
  print(await number);
  print(await isTrue);
  print("----------------------------");


}
