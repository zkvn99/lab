package org.example.study.week1.question3;

import java.util.UUID;

public class User {

  private String name;
  private int age;
  private UUID id;
  public static int userCount;

  public User(String name, int age) {
    this.name = name;
    this.age = age;
    id = UUID.randomUUID();
    userCount++;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public UUID getId() {
    return id;
  }

  public void printUserCount() {
    System.out.println(userCount);
  }

  public void registerUser(String name, int age) {

  }
}
