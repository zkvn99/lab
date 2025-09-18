package org.example.stream.use.terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application3 {

  public static void main(String[] args) {
    /* 스트림의 최종 연산 중 하나인 collect */
    List<Member> memberList = Arrays.asList(
        new Member("test01", "홍길동"),
        new Member("test02", "유관순"),
        new Member("test03", "신사임당"),
        new Member("test03", "신사")
    );

    /* List<String> 타입의 멤버 이름을 관리하는 데이터 */
    List<String> memberNames = memberList.stream()
        .map(Member::getMemberName)
        .collect(Collectors.toList());

    System.out.println("memberNames : " + memberNames);

    String str = memberList.stream()
        .map(Member::getMemberId)
        .collect(Collectors.joining(","));
    System.out.println("str : " + str);

    String str2 = memberList.stream()
                           .map(Member::getMemberId)
                           .collect(Collectors.joining(" || ", "**", "**"));
    System.out.println("str2 : " + str2);

    Map<Integer, Long> countByNameLength =
        memberList.stream()
            .collect(
                Collectors.groupingBy(
                    m -> m.getMemberName().length(),
                    Collectors.counting()
                )
            );

    System.out.println("countByNameLength : " + countByNameLength);
  }
}