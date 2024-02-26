import 'package:class_login_app/components/custom_form.dart';
import 'package:class_login_app/components/logo.dart';
import 'package:class_login_app/size.dart';
import 'package:flutter/material.dart';

class LoginPage extends StatelessWidget {
  const LoginPage({super.key});

  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Scaffold(
        body: ListView(
          children: [
            const SizedBox(height: xlarge_gap),
            // logo 위젯 생성
            const Logo('Login'),
            const SizedBox(height: large_gap),
            CustomForm(),
            TextButton(
              onPressed: () {
                // 사용자가 입력한 유효성 검사
              },
              child: Text("Login"),
            )
          ],
        ),
      ),
    );
  }
}
