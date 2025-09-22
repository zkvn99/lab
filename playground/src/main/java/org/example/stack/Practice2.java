package org.example.stack;

import java.util.Stack;

public class Practice2 {
  public int solution(String input) {
    char[] chars = input.toCharArray();
    int result = 0;
    char prev = 0;

    Stack<Character> stack = new Stack<>();
    for (char c : input.toCharArray()) {
      if (c == '(') {
        stack.push(c);
      } else {
        stack.pop();
        if (prev == '(') {
          result += stack.size();
        } else {
          result += 1;
        }
      }
      prev = c;
    }
    return result;
  }
}
