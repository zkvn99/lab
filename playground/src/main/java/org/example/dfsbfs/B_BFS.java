package org.example.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

/* 너비 우선 탐색 (Breadth First Search)
* 선입 선출 구조의 queue를 활용
* 시작 노드에서 출발해 시작 노드를 기준으로 가까운 노드를 먼저 방문하면서 탐색하는 알고리즘 */
public class B_BFS {

  // 배추 밭의 크기와 배추 개수
  static int M, N, K;
  // 배추밭
  static int[][] map;
  // 배추 찾기 시 사용할 방문 배열
  static boolean[][] visit;

  static int[] dx = {-1, 1, 0, 0};
  static int[] dy = {0, 0, -1, 1};

  static int cx,cy;

  // x와 y 좌표를 가지는 Node 클래스
  static class Node {
    int x;
    int y;
    Node(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

  public static int solution(String input) throws IOException {
    BufferedReader br = new BufferedReader(new StringReader(input));
    StringTokenizer st = new StringTokenizer(br.readLine());
    M = Integer.parseInt(st.nextToken());
    N = Integer.parseInt(st.nextToken());
    K = Integer.parseInt(st.nextToken());

    map = new int[M][N];
    visit = new boolean[M][N];

    for (int i = 0; i < K; i++) {
      st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      map[x][y] = 1;
    }

    int count = 0;
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        if (map[i][j] == 1 && !visit[i][j]) {
          bfs(i, j);
          count++;
        }
      }
    }
    return count;
  }

  private static void bfs(int x, int y) {
    Queue<Node> q = new ArrayDeque<>();
    visit[x][y] = true;
    q.offer(new Node(x, y));

    /* 연속적으로 상하좌우에 배추가 심어져있다면 해당 위치를 방문한 것으로 체크
    * queue를 통해 탐색을 진행한다 */
    while (!q.isEmpty()) {
      Node node = q.poll();

      /* 상하좌우 살펴보기 */
      for (int i = 0; i < 4; i++) {
        cx = node.x + dx[i];
        cy = node.y + dy[i];
        /* 지금 확인하는 방향이 아래 조건을 만족해야 탐색을 계속 진행
        1. 좌표로서 존재하고
        2. 방문한적이 없고
        3. 배추가 심어져있다면
        */
        if (rangeCheck() && !visit[cx][cy] && map[cx][cy] == 1) {
          q.offer(new Node(cx, cy));
          visit[cx][cy] = true;
        }
      }
    }
//    visit[x][y] = true;
//    Queue<int[]> queue = new LinkedList<>();
//    queue.add(new int[] {x, y});
//    while (!queue.isEmpty()) {
//      int[] cur = queue.poll();
//      for (int i = 0; i < 4; i++) {
//        int x1 = cur[0] + dx[i];
//        int y1 = cur[1] + dy[i];
//        if (x1 >= 0 && x1 < M && y1 >= 0 && y1 < N && map[x1][y1] == 1 && !visit[x1][y1]) {
//          visit[x1][y1] = true;
//          queue.add(new int[] {x1, y1});
//        }
//      }
//    }
  }

  static boolean rangeCheck() {
    return cx >= 0 && cx < M && cy >= 0 && cy < N;
  }
}
