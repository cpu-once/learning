public class Letters {
  public static void main(String[] args) {
    char a = '닳';
    String letter = "동해 물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
    int letterNumber = letter.length();
    int loc = letter.indexOf(a);

    System.out.printf("\"%s\" => %d자 이며, '%c'은 %d번째 있다.\n", letter, letterNumber, a, loc);

    char b = letter.charAt(loc);
    System.out.printf("\"%s\"의 %d 번째 문자는 '%c'이다.", letter,loc,b);
  }
}

/*
 * \" <- 으로 escape 문자 \ 를 사용해 String을 묶는 문자 " <-를 출력에 사용"
 * %s : 문자열
 * %c : 문자
 * %d : 정수를 의미
 */
