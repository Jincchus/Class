class Order {
  num memberId;
  String itemName;
  int itemPrice;
  int discountPrice;

  Order(
      {required this.memberId,
      required this.itemName,
      required this.itemPrice,
      required this.discountPrice});

  // 기능
  int calculateDiscount() {
    // 상품 가격이 할인 금액보다 작을 때 문제가 생길 수 있음(방어적 코드 만들어줘야함) - 고민해 볼 사항
    return itemPrice - discountPrice;
  }

  @override
  String toString() {
    return 'Order{memberId: $memberId, itemName: $itemName, itemPrice: $itemPrice, discountPrice: $discountPrice}';
  }
}
