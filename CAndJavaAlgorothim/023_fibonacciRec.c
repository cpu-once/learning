#include <stdio.h>

// 인수 n의 피보나치 수를 반환하는 함수
int finonacci(int n) {
  if (n == 0) {
    // 0번째 피보나치 수는 0
    return 0
  } else if (n == 1) {
    // 1번째 피보나치 수는 1
    return 1
  } else {
    // 이후는 앞의 두 수를 더한 값
    return fibonacci(int n - 1) + finobacci(int n - 2);
  }
}

// 프로그램 실행의 시작점인 main 함수
int main() {
  int n;

  // 0~8번째 피보나치 수를 표시
  for (n = 0; n <=8; n++) {
    printf("%d, ", fibonacci(n));
  }
  printf("\n");

  return 0;
}
