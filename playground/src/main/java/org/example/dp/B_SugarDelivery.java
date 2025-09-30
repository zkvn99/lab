package org.example.dp;

import java.util.Arrays;

public class B_SugarDelivery {
    static final int INF = Integer.MAX_VALUE / 2;

    public static int solution(int n) {
        /* dp 배열의 인덱스 값이 곧 해당 키로수의 봉지 개수가 될 수 있도록 저장 */
        int[] dp = new int[n + 1];

        /* 배열의 모든 값 초기화 */
        Arrays.fill(dp, INF);

        /* n 으로 전달 되는 숫자가 작으면 인덱스 범위를 벗어날 수 있으므로 초기값 설정 시 확인
        * 하고 반복문은 그 뒤에서부터 진행한다. */
        if(n >= 3) dp[3] = 1;
        if(n >= 5) dp[5] = 1;

        for(int i = 6; i <= n; i++) {
            // 3이전 또는 5이전 인덱스의 봉지 개수 + 1
            // 초기값이 아닌 값으로 처리하기 위해 Math.min 처리
            dp[i] = Math.min(dp[i-3], dp[i-5]) + 1;
        }

        return dp[n] >= INF ? -1 : dp[n];

    }
}
