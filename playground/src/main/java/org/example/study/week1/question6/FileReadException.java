package org.example.study.week1.question6;

public class FileReadException extends Exception {
  public FileReadException(String message) {
    super(message);
  }
  public FileReadException(String message, Throwable cause) {
    super(message, cause);
  }
}
