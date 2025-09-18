package org.example.stream.use.generation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application1 {

  public static void main(String[] args) {
    /* 배열이나 컬렉션을 이용하여 스트림을 생성하는 방법 */

    /* 배열을 스트림으로 생성하기 */
    String[] sarr = {"java", "mariadb", "jdbc"};
    Stream<String> strStream1 = Arrays.stream(sarr);
    strStream1.forEach(System.out::println);

    Stream<String> strStream2 = Arrays.stream(sarr, 0, 2);
    strStream2.forEach(System.out::println);

    List<String> stringList = Arrays.asList("html", "css", "javascript");
    Stream<String> strStream3 = stringList.stream();

    strStream3.forEach(System.out::println);
    /* 컬렉션에도 forEach 기능은 정의 되어 있으므로 stream화 없이 사용 가능 */
    stringList.forEach(System.out::println);

    /* Builder를 활용한 스트림 생성 */
    Stream<String> strStream4 = Stream.<String>builder()
        .add("홍길동")
        .add("유관순")
        .add("윤봉길")
        .build();
    strStream4.forEach(System.out::println);

    /* iterate() 를 활용하여 수열 형태의 스트림 생성 */
    Stream<Integer> intStream
        = Stream.iterate(10, value -> value * 2).limit(10);
    intStream.forEach(System.out::println);
  }
}
