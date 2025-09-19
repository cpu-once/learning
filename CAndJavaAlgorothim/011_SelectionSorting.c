#include <stdio.h>
#define LENGTH 5

void printArray (int a[], int len) {
  for (int i = 0; i < len; i++) {
    printf("[%d]", a[i]);
  }
  printf("\n");
}

int main() {
  int a[] = { 90, 34, 78, 12, 56 };
  int ins, cmp, min, temp;

  // 정렬 전 배열 내용을 표시
  printf("정렬 전 배열\n");
  printArray(a, LENGTH);
  printf("\n");

  for (ins = 0; ins < LENGTH - 1; ins++) {
    min = ins;
    for (cmp = ins + 1; cmp < LENGTH; cmp++) {
      if (a[cmp] < a[ins]) {
        min = cmp;
        temp = a[ins];
        a[ins] = a[min];
        a[min] = temp;
      }
    }
  }


  // 정렬 후 배열 내용을 표시
  printf("정렬 후 배열\n");
  printArray(a, LENGTH);

  return 0;
}


/*
 * 배열의 처음에서 끝까지 하나씩 값을 확인해 전체의 최솟값을 선택합니다.
 * 최솟값과 선두의 요소를 교환합니다. 그러면 가장 작은 요소가 확정됩니다.
 * 배열의 두 번째 요소에서 끝까지 같은 과정을 거치면 두 번째로 작은 요소가 확정됩니다.
 * 이같은 절차를 반복하여 배열 전체를 정렬 합니다.
 *
 * 외부 루프에서 가장 왼쪽의 값을 최소값이라 가정하고, 내부 루프에서 최소 값이 아닐 경우, 해당 인덱스에서 값을 교체.
 * 좌측부터 오름차순으로 정렬됨
 */
