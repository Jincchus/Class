import 'package:flutter/material.dart';

// 코드 시작점
void main() {
  // 루트 위젯을 만들어 주는 함수
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // build 함수는 화면을 그린다
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'layout 1',
      home: Scaffold(
        appBar: AppBar(
          title: Text('Layout 1'),
          backgroundColor: Colors.orange,
          centerTitle: true,
        ),
        body: Center(child: Text('Hello World')),
      ),
    );
  }
}
