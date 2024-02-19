import 'package:class_dart_oop_v2/discount_policy.dart';
import 'package:class_dart_oop_v2/grade.dart';
import 'package:class_dart_oop_v2/member.dart';

class FixDiscountPolicy implements DiscountPolicy {
  // 멤버 변수
  int discountFixAmount = 1500;

  @override
  int discount(Member member, int price) {
    // 함수 -- 연산자, 조건, 반목, 함수, 객체
    if (member.grade == Grade.VIP) {
      return discountFixAmount;
    }
    return 0;
  }
}
