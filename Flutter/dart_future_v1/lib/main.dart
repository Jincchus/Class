

void main()async {

  // 비동기 프로그래밍
  // 키워드 묶음 -  async, await : Future (일회성 응답을 돌려 받는 경우)

  print('task...1');
  // 비동기 함수 만들기
  var data1 = await fetchData();
  print('task...$data1');
  print('task...3');

}

// 비동기 함수 - Future
Future<String> fetchData(){
  // 2초 뒤 데이터를 가져 옴
  return Future.delayed(Duration(seconds: 5), () {
    return "연산 완료 처리";
  });
}
