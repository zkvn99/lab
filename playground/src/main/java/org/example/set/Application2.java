package org.example.set;

import java.util.LinkedHashSet;

public class Application2 {

  public static void main(String[] args) {
    /* LinkedHashSet : 저장 순서 유지 */
    LinkedHashSet<String> lset = new LinkedHashSet<>();
    lset.add("java");
    lset.add("css");
    lset.add("html");
    lset.add("mysql");
    lset.add("java");

    System.out.println("lset : " + lset);
  }
}
