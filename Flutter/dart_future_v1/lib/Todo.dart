import 'dart:convert';

// DTO 개념 클래스를 설계 할 때 nullable 타입으로 설계하자
void main(){

  // 1단계 - 통신 x 직접 json 형식 데이터 만들기
  String jsonStr = ''' 
    {
      "userId": 1,
      "id": 100,
      "title": "josn 파싱이란?",
      "completed": false 
    }
  ''';
  // 위 코드는 단지 형식이 있는 문자열 (json)

  // 1. 라이브러리 필요(convert)
  // JSON 문자열을 파싱하여 먼저 Map 객체로 변환
  Map<String, dynamic> jsonStrToMap = json.decode(jsonStr); // Map 구조로 변환 해 줌
  print(jsonStrToMap.runtimeType);
  print(jsonStrToMap);
  // Map --> 반복문 활용을 많이 함
  jsonStrToMap.forEach((key, value) {
    print("key - ${key}");
    print("value - ${value}");
    print("---------------------");
  });
  // 2. Map 형식의 데이터를 object 타입으로 변경
  Todo myTodo1 = Todo.fromJson(jsonStrToMap);
  print(myTodo1);
  print(myTodo1.userId);
  print(myTodo1.id);
  print(myTodo1.title);
  print(myTodo1.completed);


}

class Todo {
  int userId;
  int id;
  String title;
  bool completed;

  // 생성자1.기본 생성자
  // 강제성 - 생성자
  Todo(this.userId, this.id, this.title, this.completed);

  // 생성자2.명명된 생성자 - Map을 넣으면 Todo 오브젝트가 반환되는 코드 작성
  // 이니셜 라이저 (변수를 초기화 해주는 문법)
  Todo.fromJson(Map<String, dynamic> json)
      : userId = json["userId"],
        id = json["id"],
        title = json["title"],
        completed = json["completed"];

  @override
  String toString() {
    return '내가 보는 - Todo{userId: $userId, id: $id, title: $title, completed: $completed}';
  }
}

