package org.example;

import java.util.*;
import java.io.*;

public class Main {
    static class Balloon {
        public int order;
        public int value;

        public Balloon(int order, int value) {
            this.order = order;
            this.value = value;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<Balloon> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            deque.add(new Balloon(i + 1, Integer.parseInt(st.nextToken())));
        }

        StringBuilder sb = new StringBuilder();

        Balloon boom = deque.removeFirst();
        int move = boom.value;
        sb.append(boom.order);

        while (!deque.isEmpty()) {
            if (move > 0) {
                for (int i = 1; i < move; i++) {
                    deque.addLast(deque.removeFirst());
                }

                boom = deque.removeFirst();
                sb.append(boom.order).append(" ");
            } else {
                for (int i = 1; i < -move; i++) {
                    deque.addFirst(deque.removeLast());
                }

                boom = deque.removeLast();
                sb.append(" ").append(boom.order);
            }

            move = boom.value;
        }

        System.out.println(sb);
    }
}