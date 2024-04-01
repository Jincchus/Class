import 'package:class_dart_oop_v2/order.dart';

abstract class OrderService {
  // 주문 생성
  Order createOrder(num memberId, String itemName, int itemPrice);
}
