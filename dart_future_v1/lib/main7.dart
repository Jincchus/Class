import 'package:http/http.dart' as http;

main()  {
  // var todo = await fetchTodo();
  // var result = todo.body;

  var todo = fetchTodo();
  todo.then((value) => print("TODO 변환 : ${value.body}"));

  // 결과를 콘솔에다가 출력, 방법 1, 방법 2





}

// 통신을 하는 함수 만들어보기
Future<http.Response> fetchTodo() async{
  const url = 'https://jsonplaceholder.typicode.com/todos/1';
  var response = await http.get(Uri.parse(url));

  // print(response.runtimeType);
  // print("headers : ${response.headers}");
  // print("headers : ${response.body}");

  return response;
}