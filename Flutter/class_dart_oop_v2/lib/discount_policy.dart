// 역할
import 'package:class_dart_oop_v2/member.dart';

abstract class DiscountPolicy {
  // 할인 처리
  int discount(Member member, int price);
}
