import 'package:class_clone_coding/theme.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      theme: theme(),
      home: MainPage(),
    );
  }
}

class MainPage extends StatelessWidget {
  const MainPage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: _buildMainAppBar(),
      body: Column(
        children: [
          const SizedBox(height: 10),
          // CloneCate()
        ],
      ),
    );
  }

  AppBar _buildMainAppBar() {
    return AppBar(
        // Text();
        // 충전소, 주유소 찾기 BTN

        );
  }
}
