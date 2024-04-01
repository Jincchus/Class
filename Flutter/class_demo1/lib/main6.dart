// 코드의 시작점
void main(){

  String name = "Jhon"; // 이 변수는 null이 아닌 문자열만 가질 수 있다.
  int age = 30; // null이 아닌 정수값만 가질 수 있다.

  String? nullableName; // 이 변수는 문자열 또는 null을 가질 수 있다.
  int? nullableAge; // null 또는 정수값을 가질 수 있다.

  if(nullableName != null) {
    print("Name : ${nullableName}");
  }

}