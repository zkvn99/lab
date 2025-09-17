package org.example.lambda;

public class Application1 {

  public static void main(String[] args) {
    /* 인터페이스에 정의된 추상 메소드를 활용하는 방법 */

    /* 1. 인터페이스를 구현한 클래스를 정의하여 기능을 완성한 뒤 사용함 */
    Calculator c1 = new CalculatorImpl();
    System.out.println(c1.sumTwoNumbers(10, 20));

    /* 2. 익명 클래스를 사용해서 기능을 완성한 뒤 사용*/
    Calculator c2 = new Calculator() {
      @Override
      public int sumTwoNumbers(int a, int b) {
        return a + b;
      }
    };

    System.out.println(c2.sumTwoNumbers(20, 30));

    /* 3. 람다식을 이용한 방법 */
    Calculator c3 = (a, b) -> a + b;
    System.out.println(c3.sumTwoNumbers(20, 30));
  }
}
