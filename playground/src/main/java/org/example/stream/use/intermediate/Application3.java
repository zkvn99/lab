package org.example.stream.use.intermediate;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Application3 {

  public static void main(String[] args) {
    /* 스트림의 중계 연산 중 하나인 flatMap */
    List<List<String>> list = Arrays.asList(
        Arrays.asList("Java", "Spring", "Spring Boot"),
        Arrays.asList("JAVA", "SPRING", "SPRING BOOT")
    );

    System.out.println(list);

    List<String> flatList = list
        .stream()
        .flatMap(Collection::stream)     // 중간 연산
        .collect(Collectors.toList());   // 최종 연산

    System.out.println(flatList);

    /* collect(Collectors.toList()) vs toList() */
    List<String> sentences = Arrays.asList(
        "Hello World",
        "Java Stream API",
        "flatMap Example"
    );
    System.out.println(sentences);

    List<String> words = sentences
        .stream()
        .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
        .toList();

    System.out.println(words);
  }
}
