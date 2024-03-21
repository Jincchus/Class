import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';

void main() {
  runApp(const MyApp());
}

// MyApp
class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: ParentsView(),

    );
  }
}// end of MyApp



class ParentsView extends StatefulWidget {
  const ParentsView({super.key});


  @override
  State<ParentsView> createState() => _ParentsViewState();
} // end of StatefuleWidget

class _ParentsViewState extends State<ParentsView> {

  String childMsgContent = "여기는 부모 위젯 영역!";

  // 자식 위젯에 전달 할 함수 설계
  void onCallbackPressed(String msg){
    print("자식한테 이벤트가 일어남!");
    setState(() {
      childMsgContent = msg;
    });
  }

  void onCallbackPressedA(){
    print("Child A한테 이벤트 일어남!");
    setState(() {
      childMsgContent = "Child A에도 이벤트 일어났다고 꺄륵><!";
    });

  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: SafeArea(
        child: Column(
          children: [
            Expanded(flex:1,child: Center(child: Text(childMsgContent))),
            Expanded(flex:1,child: ChildA(callback: onCallbackPressedA,)),
            Expanded(flex:1,child: ChildB(onCallback: onCallbackPressed,))

          ],
        ),
      ),
    );
  }
}// end of _ParentsViewState

class ChildA extends StatelessWidget {
  final VoidCallback callback;
  const ChildA({required this.callback,super.key});

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.all(20.0),
      child: InkWell(
        onTap: callback,
        child: Container(
          width: double.infinity,
          color: Colors.orange,
          child: Center(child: Text("Child A")),
        ),
      ),
    );
  }
}

class ChildB extends StatelessWidget {

  // 함수 타입
  //final VoidCallback callback;
  // 함수 모양 설계 변경
  final Function(String msg) onCallback;

  // 생성자
  const ChildB({required this.onCallback,super.key});

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.all(20.0),
      child: InkWell(
        onTap: (){onCallback("ChildB가 연산 후 데이터 전달");},
        child: Container(
          width: double.infinity,
          color: Colors.red,
          child: Center(child: Text("Child B")),
        ),
      ),
    );
  }
}
