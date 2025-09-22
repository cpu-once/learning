#include <stdio.h>
#define LENGTH 10;
#define TRUE -1
#define FALSE 0

// BST 구조체 정의
struct BST {
  int data; // 요솟값
  int left; // 왼쪽 요소의 연결 정보
  int right; // 오른쪽 요소의 연결 정보
};

// 이진 탐색 트리의 실체가 되는 배열(요소 수는 최대 10)
struct BST tree[LENGTH];

// 루트 요소의 물리적 위치 인덱스(연결 리스트의 head)
int rootIdx = 0;

// 다음으로 추가할 요소의 물리적 위치 인덱스
int newIdx = 0;

// 이진 탐색 트리에 요소를 추가하는 함수
void addBST(int data) {
  int currentIdx; // 현재 요소의 물리적 위치 인덱스
  int addFlag; // 요소 추가가 완료되었는지 확인하는 플래그
  // 물리적 위치에 요솟값과 연결 정보 추가
  tree[newIdx].data = data;
  tree[newIdx].left = -1;
  tree[newIdx].right = -1;

  // 루트 요소가 아니라면 논리적 순서에 따라 요소 위치 탐색 및 결정
  if(newIdx != rootIdx) {
    currentIdx = rootIdx; // 루트부터 이진 탐색 트리를 내려감
    addFlag = FALSE; // 요소 추가가 완료되지 않음

    do {
      // 루트 요솟값보다 더 작으면 왼쪽으로 내려감
      if(data < tree[currentIdx].data) {
        // 왼쪽으로 내려갔을 때 끝이면 left에 요소의
        // 물리적 위치 인덱스를 추가(연결 정보 설정)
        if (tree[currentIdx].left == -1) {
          tree[currentIdx].left = newIdx;
          addFlag = TRUE;
        } else {
          currentIdx = tree[currentIdx].left;
        }
      } else { // 루트 요솟값보다 더 크면 오른쪽으로 내려감(동일한 값은 없음)
               // 오른쪽으로 내려갔을 때 끝이면 right에 요소의
               // 물리적 위치 인덱스를 추가(연결 정보 설정)
               if(tree[currentIdx].right == -1) {
                 tree[currentIdx].right = newIdx;
                 addFlag = TRUE;
               } else { // 오른쪽으로 내려 갔을 때 끝이 아니라면 오른쪽의 요소보다 더 내려감
                        currentIdx = tree[currentIdx].right;
               }
      }
    } while (addFlag == FALSE);
  }
  // 다음에 추가할 요소를 위해 물리적 위치의 인덱스를 1 늘림
  newIdx++;
}

// 이진 검색 트리의 실체인 배열을 물리적 위치 순서로 표시하는 함수
void printPhysicalBST() {
  int i;

  for (i = 0; i < newIdx; i++) {
    printf("tree[%d]: data = %d, left = %d, right = %d\n", i , tree[i].data, tree[i].left, tree[i].right);
  }
}


// 이진트리 DFS
void printLogicalBST(int currentIdx) {
  if (currentIdx != -1) {
    printf("tree[%d]: data = %d, left = %d, right = %d\n",
        currentIdx, tree[currentIdx].data,
        tree[currentIdx].left, tree[currentIdx].right);

    // recurrsion
    printLogicalBST(tree[currentIdx].left);
    printLogicalBST(tree[currentIdx].right);
  }
}

// 프로그램 실행의 시작점인 main 함수
int main() {
  // 요소를 추가하면서 이진 탐색 트리를 구성
  addBST(4);
  addBST(6);
  addBST(5);
  addBST(2);
  addBST(3);
  addBST(7);
  addBST(1);

  // 물리적 위치 순서로 표시
  printPhysicalBST();

  return 0;
}
