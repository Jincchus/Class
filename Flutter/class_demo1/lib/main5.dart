void main(){

  // null 대체 연산자 - 널 세이프티 기능 제공
  // String username = null;

  // String username;
  // print(username);

  // String? <-- null 값이 들어 올 수 있다고 명시하는 것
  // String != String?
  String? username = null;

  // null 대체 연산자 -> ??
  print(username ?? "홍길동");


  // dart에서는 기본적으로 null 값을 허용하지 않는다
  // null 값을 사용하고자 한다면 nullable을 활용해야함

}