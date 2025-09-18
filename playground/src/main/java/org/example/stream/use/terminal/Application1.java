package org.example.stream.use.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application1 {

  public static void main(String[] args) {
    /* 스트림의 최종 연산 중 하나인 calculating */
    long count = IntStream.range(1, 10).count();
    long sum = IntStream.range(1, 10).sum();
    System.out.println("count : " + count);
    System.out.println("sum : " + sum);

    /* OptionalInt : 결과 없음을 나타내는 명확한 요구가 있는 메소드의 반환 형식으로 사용 */
    OptionalInt max = IntStream.rangeClosed(1, 10).max();
    OptionalInt min = IntStream.rangeClosed(1, 10).min();
    System.out.println("max : " + max);
    System.out.println("min : " + min);
    System.out.println(max.getAsInt());
    System.out.println(min.getAsInt());

    /* 중간 연산 이후의 최종 연산 calculating */
    int oddSum = IntStream.rangeClosed(1, 100)
        .filter(i -> i % 2 == 1)
        .sum();
    System.out.println("oddSum : " + oddSum);
  }
}
