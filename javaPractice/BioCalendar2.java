public class BioCalendar2 {
  public static final int PHYSICAL =23;
  
  public static void main(String[] args) {
    int index = PHYSICAL;
    int days = 1200;
    
    // Math.PI 3.14에서 정의되어 있는 상수
    double vals = (days % index) * 2 * Math.PI / index;
    System.out.println(Math.toDegrees(vals) + "도");
  }
}
