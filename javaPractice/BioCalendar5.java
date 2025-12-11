public class BioCalendar5 {
  
  public static final int PHYSICAL = 23;

  public double getBioRhythm(long days, int index, int max) {
    return max * Math.sin( (days % index) * 2 * Math.PI / index );
  }

  public static void main(String[] args) {
    int days = 1200;
    BioCalendar5 bio = new BioCalendar5();
    double phyval = bio.getBioRhythm(days, PHYSICAL, 100);
    System.out.printf("나의 신체 지수 %1$.2f입니다.\n", phyval);
  }
}

/*
 * getBioRhythm 함수 호출하기 위해, BioCalendar5객체를 힙에 초기화
 */
