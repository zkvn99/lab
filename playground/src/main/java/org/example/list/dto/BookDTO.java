package org.example.list.dto;

public class BookDTO implements Comparable<BookDTO> {
  private int number;
  private String title;
  private String author;
  private int price;

  public BookDTO(int number, String title, String author, int price) {
    this.number = number;
    this.title = title;
    this.author = author;
    this.price = price;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "BookDTO{" +
        "author='" + author + '\'' +
        ", number=" + number +
        ", title='" + title + '\'' +
        ", price=" + price +
        '}';
  }

  /* 도서 제목 기준으로 오름차순 정렬 */
  @Override
  public int compareTo(BookDTO o) {
    /* this vs o (전달인자) 객체의 비교
    * 양수 반환 : 변경
    * 0 반환 : 같은 값
    * 음수 반환 : 변경 X */
    return this.title.compareTo(o.title);
  }
}
