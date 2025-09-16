package org.example.set;

import java.util.HashSet;
import java.util.Iterator;

public class Application1 {

  public static void main(String[] args) {
    /* HashSet */
    HashSet<String> hset = new HashSet<>();
//    Set<String> set = new HashSet<>();
//    Collection<String> cset =  new HashSet<>();

    hset.add(new String("java"));
    hset.add(new String("mysql"));
    hset.add(new String("jdbc"));
    hset.add(new String("html"));
    hset.add(new String("css"));
    hset.add(new String("java"));

    /* 1. 저장 순서가 유지되지 않음 ( HashSet은 Hash 연산을 통해 저장 관리 )
    * 2. 중복 값은 저장되지 않음
    * => String의 재정의된 hashCode, equals가 활용됨 */
    System.out.println("hset : " + hset);

    /* 재정의된 equals를 통해 포함 여부를 확인하고 있으므로 동등 객체가 있음을 확인 */
    System.out.println(hset.contains(new String("html")));

    /* Set의 데이터를 순회하는 방법 */
    /* 1. 배열로 변경 (toArray) */
    Object[] arr = hset.toArray();
    for (int i = 0; i < arr.length; i++) {
      System.out.println(i + " : " + arr[i]);
    }

    /* 2. Iterable의 Iterator 메소드 (반복자) */
    Iterator<String> iter = hset.iterator();
    while (iter.hasNext()) {
      System.out.println("iter.next() : " + iter.next());
      iter.remove();
    }

    /* 3. 향상된 for문 */
    for (String str : hset) {
      System.out.println("str : " + str);

      /* 반복 도중 요소 삭제 시 java.util.ConcurrentModificationException */
//      hset.remove(str);
    }
  }
}
