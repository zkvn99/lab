package org.example.study.week1.question5;

import java.util.Objects;

public class Book {
  String title;
  String author;

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Book book)) return false;
    return Objects.equals(title, book.title) &&
        Objects.equals(author, book.author);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, author);
  }
}
