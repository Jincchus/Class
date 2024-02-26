import 'package:flutter/material.dart';

class CloneButton extends StatelessWidget {
  const CloneButton({super.key});

  @override
  Widget build(BuildContext context) {
    return Row(
      children: [],
    );
  }
}

_buildButtonLeft(Icon bIcon, String text, double fSize) {
  return Row(
    children: [
      Icon(bIcon.icon),
      Text(
        text,
        style: TextStyle(fontSize: fSize),
      ),
    ],
  );
}
