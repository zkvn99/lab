package org.example.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Practice1 {
  public String solution(String input) {
    Stack<String> stack = new Stack<>();

    String[] words = input.split("");

    for (String word : words) {
      if (word.equals("(")) {
        stack.push(word);
      } else if (word.equals(")")) {
        if (stack.isEmpty()) {
          return "NO";
        }
        stack.pop();
      }
    }

    if (!stack.isEmpty()) {
      return "NO";
    }

    return "YES";
  }
}
