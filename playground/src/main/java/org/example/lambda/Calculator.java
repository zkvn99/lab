package org.example.lambda;

/* 함수형 인터페이스 : 내부에 하나의 추상메소드가 선언 된 인터페이스, 람다식의 타깃이 될 수 있음 */
@FunctionalInterface
public interface Calculator {

  int sumTwoNumbers(int a, int b);
}
