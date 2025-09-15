package org.example.filestream;

import java.io.Serializable;

/* 객체 입출력을 하기 위해서는 반드시 해당 객체가 직렬화 되어야 함
* 직렬화 대상 클래스에 Serializable 인터페이스만 구현하면 데이터 직렬화 처리가 가능하다. */
public class Member implements Serializable {

  private String id;
  private String pwd;
  private int age;
  private char gender;

  public Member(String id, String pwd, int age, char gender) {
    this.id = id;
    this.pwd = pwd;
    this.age = age;
    this.gender = gender;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public char getGender() {
    return gender;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }
}
