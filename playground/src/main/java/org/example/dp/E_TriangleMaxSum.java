package org.example.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class E_TriangleMaxSum {

    public static Integer solution(String input) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader(input));
        int n = Integer.parseInt(br.readLine());

        int[][] t = new int[n + 1][n + 1];  // 삼각형 데이터 저장
        int[][] dp = new int[n + 1][n + 1]; // 내려오면서 가지는 최대값 기억할 배열

        for(int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= i; j++) {
                t[i][j] = Integer.parseInt(st.nextToken());
                // dp[i][j] 값은 dp[i-1][j-1] 또는 dp[i-1][j] 에 기록 된 값 중
                // 큰 값을 선택한 뒤 값을 누적 연산(t[i][j]) 해서 계산한다.
                dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + t[i][j];
            }
            System.out.println(Arrays.toString(t[i]));
//            System.out.println(Arrays.toString(dp[i]));
        }

        /* dp 배열의 맨 아랫줄에서 최대 값을 구해서 반환 */
        int ans = 0;
        for(int i = 1; i <= n; i++) {
            if(ans < dp[n][i]) ans = dp[n][i];
        }
        return ans;
    }
}
