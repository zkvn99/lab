package org.example.stream.use.terminal;

import java.util.Arrays;
import java.util.List;

public class Application4 {

  public static void main(String[] args) {
    /* 최종 연산 중 하나인 match */
    List<String> stringList = Arrays.asList("Java", "Spring", "SpringBoot");

    boolean anyMatch = stringList.stream().anyMatch(s -> s.contains("j"));
    boolean allMatch = stringList.stream().allMatch(s -> s.length() > 4);
    boolean noneMatch = stringList.stream().noneMatch(s -> s.contains("a"));

    System.out.println("anyMatch: " + anyMatch);
    System.out.println("allMatch: " + allMatch);
    System.out.println("noneMatch: " + noneMatch);
  }
}
