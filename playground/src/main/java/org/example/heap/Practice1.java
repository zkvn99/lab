package org.example.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Practice1 {
  public String solution(Integer[] array) {
//    PriorityQueue<Integer> absHeap = new PriorityQueue<>(
//        Comparator.<Integer>comparingInt(Math::abs)
//                  .thenComparingInt(x -> x)
//    );

    PriorityQueue<Integer> absHeap = new PriorityQueue<>(
        (o1, o2) -> {
          int absCompare = Integer.compare(Math.abs(o1), Math.abs(o2));
          if (absCompare == 0) return Integer.compare(o1, o2);
          return absCompare;
        });

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < array.length; i++) {
      if (array[i] != 0) {
        absHeap.offer(array[i]);
      } else {
        if (absHeap.isEmpty()) {
          sb.append(0).append(" ");
        } else {
          sb.append(absHeap.poll()).append(" ");
        }
      }
    }
    return sb.toString().trim();
  }
}