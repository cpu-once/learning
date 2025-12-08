public class JavaComment {
  public static void main(String[] args) {
    /*
     * 0.0 <= 실수값 < 10.0 을 (int) 하면 정수만 반환 한다.
     * 그래서 0~9 사이의 임의의 정수를 반환한다.
     */

    int makeOne = (int)(Math.random()*10);
    // 0 ~ 9 사이의 임의의 정수
    System.out.println(makeOne); // 실행할 때마다 변한다.
  }
}

/* 주석 쓰는 법
 *  앞선 예제에서 wrapper 클래스를 쓰는 경우의 예시를 들었지만,
 *  위의 예시 같은 경우에는 타입 변환시 버림값이 있는 경우는 (int) 형식으로 써도 무방.
 */
