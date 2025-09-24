package org.example.heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * 세계적인 도둑 상덕이는 보석점을 털기로 결심했다.
 *
 * 상덕이가 털 보석점에는 보석이 총 N개 있다. 각 보석은 무게 Mi와 가격 Vi를 가지고 있다. 상덕이는 가방을 K개 가지고 있고, 각 가방에 담을 수 있는 최대 무게는 Ci이다. 가방에는 최대 한 개의 보석만 넣을 수 있다.
 *
 * 상덕이가 훔칠 수 있는 보석의 최대 가격을 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 N과 K가 주어진다. (1 ≤ N, K ≤ 300,000)
 *
 * 다음 N개 줄에는 각 보석의 정보 Mi와 Vi가 주어진다. (0 ≤ Mi, Vi ≤ 1,000,000)
 *
 * 다음 K개 줄에는 가방에 담을 수 있는 최대 무게 Ci가 주어진다. (1 ≤ Ci ≤ 100,000,000)
 *
 * 모든 숫자는 양의 정수이다.
 */
public class Practice2 {
  static class Jewel {
    public int weight;
    public int price;

    public Jewel(int weight, int price) {
      this.weight = weight;
      this.price = price;
    }
  }
  public long solution(String input) throws IOException {
    BufferedReader br
        = new BufferedReader(new StringReader(input));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    int result = 0;

    PriorityQueue<Jewel> jewels = new PriorityQueue<>((o1, o2) -> Integer.compare(o2.price, o1.price));

    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      jewels.offer(new Jewel(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
    }

    int[] bags = new int[k];
    boolean[] visited = new boolean[k];

    for (int i = 0; i < k; i++) {
      bags[i] = Integer.parseInt(br.readLine());
    }

    while (!jewels.isEmpty()) {
      Jewel jewel = jewels.poll();

      for (int i = 0; i < k; i++) {
        if (bags[i] >= jewel.weight && !visited[i]) {
          visited[i] = true;
          result += jewel.price;
          break;
        }
      }
    }


    return result;
  }
}
