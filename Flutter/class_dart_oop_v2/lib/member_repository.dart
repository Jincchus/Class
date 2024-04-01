import 'package:class_dart_oop_v2/member.dart';

abstract class MemberRepository {
  void save(Member member);
  Member? findById(num memberId);
// dart 는 자동 형변환을 지원 하지 않습니다.
// int, double --> num 은 부모 타입 입니다.
}
