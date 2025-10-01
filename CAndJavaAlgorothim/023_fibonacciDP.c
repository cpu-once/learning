#include <stdio.h>
#define LENGTH 100

// 피보나치 수를 저장하는 배열(최대 100번째 까지)
int fibonacciNumbers[LENGTH];

// 인수 n의 피보나치 수를 반환하는 함수
int fibonacci(int n) {
  for (int i = 0; i <= n; i++) {
    if (i == 0) {
      // 0 번째 피보나치 수 0을 저장
      fibonacciNumbers[i] = 0;
    } else if (i == 1) {
      // 1 번째 피보나치 수 1을 저장
      fibonacciNumbers[i] = 1;
    } else {
      // 이후의 피보나치 수를 구해 저장
      fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
    }
  }
}

// 프로그램 실행의 시작점인 main 함수
int main() {
  // 0 ~ 8 번째 피보나치 수를 표시
  for (int n = 0; n <= 8; n++) {
    printf("%d, ", fibonacci(n));
  }
  printf("\n");

  return 0;
}
