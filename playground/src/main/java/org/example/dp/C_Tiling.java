package org.example.dp;

/* 점화식 : f(x) = f(x-1) + f(x-2) */
public class C_Tiling {

    public static Integer solution(Integer n) {
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 1;
        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
