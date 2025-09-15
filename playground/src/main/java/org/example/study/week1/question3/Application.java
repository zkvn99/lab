package org.example.study.week1.question3;

public class Application {

  public static void main(String[] args) {
    User user = new User("이민욱", 27);
    User user2 = new User("테스트", 25);

    user.printUserCount();

    System.out.println(user.getId());
    System.out.println(user2.getId());
  }
}
