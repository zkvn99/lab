package org.example.study.week1.question6;

public class UserService {

  public void registerUser(String name, int age) {
    if (age <= 0 || age >= 120) {
      throw new InvalidAgeException("나이는 1~119세여야 합니다. 입력값=" + age);
    }
  }
}
