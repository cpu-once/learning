class JLocation {
  public double lat;
  public double lng;
}
// 파일 이름과 클래스 이름이 다르기 때문에 public을 붙일 수 없다.
// 클래스 접근 제한자는 default가 되고, 패키지내에서 접근가능. 
// static이 없으므로, new로 생성 후 힙에 있는 객체를 가르킴.

public class JavaUserDefinedType {
  public static void main(String[] args){
    double latitude = 37.5212722;
    double longitude = 127.00744; 

    JLocation jloc = new JLocation();
    jloc.lat = latitude;
    jloc.lng = longitude;

    JLocation newLoc = jloc;
    // 여기서는 new가 왜 필요 없을까? -> 레퍼런스 복사이기 때문, 
    // 깊은 복사가아닌 얕은 복사로 jloc이 가르키는 객체의 주소를 newLoc가 그 주소 값을 복사하여 갖고 있음
    System.out.println(newLoc.lat);
  }
}
