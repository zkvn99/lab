package org.example.stream.use.intermediate;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Application {

  public static void main(String[] args) {
    /* 스트림의 중간 연산, 중계 연산인 filter */
    /* filter : 스트림에서 특정 데이터만 걸러내는 메소드로 매개변수는 Predicate 타입이 선언되어 있음
    * Predicate - 매개변수를 받아 boolean을 반환하는 형태 */
    IntStream intStream = IntStream.range(0, 10);
    intStream.filter(i -> i % 2 == 0).forEach(System.out::println);
  }
}
