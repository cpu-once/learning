import java.util.Calendar;
import java.util.Date;

public class JavaObjectType {
  public static void main(String[] args) {
    // 기본 타입의 배열은 참조 타입. 둘은 7라인과 8라인은 같은 참조 타입임.
    int[] m = {1, 2, 3};
    int[] n = new int[] {1, 2,3};
    // 참조 타입 중 객체 타입
    String card = "H8";
    Date d = new Date();
    Calendar cal = Calendar.getInstance(); // 오늘

    // 자동으로 toStirng()이 붙음
    //
    System.out.println(card); // card.toString();
    System.out.println(d); // d.toString();
    System.out.println(cal); // cal.toString()
  }
}
