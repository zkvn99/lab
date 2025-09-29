package org.example;

import java.util.*;
import java.io.*;

public class Main {
    static boolean[][] pot;
    static boolean[][] visit;
    static int[] dx = new int[]{-1, 1, 0, 0};
    static int[] dy = new int[]{0, 0, -1, 1};
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        pot = new boolean[N][N];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            char[] ch = line.toCharArray();
            for (int j = 0; j < N; j++) {
                if (ch[j] == '1') {
                    pot[i][j] = true;
                }
            }
        }

        visit = new boolean[N][N];
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (pot[i][j] && !visit[i][j]) {
                    count++;
                    list.add(bfs(i, j));
                }
            }
        }

        System.out.println(count);

        for (int n : list) {
            System.out.println(n);
        }
    }

    static int bfs(int x, int y) {
        visit[x][y] = true;
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{x, y});
        int count = 1;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int i = 0; i < 4; i++) {
                int px = cur[0] + dx[i];
                int py = cur[1] + dy[i];

                if (valid(px, py) && pot[px][py] && !visit[px][py]) {
                    visit[px][py] = true;
                    q.offer(new int[]{px, py});
                    count++;
                }
            }
        }

        return count;
    }

    static boolean valid(int x, int y) {
        if (x < 0 || x >= N || y < 0 || y >= N) return false;
        return true;
    }
}