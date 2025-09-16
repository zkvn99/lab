package org.example.extend;

/* 토끼를 상속하는 바니 */
public class Bunny extends Rabbit {

  @Override
  public void cry() {
    System.out.println("바니바니 바니바니 당근당근");
  }
}
