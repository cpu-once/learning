#include <stdio.h>
#define LENGTH 5

void printArray(int a[], int len) {
  for (int i = 0; i < len; i++) {
    printf("[%d]", a[i]);
  }
  printf("\n");
}


int main() {
  int a[] = { 90, 34, 78, 12, 56 };
  int ins, cmp, temp;

  //정렬 전 배열 내용을 표시
  printf("정렬 전 배열\n");
  printArray(a, LENGTH);
  printf("\n");

  // 버블 정렬로 오름차순 정렬
  for (ins = 0; ins < LENGTH - 1; ins++) {
    for (cmp = 0; cmp < LENGTH - ins - 1; cmp++) {
      if (a[cmp] > a[cmp + 1]) {
        temp = a[cmp];
        a[cmp] = a[cmp + 1];
        a[cmp + 1] = temp;
      }
    }
  }

  //정렬 후 배열 내용 표시
  printf("정렬 후 배열\n");
  printArray(a, LENGTH);

  return 0;
}


/*
 * 배열의 끝에서 처음까지 이웃 사이의 요소를 비교하여 작은 값이 앞으로 오도록 요소를 교체
 * 이를 반복하면 배열의 시작 부분에 가장 작은 값을 갖는 요소가 위치
 * 다음으로 나머지 요소에 대해 같은 과정을 거치면 두 번째로 작은 요소가 위치
 * 이 같은 절차를 반복하여 배열 전체를 정렬
 *
 * 내부 루프 카운터 cmp에 따라 배열의 처음 요소부터 LENGTH - ins - 1 까지 요소를 하나하나씩 비교하여 
 * 다음 인덱스의 값이 현재 인덱스의 값보다 크다면 값을 교체함.
 *
 * 처음 루프를 돈다면, 마지막 값은 정렬이 되어 있는 상태이므로, LENGTH - ins - 1을 하여 루프의 반복 횟수를 줄임
 */
