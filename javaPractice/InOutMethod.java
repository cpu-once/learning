import java.util.Scanner;

public class InOutMethod {
  public static void main(String[] args){
    Scanner scann = new Scanner(System.in);

    System.out.println("정수를 입력하세요");
    int choice = scann.nextInt();
    System.out.println(choice);

    System.out.println("실수를 입력하세요");
    double rchoice = scann.nextDouble();
    System.out.println(choice);

    System.out.println("문자열을 입력하세요");
    String schoice = scann.next();
    System.out.println(schoice);
  }
}

/* 간단한거 다룰 땐 util의 Scanner 쓰고, 대량이라면 java.io 패키지를 이용하자.
 */
