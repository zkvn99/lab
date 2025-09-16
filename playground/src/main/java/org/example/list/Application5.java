package org.example.list;

import java.util.LinkedList;
import java.util.Queue;

public class Application5 {

  public static void main(String[] args) {
    /* Queue */
    Queue<String> queue = new LinkedList<>();

    /* 큐에 데이터를 삽입 할 때는 offer 메소드를 활용 */
    queue.offer("first");
    queue.offer("second");
    queue.offer("third");
    queue.offer("fourth");
    queue.offer("fifth");

    System.out.println("queue : " + queue);

    /* 큐에서 데이터를 꺼내는 메소드
    * peek : 큐의 가장 앞에(먼저 들어온) 요소를 반환
    * poll : 큐의 가장 앞에(먼저 들어온) 요소를 제거 후 반환
    * */
    System.out.println("peek : " + queue.peek());
    System.out.println("queue : " + queue);

    System.out.println("poll : " + queue.poll());
    System.out.println("queue : " + queue);

    System.out.println("poll : " + queue.poll());
    System.out.println("poll : " + queue.poll());
    System.out.println("poll : " + queue.poll());
    System.out.println("poll : " + queue.poll());

    /* 큐에서 반환할 값이 없을 경우 null 반환 */
    System.out.println("poll : " + queue.poll());
  }
}
