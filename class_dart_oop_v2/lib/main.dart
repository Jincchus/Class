//코드의 시작점
import 'package:class_dart_oop_v2/discount_policy.dart';
import 'package:class_dart_oop_v2/fix_discount_policy_impl.dart';
import 'package:class_dart_oop_v2/grade.dart';
import 'package:class_dart_oop_v2/member.dart';
import 'package:class_dart_oop_v2/member_repository.dart';
import 'package:class_dart_oop_v2/member_service.dart';
import 'package:class_dart_oop_v2/member_service_impl.dart';
import 'package:class_dart_oop_v2/memory_member_repository_impl.dart';
import 'package:class_dart_oop_v2/order.dart';
import 'package:class_dart_oop_v2/order_service.dart';
import 'package:class_dart_oop_v2/order_service_impl.dart';
import 'package:class_dart_oop_v2/percent_discount_policy_impl.dart';

void main() {
  // 테스트
  MemberRepository memberRepository = MemoryMemberRepositoryImpl();
  MemberService memberService = MemberServiceImpl(memberRepository);

  Member member1 = Member(id: 1, name: '홍길동', grade: Grade.VIP);
  Member member2 = Member(id: 2, name: '이순신', grade: Grade.VIP);
  memberService.signUp(member1);

  // 회원 찾기
  Member? findMember = memberService.selectMember(member1.id);
  print(findMember.toString());

  print('-------------------');
  // 할인
  // 1 - 고정할인 정책
  // 2 - 퍼센트 할인 정책
  DiscountPolicy discountPolicy = PercentDiscountPolicy();
  // DiscountPolicy discountPolicy = FixDiscountPolicy();
  OrderService orderService =
      OrderServiceImpl(memberRepository, discountPolicy);

  Order createdOrder = orderService.createOrder(findMember!.id, '맥북', 5000000);

  print(createdOrder.toString());
}
