import 'package:class_dart_oop_v2/member.dart';
import 'package:class_dart_oop_v2/member_repository.dart';
import 'package:class_dart_oop_v2/member_service.dart';

class MemberServiceImpl implements MemberService {
  // DIP
  // 상위 모듈은 하위 모듈에 의존해서는 안된다.
  // 즉 상위 모듈과 하위 모듈은 추상화에 의존 해야 한다.
  MemberRepository memberRepository;
  //MemoryMemberRepositoryImpl memoryMemberRepositoryImpl;

  // 생성자 주입 - DI
  MemberServiceImpl(this.memberRepository); // 단일 생성자

  @override
  Member? selectMember(num memberId) {
    // 인증 , 유효성 .. 방어적 코드
    return memberRepository.findById(memberId);
  }

  @override
  void signUp(Member member) {
    memberRepository.save(member);
  }
}
