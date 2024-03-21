import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: HomeView(),
    );
  }
}

// View
class HomeView extends StatefulWidget {
  const HomeView({super.key});

  @override
  State<HomeView> createState() => _HomeViewState();
}

class _HomeViewState extends State<HomeView> {

  // 핵심 데이터 선정 - 클래스로 설계 가능
  // Model 에서 데이터와 관련된 로직이 포함 됨
  int _counter = 0;


  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('뷰모델 없는 코드 작성'),),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Text("간단한 뷰와 모델 예제"),
            Text("숫자 확인(핵심 데이터) ${_counter}"),
            ElevatedButton(
              onPressed: (){
              // 사용자가 버튼을 클릭하면 숫자가 올라가는 기능을 만들자
                setState(() {
                  _counter++;
                });
              },
              child: Text('증감'),
            ),
          ],
        ),
      ),
    );
  }
}

// 1단계에서는 MV 개념으로 코딩을 했다면 ViewModel 이라는 개념을 적용해 보자

// ViewModel
class CounterViewModel {

  int _counter = 0;
  int get counter => _counter;
  // 위 get counter는 아래와 같음
  // int getCounter() {
  //   return this._counter;
  // }

  void incrementCounter(){
    _counter++;
  }



}
