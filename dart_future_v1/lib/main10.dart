import 'dart:convert';

import 'package:dart_future_v1/Todo.dart';
import 'package:http/http.dart' as http;

void main() async{
  var res = await fetchTodo();
  if(res.statusCode == 200){
    print("통신 성공");
    Map<String, dynamic> resultMap = json.decode(res.body);
    var todo1 = Todo.fromJson(resultMap);

    print("title : ${todo1.title}");
    print("completed : ${todo1.completed}");
  }else{
    print("통신 실패");
  };
}
// 통신을 하는 함수 만들어보기
Future<http.Response> fetchTodo() async{
  const url = 'https://jsonplaceholder.typicode.com/todos/55';
  var response = await http.get(Uri.parse(url));

  return response;
}