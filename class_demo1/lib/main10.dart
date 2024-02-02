void main() {
  int num1 = 500;
  int num2 = 10;

  print("더하기 : ${add(10,10)}");
  print("빼기 : ${sub(10,10)}");
  print("곱하기 : ${mul(10,10)}");
  print("나누기 : ${div(10,10)}");
}

/// 1. 기존 함수 정의
int add1(int n1, int n2) {
  return n1 + n2;
}

int sub1(int n1, int n2) {
  return n1 - n2;
}

int mul1(int n1, int n2) {
  return n1 * n2;
}

double div1(int n1, int n2) {
  return n1 / n2;
}

/// 2. 화살표 함수로 변경 해보기

int add(int n1, int n2) => n1 + n2;
int sub(int n1, int n2) => n1 - n2;
int mul(int n1, int n2) => n1 * n2;
double div(int n1, int n2) => n1 / n2;