public class HighHill {
  public static void main(String[] args) {
    double S = 6;
    double P = 0.75;
    double L = 200;
    double T = 0;
    double A = 1;
    double Y = 2;
    double ups1 = P*L*(Y+9);
    double downs = (T+1)*(A+1)*(Y+10)*(L+20);
    double ups2 = 12 + 3*S/8.0;
    double high = ups1 / downs * ups2;

    System.out.printf("적당한 하이힐 높이는 %1$.2fcm 입니다.", high);
  }
}

/*
 * %f : 실수 포맷
 * %.2f는: 소수점 두 자리 까지 표시
 * %1$.2f : 첫 번째 변수 high를 1$ 위치에 넣고, 소수점 두자리 까지 표시하는 더블이라는 의미
 */
