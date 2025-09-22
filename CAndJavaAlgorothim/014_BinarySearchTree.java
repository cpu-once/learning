class BST {
  public int data; // 요솟값
  public int left; // 왼쪽 요소의 연결 정보
  public int right; // 오른쪽 요소의 연결 정보
}

// 이진 탐색 트리를 구성하는 클래스 정의
public class BinarySearchTree {
  // 이진 탐색 트리의 실체가 되는 배열(요소 수는 최대 10)
  public static int BST[] tree = new BST[10];

  // 루트 요소의 물리적 위치 인덱스 (연결 리스트의 head)
  public static int rootIdx = 0;

  //다음으로 추가할 요소의 물리적 위치 인덱스
  public static int newIdx = 0;

  // 이진 탐색 트리에 요소를 추가하는 메소드
  public static void addBST(int data) {
    int currentIdx; // 현재 요소의 물리적 위치 인덱스
    boolean addFlag; // 요소 추가가 완료되었는지 확인하는 플래그

    // 물리적 위치에 요솟값의 연걸 정보 추가
    tree[newIdx].data = data;
    tree[newIdx].left = -1;
    tree[newIdx].right = -1;

    // 루트 요소가 아니라면 논리적 순서에 따라 요소 위치 탐색 및 결정
    if (newIdx != rootIdx) {
      currentIdx = rootIdx;
      addFlag = false;

      do {
        // 루트 요솟값보다 더 작으면 왼쪽으로 내려감
        if (data < tree[currentIdx].data) {
          // 왼쪽으로 내려갔을 때 끝이면 left에 요소의 물리적 위치 인덱스를 추가(연결 정보 설정)
          if (tree[currentIdx].left == -1 ) {
            tree[currentIdx].left = newIdx;
            addFlag = true;
          } else {
          // 왼쪽으로 내려갔을 때 끝이 아니라면 왼쪽의 요소보다 더 내려감
            currentIdx = tree[currentIdx].left;
          }
        } else { // 루트 요솟값보다 더크면 오른쪽으로 내려감(동일한 값은 없음)
          if (tree[currentIdx].right == -1) {
            tree[currentIdx].right = newIdx;
            addFlag = true;
          } else {
            currentIdx = tree[currentIdx].right;
          }
        }
      } while (addFlag == false);
    }

    // 이진트리 DFS
    public static void printLogicalBST(int currentIdx) {
      if (currentIdx != -1) {
        System.out.printf("tree[%d] : data = %d, right = %d\n", 
            currentIdx, tree[currentIdx].data,
            tree[currentIdx].left, tree[currentIdx].right);

        // 재귀 호출 부분
        printLogicalBST(tree[currentIdx].left);
        printLogicalBST(tree[currentIdx].right);
      }
    }

    // 이진 검색 트리의 실체인 배열을 물리적 위치 순서로 표시하는 메소드
    public static void main (String[] args) {
      // 자바는 인스턴스 생성이 필요 (이 처리는 의사코드나 C에서는 불필요)

      for (int i = 0; i < tree.length; i++) {
        tree[i] = new BST();
      }

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
    }
  }
  

  잔 디심기 테스트 
