package org.example.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.example.list.comparator.AscendingPrice;
import org.example.list.dto.BookDTO;

public class Application2 {

  public static void main(String[] args) {
    /* 사용자 정의 자료형으로 ArrayList 생성하고 정렬 */
    List<BookDTO> bookList = new ArrayList<>();
    bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
    bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
    bookList.add(new BookDTO(3, "동의보감", "허준", 40000));
    bookList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
    bookList.add(new BookDTO(5, "삼국유사", "일연", 58000));

    System.out.println("===== 정렬 전 =====");
    for (BookDTO book : bookList) {
      System.out.println(book);
    }

    /* implements Comparable을 통해 compareTo 메소드(정렬 기준 반환)가 구현되어 있어야만
    * 사용 가능한데 구현되지 않았을 경우 사용 불가능 */
    System.out.println("===== 정렬 후 =====");
    Collections.sort(bookList);
    for (BookDTO book : bookList) {
      System.out.println(book);
    }

    /* Comparator 인터페이스를 구현한 정렬 기준을 사용해서 정렬 */
    Collections.sort(bookList, new AscendingPrice());
    bookList.sort(new AscendingPrice());
    System.out.println("===== 가격 오름차순 정렬 후 =====");
    for (BookDTO book : bookList) {
      System.out.println(book);
    }

    /* 정렬 기준이 계속 사용되는 경우 별도의 클래스를 만들어서 재사용할 수 있지만
    * 한 번만 사용하는 경우 더 간편하게 익명 클래스(Anonymous Class)를 활용 가능 */
    bookList.sort(new Comparator<BookDTO>() {
      @Override
      public int compare(BookDTO o1, BookDTO o2) {
        /* 가격 내림차순 정렬 */
        return o2.getPrice() - o1.getPrice();
      }
    });
    System.out.println("===== 가격 오름차순 정렬 후 =====");
    for (BookDTO book : bookList) {
      System.out.println(book);
    }
  }
}
