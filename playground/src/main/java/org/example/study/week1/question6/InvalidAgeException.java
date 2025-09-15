package org.example.study.week1.question6;

public class InvalidAgeException extends RuntimeException {

  public InvalidAgeException(String message) {
    super(message);
  }

  public InvalidAgeException(String message, Throwable cause) {
    super(message, cause);
  }

}
