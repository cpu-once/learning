public class BioCalendar3 {
  public static final int PHYSICAL = 23;

  public static void main(String[] args) {
    int index = PHYSICAL;
    int days = 1200;

    double phyval = 100 * Math.sin( (days % index) * 2 * Math.PI / index );
    System.out.printf("나의 신체 지수는 %1$.2f 입니다.\n", phyval);
  }
}

/*
 * Math 클래스는 util 패키지에 있고, 이 클래스의 메서드는 대부분 static 으로 객체 생성 없이 Math.메서드() 형식으로 사용
 */
