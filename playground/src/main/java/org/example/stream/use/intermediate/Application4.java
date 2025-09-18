package org.example.stream.use.intermediate;

import java.util.List;
import java.util.stream.IntStream;

public class Application4 {

  public static void main(String[] args) {
    /* 스트림의 중계 연산 중 sorted */
    List<Integer> integerList = IntStream.of(5, 10, 99, 7, 1, 50)
        .boxed()
        .sorted((a, b) -> b - a)
        .toList();
    System.out.println(integerList);
  }
}
