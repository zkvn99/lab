package org.example.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

/* BFS는 먼저 방문한 노드를 기준으로 가장 가까운 노드부터 탐색한다.
 * 즉, 시작점에서 출발하여 거리 1짜리 노드를 모두 방문한 후,
 * 거리 2짜리 노드를 방문하는 방식으로 진행 된다.
 * 따라서 어떤 노드에 도달했을 때, 처음 도달한 순간이 곧 최단 거리가 된다.
 * DFS는 한 방향으로 깊게 들어간 후, 막다른 길에 도달하면 다시 되돌아오므로
 * 최단 경로가 아닌 먼 길을 돌아 도착하는 경우도 생길 수 있다.
 * */
public class D_ShortestPath {
  static int N, M;
  static int[][] map;
  static boolean[][] visit;

  static class Node {
    int x;
    int y;
    Node(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

  static int[] dx = {-1, 1, 0, 0};
  static int[] dy = {0, 0, -1, 1};

  public static int solution(String input) throws IOException {
    BufferedReader br = new BufferedReader(new StringReader(input));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    map = new int[N][M];
    visit = new boolean[N][M];

    for (int i = 0; i < N; i++) {
      char[] ch = br.readLine().toCharArray();
      for (int j = 0; j < M; j++) {
        map[i][j] = Character.getNumericValue(ch[j]);
      }
    }

    bfs(0, 0);

    return map[N - 1][M - 1];
  }

  static void bfs(int x, int y) {
    Queue<Node> q = new ArrayDeque<>();
    q.offer(new Node(x, y));
    visit[x][y] = true;

    while (!q.isEmpty()) {
      Node node = q.poll();

      for (int i = 0; i < 4; i++) {
        int nx = node.x + dx[i];
        int ny = node.y + dy[i];

        if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
          continue;
        }

        if(visit[nx][ny] || map[nx][ny] == 0) continue;

        q.offer(new Node(nx, ny));
        visit[nx][ny] = true;
        map[nx][ny] = map[node.x][node.y] + 1;
      }
    }
  }
}
