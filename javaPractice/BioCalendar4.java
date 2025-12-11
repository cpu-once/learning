public class BioCalendar4 {
  public static final int PHYSICAL = 23;

  public static double getBioRhythm(long days, int index, int max) {
    return max * Math.sin( (days % index) * 2 * Math.PI / index );
  }

  public static void main(String[] args) {
    int days = 1200;

    double phyval = getBioRhythm( days, PHYSICAL, 100);
    System.out.printf("나의 신체 지수 %1$.2f 입니다.\n", phyval);
  }
}

/*
 * static method는 객체 생성 없이 사용 가능.
 *
 */
