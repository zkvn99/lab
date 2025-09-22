package org.example.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Practice1 {

  static class Ballon {
    public int order;
    public int noteValue;

    public Ballon(int order, int noteValue) {
      this.order = order;
      this.noteValue = noteValue;
    }
  }

  public String solution(Integer[] notes) {
    Deque<Ballon> ballons = new ArrayDeque<>();
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < notes.length; i++) {
      ballons.addLast(new Ballon(i + 1, notes[i]));
    }

    Ballon current = ballons.removeFirst();
    sb.append(current.order);

    while (!ballons.isEmpty()) {

      int moveValue = current.noteValue;

      if(moveValue > 0) {
        for (int i = 1; i < moveValue; i++) {
          ballons.addLast(ballons.removeFirst());
        }
        current = ballons.removeFirst();
      } else {
        for (int i = 1; i < -moveValue; i++) {
          ballons.addFirst(ballons.removeLast());
        }
        current = ballons.removeLast();
      }

      sb.append(" ").append(current.order);
    }

    return sb.toString();
  }
}
