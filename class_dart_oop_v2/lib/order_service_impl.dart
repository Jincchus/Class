import 'package:class_dart_oop_v2/discount_policy.dart';
import 'package:class_dart_oop_v2/member.dart';
import 'package:class_dart_oop_v2/member_repository.dart';
import 'package:class_dart_oop_v2/order.dart';
import 'package:class_dart_oop_v2/order_service.dart';

class OrderServiceImpl implements OrderService {
  // DIP
  MemberRepository memberRepository;
  DiscountPolicy discountPolicy;

  // DI - 생성자 의존 주입
  OrderServiceImpl(this.memberRepository, this.discountPolicy);

  @override
  Order createOrder(num memberId, String itemName, int itemPrice) {
    // 1. 회원 등급 조회
    Member? memberEntity = memberRepository.findById(memberId);
    // 2. 회원 등급에 맞는 할인 정책을 반영
    // ! --> null 강제 연산자
    int discountPrice = discountPolicy.discount(memberEntity!, itemPrice);

    // 3. 반환값이 Order 인스턴스를 생성
    Order newOrder = Order(
        memberId: memberId,
        itemName: itemName,
        itemPrice: itemPrice,
        discountPrice: discountPrice);
    return newOrder;
  }
}
