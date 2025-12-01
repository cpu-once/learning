#include <stdio.h>
#include <string.h>
#define LENGTH 10

// StationList 구조체 정의
struct StationList {
  char name[20]; // 역 이름
  int next; // 연결 정보
};

// 연결 리스트의 실체가 되는 배열(요소 수는 최대 10으로 한다)
sturct StationList list[LENGTH];


// head 선언
int head;

// 연결 리스트의 초기 상태를 만드는 함수
void initStationList() {
  // 역 이름과 연결 정보를 설정
  strcpy(list[0].name, "부산");
  list[0].next = -1;
  strcpy(list[1].name, "대전");
  list[1].next = 3;
  strcpy(list[2].name, "서울");
  list[2].next = 4;
  strcpy(list[3].name, "동대구");
  list[3].next = 0;
  strcpy(list[4].name, "천안아산");
  list[4].next = 1;

  // head값 설정
  head = 2;
}


// 연결 리스트의 요소를 표시하는 함수
void printStationList() {
  int idx = head;
  while (idx != -1) {
    printf("[%s] -> ", list[idx].name);
    idx = list[idx].next;
  }

  printf("\n");
}

// 연결 리스트에 요소를 삽입하는 함수
void insertStationList (int insIdx, char insName[], int prevIdx) {
  strcpy(list[insIdx].name, insName);
  list[insIdx].next = list[prevIdx].next;
  list[prevIdx].next = insIdx;
}

// 연결 리스트에 요소를 삭제하는 함수
void deleteStationList(int delIdx, int prevIdx) {
  list[prevIdx].next = list[delIdx].next;
}

// 프로그램 실행의 시작점인 main 함수
int main() {
  // 초기 상태의 연결 리스트를 작성해 표시
initStationList();
printStationList();

// 연결 리스트에 요소를 삽입하여 표시
insertStationList(5, "광명", 2);
printStationList();


// 연결 리스트에 요소를 삭제하여 표시
deleteStationList(5, 2);
printStationList();

return 0;

}
