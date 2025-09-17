package org.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application2 {

  public static void main(String[] args) {
    /* 스트림의 병렬 처리 */
    List<String> list = new ArrayList<>(
        Arrays.asList("java", "mariadb", "html", "css", "mybatis")
    );

    /* 모든 작업은 기본적으로 main 스레드 내에서 일어남 */
    System.out.println("===== for each");
    for (String s : list) {
      print(s);
    }

    System.out.println("===== normal stream");
    list.stream().forEach(s -> print(s));

    /* 병렬 스트림을 활용하면 처리해야 할 데이터 요소가 많을 경우
    * 효율적으로 처리할 수 있는 장점이 있음 */
    System.out.println("===== parallel stream");
    list.parallelStream().forEach(Application2::print);
    list.parallelStream().forEach(Application2::print);
  }

  private static void print(String str) {
    System.out.println(str + " : " + Thread.currentThread().getName());
  }
}
