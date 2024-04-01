// 코드의 시작점
void main(){

  int point = 90;

  // if문
  if(point >= 90){
    print('A학점');
  } else if(point >= 80){
    print('B학점');
  } else if(point >= 70){
    print('C학점');
  } else {
    print('F학점');
  }

   print('------------------');
  // 삼항 연산자
  // 조건식 ? 결과1 : 결과2
  print(point >= 60 ? '합격' : '불합격');

  point = 40;
  print(point >= 60 ? '합격' : '불합격');
}