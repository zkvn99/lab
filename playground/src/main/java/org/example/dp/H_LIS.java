package org.example.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.StringTokenizer;

/* LIS(Longest Increasing Subsequence) : 최대 부분 증가 수열
 * 주어진 수열에서 원래의 순서를 유지하면서, 증가하는 순서를 만족하는
 * 부분 수열 중 가장 긴 수열을 찾는 문제이다.
 * 예를 들어, 수열 {10, 20, 10, 30, 20, 50} 이 있다면
 * 가능한 증가 수열 중 하나인 {10, 20, 30, 50}은 길이가 4인 LIS가 된다.
 * */
public class H_LIS {

    public static Integer solution(String input) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader(input));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n + 1];
        int[] dp = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
        }

        int max = 1;

        return max;
    }
}
