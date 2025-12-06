class javaBasic {
  public static void main(String[] args){
    System.out.println("java primitive types and reference types and primitive types. Additionally, java.lang.String, java.lang.Math methods");
  }

  /* javaBasic 요약
   * java 데이터 타입
   * java.lang.String
   * java.lang.Math
   */

  boolean isL = false;
  char sult ='H';
  int year = 2017;
  int month = 6;

  double latitude = 37.52;
  double longitude = 127.007;

  String card = "H8";

  /* 기본 타입과 참조 타입 */
  /* String은 참조 타입이지만, 기본 타입 처럼 사용한다*/
  /*
   * 참조 타입은 new 연산자를 통해 객체 할당 후 사용
   * Geo geo1 = new Geo();
   * geo1.latitude = 37.5;
   * geo1.longitude = 127;
   */

  /*
   * String 주요 메서드(java.lang.String)
   *
   * char String.charAt(int index);
   *
   * String String.concat(String s);
   *
   * boolean String.contains(String s);
   * boolean String.equals(String s);
   * boolean String.equalsIgnoreCase(String s);
   *
   * int String.indexOf(String s);
   * int String.indexOf(char c);
   * int String.lastIndexOf(String s);
   * int String.lastIndexOf(char c);
   *
   * void String.trim();
   *
   * int String.length();
   *
   * String String.substring(int index1); [ 범위
   *
   * String String.substring(int index1, int index2); [, ) 범위
   *
   * String String.replace(String old, String new); old 문자열 또는 char를 new로 변경
   * String String.replaceAll(String old, String new); 첫 번째 인자로 정규식 사용 가능
   *
   * String String.toUpperCase() 
   * String String.toLowerCAse()
   *
   * String[] String.split(String del)
   *
   * Math 주요 메서드 (java.lang.Math)
   *
   * double Math.sin(double)
   * double Math.cos(double)
   * double Math.toRadians(double)
   *
   * double Math.sqrt(double)
   *
   * double Math.random()
   *
   * double Math.abs(double)
   * int Math.abs(int)
   *
   * double Math.floor(double)
   * double Math.pow(double1, double2) double1의 double2 승
   * double Math.max(double1, double2) double1, double2 중 최대값
   * double Math.min(double1, double2) double1, double2 중 최소값
   *
   */
}
