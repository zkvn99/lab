package org.example.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
import org.example.dfsbfs.B_BFS.Node;

public class C_DFSBFS {

  static int[][] map;
  static boolean[] visit;
  static int node;
  static int edge;
  static int start;
  static StringBuilder sb;

  public static String solution(String input) throws IOException {
    BufferedReader br = new BufferedReader(new StringReader(input));
    StringTokenizer st = new StringTokenizer(br.readLine());
    node = Integer.parseInt(st.nextToken()); // 정점의 개수
    edge = Integer.parseInt(st.nextToken()); // 간선의 개수
    start = Integer.parseInt(st.nextToken()); // 시작할 정점

    map = new int[node + 1][node + 1];

    for (int i = 0; i < edge; i++) {
      st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      map[x][y] = map[y][x] = 1;
    }

    visit = new boolean[node + 1];

    sb = new StringBuilder();
    dfs(start);
    sb.append("\n");

    visit = new boolean[node + 1];

    bfs(start);
    return sb.toString();
  }

  static void dfs(int start) {
    visit[start] = true;
    sb.append(start).append(" ");
    System.out.println(" 방문 노드 : " + start);

    for (int i = 1; i <= node; i++) {
      if (!visit[i] && map[start][i] == 1) {
        dfs(i);
      }
    }
  }

  static void bfs(int start) {
    visit[start] = true;
    Queue<Integer> queue = new LinkedList<>();
    queue.add(start);
    sb.append(start).append(" ");

    while (!queue.isEmpty()) {
      start = queue.poll();
      System.out.println(start);
      for (int i = 1; i <= node; i++) {
        if (map[start][i] == 1 && !visit[i]) {
          queue.offer(i);
          visit[i] = true;
          sb.append(i).append(" ");
        }
      }
    }
  }
}
