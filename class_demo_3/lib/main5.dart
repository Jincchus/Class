// 상속 구조 생성 -->

// 부모 클래스 단일 생성자 생성
class Coffee {
  String? name;
  Coffee(this.name);
}

// 자식 클래스 --> 이니셜 라이저 생성
class Americano extends Coffee {
  Americano(String name) : super(name);
}

void main() {
  Americano americano = Americano('아메아메아메');
  print(americano.name);
}
