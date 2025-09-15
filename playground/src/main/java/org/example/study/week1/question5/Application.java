package org.example.study.week1.question5;

public class Application {

  public static void main(String[] args) {
    Book book1 = new Book("자바의 정석", "남궁성");
    Book book2 = new Book("이펙티브 자바", "조슈아 블로크");
    Book book3 = new Book("자바의 정석", "남궁성");

    System.out.println(book1.equals(book3));
    System.out.println(book1.equals(book2));
    System.out.println(book1.hashCode());
    System.out.println(book2.hashCode());
    System.out.println(book3.hashCode());
  }
}
