public class Hello {
  public static void showHello() {
    System.out.println("show Hello method");
  }

  public static void main(String[] args) {
    showHello();
  }
}
/*
 * Method Access modifier
 * public : 어디서나 접근 가능
 * protecetd : 동일 패키지 + 자식 클래스, 다른 패키지에 있더라도 해당 클래스를 상속받은 자식 클래스에서 접근 가능.
 * default : package private, 다른 패키지의 자식클래스도 접근 불가능 
 * private : 클래스 내부에서만
 *
 *
 * final
 * fianl variable : The reference (memory address) to the object cannot change. however, the object's internal state can still modeified unless the object itself
 * is immuatble (like the built-in String class). 
 *
 * final method : When a method is declared as final, it cannot be overriden by any subclass.
 *
 * fianl Class : When a class is declared as final, it cannot be inherited (extended) by any other class.
 */
