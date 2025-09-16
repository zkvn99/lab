package org.example.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application3 {

  public static void main(String[] args) {
    /* TreeSet : 정렬 */
    TreeSet<String> tset = new TreeSet<>();
    tset.add("java");
    tset.add("mysql");
    tset.add("jdbc");
    tset.add("html");
    tset.add("css");
    tset.add("java");

    /* 자동 오름차순 정렬이 일어나며 이진 트리의 형태로 요소를 저장
    * String 클래스 Implements Comparable의 CompareTo 메소드 오버라이딩 기준으로 정렬
    * 중복 저장은 허가하지 않음 */
    System.out.println("test : " + tset);

    /* 로또 번호 발생기 */
    Set<Integer> lotto = new TreeSet<>();
    while (lotto.size() < 6) {
      lotto.add((int)(Math.random() * 45) + 1);
    }

    System.out.println("lotto + " + lotto);
  }
}
