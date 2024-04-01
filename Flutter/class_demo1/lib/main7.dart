void main(){

  // 1. null 속성 접근 방법 ?, ??
  String? maybeName;

  //print(maybeName.length) (X);
  int resultLength = maybeName?.length ?? 0; // null이 아니면 문자열 길이를 반환, null이면 대체 연산자인 0을 반환

  print(resultLength); // -> 0


  // 2. null에 안전한 객체 메서드 접근
  String? name = getName(); // NULL 또는 문자열을 담을 수 있다.
    // String name2 = getName();
    // ->A value of type 'String?' can't be assigned to a variable of type 'String'. (Documentation)  Try changing the type of the variable, or casting the right-hand type to 'String'.
  String? returnName = name?.toLowerCase() ?? "홍길동";
  print(returnName);

}

// 전역 함수
String? getName(){
  return null;
}
