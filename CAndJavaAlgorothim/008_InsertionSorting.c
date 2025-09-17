#include <stdio.h>
#define LENGTH 5


void printArray(int a[], int len) {
  for (int i = 0; i < len; i++) {
    printf("[%d]",a[i]);
  }
}



int main() {
  int a[] = { 90, 34, 78, 12, 56 };
  int ins, cmp, temp;

  // 정렬 전의 배열 내용을 표시
  printf("정렬 전 베열 \n");
  printArray(a, LENGTH);
  printf("\n");

  // 삽입 정렬로 오름차순 정렬
  for (ins = 1; ins < LENGTH; ins++) {
    temp = a[ins];
    for (cmp = ins - 1; cmp >= 0; cmp--){
      if (a[cmp] > temp) {
        a[cmp + 1] = a[cmp];
      } else {
        break;
      }
    a[cmp + 1] = temp;
    }
  }
  printf("정렬 후 배열\n");
  printArray(a, LENGTH);

  return 0;
}

/*
 * 배열의 첫 번째 요소는 이미 존재한다고 가정하고, 나머지 요소를 하나씩 삽입
 * 삽입할 때 이미 존재하는 요소와 크기를 비교하여 삽입 위치를 결정
 * 마지막 요소를 삽입하면 전체 배열의 정렬이 완료
 *
 * temp의 값을 배열의 원소들과 비교해가며 삽입할 위치가 정해지면, 삽입할 위치부터 
 * 내부 루프문에 의해 값을 복사 하고, 내부 루프문이 끝나면, 외부 루프에서 a[cmp +1] = temp; 로 삽입할 위치에 값을 삽입
 * a[cmp +1] = temp; 인 이유는 cmp-- 에 의해 cmp 값이 -1이 되므로 OutOfIndex값 맞춰줌. (끝값 맞춰주기)
 */
