import 'package:flutter/material.dart';

const MaterialColor primaryWhite = MaterialColor(
  0xFFFFFFFF,
  <int, Color>{
    50: Color(0xFFFFFFFF),
    100: Color(0xFFFFFFFF),
    200: Color(0xFFFFFFFF),
    300: Color(0xFFFFFFFF),
    400: Color(0xFFFFFFFF),
    500: Color(0xFFFFFFFF),
    600: Color(0xFFFFFFFF),
    700: Color(0xFFFFFFFF),
    800: Color(0xFFFFFFFF),
  },
);

// 글로벌 함수
// main --> Material APP사용시 변수로 테마 설정 가능

ThemeData theme() {
  return ThemeData(
    primarySwatch: primaryWhite,
    appBarTheme: const AppBarTheme(
      iconTheme: IconThemeData(color: Colors.blue),
    ),
  );
}
