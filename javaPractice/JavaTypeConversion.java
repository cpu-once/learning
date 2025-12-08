public class JavaTypeConversion {
  public static void main(String[] args) {
    String slat = "37.521213     ";
    // String slat = "hello";
    // 공백 제거 후 double로 타입 변환
    double latitude = Double.parseDouble(slat.trim());
    // primitive 타입을 주로 사용하는 것 보다 어지간하면 래퍼클래스들 사용하는게 낫다고 봄.
    // GC 동작과 제어에서 관심사 분리가 편함.
    // 해당 예제는 스트링 클래스의 .trim() 메서의 사용과, 래퍼클래스의 parseDouble 메서드를 통해 다시 primitive로 할당하는 예제
    // 형 변환시 wrapper 클래스를 사용하는 이유는 이미 잘 만들어진 형 변환 코드를 재사용 하는 효과. 실수 줄이기 등등의 이유.
    // wrapper를 쓰지 않을 경우 사용자가 구현하거나 기능 제한이나 제네릭 사용 불가등 프로그래밍시 제약이 많음.
    // 비슷한 예시로 c++의 stl 사용을 예를 들 수 있음.
    //
    // 타입캐스팅에서 어퍼캐스팅과 다운캐스팅 예시
    // 객체 상속 관계에서 어퍼캐스팅과 다운캐스팅이란 용어를 쓰고 있지만,
    // 해당 예시에서 (int), (double) 혹은 asInt와 같은 캐스팅 메소드나 방법이 있지만
    // wrapper를 쓰는 이유는 프로그래머의 실수를 줄이기 위한 방안. UB 발생할 우려가 있고, 조심할 필요가 있음
    // 힙 할당 비용을 쓰고, 멀티쓰레드 환경에서 unexpected behavior 내지는 runtime error 줄이는 방법
    System.out.println(latitude);
  }
}
