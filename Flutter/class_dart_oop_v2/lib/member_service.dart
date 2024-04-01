import 'package:class_dart_oop_v2/member.dart';

abstract class MemberService {
  void signUp(Member member);
  Member? selectMember(num memberId);
}
