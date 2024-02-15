// dart에서 기본적으로 제공하는 라이브러리를 import
import 'dart:math';

void main() {
  List<int> nums = [1, 2, 3, 4, 5];
  print(nums[0]);
  print(nums[1]);
  print(nums[2]);
  print(nums[3]);
  print(nums[4]);
  // print(nums[5]); //RangeError (index): Invalid value: Not in inclusive range 0..4: 5

  // map 리터럴은 중괄호{} 사용
  Map<String, dynamic> user = {
    'id': 1,
    'username': 'cos',
  };
  // key 연산은 인덱스 연산자를 활용
  print(user['id']);
  print(user['username']);

  // Set 리터럴은 중괄호{} 사용
  Set<int> lotto = {};

  Random r = Random();
  // 0 ~ 44 --> 1 ~ 45
  lotto.add(r.nextInt(45) + 1);
  lotto.add(r.nextInt(45) + 1);
  lotto.add(r.nextInt(45) + 1);
  lotto.add(r.nextInt(45) + 1);
  lotto.add(r.nextInt(45) + 1);
  lotto.add(r.nextInt(45) + 1);

  // 반드시 숫자 6개가 나오게 로직
  // while문으로 코드 수정해 보기 - 도전 과제
  print('-----------------------');
  while (lotto.length < 7) {
    lotto.add(r.nextInt(45) + 1);
  }
  print(lotto);
  print(lotto.runtimeType);

  // Set --> List로 변경
  print(lotto.toList());
  List<int> lottoList = lotto.toList();
  // Set 자료 구조 정렬 X
  lottoList.sort();
  print(lottoList);
}
