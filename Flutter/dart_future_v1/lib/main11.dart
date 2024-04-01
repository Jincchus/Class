import 'dart:convert';

import 'package:dart_future_v1/User.dart';
import 'package:http/http.dart' as http;

main() async{

  var res = await fetchUser();
  if(res.statusCode == 200){
    print("통신 성공");
    Map<String, dynamic> resultMap = json.decode(res.body);
    var users = User.fromJson(resultMap);

    print("users : ${users}");
    print("users : ${users.address}");
    print("users : ${users}");
  } else {
    print("통신 실패");
  };

}


Future<http.Response> fetchUser() async{
  const url = 'https://jsonplaceholder.typicode.com/users/1';
  var response = await http.get(Uri.parse(url));

  return response;
}