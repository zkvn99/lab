package org.example.deque;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Practice2 {
  public String solution(String command, Integer[] array) {

    Deque<Integer> deque = new LinkedList<>();
    char[] commandArray = command.toCharArray();

    for (int num : array) {
      deque.addLast(num);
    }

    for (char c : commandArray) {
      if (c == 'R') {
        Collections.reverse((List<?>) deque);
      } else {
        if (deque.isEmpty()) {
          return "error";
        } else {
          deque.removeFirst();
        }
      }
    }

    return deque.toString();
  }
}
