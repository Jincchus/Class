import 'package:class_dart_oop_v2/discount_policy.dart';
import 'package:class_dart_oop_v2/grade.dart';
import 'package:class_dart_oop_v2/member.dart';

class PercentDiscountPolicy implements DiscountPolicy {
  double discountPercent = 10; // 10% 할인

  @override
  int discount(Member member, int price) {
    if (member.grade == Grade.VIP) {
      // dart에서는 자동 형 변환이 없다 --> 명시적 형 변환이 있다.
      // 상품금액 * (10% / 100) --> double.toInt()
      return (price * (discountPercent / 100)).toInt();
    }

    return 0;
  }
}
