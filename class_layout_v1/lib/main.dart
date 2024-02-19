import 'dart:ffi';

import 'package:flutter/material.dart';

// 코드 시작점
void main() {
  // 루트 위젯을 만들어 주는 함수
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  Column _buildButtonColume(IconData iconData, Color color, String label) {
    return Column(
      children: [
        Icon(iconData, color: color),
        Container(
          margin: const EdgeInsets.only(top: 8),
          child: Text(
            label,
            style: TextStyle(
              fontSize: 12,
              fontWeight: FontWeight.bold,
              color: color,
            ),
          ),
        ),
      ],
    );
  }

  // build 함수는 화면을 그린다
  @override
  Widget build(BuildContext context) {
    // 함수 바디 ... 코드 사용하기

    Widget titleSection = Container(
      padding: const EdgeInsets.all(32),
      child: Row(
        children: [
          // text
          Column(
            crossAxisAlignment: CrossAxisAlignment.start,
            children: [
              Text(
                'This page is Bacchus area',
                style: TextStyle(fontWeight: FontWeight.bold),
              ),
              Text('Bacchus is Greate KING')
            ],
          ),
          const Spacer(),
          // icon
          Icon(
            Icons.star,
            color: Colors.redAccent,
          ),
          // text(486)
          Container(margin: EdgeInsets.only(top: 2), child: Text('486')),
        ],
      ),
    );

    Widget buttonSection = Row(
      mainAxisAlignment: MainAxisAlignment.spaceAround,
      children: [
        _buildButtonColume(Icons.call, Colors.blue, 'CALL'),
        _buildButtonColume(Icons.near_me, Colors.blue, 'ROUTE'),
        _buildButtonColume(Icons.share, Colors.blue, 'SHARE'),
      ],
    );

    Widget textSection = Container(
      padding: const EdgeInsets.all(32),
      child: const Text(
        'Lake Oeschinen lies at the foot of the Blüemlisalp in the Bernese '
        'Alps. Situated 1,578 meters above sea level, it is one of the '
        'larger Alpine Lakes. A gondola ride from Kandersteg, followed by a '
        'half-hour walk through pastures and pine forest, leads you to the '
        'lake, which warms to 20 degrees Celsius in the summer. Activities '
        'enjoyed here include rowing, and riding the summer toboggan run.',
        softWrap: true,
      ),
    );

    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'bacchus layout',
      home: Scaffold(
        appBar: AppBar(
          backgroundColor: Colors.grey,
          title: Text(
            'Bacchus World',
            style: TextStyle(fontWeight: FontWeight.bold),
          ),
          centerTitle: true,
        ),
        body: ListView(
          children: [
            Image.asset('assets/bacchus.jpg',
                width: 620, height: 240, fit: BoxFit.cover),
            titleSection,
            buttonSection,
            textSection,
          ],
        ),
      ),
    );
  }
}
