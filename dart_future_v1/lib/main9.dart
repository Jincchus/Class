import 'package:dart_future_v1/main8.dart';
import 'package:http/http.dart' as http;
import 'dart:convert';

main() async{
  var todo = await fetchTodo();
  var result = todo.body;

  // 결과를 콘솔에다가 출력, 방법 1, 방법 2

  Map<String, dynamic> jsonDataToMap = json.decode(result);

  jsonDataToMap.forEach((key, value) {
    print("key - ${key}");
    print("value - ${value}");
  });

  Todo myTodo2 = Todo.fromJson(jsonDataToMap);
  print("myTodo");
  print(myTodo2);
  print(myTodo2.userId);
  print(myTodo2.id);
  print(myTodo2.title);
  print(myTodo2.completed);




}

// 통신을 하는 함수 만들어보기
Future<http.Response> fetchTodo() async{
  const url = 'https://jsonplaceholder.typicode.com/todos/33';
  var response = await http.get(Uri.parse(url));

  return response;
}