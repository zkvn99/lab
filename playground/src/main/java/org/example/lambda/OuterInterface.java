package org.example.lambda;

/* 람다식 사용을 위해 인터페이스 내에 하나의 추상 메소드만 존재해야 하기 때문에
* 관리 인터페이스가 너무 많아질 수 있어, 내부 인터페이스를 활용 */
public interface OuterInterface {

  @FunctionalInterface
  interface Sum {
    int sumTwoNumbers(int a, int b);
  }

  @FunctionalInterface
  interface Minus {
    int minusTwoNumbers(int a, int b);
  }

  @FunctionalInterface
  interface Multiple {
    int multipleTwoNumber(int a, int b);
  }

  @FunctionalInterface
  interface Divide {
    int divideTwoNumber(int a, int b);
  }
}
