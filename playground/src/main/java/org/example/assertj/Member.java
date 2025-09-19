package org.example.assertj;

public class Member {
  private int sequence;
  private String id;
  private String name;
  private int age;

  public Member(int sequence, String id, String name, int age) {
    this.sequence = sequence;
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getSequence() {
    return sequence;
  }

  @Override
  public String toString() {
    return "Member{" +
        "age=" + age +
        ", sequence=" + sequence +
        ", id='" + id + '\'' +
        ", name='" + name + '\'' +
        '}';
  }
}
