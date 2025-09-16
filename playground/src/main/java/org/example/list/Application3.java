package org.example.list;

import java.util.LinkedList;

public class Application3 {

  public static void main(String[] args) {
    /* LinkedList */
    LinkedList<String> linkedList = new LinkedList<>();

    /* List 계열이기 때문에 내부 구현 코드는 다르지만 호출 메소드의 형태는
    * ArrayList와 동일하게 사용 가능 */
    linkedList.add("banana");
    linkedList.add("orange");
    linkedList.add("apple");
    linkedList.add("banana");

    /* List의 특징 (1) 저장 순서 유지 (2) 중복 저장 가능 */
    for (int i = 0; i < linkedList.size(); i++) {
      System.out.println(linkedList.get(i));
    }

    for (String s : linkedList) {
      System.out.println("s : " + s);
    }

    System.out.println(linkedList.isEmpty());
    linkedList.clear();
    System.out.println(linkedList.isEmpty());
  }
}
