public class FibonacciDP {
  // 피보나치 수를 기억하는 배열(최대 100번째 까지)
  public static int[] fibonacciNumbers = new int[100];

  // 인수 n의 피보나치 수를 반환하는 메소드
  public static int fibonacci(int n) {
    for (int i = 0; i <= n; i++) {
      if (i == 0) {
        // 0번째 피보나치 수 0을 저장
        fibonacciNumbers[i] = 0;
      } else if (i == 1) {
        // 1번째 피보나치 수 1을 저장
        fibonacciNumbers[i] = 1;
      } else {
        // 이후의 피보나치 수를 구해 저장
        fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
      }
    }
    // 피보나치 수를 반환
    return fibonacciNumbers[n];
  }

  // 프로그램 실행의 시작점인 main 메소드
  public static void main(String[] args) {
    // 0 ~ 8번째 피보나치 수를 표시
    for (int n = 0; n <= 8; n++) {
      System.out.printf("%d, ", fibonacci(n));
    }
    System.out.printf("\n");
  }
}
