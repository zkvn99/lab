package org.example.jupiter;

public class NumberValidation {
  public void checkDividableNumber(int firstNum, int secondNum) {
    if (secondNum == 0) throw new IllegalArgumentException("0으로 나눌 수 없습니다");
  }
}
