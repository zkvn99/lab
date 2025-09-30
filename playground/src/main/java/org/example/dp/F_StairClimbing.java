package org.example.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class F_StairClimbing {

    public static Integer solution(String input) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader(input));
        int n = Integer.parseInt(br.readLine());    // 계단의 개수
        int[] arr = new int[n + 1];                 // 계단의 점수
        int[] dp = new int[n + 1];                  // 최적(최대 점수 합계)의 값 누적

        for(int i = 1; i <= n; i++) arr[i] = Integer.parseInt(br.readLine());

        // 초기값 설정
        dp[1] = arr[1];
        if(n >= 2) dp[2] = dp[1] + arr[2];

        // 점화식은 3번 계단부터 적용
        for(int i = 3; i <= n; i++) {
            /* 가능 상황
            * 1. 직전 계단에서 올라오는 상황
            * -> 연달아 밟지 않아야 하므로 i-3 -> i-1 -> i
            * -> dp[i-3] + arr[i-1]
            * 2. 두 계단 전에서 올라오는 상황
            * -> i-2 이전의 상황에 대해서 신경 쓸 필요가 없음
            * -> dp[i-2]
            * */
            dp[i] = Math.max(dp[i-3]+arr[i-1], dp[i-2]) + arr[i];
        }

        return dp[n];
    }
}
